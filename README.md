# nacos-demo
nacos-demo
## windows下nacos配置
* step1：执行 nacos\conf  nacos-mysql.sql脚本
* step2：nacos\conf 下 application.properties 文件修改如下
  - spring.datasource.platform=mysql
  - db.num=1
  - db.url.0=jdbc:mysql://127.0.0.1:3306/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
  - db.user=root
  - db.password=123456
* step3：启动 nacos-win\nacos\bin 目录下 .\startup.cmd
