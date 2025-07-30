package com.rabbiter.hrm.interceptor;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.rabbiter.hrm.service.StaffService;
import com.rabbiter.hrm.entity.Staff;
import com.rabbiter.hrm.enums.BusinessStatusEnum;
import com.rabbiter.hrm.exception.ServiceException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author
 * @Date 2024/2/23
 * @Version 1.0
 */


public class JWTInterceptor implements HandlerInterceptor {

    @Resource
    private StaffService staffService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token = request.getHeader("token");// 从 http 请求头中取出 token
        Integer id = null;
        if (StrUtil.isNotBlank(token)) {
            try {
               id = Integer.valueOf(JWT.decode(token).getAudience().get(0));
            }
            catch (Exception e){
                throw new ServiceException(BusinessStatusEnum.STAFF_NOT_TOKEN_ERROR);
            }
            // 获取token中的id，验证员工
//            Integer id = Integer.valueOf(JWT.decode(token).getAudience().get(0));

            Staff staff = this.staffService.getById(id);
            // 是否有此员工
            if (staff != null) {
                // 判断员工状态是否正常
                if (staff.getStatus() == 1) {
                    // 验证token
                    JWTVerifier verifier = JWT.require(Algorithm.HMAC256(staff.getPassword())).build();
                    try {
                        verifier.verify(token); // 验证token
                    } catch (JWTVerificationException e) {
                        throw new ServiceException(BusinessStatusEnum.TOKEN_INVALID);
                    }
                    return true;
                }
                throw new ServiceException(BusinessStatusEnum.STAFF_STATUS_ERROR);
            }
            throw new ServiceException(BusinessStatusEnum.STAFF_NOT_EXIST);
        }
        throw new ServiceException(BusinessStatusEnum.TOKEN_NOT_EXIST);
    }
}
