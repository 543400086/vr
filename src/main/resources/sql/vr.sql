drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment,
   userName             varchar(20),
   sex                  int4,
   birthday             datetime,
   mobile               varchar(30),
   idcard               varchar(20),
   email                varchar(100),
   education            varchar(20) comment '学历',
   department           varchar(50) comment '部门',
   position             varchar(50) comment '职位',
   level                varchar(20) comment '级别',
   primary key (id)
);


drop table if exists Customer;

/*==============================================================*/
/* Table: Customer                                              */
/*==============================================================*/
create table Customer
(
   id                   int not null auto_increment,
   customerName         varchar(50),
   moble                varchar(50),
   address              varchar(200),
   type                 varchar(50),
   plateNumber          varchar(50),
   engineNumber         varchar(50),
   datetime             datetime,
   createBy             varchar(50),
   primary key (id)
);


drop table if exists MaintainOrder;

/*==============================================================*/
/* Table: MaintainOrder                                         */
/*==============================================================*/
create table MaintainOrder
(
   id                   int not null auto_increment,
   customerId           int4 comment '客户Id',
   beginTime            datetime comment '维修开始时间',
   endTime              datetime comment '维修结束时间',
   totalPrice           decimal(2) comment '订单总金额',
   discount             decimal(1) comment '折扣率',
   discountAmount       decimal(2) comment '优惠金额',
   status               int comment '状态：1维修中 2完成 3已结算',
   maintainName         varchar(20) comment '维修人',
   primary key (id)
);

drop table if exists MaintainOrderDetail;

/*==============================================================*/
/* Table: MaintainOrderDetail                                   */
/*==============================================================*/
create table MaintainOrderDetail
(
   id                   int not null auto_increment,
   orderId              int4,
   itemId               int4,
   itemName             varchar(50),
   itemType             int comment '类型：1维修项目   2配件',
   buyPrice             decimal(2) comment '进货价',
   salePrice            decimal(2) comment '销售价',
   count                int comment '数量',
   createTime           datetime,
   primary key (id)
);






drop table if exists MaintainProject;

/*==============================================================*/
/* Table: MaintainProject                                       */
/*==============================================================*/
create table MaintainProject
(
   id                   int not null auto_increment,
   projectName          varchar(50),
   chargeUnit           varchar(20) comment '计费单位',
   carType              varchar(10),
   TimeFee              int comment '工时费',
   guaranteeTime        int comment '保修期限',
   remark               varchar(200),
   primary key (id)
);

drop table if exists part;

/*==============================================================*/
/* Table: part                                                  */
/*==============================================================*/
create table part
(
   id                   int4 not null,
   partName             varchar(200) comment '名称',
   unit                 varchar(20) comment '单位',
   standard             varchar(20) comment '规格',
   supplier             varchar(50) comment '供应商',
   location             varchar(200) comment '产地',
   validTime            datetime comment '有效期',
   generalType          varchar(20) comment '通用车型',
   buyPrice             decimal(0) comment '进货价',
   SalePrice            decimal comment '销售价',
   createTime           datetime,
   updateTime           datetime,
   primary key (id)
);

alter table part comment '配件表';



drop table if exists PartPurchase;

/*==============================================================*/
/* Table: PartPurchase                                          */
/*==============================================================*/
create table PartPurchase
(
   id                   int not null auto_increment,
   purchaseNumber       varchar(20),
   partId               int4,
   buyPrice             decimal,
   salePrice            decimal(0),
   createTime           datetime,
   primary key (id)
);


drop table if exists PartStock;

/*==============================================================*/
/* Table: PartStock                                              */
/*==============================================================*/
create table PartStock
(
   id                   int not null auto_increment,
   partId               int4,
   count                int4,
   status               int4,
   primary key (id)
);












