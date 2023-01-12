"# Springsecurity" 
单点登录SSO解决方案之SpringSecurity+JWT实现

参考：https://blog.csdn.net/qq_38526573/article/details/103409430


数据库的表名为t_user,字段分别是username 和 password
其中password不能直接存明文，需要存储BCryptPasswordEncoder加密后的字符，可以直接调用encode方法进行加密
