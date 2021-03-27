use demo;

##创建用户表
 CREATE TABLE IF NOT EXISTS `user`(
   `id` BIGINT AUTO_INCREMENT comment '唯一标识id',
   `title` VARCHAR(100) NOT NULL comment '标题',
   `author` VARCHAR(40) NOT NULL comment '作者',
   `create_time` datetime DEFAULT NOW() comment '创建时间',
   `update_time` datetime DEFAULT NOW() comment '更新时间',
   `version` BIGINT default 1 comment '版本号',
   `status` INT(2) default 0 comment '状态',
   `delete_status` INT(2) default 0 comment '逻辑删除',
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


