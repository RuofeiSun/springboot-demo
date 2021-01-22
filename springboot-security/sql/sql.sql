 create table sys_user
 (
    id int primary key auto_increment,
    username varchar(32),
    password varchar(32)
 );

 ###角色表
 create table sys_role
 (
    id int primary key auto_increment,
    name varchar(32)
 );

 ###权限表
 create table sys_permission
 (
    id int primary key auto_increment,
    name varchar(32),
    description varchar(256),
    url varchar(256),
    pid int
 );

 ###用户角色表
 create table sys_user_role
 (
    id int primary key auto_increment,
    sys_user_id int,
    sys_role_id int
 );

 ###角色权限表
 create table sys_role_permission
 (
   id int primary key auto_increment,
   role_id int,
   permission_id int
 );

 insert into sys_user(id,username,password) values(1,'admin','admin');
 insert into sys_user(id,username,password) values(2,'abel','abel');

 insert into sys_role(id,name) values(1,'ROLE_ADMIN');
 insert into sys_role(id,name) values(2,'ROLE_USER');

 insert into sys_user_role(SYS_USER_ID,SYS_ROLE_ID) values(1,1);
 insert into sys_user_role(SYS_USER_ID,SYS_ROLE_ID) values(2,2);

INSERT INTO `sys_permission` VALUES('1','ROLE_HOME','home','/',null),('2','ROLE_ADMIN','ABel','admin',null);

INSERT INTO `sys_role_permission` VALUES('1','1','1'),('2','1','2'),('3','2','1');