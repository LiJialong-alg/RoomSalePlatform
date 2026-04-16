# RoomSalePlatform 房屋租赁平台

## 项目简介
RoomSalePlatform 是一个基于 Spring Boot 3.0.5 开发的房屋租赁管理平台，提供公寓管理、房间管理、租约管理、预约看房等核心功能。

## 技术栈
- **后端框架**: Spring Boot 3.0.5
- **持久层**: MyBatis-Plus 3.5.3.1
- **数据库**: MySQL
- **缓存**: Redis
- **对象存储**: MinIO
- **认证**: JWT
- **API文档**: Knife4j

## 项目结构
```
├── common/            # 公共模块
│   ├── constant/      # 常量定义
│   ├── exception/     # 异常处理
│   ├── login/         # 登录相关
│   ├── minio/         # MinIO配置
│   ├── mybatisplus/   # MyBatis-Plus配置
│   ├── result/        # 响应结果
│   └── utils/         # 工具类
├── model/             # 模型模块
│   ├── entity/        # 实体类
│   └── enums/         # 枚举类
├── web/               # Web模块
│   ├── web-admin/     # 后台管理系统
│   └── web-app/       # 前端应用系统
├── pom.xml            # 项目依赖
└── README.md          # 项目说明
```

## 功能模块
- **公寓管理**: 公寓信息的CRUD操作
- **房间管理**: 房间信息的CRUD操作
- **租约管理**: 租约的创建、修改、查询
- **预约看房**: 预约信息的管理
- **用户管理**: 系统用户和普通用户的管理
- **系统配置**: 基础数据的配置管理

## 启动说明
1. 配置数据库连接（application.yml）
2. 配置Redis连接（application.yml）
3. 配置MinIO连接（application.yml）
4. 运行 `AppWebApplication.java` 启动前端应用
5. 运行 `AdminWebApplication.java` 启动后台管理系统

## 访问地址
- 前端应用: http://localhost:8080
- 后台管理: http://localhost:8081

## 注意事项
- 本项目使用Java 17开发
- 数据库需要提前创建并导入初始化数据
- Redis和MinIO服务需要正常运行