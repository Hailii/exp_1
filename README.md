# 实验一

## Android开发基础

### 验证Activity的生命周期

#### 关键代码：
```
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","oncreate");
        // The activity is being created.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onstart");
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onresume");
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onpause");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onstop");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","ondestroy");
        // The activity is about to be destroyed.
    }
```
#### 启动应用时打印到控制台上的信息
![无法显示](/1.png)
#### 返回桌面，应用在后台运行
![无法显示](/2.png)
#### 再次打开应用
![无法显示](/3.png)
#### 关闭应用
![无法显示](/4.png)
