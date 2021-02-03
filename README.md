# nacos-demo
nacos-demo
## windows下nacos配置
* step1：解压 nacos-server-1.2.1.tar.gz 文件
* step2：执行 nacos\conf  nacos-mysql.sql脚本
* step3：nacos\conf 下 application.properties 文件修改如下
  - spring.datasource.platform=mysql
  - db.num=1
  - db.url.0=jdbc:mysql://127.0.0.1:3306/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
  - db.user=root
  - db.password=123456
* step4：启动 nacos-win\nacos\bin 目录下 .\startup.cmd
* step5：访问 http://localhost:8848/nacos ，账号和密码均为nacos
## 服务注册中心演示
* step1：运行服务提供方 PaymentMain9001.java
* step2：运行服务提供方 PaymentMain9002.java
* step2：运行服务消费方 OrderNacosMain83.java
* step3：浏览器访问消费方接口 http://localhost:8082/consumer/payment/nacos/1 实现调用服务提供方接口
## 服务注册中心单个服务多实例测试
请求消费者http://localhost:8082/consumer/payment/nacos/1 会轮询请求健康的提供者,输出如下：
```
nacos 注册中⼼，服务端⼝:8080 id1
nacos 注册中⼼，服务端⼝:8081 id1
nacos 注册中⼼，服务端⼝:8080 id1
nacos 注册中⼼，服务端⼝:8081 id1
... 
```
