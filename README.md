# seckill 秒杀系统

## 步骤
1. 利用maven创建项目骨架
 
	mvn archetype:generate -DgroupId=org.seckill -DartifactId=seckill -DarchetypeArtifactId=maven-archetype-webapp
	
2. 更改web.xml中servlet版本
   
   <web-app xmlns="http://java.sun.com/xml/ns/javaee"
	  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	  xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
	                      http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	  version="3.0"
	  metadata-complete="true">
	</web-app>

3. 目录添加

 - 目录src/main 添加java
 - 目录src 添加 test/java test/resource
 
4. 添加项目依赖 pom.xml


## 功能

1. 秒杀接口暴露
2. 执行秒杀
3. 相关查询

## 设计

1. DAO 层设计
2. Service 层设计
3. web 设计


## 相关文档

1. MyBatis http://www.mybatis.org/mybatis-3/getting-started.html
2. spring http://docs.spring.io/spring/docs/4.1.7.RELEASE/spring-framework-reference/
 
