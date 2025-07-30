package com.rabbiter.hrm.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.hrm.dto.Response;
import com.rabbiter.hrm.dto.ResponseDTO;
import com.rabbiter.hrm.entity.Staff;
import com.rabbiter.hrm.enums.BusinessStatusEnum;
import com.rabbiter.hrm.mapper.StaffMapper;
import com.rabbiter.hrm.util.JWTUtil;
import com.rabbiter.hrm.util.MD5Util;
import com.rabbiter.hrm.vo.StaffDeptVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : 
 * @Date : 2024/1/30
 */

@Service
public class LoginService extends ServiceImpl<StaffMapper, Staff> {

    @Resource
    private StaffMapper staffMapper;

    public ResponseDTO login(Staff staff) {
        String password = MD5Util.MD55(staff.getPassword());
        StaffDeptVO staffDeptVO = this.staffMapper.findStaffInfo(staff.getCode(), password);
        if (staffDeptVO != null) {
            // 验证用户状态
            if (staffDeptVO.getStatus() == 1) {
                String token = JWTUtil.generateToken(staffDeptVO.getId(),password);
                return Response.success(staffDeptVO, token); // 返回员工信息和token
            }
            return Response.error(BusinessStatusEnum.STAFF_STATUS_ERROR);
        }
        return Response.error("用户名或密码错误!");
    }
}
