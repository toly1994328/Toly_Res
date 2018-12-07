#### 开源计划之toly_res
>我的test包终于长大了，将脱离Zutils，自成一派，取名toly_res，主要包含:

```
常用字符串（名字、邮箱、省份、句子、著作名称等）
经典item布局(qq、淘宝、简书、掘金等单条目布局样式)
常用媒体（图标--xml版的svg、图片、序列帧、短音效等)
常用drawable（selector、shape、anim、color等）、
常用实体类。
```

>致力于为安卓学习者扫清测试数据来源，res资源匮乏等非智力问题，这也是我的test包的初衷。  
`温馨提示`:此库最好只用于学习时使用，因为比较大。如果项目需要某些资源，可以自行拷贝。  
本项目将持续更新，收录有价值的资源文件

##### 引入：

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
    //...
    implementation 'com.github.toly1994328:Toly_Res:v0.01'
}
```


---
##### 一、常用字符串
##### 1.String数组：这些数组都是通过代码处理的，想了解正则的使用，可见番外篇：  
[带你玩正则1--数据遍地是,看你取不取](https://www.jianshu.com/p/7a08cc91e674)

```
百家姓String数组：              ZData.XING
常用名String数组：              ZData.MING
《匆匆》String数组(单字)：      ZData.CONG_CONG
《春》String数组(单字)：        ZData.SPRING
省份String数组：                ZData.PROVINCES
书籍String数组：                ZData.BOOKS
邮箱String数组：                ZData.EMAIL
《匆匆》的句子String数组：      ZData.SEN_CONG_CONG
《荷塘月色》句子String数组：    ZData.SEN_HTYS

小写字母String数组：    ZData.abc
大写字母String数组：    ZData.ABC

json字符串：
随机电影信息(名字，图片地址，评分)：JsonData.MOVIE
水浒传108将信息(名字，星，绰号)：JsonData.SHUI_HU_ZHUAN

图片资源id数组：
背景图：ResData.RES_BG
头像图：ResData.REA_HEAD_ICON
其他图：REA_PIC
```

##### 2.随机输出字符串：

```
//随机输出1~20个字符组成的字符串
System.out.println(ZRandom.randomChar(20));

//指定字符数组,随机选取1个字符组成的字符串
System.out.println(ZRandom.randomChar( ZData.CONG_CONG));

//指定字符数组,随机选取1~20个字符组成的字符串
System.out.println(ZRandom.randomChar( ZData.CONG_CONG,20));

//指定字符数组,选取15~20个字符组成的字符串
System.out.println(ZRandom.randomChar( ZData.CONG_CONG,15,20));

//随机中文名---百家姓+随机名
System.out.println(ZRandom.randomCnName());

//4+6随机英文组合
System.out.println(ZRandom.randomEnName());
```


曾经 | 现在
---|---
![](https://upload-images.jianshu.io/upload_images/9414344-74ebf91e526408ff.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)| ![](https://upload-images.jianshu.io/upload_images/9414344-b650e14ead0ecc5b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---


曾经 | 现在
---|---
![](https://upload-images.jianshu.io/upload_images/9414344-551f441eeb3a4e6f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)| ![](https://upload-images.jianshu.io/upload_images/9414344-8324ad511b0aac00.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




#### 二、常用媒体：
##### 1.常用图标(注：都是xml,`颜色、大小`均可随意修改)  
>下面用png进行一览

###### 1.1播放系

![播放系.png](https://upload-images.jianshu.io/upload_images/9414344-3199fc77d9b049ce.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

###### 1.2方向系

![方向系.png](https://upload-images.jianshu.io/upload_images/9414344-87ec0f9b414358fb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

###### 1.3字母系
![字母系.png](https://upload-images.jianshu.io/upload_images/9414344-6d10e0826f172900.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

###### 1.4常用待分类
![常用待分类.png](https://upload-images.jianshu.io/upload_images/9414344-5d9aad03c804a029.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
---

---
##### 2.常用图片：

###### 2.1头像：(用Python简单抓的)
![](https://upload-images.jianshu.io/upload_images/9414344-a5061a89fc86f8f0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/9414344-885bb566c91a9f9d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---

###### 2.3背景图：(考虑体积问题,精选12张)

![背景.png](https://upload-images.jianshu.io/upload_images/9414344-9ef4349fb8b4c923.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---

###### 2.4测试图

![测试图.png](https://upload-images.jianshu.io/upload_images/9414344-f752b445597cb18e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

###### 2.5随机图

![随机图.png](https://upload-images.jianshu.io/upload_images/9414344-16dbcb2778c523dc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---
###### 2.6：序列帧

![序列帧1.png](https://upload-images.jianshu.io/upload_images/9414344-8315bc9e39e0874e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![序列帧2.png](https://upload-images.jianshu.io/upload_images/9414344-f19aeb9fd749f7bf.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![序列帧3.png](https://upload-images.jianshu.io/upload_images/9414344-e5fc84324949430c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![序列帧4.png](https://upload-images.jianshu.io/upload_images/9414344-9be54065c64ee240.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---
##### 3.测试音频
###### 待收集

---



---
#### 三、常用其他res资源  
>准备这个有两个目的：其一：方便备用  
其二：drawable的xml很繁杂，长久不用就手生，统一收集一下便于参考  

---

##### 3.1：shape线

![shape线.png](https://upload-images.jianshu.io/upload_images/9414344-b9d370ea2c4c4f07.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 3.2：shaple类圆

![shaple类圆.png](https://upload-images.jianshu.io/upload_images/9414344-809bcef4148cf9d8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 3.3：shape矩形

![shape矩形.png](https://upload-images.jianshu.io/upload_images/9414344-69a03e42b4fa4ad8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




---
#### 二、经典item布局

##### 1.仿qq消息列表：item_qq_msg.xml

![item_qq_msg.png](https://upload-images.jianshu.io/upload_images/9414344-61c08fc346fc1961.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---


##### 2.商品item：item_goods_list.xml

![商品item.png](https://upload-images.jianshu.io/upload_images/9414344-1eb636f57158331d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 3.聊天-我item：item_chat_me.xml

![聊天-我.png](https://upload-images.jianshu.io/upload_images/9414344-44c3443aba4ebc78.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---


##### 4.时间item：item_chat_time.xml

![时间item.png](https://upload-images.jianshu.io/upload_images/9414344-edb12efa366711f0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 5.聊天-他item：item_chat_he.xml

![聊天-他.png](https://upload-images.jianshu.io/upload_images/9414344-08f988d4fc49a57a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 6.上图下字：item_img_txt.xml

![上图下字.png](https://upload-images.jianshu.io/upload_images/9414344-0d23e87e2cce4b9a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---

##### 7.一张卡片：item_a_card.xml

![一张卡片.png](https://upload-images.jianshu.io/upload_images/9414344-db5067c21f211df0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---

##### 8.列表item：item_jianshu_article.xml

![列表item.png](https://upload-images.jianshu.io/upload_images/9414344-35bc90c3fade231e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


---



