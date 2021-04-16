/*
 Navicat Premium Data Transfer

 Source Server         : Chick
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : gdp

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 28/03/2021 22:03:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id',
  `CREATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者id',
  `CREATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者用户名',
  `UPDATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者id',
  `UPDATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者用户名',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限描述',
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称，驼峰式全英文，唯一',
  `PARENT_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父权限id',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `UK_f0cmfe8wqlt27hx76n0h9o2yf`(`NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('auth-d2CHlFWd', '1577254488052', 'usr-admin', 'admin', '1577254488052', 'usr-admin', 'admin', '管理权限的权限', 'authorityManagement', NULL);
INSERT INTO `authority` VALUES ('auth-hg1Iu2lG', '1577254471036', 'usr-admin', 'admin', '1577254471036', 'usr-admin', 'admin', '管理角色的权限', 'roleManagement', NULL);
INSERT INTO `authority` VALUES ('auth-l4ZqCT4J', '1578452859460', 'usr-admin', 'admin', '1578452859460', 'usr-admin', 'admin', '管理菜单的权限', 'menuManagement', NULL);
INSERT INTO `authority` VALUES ('auth-OLVmaPOj', '1577254457368', 'usr-admin', 'admin', '1577254457368', 'usr-admin', 'admin', '管理用户的权限', 'userManagement', NULL);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单id',
  `CREATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者id',
  `CREATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者用户名',
  `UPDATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者id',
  `UPDATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者用户名',
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称，驼峰式全英文，唯一',
  `ORDER_` int(0) NULL DEFAULT NULL COMMENT '排序',
  `PARENT_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父菜单id',
  `TITLE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单显示名称',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单描述',
  `ICON` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单图标',
  `PATH` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口路径',
  `DEPLOY` bit(1) NULL DEFAULT NULL COMMENT '是否部署',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `UK_oyl0vtq40kyv8fdfjuade2yqb`(`NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('file-362KK0Ra', '1578991960257', 'usr-admin', 'admin', '1581050117269', 'usr-admin', 'admin', 'userList', 2, 'file-RaEbwYZ3', '用户管理', '用户列表', 'el-icon-setting', 'user/userList', b'0');
INSERT INTO `menu` VALUES ('file-4DQOBJY9', '1580805691150', 'usr-admin', 'admin', '1596007301082', 'usr-admin', 'admin', 'menuList', 5, 'file-RaEbwYZ3', '菜单管理', '', 'el-icon-setting', 'menu/menuList', b'0');
INSERT INTO `menu` VALUES ('file-nuxpnaiU', '1580815008102', 'usr-admin', 'admin', '1581050080711', 'usr-admin', 'admin', 'authorityList', 4, 'file-RaEbwYZ3', '权限管理', '', 'el-icon-setting', 'authority/authorityList', b'0');
INSERT INTO `menu` VALUES ('file-PNmjz9PU', '1578991896698', 'usr-admin', 'admin', '1581050122226', 'usr-admin', 'admin', 'roleList', 3, 'file-RaEbwYZ3', '角色管理', '角色列表', 'el-icon-setting', 'role/roleList', b'0');
INSERT INTO `menu` VALUES ('file-RaEbwYZ3', '1581049773800', 'usr-admin', 'admin', '1581999128764', 'usr-admin', 'admin', 'userAuthorityManagement', 1, '', '用户权限管理', '', 'el-icon-user-solid', '', b'0');
INSERT INTO `menu` VALUES ('menu-0L06s0c8', '1613483590726', 'usr-admin', 'admin', NULL, NULL, NULL, 'shipAddress', 2, '', '定价管理', NULL, 'el-icon-money', '', b'0');
INSERT INTO `menu` VALUES ('menu-5Nw4LdtV', '1613482737535', 'usr-admin', 'admin', NULL, NULL, NULL, 'customer', 1, '', '客户管理', NULL, 'el-icon-user', '', b'0');
INSERT INTO `menu` VALUES ('menu-9eRWtA1O', '1613483637086', 'usr-admin', 'admin', NULL, NULL, NULL, 'shipAddressInfo', 2, 'menu-0L06s0c8', '运送地址定价', NULL, '', 'GRP/shipAddressInfo', b'0');
INSERT INTO `menu` VALUES ('menu-D86XfYi2', '1614608874049', 'usr-admin', 'admin', NULL, NULL, NULL, 'resSortInfo', 2, 'menu-0L06s0c8', '物品类别定价', NULL, '', 'GRP/resSortInfo', b'0');
INSERT INTO `menu` VALUES ('menu-gH77Z7Nt', '1613483952278', 'usr-admin', 'admin', NULL, NULL, NULL, 'orderInfo', 2, '', '订单管理', NULL, 'el-icon-s-order', 'GRP/OrderInfo', b'0');
INSERT INTO `menu` VALUES ('menu-HskRPloF', '1613483328929', 'usr-admin', 'admin', NULL, NULL, NULL, 'deliver', 1, '', '配送员管理', NULL, 'el-icon-truck', '', b'0');
INSERT INTO `menu` VALUES ('menu-IUB7ijrA', '1613482794296', 'usr-admin', 'admin', NULL, NULL, NULL, 'customerInfo', 2, 'menu-5Nw4LdtV', '客户信息', NULL, '', 'GRP/customerInfo', b'0');
INSERT INTO `menu` VALUES ('menu-jWERg0g2', '1613484470032', 'usr-admin', 'admin', NULL, NULL, NULL, 'feedbackInfo', 3, '', '反馈建议', NULL, 'el-icon-s-comment', 'GRP/feedbackInfo', b'0');
INSERT INTO `menu` VALUES ('menu-klZWxedI', '1613483059223', 'usr-admin', 'admin', NULL, NULL, NULL, 'addressInfo', 2, 'menu_pEovl9Ru', '客户地址', NULL, '', 'GRP/addressInfo', b'0');
INSERT INTO `menu` VALUES ('menu-kNVMBpRR', '1613483514036', 'usr-admin', 'admin', NULL, NULL, NULL, 'branchInfo', 2, 'menu-T2MEXPjS', '网点信息', NULL, '', 'GRP/branchInfo', b'0');
INSERT INTO `menu` VALUES ('menu-KXYSKxac', '1613483398640', 'usr-admin', 'admin', NULL, NULL, NULL, 'deliverInfo', 2, 'menu-HskRPloF', '配送员信息', NULL, '', 'GRP/deliverInfo', b'0');
INSERT INTO `menu` VALUES ('menu-n9BknU3O', '1613484397827', 'usr-admin', 'admin', NULL, NULL, NULL, 'BillInfo', 3, '', '运单信息', NULL, 'el-icon-s-promotion', 'GRP/BillInfo', b'0');
INSERT INTO `menu` VALUES ('menu-T2MEXPjS', '1613483453990', 'usr-admin', 'admin', NULL, NULL, NULL, 'branch', 2, '', '网点管理', NULL, 'el-icon-office-building', '', b'0');
INSERT INTO `menu` VALUES ('menu_pEovl9Ru', '1613229318126', 'usr-admin', 'admin', NULL, NULL, NULL, 'address', 1, '', '地址管理', NULL, 'el-icon-position', '', b'0');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `CREATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者id',
  `CREATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者用户名',
  `UPDATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者id',
  `UPDATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者用户名',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称，ROLE_开头，后接全英文，唯一',
  `PERMISSIONS` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端权限',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `UK_1jgik2hgsmfm7g4ee2nf5m6h3`(`NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('rol-QAv9DcTN', '1577254344223', 'usr-admin', 'admin', '1595490005856', 'usr-admin', 'admin', '管理员，拥有管理用户、角色、权限、菜单这四者的权限', 'ROLE_ADMIN', NULL);
INSERT INTO `role` VALUES ('role-i3oZjrJC', '1615461818820', 'usr-admin', 'admin', NULL, NULL, NULL, NULL, 'ROLE_STAFF', NULL);

-- ----------------------------
-- Table structure for role_authority
-- ----------------------------
DROP TABLE IF EXISTS `role_authority`;
CREATE TABLE `role_authority`  (
  `ROLE_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `AUTHORITY_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色和用户权限关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_authority
-- ----------------------------
INSERT INTO `role_authority` VALUES ('rol-QAv9DcTN', 'auth-d2CHlFWd');
INSERT INTO `role_authority` VALUES ('rol-QAv9DcTN', 'auth-hg1Iu2lG');
INSERT INTO `role_authority` VALUES ('rol-QAv9DcTN', 'auth-l4ZqCT4J');
INSERT INTO `role_authority` VALUES ('rol-QAv9DcTN', 'auth-OLVmaPOj');

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu`  (
  `ROLE_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `MENU_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色和用户菜单关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'file-362KK0Ra');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'file-PNmjz9PU');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'file-nuxpnaiU');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'file-4DQOBJY9');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'file-RaEbwYZ3');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu_pEovl9Ru');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-5Nw4LdtV');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-IUB7ijrA');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-klZWxedI');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-HskRPloF');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-KXYSKxac');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-T2MEXPjS');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-kNVMBpRR');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-0L06s0c8');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-9eRWtA1O');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-gH77Z7Nt');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-n9BknU3O');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-jWERg0g2');
INSERT INTO `role_menu` VALUES ('rol-QAv9DcTN', 'menu-D86XfYi2');

-- ----------------------------
-- Table structure for t_address
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address`  (
  `address_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '地址编号',
  `customer_id` int(0) NULL DEFAULT NULL COMMENT '客户编号',
  `address_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系号码',
  PRIMARY KEY (`address_id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  CONSTRAINT `t_address_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES (1, 1, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487');
INSERT INTO `t_address` VALUES (2, 1, '刘德华', '广东 广州市 天河区 天河区人民政府', '15099896867');
INSERT INTO `t_address` VALUES (3, 1, '郭富城', '广东 广州市 海珠区 海珠区人民政府', '18098498938');
INSERT INTO `t_address` VALUES (4, 1, '张学友', '广东 广州市 荔湾区荔湾区人民政府', '15058678970');
INSERT INTO `t_address` VALUES (5, 1, '陈奕迅', '广东 广州市 越秀区越秀区人民政府', '13609090898');
INSERT INTO `t_address` VALUES (7, 1, '吴优', '广东 广州市 番禺区 番禺区人民政府', '15037285635');
INSERT INTO `t_address` VALUES (8, 1, '刘秦', '广东 广州市 白云区 白云区人民政府', '13757463829');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `customer_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `customer_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户姓名',
  `customer_login_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帐号名',
  `customer_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `customer_age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `customer_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `customer_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系号码',
  `id_card_no` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号码',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES (1, '曾学锴', 'zxk', '123', 22, '男', '13265307487', '');
INSERT INTO `t_customer` VALUES (2, '张三', 'zhangsan', '123', 23, '男', '13729909371', '');
INSERT INTO `t_customer` VALUES (3, '李四', 'lisi', '123', 24, '男', '15090930220', NULL);

-- ----------------------------
-- Table structure for t_dot
-- ----------------------------
DROP TABLE IF EXISTS `t_dot`;
CREATE TABLE `t_dot`  (
  `dot_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '网点编号',
  `dot_city` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网点所属城市',
  `dot_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网点地址',
  `dot_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网点名称',
  `dot_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网点联系号码',
  PRIMARY KEY (`dot_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dot
-- ----------------------------
INSERT INTO `t_dot` VALUES (1, '广东省广州市', '广东 广州市 从化区 太平镇广州软件学院', '从化总部', '13729909370');
INSERT INTO `t_dot` VALUES (2, '广东省广州市', '广东 广州市 海珠区 海珠区宅急送分部', '海珠分部', '15067684889');
INSERT INTO `t_dot` VALUES (4, '广东省广州市', '广东 广州市 荔湾区 荔湾区宅急送分部', '荔湾分部', '18022824745');
INSERT INTO `t_dot` VALUES (5, '广东省广州市', '广东 广州市 天河区 天河区宅急送分部', '天河分部', '13798907868');
INSERT INTO `t_dot` VALUES (6, '广东省广州市', '广东 广州市 白云区 白云区宅急送分部', '白云分部', '15098684678');
INSERT INTO `t_dot` VALUES (7, '广东省广州市', '广东 广州市 越秀区 越秀区宅急送分部', '越秀分部', '13890897865');
INSERT INTO `t_dot` VALUES (8, '广东省广州市', '广东 广州市 花都区 花都区宅急送分部', '花都分部', '15023546786');
INSERT INTO `t_dot` VALUES (9, '广东省广州市', '广东 广州市 增城区 增城区宅急送分部', '增城分部', '15029099087');
INSERT INTO `t_dot` VALUES (10, '广东省广州市', '广东 广州市 番禺区 番禺区宅急送分部', '番禺分部', '18087965425');

-- ----------------------------
-- Table structure for t_feedback
-- ----------------------------
DROP TABLE IF EXISTS `t_feedback`;
CREATE TABLE `t_feedback`  (
  `feedback_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '反馈编号',
  `customer_id` int(0) NULL DEFAULT NULL COMMENT '客户编号',
  `feedback_content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '反馈内容',
  `mailxbox` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系邮箱',
  PRIMARY KEY (`feedback_id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  CONSTRAINT `t_feedback_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_feedback
-- ----------------------------
INSERT INTO `t_feedback` VALUES (1, 1, '希望好好改进', '497231387@qq.com');
INSERT INTO `t_feedback` VALUES (11, 1, '加油', '474898029@qq.com');
INSERT INTO `t_feedback` VALUES (12, 1, '测试1', '857128383@qq.com');
INSERT INTO `t_feedback` VALUES (13, 1, '测试2', '876875987@qq.com');
INSERT INTO `t_feedback` VALUES (14, 1, '测试3', '849038787@qq.com');
INSERT INTO `t_feedback` VALUES (15, 1, '加油', '1092838475@qq.com');

-- ----------------------------
-- Table structure for t_logistics
-- ----------------------------
DROP TABLE IF EXISTS `t_logistics`;
CREATE TABLE `t_logistics`  (
  `logistics_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '物流编号',
  `waybill_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运单编号',
  `staff_id` int(0) NULL DEFAULT NULL COMMENT '员工编号',
  `logistics_type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流更新（收入，发出）',
  `start_dot_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '起始网点名',
  `target_dot_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标网点名',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '填写物流信息时间',
  PRIMARY KEY (`logistics_id`) USING BTREE,
  INDEX `waybill_id`(`waybill_id`) USING BTREE,
  INDEX `staff_id`(`staff_id`) USING BTREE,
  CONSTRAINT `t_logistics_ibfk_1` FOREIGN KEY (`waybill_id`) REFERENCES `t_waybill` (`waybill_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `t_logistics_ibfk_2` FOREIGN KEY (`staff_id`) REFERENCES `t_staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_logistics
-- ----------------------------
INSERT INTO `t_logistics` VALUES (24, '112021031021255508', 1, '收入', '华软总部', '华软总部', '2021-03-10 14:12:52');
INSERT INTO `t_logistics` VALUES (25, '112021031021255508', 1, '发出', '华软总部', '白云分部', '2021-03-10 14:16:02');
INSERT INTO `t_logistics` VALUES (26, '112021031021255508', 1, '收入', '白云分部', '白云分部', '2021-03-10 14:34:48');
INSERT INTO `t_logistics` VALUES (28, '112021031221430105', 10, '收入', '天河分部', '天河分部', '2021-03-12 16:33:05');
INSERT INTO `t_logistics` VALUES (29, '112021031221430105', 10, '收入', '天河分部', '番禺分部', '2021-03-12 16:33:28');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `order_id` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `customer_id` int(0) NULL DEFAULT NULL COMMENT '客户编号',
  `dot_id` int(0) NULL DEFAULT NULL COMMENT '网点编号',
  `staff_id` int(0) NULL DEFAULT NULL COMMENT '员工编号',
  `sender` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件人姓名',
  `sender_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄出地址',
  `sender_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件人联系号码',
  `receiver` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人姓名',
  `receiving_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货地址',
  `receiver_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人联系号码',
  `weight` int(0) NULL DEFAULT NULL COMMENT '预计重量',
  `res_sort` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物品类别',
  `insured_price` int(0) NULL DEFAULT NULL COMMENT '保价（1为保价，0为不保价）',
  `freight` decimal(5, 2) NULL DEFAULT NULL COMMENT '运费',
  `payment_method` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付方式',
  `remarks` varchar(160) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `order_time` datetime(0) NULL DEFAULT NULL COMMENT '下单时间',
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `custmer_id`(`customer_id`) USING BTREE,
  INDEX `dot_id`(`dot_id`) USING BTREE,
  INDEX `staff_id`(`staff_id`) USING BTREE,
  CONSTRAINT `t_order_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `t_order_ibfk_2` FOREIGN KEY (`dot_id`) REFERENCES `t_dot` (`dot_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `t_order_ibfk_3` FOREIGN KEY (`staff_id`) REFERENCES `t_staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1615288579189311', 1, 1, NULL, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487', '刘德华', '广东 广州市 从化区 城建学院', '15099896867', 1, '证照证件', 0, 9.00, '在线支付', NULL, '2021-03-09 11:16:19');
INSERT INTO `t_order` VALUES ('1615380797485942', 1, 1, NULL, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487', '刘德华', '广东 广州市 天河区 天河区人民政府', '15099896867', 1, '鲜花', 0, 9.00, '在线支付', NULL, '2021-03-10 12:53:17');
INSERT INTO `t_order` VALUES ('1615381014960702', 1, 1, NULL, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487', '郭富城', '广东 广州市 海珠区 海珠区人民政府', '18098498938', 3, '蛋糕', 1, 15.00, '在线支付', NULL, '2021-03-10 12:56:55');
INSERT INTO `t_order` VALUES ('1615381316370758', 1, 1, 10, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487', '张学友', '广东 广州市 荔湾区荔湾区人民政府', '15058678970', 1, '文件', 0, 7.00, '在线支付', NULL, '2021-03-10 13:01:56');
INSERT INTO `t_order` VALUES ('1615382755394064', 1, 1, 1, '曾学锴', '广东 广州市 从化区 太平镇广州软件学院', '13265307487', '刘秦', '广东 广州市 白云区 白云区人民政府', '13757463829', 1, '证照证件', 0, 9.00, '在线支付', NULL, '2021-03-10 13:25:55');
INSERT INTO `t_order` VALUES ('1615556581837560', 1, 10, 10, '刘德华', '广东 广州市 天河区 天河区人民政府', '15099896867', '吴优', '广东 广州市 番禺区 番禺区人民政府', '15037285635', 2, '鲜花', 1, 13.00, '在线支付', NULL, '2021-03-12 13:43:02');

-- ----------------------------
-- Table structure for t_res_sort
-- ----------------------------
DROP TABLE IF EXISTS `t_res_sort`;
CREATE TABLE `t_res_sort`  (
  `res_sort_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '物品类别编号',
  `res_sort` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物品类别',
  `res_sort_money` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物品定价',
  PRIMARY KEY (`res_sort_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_res_sort
-- ----------------------------
INSERT INTO `t_res_sort` VALUES (1, '其他', '2.00');
INSERT INTO `t_res_sort` VALUES (2, '鲜花', '3.00');
INSERT INTO `t_res_sort` VALUES (3, '蛋糕', '3.00');
INSERT INTO `t_res_sort` VALUES (4, '文件', '1.00');
INSERT INTO `t_res_sort` VALUES (6, '证照证件', '3.00');
INSERT INTO `t_res_sort` VALUES (7, '数码家电', '3.00');
INSERT INTO `t_res_sort` VALUES (8, '服饰鞋帽', '3.00');
INSERT INTO `t_res_sort` VALUES (9, '食品饮料', '1.00');
INSERT INTO `t_res_sort` VALUES (10, '水果生鲜', '2.00');

-- ----------------------------
-- Table structure for t_res_weight
-- ----------------------------
DROP TABLE IF EXISTS `t_res_weight`;
CREATE TABLE `t_res_weight`  (
  `res_weight_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '物品重量编号',
  `res_weight` int(0) NULL DEFAULT NULL COMMENT '物品重量',
  `res_weight_money` decimal(5, 2) NULL DEFAULT NULL COMMENT '物品重量定价',
  PRIMARY KEY (`res_weight_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_res_weight
-- ----------------------------
INSERT INTO `t_res_weight` VALUES (1, 1, 10.00);
INSERT INTO `t_res_weight` VALUES (2, 2, 12.00);
INSERT INTO `t_res_weight` VALUES (3, 3, 14.00);
INSERT INTO `t_res_weight` VALUES (4, 4, 16.00);
INSERT INTO `t_res_weight` VALUES (5, 5, 18.00);
INSERT INTO `t_res_weight` VALUES (6, 6, 20.00);
INSERT INTO `t_res_weight` VALUES (7, 7, 22.00);
INSERT INTO `t_res_weight` VALUES (8, 8, 24.00);
INSERT INTO `t_res_weight` VALUES (9, 9, 26.00);

-- ----------------------------
-- Table structure for t_send
-- ----------------------------
DROP TABLE IF EXISTS `t_send`;
CREATE TABLE `t_send`  (
  `send_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '派送编号',
  `waybill_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运单编号',
  `staff_id` int(0) NULL DEFAULT NULL COMMENT '员工编号',
  `send_time` datetime(0) NULL DEFAULT NULL COMMENT '派送时间',
  `sign_state` int(0) NULL DEFAULT NULL COMMENT '签收状态(0为已签收，1位拒签)',
  `stime` datetime(0) NULL DEFAULT NULL COMMENT '操作时间',
  `reject_reasons` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拒收原因',
  PRIMARY KEY (`send_id`) USING BTREE,
  INDEX `waybill_id`(`waybill_id`) USING BTREE,
  INDEX `staff_id`(`staff_id`) USING BTREE,
  CONSTRAINT `t_send_ibfk_1` FOREIGN KEY (`waybill_id`) REFERENCES `t_waybill` (`waybill_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `t_send_ibfk_2` FOREIGN KEY (`staff_id`) REFERENCES `t_staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_send
-- ----------------------------
INSERT INTO `t_send` VALUES (35, '112021031021015613', 2, '2021-03-10 13:14:13', NULL, NULL, NULL);
INSERT INTO `t_send` VALUES (38, '112021031021255508', 7, '2021-03-10 15:01:59', 0, '2021-03-10 15:18:51', NULL);

-- ----------------------------
-- Table structure for t_ship_address
-- ----------------------------
DROP TABLE IF EXISTS `t_ship_address`;
CREATE TABLE `t_ship_address`  (
  `ship_address_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '运送地址定价',
  `start_address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '始点',
  `end_address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '终点',
  `ship_address_money` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运送地址定价',
  PRIMARY KEY (`ship_address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_ship_address
-- ----------------------------
INSERT INTO `t_ship_address` VALUES (1, '广东 广州市 从化区', '广东 广州市 从化区', '1.00');
INSERT INTO `t_ship_address` VALUES (2, '广东 广州市 从化区', '广东 广州市 天河区', '3.00');
INSERT INTO `t_ship_address` VALUES (4, '广东 广州市 从化区', '广东 广州市 海珠区', '3.00');
INSERT INTO `t_ship_address` VALUES (5, '广东 广州市 从化区', '广东 广州市 荔湾区', '3.00');
INSERT INTO `t_ship_address` VALUES (6, '广东 广州市 从化区', '广东 广州市 越秀区', '3.00');
INSERT INTO `t_ship_address` VALUES (7, '广东 广州市 从化区', '广东 广州市 白云区', '2.00');
INSERT INTO `t_ship_address` VALUES (8, '广东 广州市 从化区', '广东 广州市 花都区', '2.00');
INSERT INTO `t_ship_address` VALUES (9, '广东 广州市 从化区', '广东 广州市 增城区', '2.00');
INSERT INTO `t_ship_address` VALUES (10, '广东 广州市 从化区', '广东 广州市 番禺区', '3.00');

-- ----------------------------
-- Table structure for t_staff
-- ----------------------------
DROP TABLE IF EXISTS `t_staff`;
CREATE TABLE `t_staff`  (
  `staff_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `staff_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `staff_login_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工帐号',
  `staff_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录密码',
  `staff_age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `staff_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `staff_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系号码',
  `hiredate` date NULL DEFAULT NULL COMMENT '入职时间',
  `dot_id` int(0) NULL DEFAULT NULL COMMENT '网点id',
  PRIMARY KEY (`staff_id`) USING BTREE,
  INDEX `dot_id`(`dot_id`) USING BTREE,
  CONSTRAINT `t_staff_ibfk_1` FOREIGN KEY (`dot_id`) REFERENCES `t_dot` (`dot_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_staff
-- ----------------------------
INSERT INTO `t_staff` VALUES (1, '隆五', 'longwu', '123', 25, '男', '15289897867', '2021-03-03', 1);
INSERT INTO `t_staff` VALUES (2, '李四', 'lisi', '123', 25, '男', '15090876757', '2021-03-03', 2);
INSERT INTO `t_staff` VALUES (4, '张三', 'zhang', '123', 25, '男', '13729909370', '2021-03-03', 4);
INSERT INTO `t_staff` VALUES (7, '史提芬生', 'sitifenshen', '123', 26, '男', '15090879087', '2021-03-03', 6);
INSERT INTO `t_staff` VALUES (8, '刘牛', 'liuniu', '123', 26, '女', '15098976536', '2021-03-03', 7);
INSERT INTO `t_staff` VALUES (9, '吴赵', 'wuzhao', '123', 29, '男', '18097987649', '2021-03-03', 10);
INSERT INTO `t_staff` VALUES (10, '刘一', 'liuyi', '123', 20, '女', '1509293849', '2021-03-03', 5);
INSERT INTO `t_staff` VALUES (11, '系统管理员', 'admin', '1111', 25, '男', '15098086958', '2021-03-03', NULL);

-- ----------------------------
-- Table structure for t_waybill
-- ----------------------------
DROP TABLE IF EXISTS `t_waybill`;
CREATE TABLE `t_waybill`  (
  `waybill_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单运输编号',
  `order_id` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编号',
  `receipt_time` datetime(0) NULL DEFAULT NULL COMMENT '接单时间',
  `confirm_time` datetime(0) NULL DEFAULT NULL COMMENT '员工确认收件时间',
  `payment_time` datetime(0) NULL DEFAULT NULL COMMENT '付款时间',
  `cancel_time` datetime(0) NULL DEFAULT NULL COMMENT '取消时间',
  `finish_time` datetime(0) NULL DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY (`waybill_id`) USING BTREE,
  INDEX `order_id`(`order_id`) USING BTREE,
  CONSTRAINT `t_waybill_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `t_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_waybill
-- ----------------------------
INSERT INTO `t_waybill` VALUES ('112021030919161935', '1615288579189311', NULL, NULL, '2021-03-09 11:16:19', NULL, NULL);
INSERT INTO `t_waybill` VALUES ('112021031020531753', '1615380797485942', NULL, NULL, '2021-03-10 12:53:17', NULL, NULL);
INSERT INTO `t_waybill` VALUES ('112021031020565473', '1615381014960702', NULL, NULL, '2021-03-10 12:56:55', NULL, NULL);
INSERT INTO `t_waybill` VALUES ('112021031021015613', '1615381316370758', '2021-03-10 14:18:40', NULL, '2021-03-10 13:01:56', NULL, NULL);
INSERT INTO `t_waybill` VALUES ('112021031021255508', '1615382755394064', '2021-03-10 13:53:40', '2021-03-10 14:04:38', '2021-03-10 15:18:51', NULL, '2021-03-10 15:18:51');
INSERT INTO `t_waybill` VALUES ('112021031221430105', '1615556581837560', '2021-03-12 15:50:55', '2021-03-12 16:30:15', '2021-03-12 13:43:02', NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `CREATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者id',
  `CREATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者用户名',
  `UPDATE_TIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者id',
  `UPDATE_USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者用户名',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户描述',
  `EMAIL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱地址',
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `NICKNAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `PASSWORD` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码，需要加密',
  `PHONE` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话号码',
  `STATUS` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户状态，属性值详见枚举类UserStatus',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `UK_kpjtmcyew2jx0jn8ouw1jmw2n`(`NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('usr-admin', '', '', '', '1581050800138', 'usr-admin', 'admin', '', '', 'admin', '管理员', '$2a$10$852p2TT7sJjZEHE64liF.ObcvwIYTfJ4FYE4s1c4Z/.IuwWD89QDa', '', '1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `USER_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `ROLE_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户和用户角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('usr-admin', 'rol-QAv9DcTN');

SET FOREIGN_KEY_CHECKS = 1;
