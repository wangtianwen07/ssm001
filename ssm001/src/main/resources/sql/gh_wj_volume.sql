/*
Navicat MySQL Data Transfer

Source Server         : 10.192.2.250_remote
Source Server Version : 50636
Source Host           : 10.192.2.250:3306
Source Database       : ebs

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2017-09-29 17:04:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gh_wj_volume
-- ----------------------------
DROP TABLE IF EXISTS `gh_wj_volume`;
CREATE TABLE `gh_wj_volume` (
  `uuid` varchar(32) NOT NULL,
  `type` varchar(10) DEFAULT NULL,
  `sysid` varchar(32) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `startTime` date DEFAULT NULL,
  `endTime` date DEFAULT NULL,
  `tksMessage` varchar(500) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  `scope` varchar(20) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gh_wj_volume
-- ----------------------------
INSERT INTO `gh_wj_volume` VALUES ('8a4082025e6578f5015e65834c800004', '0', '', '2017中秋节福利问', '2017中秋节福利问卷调查', '2017-08-02', null, '感谢总工会的支持！', '1', null, '0', 'csscis/wj/volumes/8a4082025e6578f5015e65834c800004.jsp');
INSERT INTO `gh_wj_volume` VALUES ('8a4082025e65d831015e65dacc680002', '0', '1010', '劳动竞赛问卷', '劳动竞赛问卷调查', '2017-10-08', null, '感谢cctv', '1', null, '0', 'csscis/wj/volumes/8a4082025e65d831015e65dacc680002.jsp');
INSERT INTO `gh_wj_volume` VALUES ('8a4082025e65e436015e65fa766f000b', '0', '', '测试问卷', 'dasfdasfgggggs', '2017-09-14', null, 'dasf', '1', null, '0', 'csscis/wj/volumes/8a4082025e65e436015e65fa766f000b.jsp');
