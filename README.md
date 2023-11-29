## 本项目实现的最终作用是基于JSP鞋子商城销售网站
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 商品查询
 - 用户管理
 - 管理员后台
 - 管理员登录
 - 订单查询
### 第2个角色为用户角色，实现了如下功能：
 - 修改用户信息
 - 填写订单
 - 支付
 - 查看我的订单
 - 查看鞋子
 - 用户注册
 - 用户登录
 - 用户首页
## 数据库设计如下：
# 数据库设计文档

**数据库名：** shoes_mall

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [good_info](#good_info) |  |
| [good_type](#good_type) |  |
| [order_good](#order_good) |  |
| [order_info](#order_info) |  |
| [shopping_cart](#shopping_cart) |  |
| [user_info](#user_info) |  |

**表名：** <a id="good_info">good_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | good_id |   int   | 10 |   0    |    N     |  Y   |       | 商品id  |
|  2   | good_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品名称  |
|  3   | good_price |   float   | 13 |   0    |    Y     |  N   |   NULL    | 商品价格  |
|  4   | good_desc |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品的简介  |
|  5   | good_pic |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品的图片  |
|  6   | good_count |   int   | 10 |   0    |    Y     |  N   |   NULL    | 商品的数量  |
|  7   | good_size |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品的大小  |
|  8   | good_color |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品的颜色  |
|  9   | good_type |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品类型  |

**表名：** <a id="good_type">good_type</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | type_id |   int   | 10 |   0    |    N     |  Y   |       | 类别id  |
|  2   | type_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 类别名称  |
|  3   | type_desc |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 类别的简介  |

**表名：** <a id="order_good">order_good</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | ord_good_id |   int   | 10 |   0    |    N     |  Y   |       | 详情id  |
|  2   | ord_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 订单id  |
|  3   | good_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 商品id  |
|  4   | good_size |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品大小  |
|  5   | good_color |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品颜色  |

**表名：** <a id="order_info">order_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | ord_id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | ord_u_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 收货人姓名  |
|  3   | ord_u_add |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 收货人地址  |
|  4   | ord_price |   float   | 13 |   0    |    Y     |  N   |   NULL    | 订单总额  |
|  5   | ord_type |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 订单状态  |
|  6   | ord_date |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 订单日期  |
|  7   | u_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 用户ID（外键）  |
|  8   | ord_u_phone |   varchar   | 11 |   0    |    Y     |  N   |   NULL    | 收货人电话  |
|  9   | ord_count |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品id集  |

**表名：** <a id="shopping_cart">shopping_cart</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | shop_id |   int   | 10 |   0    |    N     |  Y   |       | 购物车Id  |
|  2   | good_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 商品id  |
|  3   | good_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品名称  |
|  4   | good_count |   int   | 10 |   0    |    Y     |  N   |   NULL    | 商品数量  |
|  5   | good_price |   float   | 13 |   0    |    Y     |  N   |   NULL    | 商品价格  |
|  6   | u_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 用户id  |
|  7   | good_pic |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 商品图片  |
|  8   | good_color |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 颜色  |
|  9   | good_size |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 大小  |

**表名：** <a id="user_info">user_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | username |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 用户名  |
|  2   | u_id |   int   | 10 |   0    |    N     |  Y   |       | 用户id  |
|  3   | u_pwd |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 密码  |
|  4   | u_address |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 收货人地址  |
|  5   | u_birth |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 出生日期  |
|  6   | u_gender |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 性别  |
|  7   | u_num |   varchar   | 11 |   0    |    Y     |  N   |   NULL    | 电话号码  |
|  8   | u_money |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 余额  |
|  9   | u_name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 收货人姓名  |
|  10   | type |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 用户类型  |
|  11   | u_pic |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 头像  |

**运行不出来可以微信 javape 我的公众号：源码码头**
