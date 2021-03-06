[![](https://jitpack.io/v/LiuZhiPeng1214/HWImageView.svg)](https://jitpack.io/#LiuZhiPeng1214/HWImageView)
# HWImageView
能够加载webp,gif,png等格式的图片框架,无任何学习成本，傻瓜式接入

## 接入方式
   ### gradle
   - Step 1. Add the JitPack repository to your build file
   Add it in your root build.gradle at the end of repositories:
   ```
   allprojects {
   		repositories {
   			...
   			maven { url 'https://jitpack.io' }
   		}
   	}
   ```
   - Step 2. Add the dependency
   ```
   dependencies {
   	        implementation 'com.github.LiuZhiPeng1214:HWImageView:v1.0.0'
   	}
   ```
   ### maven
   - Step 1. Add the JitPack repository to your build file
   ```
    	<repositories>
    		<repository>
    		    <id>jitpack.io</id>
    		    <url>https://jitpack.io</url>
    		</repository>
    	</repositories>
   ```
   - Step 2. Add the dependency
   ```
        <dependency>
        	    <groupId>com.github.LiuZhiPeng1214</groupId>
        	    <artifactId>HWImageView</artifactId>
        	    <version>v1.0.0</version>
        	</dependency>
   ```
   
## 使用方法
 - 在Application的onCreate中调用
 ```
 public class MyApplication extends Application {
     @Override
     public void onCreate() {
         super.onCreate();
         HWImageView.init(this); //正常图
         HWGifImageView.init(this); //动图
     }
 }

```
- 使用示例

xml使用
```
 <com.huwen.imagelibrary.HWImageView
        android:id="@+id/iv_img"
        android:layout_width="200dp"
        android:layout_height="200dp"/>
```
activity中使用
```
imageView = new SHImageView(context);


//网络图片
imageView.setImageUrl("http://t.cn/R5JfqHu");
//本地图片
//imageView.setImageUrl("file://sdcard/sample/xxx.jpg");
//gif图片
//imageView.setImageUrl("file://sdcard/sample/xxx.gif");
    
//在setImageUrl之前调用
imageView.setWrapContentEnable(true);//支持自适应宽高
//可以注入压缩接口
imageView.setCompressCallback(CompressCallback compressCallback);
```

### HWImageView 普通图片
```
//直接设置url，其他都不用管
public void setImageUrl(String url);

//直接设置res id，其他都不用管
public void setImageRes(int resId);

//静态方法，用来手动清除内存里的缓存
public static void clearMemoryCaches();

//静态方法，用来手动清除文件里的缓存
public static void clearDiskCaches();

//静态方法，用来手动清除所有缓存
public static void clearCaches();

//静态方法，初始化，放在application的oncreate里 
public static void init(Context context);
```

### HWCircleImageView 圆形图片
```
/设置边框颜色
void setBorderColor(int color);

//设置边框宽度
void setBorderWidth(int width);
```

    

    

