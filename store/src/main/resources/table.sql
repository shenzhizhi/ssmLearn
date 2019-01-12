CREATE TABLE `item` (
  `item_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `item_name` varchar(20) NOT NULL COMMENT '商品名',
  `item_class` int(10) DEFAULT NULL COMMENT '商品类型id',
  `item_stock` int(10) DEFAULT NULL COMMENT '商品库存',
  `item_price` float DEFAULT NULL COMMENT '商品价格',
  `item_info` varchar(4000) DEFAULT NULL COMMENT '商品详细信息',
  `item_imagepath` varchar(100) DEFAULT NULL COMMENT '商品图片路径',
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `Item_item_id_uindex` (`item_id`),
  KEY `item_class` (`item_class`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`item_class`) REFERENCES `itemclass` (`itemClass_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

insert into item (item_name, item_class, item_stock, item_price, item_info, item_imagepath) VALUES ('猪肉',1,'20',15.0,'我是猪肉','');
insert into item (item_name, item_class, item_stock, item_price, item_info, item_imagepath) VALUES ('鸡肉',1,'50',16.0,'我鸡肉肉','');

CREATE TABLE `itemclass` (
  `itemClass_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品类型id',
  `itemClass_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`itemClass_id`),
  UNIQUE KEY `ItemClass_itemClass_id_uindex` (`itemClass_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品类型表'

insert into itemclass (itemClass_name) VALUES ('食品');