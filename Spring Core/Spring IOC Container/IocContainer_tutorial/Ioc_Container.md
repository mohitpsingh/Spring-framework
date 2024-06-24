IOC Container

1. It is used to create and manage the objects.
2. It manage all the Objects which is mentioned in the Config File.
3. Objects which IOC Container Creates called Beans.
4. To config the Bean we need to create Object of AnnotationConfigApplicationContext and pass 
   the config.class into the parameters.
5. AnnotationConfigApplicationContext contains multiple methods for related to Life cycle of a bean.


Types of IOC Container
1. Bean Factory
2. ApplicationContext

Both are Interfaces, Both Work like a containers where Bean Factory is like a Legacy and 
ApplicationContext is Advance

Application Context - It's like a Big Brother of Bean Factory because It can perform all the operation which 
Bean Factory can perform. It also provide some additional features.

As Both are Interface to use it's functionality we can create object from ClassPathXmlApplicationContext for xlm based 
configuration and AnnotationConfigApplicationContext for Annotation based configuration

AnnotationConfigApplicationContext internally calls the ApplicationContext.

both classes reades the config file and see what need to created.
