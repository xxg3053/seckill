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
    * SeckillDao 秒杀接口  
    * SuccessKilledDao 秒杀成功接口  
   
2. Service 层设计
   * SeckillService 秒杀服务层

3. DTO 数据传输层设计
   * Exposer 秒杀暴露接口
   * SeckillExecution 秒杀结果
   
4. 常量设计
   * SeckillStatEnum 使用枚举定义常量
   
5. Web 设计
    - 秒杀API的URL设计 Restful风格
        * GET  /seckill/list                 秒杀列表
        * GET  /seckill/{id}/detail          详情页
        * GET  /seckill/time/now             系统时间
        * POST /seckill/{id}/exposer         暴露秒杀
        * POST /seckill/{id}/{md5}/execution 执行秒杀
    - 围绕Handle开发
    - SpringMVC运行流程
    - HTTP请求地址映射原理
        * Servlet容器（tomcat,jetty等）
    - 注解映射技巧
        * RequestMapping注解
            - 支持标准的URL
            - Ant风格URL(即？和*和**等字符)
            - 带｛xxx｝占位符的URL
    - 请求方式细节处理
        1. 请求参数绑定
        2. 请求方式限制
        3. 请求转发和重定向
        4. 数据模型赋值
        5. 返回json数据
        6. cookie访问
    
  


## 相关文档

1. MyBatis http://www.mybatis.org/mybatis-3/getting-started.html
2. pring http://docs.spring.io/spring/docs/4.1.7.RELEASE/spring-framework-reference/
3. logback http://logback.qos.ch/manual/configuration.html
4. 使用logback而不是用log4j的原因 http://logback.qos.ch/reasonsToSwitch.html
5. Bootstrap http://www.runoob.com/bootstrap/bootstrap-tutorial.html
 
