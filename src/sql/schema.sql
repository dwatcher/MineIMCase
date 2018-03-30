-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE IF NOT EXISTS meim;
use meim;
-- 创建用户表
CREATE TABLE IF NOT EXISTS users (
    `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `username` varchar(100) NOT NULL COMMENT '账号',
    `nickname` varchar(100) NOT NULL COMMENT '昵称',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '账号创建时间',
    PRIMARY KEY (user_id),
    key idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '用户列表';

CREATE TABLE IF NOT EXISTS relation (
    `relation_id` int NOT NULL AUTO_INCREMENT COMMENT '关系ID',
    `usera` int NOT NULL COMMENT '用户aID',
    `userb` int NOT NULL COMMENT '用户bID',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (relation_id),
    key idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '用户列表';

INSERT INTO users(username, nickname)
VALUES
('用户1', '用户1'),
('用户2', '用户2'),
('用户3', '用户3');

INSERT INTO relation(usera, userb)
VALUES (1000, 1001),(1001, 1002),(1000, 1002);