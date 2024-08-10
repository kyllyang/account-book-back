drop table if exists sys_dict;
create table sys_dict
(
    id bigint auto_increment primary key,
    parent_code varchar(255) null comment '上级编码',
    code varchar(255) null comment '编码',
    name varchar(255) null comment '名称',
    sort int null comment '排序',
    version int null,
    create_by varchar(255),
    create_time datetime,
    update_by varchar(255),
    update_time datetime,
    delete_flag int(1) null
) comment='字典';

drop table if exists sys_dict_item;
create table sys_dict_item
(
    id bigint auto_increment primary key,
    dict_code varchar(255) null comment '字典编码',
    name varchar(255) null comment '字典项名',
    value_ varchar(255) null comment '字典项值',
    sort int null comment '排序',
    version int null,
    create_by varchar(255),
    create_time datetime,
    update_by varchar(255),
    update_time datetime,
    delete_flag int(1) null
) comment='字典项';

drop table if exists ab_record;
create table ab_record
(
    id bigint auto_increment primary key,
    code varchar(255) null comment '编码',
    channel_code varchar(255) null comment '渠道编码',
    date_ datetime comment '日期',
    amount integer comment '金额（分）',
    remark varchar(255) comment '备注',
    version int null,
    create_by varchar(255),
    create_time datetime,
    update_by varchar(255),
    update_time datetime,
    delete_flag int(1) null
) comment='消费记录';

drop table if exists ab_tag;
create table ab_tag
(
    id bigint auto_increment primary key,
    code varchar(255) null comment '编码',
    name varchar(255) null comment '名称',
    version int null,
    create_by varchar(255),
    create_time datetime,
    update_by varchar(255),
    update_time datetime,
    delete_flag int(1) null
) comment='消费标签';

drop table if exists ab_record_tag;
create table ab_record_tag
(
    id bigint auto_increment primary key,
    record_code varchar(255) null comment '消费记录编码',
    tag_code varchar(255) null comment '消费标签编码',
    version int null,
    create_by varchar(255),
    create_time datetime,
    update_by varchar(255),
    update_time datetime,
    delete_flag int(1) null
) comment='消费记录和标签关系';
