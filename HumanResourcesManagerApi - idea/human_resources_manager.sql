/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : human_resources_manager

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 31/03/2024 23:55:39
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for att_attendance
-- ----------------------------
DROP TABLE IF EXISTS `att_attendance`;
CREATE TABLE `att_attendance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `mor_start_time` time NULL DEFAULT NULL COMMENT '上午上班时间',
  `mor_end_time` time NULL DEFAULT NULL COMMENT '上午下班时间',
  `aft_start_time` time NULL DEFAULT NULL COMMENT '下午上班时间',
  `aft_end_time` time NULL DEFAULT NULL COMMENT '下午下班时间',
  `attendance_date` date NOT NULL COMMENT '考勤日期',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '0正常，1迟到，2早退，3旷工，4休假',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 292 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工考勤表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of att_attendance
-- ----------------------------
INSERT INTO `att_attendance` VALUES (284, 1, '06:00:00', '12:00:00', '13:00:55', '18:00:16', '2024-03-08', 0, NULL, '2024-03-31 15:30:39', '2024-03-31 15:30:39', 0);
INSERT INTO `att_attendance` VALUES (285, 1, '09:00:00', '10:30:00', '13:01:55', '16:00:16', '2024-03-11', 3, NULL, '2024-03-31 15:30:39', '2024-03-31 15:30:39', 0);
INSERT INTO `att_attendance` VALUES (286, 2, '06:45:00', '11:40:00', '13:10:55', '16:30:16', '2024-03-08', 1, NULL, '2024-03-31 15:30:39', '2024-03-31 15:30:39', 0);
INSERT INTO `att_attendance` VALUES (287, 2, '07:40:00', '12:30:00', '13:09:55', '18:49:16', '2024-03-11', 1, NULL, '2024-03-31 15:30:39', '2024-03-31 15:30:39', 0);
INSERT INTO `att_attendance` VALUES (288, 38, '06:00:00', '12:00:00', '13:00:55', '18:00:16', '2024-03-08', 0, NULL, '2024-03-31 16:46:05', '2024-03-31 16:46:05', 0);
INSERT INTO `att_attendance` VALUES (289, 38, '09:00:00', '10:30:00', '13:01:55', '16:00:16', '2024-03-11', 3, NULL, '2024-03-31 16:46:05', '2024-03-31 16:46:05', 0);
INSERT INTO `att_attendance` VALUES (290, 39, '06:45:00', '11:40:00', '13:10:55', '16:30:16', '2024-03-08', 3, NULL, '2024-03-31 16:46:05', '2024-03-31 16:46:05', 0);
INSERT INTO `att_attendance` VALUES (291, 39, '07:40:00', '12:30:00', '13:09:55', '18:49:16', '2024-03-11', 1, NULL, '2024-03-31 16:46:05', '2024-03-31 16:46:05', 0);

-- ----------------------------
-- Table structure for att_leave
-- ----------------------------
DROP TABLE IF EXISTS `att_leave`;
CREATE TABLE `att_leave`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `days` int(11) NULL DEFAULT NULL COMMENT '休假天数',
  `type_num` tinyint(1) NULL DEFAULT NULL COMMENT '休假类型',
  `status` tinyint(1) NULL DEFAULT 1 COMMENT '0禁用，1正常，默认1',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '请假表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of att_leave
-- ----------------------------
INSERT INTO `att_leave` VALUES (1, 2, 40, 1, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (2, 2, 4, 2, 0, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (3, 3, NULL, 1, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (4, 3, NULL, 4, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (5, 3, NULL, 5, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (6, 2, 3, 4, 0, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (7, 2, 10, 0, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (8, 2, 4, 3, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (9, 5, 10, 2, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (10, 5, 10, 4, 0, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (11, 5, 10, 0, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (12, 5, 30, 1, 0, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (13, 5, 10, 3, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (14, 12, 10, 2, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (15, 12, 10, 4, 0, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (16, 12, 10, 0, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (17, 2, 2, 5, 1, NULL, '2024-03-31 13:29:24', '2024-03-31 13:29:24', 0);
INSERT INTO `att_leave` VALUES (18, 17, 5, 0, 1, NULL, '2024-03-31 16:25:15', '2024-03-31 16:25:15', 0);
INSERT INTO `att_leave` VALUES (19, 17, 5, 1, 1, NULL, '2024-03-31 16:25:22', '2024-03-31 16:25:22', 0);
INSERT INTO `att_leave` VALUES (20, 17, 5, 2, 1, NULL, '2024-03-31 16:25:26', '2024-03-31 16:25:26', 0);
INSERT INTO `att_leave` VALUES (21, 17, 5, 3, 1, NULL, '2024-03-31 16:25:30', '2024-03-31 16:25:30', 0);
INSERT INTO `att_leave` VALUES (22, 17, 5, 4, 1, NULL, '2024-03-31 16:25:35', '2024-03-31 16:25:35', 0);
INSERT INTO `att_leave` VALUES (23, 17, 5, 5, 1, NULL, '2024-03-31 16:25:38', '2024-03-31 16:25:38', 0);
INSERT INTO `att_leave` VALUES (24, 22, 5, 0, 1, NULL, '2024-03-31 16:26:05', '2024-03-31 16:26:05', 0);
INSERT INTO `att_leave` VALUES (25, 22, 5, 1, 1, NULL, '2024-03-31 16:26:09', '2024-03-31 16:26:09', 0);
INSERT INTO `att_leave` VALUES (26, 22, 5, 2, 1, NULL, '2024-03-31 16:26:13', '2024-03-31 16:26:13', 0);
INSERT INTO `att_leave` VALUES (27, 22, 5, 3, 1, NULL, '2024-03-31 16:26:16', '2024-03-31 16:26:16', 0);
INSERT INTO `att_leave` VALUES (28, 22, 5, 4, 1, NULL, '2024-03-31 16:26:20', '2024-03-31 16:26:20', 0);
INSERT INTO `att_leave` VALUES (29, 22, 5, 5, 1, NULL, '2024-03-31 16:26:23', '2024-03-31 16:26:23', 0);
INSERT INTO `att_leave` VALUES (30, 23, 5, 0, 1, NULL, '2024-03-31 16:27:05', '2024-03-31 16:27:05', 0);
INSERT INTO `att_leave` VALUES (31, 23, 5, 1, 1, NULL, '2024-03-31 16:27:08', '2024-03-31 16:27:08', 0);
INSERT INTO `att_leave` VALUES (32, 23, 5, 2, 1, NULL, '2024-03-31 16:27:12', '2024-03-31 16:27:12', 0);
INSERT INTO `att_leave` VALUES (33, 23, 5, 3, 1, NULL, '2024-03-31 16:27:35', '2024-03-31 16:27:35', 0);
INSERT INTO `att_leave` VALUES (34, 23, 5, 4, 1, NULL, '2024-03-31 16:27:39', '2024-03-31 16:27:39', 0);
INSERT INTO `att_leave` VALUES (35, 23, 5, 5, 1, NULL, '2024-03-31 16:27:42', '2024-03-31 16:27:42', 0);

-- ----------------------------
-- Table structure for att_overtime
-- ----------------------------
DROP TABLE IF EXISTS `att_overtime`;
CREATE TABLE `att_overtime`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `salary_multiple` decimal(5, 2) NULL DEFAULT NULL COMMENT '工资倍数，如按照小时计算，就是员工平均小时工资乘以倍数',
  `bonus` decimal(10, 3) NULL DEFAULT NULL COMMENT '加班奖金',
  `type_num` int(11) NULL DEFAULT NULL COMMENT '加班类型',
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `count_type` tinyint(1) NULL DEFAULT NULL COMMENT '0小时，1天，默认0，计数加班工资的类型',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `is_time_off` tinyint(1) NULL DEFAULT 0 COMMENT '0不补休，1补休，默认0',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '加班表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of att_overtime
-- ----------------------------
INSERT INTO `att_overtime` VALUES (1, 4.00, 200.000, 1, 2, 1, NULL, 0, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (2, 0.00, 0.000, 3, 15, 0, NULL, 1, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (3, 0.10, NULL, 1, 5, 0, NULL, 0, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (4, 0.30, NULL, 2, 5, 1, NULL, 0, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (5, 0.00, 0.000, 2, 2, 1, NULL, 1, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (6, 0.00, 0.000, 3, 2, 0, NULL, 1, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);
INSERT INTO `att_overtime` VALUES (7, 2.00, 150.000, 0, 2, 0, NULL, 0, '2024-03-31 13:29:31', '2024-03-31 13:29:31', 0);

-- ----------------------------
-- Table structure for att_staff_leave
-- ----------------------------
DROP TABLE IF EXISTS `att_staff_leave`;
CREATE TABLE `att_staff_leave`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `days` int(11) NULL DEFAULT NULL COMMENT '请假的天数',
  `type_num` int(11) NULL DEFAULT NULL COMMENT '请假类型id',
  `start_date` date NULL DEFAULT NULL COMMENT '请假的开始日期',
  `status` tinyint(1) NULL DEFAULT 0 COMMENT '0未审核，1审核通过，2驳回，3撤销',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工请假表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of att_staff_leave
-- ----------------------------
INSERT INTO `att_staff_leave` VALUES (18, 1, 4, 4, '2023-05-06', 1, '回家喽', '2024-03-31 13:29:37', '2024-03-31 16:20:35', 0);
INSERT INTO `att_staff_leave` VALUES (19, 1, 4, 4, '2023-05-14', 1, '回家喽', '2024-03-31 13:29:37', '2024-03-31 16:20:38', 0);
INSERT INTO `att_staff_leave` VALUES (20, 1, 4, 4, '2023-05-19', 1, NULL, '2024-03-31 13:29:37', '2024-03-31 16:20:39', 0);
INSERT INTO `att_staff_leave` VALUES (21, 1, 5, 0, '2024-01-10', 3, '努力复习中！', '2024-03-31 13:29:37', '2024-03-31 16:20:42', 1);
INSERT INTO `att_staff_leave` VALUES (22, 1, 2, 2, '2024-02-16', 1, NULL, '2024-03-31 13:29:37', '2024-03-31 16:20:45', 0);
INSERT INTO `att_staff_leave` VALUES (23, 1, 5, 0, '2024-02-15', 1, '有事情需要处理', '2024-03-31 13:29:37', '2024-03-31 16:20:46', 0);
INSERT INTO `att_staff_leave` VALUES (24, 1, 2, 0, '2024-02-21', 1, '有事', '2024-03-31 13:29:37', '2024-03-31 16:20:51', 0);

-- ----------------------------
-- Table structure for per_menu
-- ----------------------------
DROP TABLE IF EXISTS `per_menu`;
CREATE TABLE `per_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单编码',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `icon` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `path` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单路径',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '父菜单id，0代表根菜单，默认0',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of per_menu
-- ----------------------------
INSERT INTO `per_menu` VALUES (1, 'staff', '员工管理', 'team', '/staff', 5, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (2, 'docs', '文件管理', 'paper', '/docs', 5, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (3, 'role', '角色管理', 'user3', '/role', 6, '', '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (4, 'menu', '菜单管理', 'list', '/menu', 6, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (5, 'system', '系统管理', 'setting', '/system', 0, '', '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (6, 'permission', '权限管理', 'shield', '/permission', 0, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (13, 'department', '部门管理', 'building', '/department', 5, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (14, 'attendance', '考勤管理', 'refresh', '/attendance', 0, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (15, 'insurance', '五险一金', 'mark1', '/insurance', 17, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (16, 'salary', '薪资管理', 'shield', '/salary', 17, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (17, 'money', '财务管理', 'paper', '/money', 0, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (18, 'city', '参保城市', 'building', '/city', 17, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (19, 'leave', '请假审批', 'yes', '/leave', 14, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);
INSERT INTO `per_menu` VALUES (20, 'performance', '考勤表现', 'user2', '/performance', 14, NULL, '2024-03-31 13:29:43', '2024-03-31 13:29:43', 0);

-- ----------------------------
-- Table structure for per_role
-- ----------------------------
DROP TABLE IF EXISTS `per_role`;
CREATE TABLE `per_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `code` varchar(20) CHARACTER SET utf16 COLLATE utf16_general_ci NULL DEFAULT NULL COMMENT '角色编码',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色备注',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of per_role
-- ----------------------------
INSERT INTO `per_role` VALUES (1, 'superadmin', '管理员', '', '2024-03-31 13:29:48', '2024-03-31 13:29:48', 0);
INSERT INTO `per_role` VALUES (11, 'money', '财务', NULL, '2024-03-31 15:08:53', NULL, 0);
INSERT INTO `per_role` VALUES (12, 'hr', '人力', NULL, '2024-03-31 15:09:12', NULL, 0);
INSERT INTO `per_role` VALUES (13, 'admin', '总经理', NULL, '2024-03-31 15:31:33', '2024-03-31 15:47:08', 0);
INSERT INTO `per_role` VALUES (14, '111', '111', NULL, '2024-03-31 23:51:27', '2024-03-31 23:51:27', 0);

-- ----------------------------
-- Table structure for per_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `per_role_menu`;
CREATE TABLE `per_role_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `menu_id` int(11) NOT NULL COMMENT '菜单id',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0禁用，1正常，默认1',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '角色菜单关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of per_role_menu
-- ----------------------------
INSERT INTO `per_role_menu` VALUES (1, 1, 2, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (2, 1, 5, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (3, 1, 6, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (5, 1, 3, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (6, 1, 4, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (7, 1, 1, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (18, 1, 13, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (24, 1, 15, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (25, 1, 17, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (26, 1, 18, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (27, 1, 14, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (28, 1, 19, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (29, 1, 20, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (30, 1, 16, 1, '2024-03-31 13:29:53', '2024-03-31 13:29:53', 0);
INSERT INTO `per_role_menu` VALUES (41, 11, 17, 1, '2024-03-31 15:09:24', NULL, 0);
INSERT INTO `per_role_menu` VALUES (42, 11, 15, 1, '2024-03-31 15:09:24', NULL, 0);
INSERT INTO `per_role_menu` VALUES (43, 11, 16, 1, '2024-03-31 15:09:24', NULL, 0);
INSERT INTO `per_role_menu` VALUES (44, 11, 18, 1, '2024-03-31 15:09:24', NULL, 0);
INSERT INTO `per_role_menu` VALUES (45, 12, 1, 1, '2024-03-31 15:09:42', NULL, 0);
INSERT INTO `per_role_menu` VALUES (46, 12, 14, 1, '2024-03-31 15:09:42', NULL, 0);
INSERT INTO `per_role_menu` VALUES (47, 12, 19, 1, '2024-03-31 15:09:42', NULL, 0);
INSERT INTO `per_role_menu` VALUES (48, 12, 20, 1, '2024-03-31 15:09:42', NULL, 0);
INSERT INTO `per_role_menu` VALUES (49, 12, 5, 1, '2024-03-31 15:09:42', NULL, 0);
INSERT INTO `per_role_menu` VALUES (51, 13, 5, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (52, 13, 1, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (53, 13, 2, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (54, 13, 13, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (55, 13, 14, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (56, 13, 19, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (57, 13, 20, 1, '2024-03-31 15:31:38', NULL, 0);
INSERT INTO `per_role_menu` VALUES (58, 13, 17, 1, '2024-03-31 15:31:38', '2024-03-31 15:51:38', 0);
INSERT INTO `per_role_menu` VALUES (59, 13, 15, 1, '2024-03-31 15:31:38', '2024-03-31 15:51:38', 0);
INSERT INTO `per_role_menu` VALUES (60, 13, 16, 1, '2024-03-31 15:31:38', '2024-03-31 15:51:38', 0);
INSERT INTO `per_role_menu` VALUES (61, 13, 18, 1, '2024-03-31 15:31:38', '2024-03-31 15:51:38', 0);

-- ----------------------------
-- Table structure for per_staff_role
-- ----------------------------
DROP TABLE IF EXISTS `per_staff_role`;
CREATE TABLE `per_staff_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0禁用，1正常，默认1',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工角色关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of per_staff_role
-- ----------------------------
INSERT INTO `per_staff_role` VALUES (1, 1, 1, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (2, 29, 2, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (3, 29, 3, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (4, 3, 3, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (5, 3, 9, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (6, 3, 5, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (7, 31, 9, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (8, 1, 9, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (9, 6, 9, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (10, 6, 2, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (11, 9, 7, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (12, 2, 9, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (13, 3, 6, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (14, 3, 8, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (15, 2, 2, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (16, 1, 4, 0, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (17, 2, 4, 1, '2024-03-31 13:29:59', '2024-03-31 13:29:59', 0);
INSERT INTO `per_staff_role` VALUES (18, 38, 1, 0, '2024-03-31 15:34:38', '2024-03-31 15:34:42', 0);
INSERT INTO `per_staff_role` VALUES (19, 38, 13, 0, '2024-03-31 15:34:42', '2024-03-31 15:38:48', 0);
INSERT INTO `per_staff_role` VALUES (20, 38, 12, 1, '2024-03-31 15:38:48', NULL, 0);
INSERT INTO `per_staff_role` VALUES (21, 39, 11, 1, '2024-03-31 15:39:39', NULL, 0);
INSERT INTO `per_staff_role` VALUES (22, 2, 1, 0, '2024-03-31 15:48:21', '2024-03-31 15:54:05', 0);
INSERT INTO `per_staff_role` VALUES (23, 2, 13, 1, '2024-03-31 15:54:05', NULL, 0);

-- ----------------------------
-- Table structure for sal_salary
-- ----------------------------
DROP TABLE IF EXISTS `sal_salary`;
CREATE TABLE `sal_salary`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `base_salary` decimal(10, 3) NULL DEFAULT NULL COMMENT '基础工资',
  `overtime_salary` decimal(10, 3) NULL DEFAULT NULL COMMENT '加班费',
  `subsidy` decimal(10, 3) NULL DEFAULT NULL COMMENT '生活补贴',
  `bonus` decimal(10, 3) NULL DEFAULT NULL COMMENT '奖金',
  `total_salary` decimal(10, 3) NULL DEFAULT NULL COMMENT '总工资',
  `late_deduct` decimal(10, 3) NULL DEFAULT NULL COMMENT '早退扣款',
  `leave_deduct` decimal(10, 3) NULL DEFAULT NULL COMMENT '休假扣款',
  `leave_early_deduct` decimal(10, 3) NULL DEFAULT NULL COMMENT '早退扣款',
  `absenteeism_deduct` decimal(10, 3) NULL DEFAULT NULL COMMENT '旷工扣款',
  `month` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '月份',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工工资表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sal_salary
-- ----------------------------
INSERT INTO `sal_salary` VALUES (1, 1, 7000.000, NULL, 400.000, 200.000, 5595.000, 0.000, 640.000, 0.000, 100.000, '202204', 'jack的工资明细', '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (2, 1, 6800.000, NULL, 0.000, 100.000, 4795.000, 50.000, 160.000, 50.000, 100.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (3, 1, 6500.000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '202105', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (4, 1, 7000.000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '202112', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (5, 2, 6000.000, NULL, 600.000, 200.000, 5270.000, 0.000, 240.000, 50.000, 0.000, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (6, 2, 7000.000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '202104', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (7, 3, 6000.000, NULL, 0.000, 0.000, 5175.000, NULL, NULL, NULL, NULL, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (8, 1, 6000.000, NULL, 0.000, 0.000, 4735.000, NULL, NULL, NULL, NULL, '202202', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (9, 4, 6000.000, NULL, 500.000, 300.000, 5710.000, NULL, NULL, NULL, NULL, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (10, 5, 7000.000, NULL, 0.000, 0.000, 5368.000, NULL, NULL, NULL, NULL, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (11, 6, 8000.000, NULL, 0.000, 0.000, 6340.000, 0.000, 0.000, 50.000, 0.000, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (12, 7, 6000.000, NULL, 1000.000, 0.000, 5710.000, 0.000, 0.000, 0.000, 0.000, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (13, 8, 6000.000, NULL, 0.000, 0.000, 2100.000, 0.000, 0.000, 0.000, 0.000, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (14, 9, 6000.000, NULL, 0.000, 0.000, 5275.000, 0.000, 0.000, 0.000, 0.000, '202204', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (15, 1, 6666.000, NULL, 0.000, 0.000, 5401.000, 0.000, 0.000, 0.000, 0.000, '202203', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (16, 10, 8000.000, NULL, 0.000, 0.000, 5030.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (17, 2, 6050.000, NULL, 0.000, 0.000, 4660.000, 50.000, 0.000, 0.000, 100.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (18, 3, 6000.000, NULL, 0.000, 0.000, 4632.000, 50.000, 0.000, 100.000, 300.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (19, 4, 7000.000, NULL, 0.000, 0.000, 5510.000, 100.000, 0.000, 0.000, 300.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (20, 5, 7500.000, NULL, 0.000, 0.000, 5868.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (21, 6, 6500.000, NULL, 0.000, 0.000, 4890.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (22, 7, 7878.000, NULL, 0.000, 0.000, 6588.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (23, 8, 7999.000, NULL, 0.000, 0.000, 4099.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (24, 9, 7000.000, NULL, 0.000, 0.000, 6275.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (25, 11, 7000.000, NULL, 200.000, 0.000, 5345.000, 0.000, 0.000, 0.000, 0.000, '202205', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);
INSERT INTO `sal_salary` VALUES (26, 1, 4000.000, NULL, 500.000, 1000.000, 3026.000, 0.000, 0.000, 0.000, 0.000, '202403', NULL, '2024-03-31 13:30:12', '2024-03-31 13:30:12', 0);

-- ----------------------------
-- Table structure for sal_salary_deduct
-- ----------------------------
DROP TABLE IF EXISTS `sal_salary_deduct`;
CREATE TABLE `sal_salary_deduct`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `type_num` int(11) NULL DEFAULT NULL COMMENT '扣款类型，0迟到，1早退，2旷工，3休假',
  `deduct` int(11) NOT NULL DEFAULT 0 COMMENT '每次扣款金额',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '工资扣除表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sal_salary_deduct
-- ----------------------------
INSERT INTO `sal_salary_deduct` VALUES (1, 2, 2, 200, '旷工绝不姑息', '2024-03-31 13:30:19', '2024-03-31 13:30:19', 0);
INSERT INTO `sal_salary_deduct` VALUES (2, 2, 1, 0, NULL, '2024-03-31 13:30:19', '2024-03-31 13:30:19', 0);
INSERT INTO `sal_salary_deduct` VALUES (3, 2, 3, 0, NULL, '2024-03-31 13:30:19', '2024-03-31 13:30:19', 0);
INSERT INTO `sal_salary_deduct` VALUES (4, 2, 0, 100, NULL, '2024-03-31 13:30:19', '2024-03-31 13:30:19', 0);

-- ----------------------------
-- Table structure for soc_city
-- ----------------------------
DROP TABLE IF EXISTS `soc_city`;
CREATE TABLE `soc_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '参保城市',
  `average_salary` decimal(10, 3) NULL DEFAULT NULL COMMENT '职工上年度平均月工资',
  `lower_salary` decimal(10, 3) NULL DEFAULT NULL COMMENT '职工上年度最低月工资',
  `soc_upper_limit` decimal(10, 3) NULL DEFAULT NULL COMMENT '职工社保缴纳基数上限',
  `soc_lower_limit` decimal(10, 3) NULL DEFAULT NULL COMMENT '职工社保缴纳基数下限',
  `hou_upper_limit` decimal(10, 3) NULL DEFAULT NULL COMMENT '公积金缴纳基数上限',
  `hou_lower_limit` decimal(10, 3) NULL DEFAULT NULL COMMENT '公积金缴纳基数下限',
  `per_pension_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '个人养老保险缴费比例',
  `com_pension_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '企业养老保险缴费比例',
  `per_medical_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '个人医疗保险缴费比例',
  `com_medical_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '企业医疗保险缴费比例',
  `per_unemployment_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '个人失业保险缴费比例',
  `com_unemployment_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '企业失业保险缴费比例',
  `com_maternity_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '企业生育保险缴费比例',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '参保城市表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of soc_city
-- ----------------------------
INSERT INTO `soc_city` VALUES (1, '成都', 10000.000, 3000.000, 30000.000, 6000.000, 30000.000, 3000.000, 0.090, 0.160, 0.020, 0.090, 0.007, 0.006, 0.010, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);
INSERT INTO `soc_city` VALUES (2, '重庆', 8000.000, 3000.000, 24000.000, 4800.000, 24000.000, 3000.000, 0.100, 0.100, 0.020, 0.085, 0.005, 0.009, 0.028, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);
INSERT INTO `soc_city` VALUES (3, '北京', 12000.000, 4000.000, 36000.000, 7200.000, 36000.000, 4000.000, 0.080, 0.120, 0.020, 0.090, 0.011, 0.005, 0.008, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);
INSERT INTO `soc_city` VALUES (4, '上海', 15000.000, 10000.000, 45000.000, 9000.000, 45000.000, 10000.000, 0.076, 0.022, 0.010, 0.020, 0.100, 0.120, 0.090, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);
INSERT INTO `soc_city` VALUES (5, '武汉', 5000.000, 3400.000, 15000.000, 3000.000, 15000.000, 3400.000, 0.100, 0.130, 0.100, 0.130, 0.140, 0.021, 0.025, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);
INSERT INTO `soc_city` VALUES (6, '深圳', 13000.000, 10000.000, 39000.000, 7800.000, 39000.000, 10000.000, 0.050, 0.070, 0.030, 0.060, 0.015, 0.010, 0.010, NULL, '2024-03-31 13:30:24', '2024-03-31 13:30:24', 0);

-- ----------------------------
-- Table structure for soc_insurance
-- ----------------------------
DROP TABLE IF EXISTS `soc_insurance`;
CREATE TABLE `soc_insurance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) NULL DEFAULT NULL COMMENT '城市id',
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `house_base` decimal(10, 3) NULL DEFAULT NULL COMMENT '公积金基数',
  `per_house_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '公积金个人缴纳比例',
  `per_house_pay` decimal(10, 3) NULL DEFAULT NULL COMMENT '公积金个人缴纳费用',
  `com_house_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '公积金企业缴纳比例',
  `com_house_pay` decimal(10, 3) NULL DEFAULT NULL COMMENT '公积金企业缴纳费用',
  `social_base` decimal(10, 3) NULL DEFAULT NULL COMMENT '社保基数',
  `com_social_pay` decimal(10, 3) NULL DEFAULT NULL COMMENT '社保企业缴纳费用',
  `per_social_pay` decimal(10, 3) NULL DEFAULT NULL COMMENT '社保个人缴纳费用',
  `com_injury_rate` decimal(6, 3) NULL DEFAULT NULL COMMENT '工伤保险企业缴纳比例',
  `social_remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '社保备注',
  `house_remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公积金备注',
  `status` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0未支付，1已支付，2支付失败',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工五险一金表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of soc_insurance
-- ----------------------------
INSERT INTO `soc_insurance` VALUES (1, 4, 1, 10000.000, 0.080, 800.000, 0.050, 500.000, 9000.000, 2313.000, 1674.000, 0.005, '社保个人缴纳1674元', '公积金个人缴纳800元', 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (2, 3, 2, 5000.000, 0.080, 400.000, 0.080, 400.000, 8000.000, 2224.000, 840.000, 0.015, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (3, 4, 3, 3000.000, 0.120, 360.000, 0.120, 360.000, 3000.000, 813.000, 558.000, 0.019, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (4, 3, 4, 5000.000, 0.050, 250.000, 0.050, 250.000, 8000.000, 2256.000, 840.000, 0.019, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (5, 5, 5, 3400.000, 0.080, 272.000, 0.080, 272.000, 4000.000, 1916.000, 1360.000, 0.003, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (6, 5, 6, 5000.000, 0.050, 250.000, 0.050, 250.000, 4000.000, 1916.000, 1360.000, 0.003, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (7, 3, 7, 4500.000, 0.100, 450.000, 0.100, 450.000, 8000.000, 2120.000, 840.000, 0.002, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (8, 5, 8, 10000.000, 0.050, 500.000, 0.050, 500.000, 10000.000, 4910.000, 3400.000, 0.015, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (9, 2, 9, 4000.000, 0.050, 200.000, 0.050, 200.000, 5000.000, 1375.000, 525.000, 0.010, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (10, 5, 10, 5000.000, 0.050, 250.000, 0.050, 250.000, 8000.000, 3888.000, 2720.000, 0.010, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);
INSERT INTO `soc_insurance` VALUES (11, 6, 11, 10000.000, 0.100, 1000.000, 0.100, 1000.000, 9000.000, 1485.000, 855.000, 0.015, NULL, NULL, 0, '2024-03-31 13:30:31', '2024-03-31 13:30:31', 0);

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门编码',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `mor_start_time` time NULL DEFAULT NULL COMMENT '上午上班时间',
  `mor_end_time` time NULL DEFAULT NULL COMMENT '上午下班时间',
  `aft_start_time` time NULL DEFAULT NULL COMMENT '下午上班时间',
  `aft_end_time` time NULL DEFAULT NULL COMMENT '下午下班时间',
  `total_work_time` decimal(3, 1) NULL DEFAULT NULL COMMENT '员工工作总时长',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门备注',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '父级部门id，0根部门',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除，0未删除，1删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '部门表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES (1, NULL, '运维部门', NULL, NULL, NULL, NULL, NULL, NULL, 0, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (2, NULL, '运维1部', '06:00:00', '11:30:00', '13:00:00', '17:00:00', 9.5, '核心部门', 1, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (3, NULL, '运维2部', '06:00:00', '10:30:00', '13:30:00', '17:30:00', 8.5, NULL, 1, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (4, NULL, '销售部门', NULL, NULL, NULL, NULL, NULL, NULL, 0, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (5, NULL, '销售1部', '06:00:00', '10:00:00', '13:00:00', '16:30:00', 7.5, NULL, 4, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (6, NULL, '销售2部', '06:00:00', '10:30:00', '13:30:00', '17:00:00', 8.0, NULL, 4, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (7, NULL, '财务部门', NULL, NULL, NULL, NULL, NULL, '财务', 0, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (8, NULL, '财务1部', '06:00:00', '10:00:00', '14:00:00', '18:00:00', 8.0, NULL, 7, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (9, NULL, '财务2部', '06:00:00', '10:00:00', '13:00:00', '16:30:00', 7.5, NULL, 7, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (10, NULL, '财务3部', '06:00:00', '11:30:00', '13:00:00', '16:30:00', 9.0, NULL, 7, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (11, NULL, '开发部门', NULL, NULL, NULL, NULL, NULL, NULL, 0, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (12, NULL, '开发1部', '06:00:00', '12:00:00', '13:30:00', '17:30:00', 10.0, NULL, 11, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (13, NULL, '开发2部', '06:00:00', '11:00:00', '14:00:00', '17:30:00', 8.5, NULL, 11, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (14, NULL, '财务4部', '06:00:00', '10:30:00', '14:30:00', '18:00:00', 8.0, NULL, 7, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (15, NULL, '运维3部', '06:00:00', '12:00:00', '13:30:00', '18:00:00', 10.5, NULL, 1, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (16, NULL, '人事部门', NULL, NULL, NULL, NULL, NULL, '人力资源管理', 0, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (17, NULL, '人事1部', '07:00:00', '11:00:00', '13:30:00', '17:30:00', 8.0, NULL, 16, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (18, NULL, '人事2部', '06:10:00', '10:40:00', '13:40:00', '17:10:00', 8.0, NULL, 16, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (19, NULL, '人事3部', '06:10:00', '10:20:00', '13:30:00', '17:00:00', 7.7, NULL, 16, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (20, NULL, '运维4部', '06:00:00', '11:00:00', '13:00:00', '17:30:00', 9.5, NULL, 1, '2024-03-31 13:30:35', '2024-03-31 13:30:35', 0);
INSERT INTO `sys_dept` VALUES (21, NULL, '办公室', NULL, NULL, NULL, NULL, NULL, NULL, 0, '2024-03-31 15:32:49', '2024-03-31 15:32:49', 0);
INSERT INTO `sys_dept` VALUES (22, NULL, '总经理办公室', '09:30:00', '10:00:00', '15:00:00', '16:30:00', 2.0, NULL, 21, '2024-03-31 15:33:31', '2024-03-31 15:33:31', 0);
INSERT INTO `sys_dept` VALUES (23, NULL, '管理员', '09:30:00', '10:00:00', '15:00:00', '16:30:00', 2.0, NULL, 21, '2024-03-31 15:38:26', '2024-03-31 15:38:26', 0);

-- ----------------------------
-- Table structure for sys_docs
-- ----------------------------
DROP TABLE IF EXISTS `sys_docs`;
CREATE TABLE `sys_docs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件名称',
  `type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件类型',
  `old_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件的原名称',
  `md5` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件md5信息',
  `size` bigint(20) NULL DEFAULT NULL COMMENT '文件大小KB',
  `staff_id` int(11) NULL DEFAULT NULL COMMENT '文件上传者id',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件备注',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0未删除，1已删除，默认为0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '文件表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_docs
-- ----------------------------
INSERT INTO `sys_docs` VALUES (52, '7cac1b294047f2b76ab2.jpg', 'jpg', '07.jpg', '507704f05fbca53793bce9970b40e6c8', 175, 1, NULL, '2024-03-31 13:30:42', '2024-03-31 13:30:42', 0);

-- ----------------------------
-- Table structure for sys_staff
-- ----------------------------
DROP TABLE IF EXISTS `sys_staff`;
CREATE TABLE `sys_staff`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '员工编码',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '员工姓名',
  `gender` tinyint(1) NULL DEFAULT 0 COMMENT '性别，0男，1女，默认0',
  `pwd` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工密码',
  `avatar` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工头像',
  `birthday` date NULL DEFAULT NULL COMMENT '员工生日',
  `phone` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工电话',
  `address` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工备注',
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '员工状态，0异常，1正常',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除，0未删除，1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_staff
-- ----------------------------
INSERT INTO `sys_staff` VALUES (1, 'superadmin', '管理员', 0, 'E10A83EE057F20F8DC3949BA59ABBE56', '7cac1b294047f2b76ab2.jpg', '2000-12-05', '13344444444', '北京市朝阳区', '系统管理员，拥有最高权限', 23, 1, '2024-03-31 13:29:02', '2024-03-31 16:32:38', 0);
INSERT INTO `sys_staff` VALUES (2, 'admin', '张三', 1, 'E10A83EE057F20F8DC3949BA59ABBE56', '', '1998-04-17', '13344444444', '北京市海淀区', NULL, 22, 1, '2024-03-31 13:29:02', '2024-03-31 15:42:17', 0);
INSERT INTO `sys_staff` VALUES (38, 'user', '陈小明', 0, 'E10A83EE057F20F8DC3949BA59ABBE56', NULL, '1996-02-23', '15977777777', '北京市海淀区', NULL, 17, 1, '2024-03-31 15:32:36', '2024-03-31 15:45:50', 0);
INSERT INTO `sys_staff` VALUES (39, 'user2', '王小红', 1, 'E10A83EE057F20F8DC3949BA59ABBE56', NULL, '2000-06-06', '19977777777', '北京市朝阳区', NULL, 8, 1, '2024-03-31 15:39:22', '2024-03-31 15:45:52', 0);

SET FOREIGN_KEY_CHECKS = 1;
