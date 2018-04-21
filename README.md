解决亚马逊调用频率限制问题的sdk框架

针对亚马逊API调用频率限制的问题，使用CountDownLatch和线程池，结合频率统一控制中心，来封装一套亚马逊调用的sdk框架。




主要的优化点

1、调用方调用亚马逊API不会出现超频率的错误

2、对于拉取亚马逊报告的3个步骤，sdk封装成一个调用就能拿到报告结果

3、sdk提供了同步和异步两种调用方式




注意：

这里仅仅是测试的时候用AmazonOrderRequest和AmazonOrderResponse来模拟亚马逊的调用。

其他具体的请求响应类会在稍后提交。

对应的亚马逊java封装的客户端库，见以下链接及其相关页面 https://developer.amazonservices.com.cn/doc/products/products/v20111001/java.html