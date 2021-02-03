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
