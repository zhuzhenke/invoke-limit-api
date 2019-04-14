解决亚马逊调用频率限制问题的sdk框架

技术交流欢迎联系作者Wechat:839127406

针对亚马逊API调用频率限制的问题，使用CountDownLatch和线程池，结合频率统一控制中心，来封装一套亚马逊调用的sdk框架。




主要的优化点

1、调用方调用亚马逊API不会出现超频率的错误

2、对于拉取亚马逊报告的3个步骤，sdk封装成一个调用就能拿到报告结果

3、sdk提供了同步和异步两种调用方式




注意：

对应的亚马逊java封装的客户端库，见以下链接及其相关页面 https://developer.amazonservices.com.cn/doc/products/products/v20111001/java.html



使用方式参考
第一步:

填写授权信息配置com.amazon.config.AmazonAccountConfig

第二步:

(1)简单接口调用使用AmazonTest中的案例
正常模式调用，即只需要一次调用接口就可以完成的调用

 提供同步和异步两种方式，异步方式有回调方法
 
(2)复杂接口的调用使用AmazonDisposableTest中的案例

组合模式的接口调用，如获取商品列表这种数据

   通常分为3个步骤完成所有调用
   
   （1）提交获取商品请求，拿到请求ID
   
   （2）通过请求ID，去获取这个请求ID的报告是否完成，如已经完成，拿到报告ID
   
   （3）通过报告ID获取商品数据
   
   但是如果分为3次调用就会比较麻烦，所以提供了AmazonDisposableClient只需要一次调用，就可以获取最后的商品数据了
   
   