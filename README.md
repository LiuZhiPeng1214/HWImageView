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
    - 首先在Application的onCreate中调用
    ```
        public class MyApplication extends Application {
            @Override
            public void onCreate() {
                super.onCreate();
                HWImageView.init(this);
                HWGifImageView.init(this);
            }
        }
    ```
    - 
    

    

