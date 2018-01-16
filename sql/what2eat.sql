/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : what2eat

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2018-01-16 23:12:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for history_menu
-- ----------------------------
DROP TABLE IF EXISTS `history_menu`;
CREATE TABLE `history_menu` (
  `idx` int(11) NOT NULL AUTO_INCREMENT COMMENT '逐渐id',
  `user_id` int(11) NOT NULL COMMENT '用户表id',
  `location_selected` varchar(255) NOT NULL COMMENT '地理位置',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `is_delete` int(1) NOT NULL DEFAULT '1' COMMENT '是否收藏 默认1',
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of history_menu
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `union_id` varchar(255) NOT NULL COMMENT '用户唯一标识',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_unique` (`union_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
