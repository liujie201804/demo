##user 字段添加
##alter table user add delete_status int(2) default 0 comment '逻辑删除备注：0 正常 ，1 删除';
##user 字段添加注释
ALTER TABLE user MODIFY COLUMN delete_status int(2) default 0 COMMENT '逻辑删除备注：0 正常 ，1 删除';