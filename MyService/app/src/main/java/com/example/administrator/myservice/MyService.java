package com.example.administrator.myservice;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.widget.Toast;

/**Android Service
 * (1)定义：服务是一个后台运行的组件，执行长时间运行且不需要用户交互的任务。即使应用被销毁也依然
 * 可以工作
 *(2)状态
 * a.Started	Android的应用程序组件，如活动，通过startService()启动了服务，则服务是Started状态。
 * 一旦启动，服务可以在后台无限期运行，即使启动它的组件已经被销毁。
 * b.Bound	当Android的应用程序组件通过bindService()绑定了服务，则服务是Bound状态。Bound状态的
 * 服务提供了一个客户服务器接口来允许组件与服务进行交互，如发送请求，获取结果，甚至通过IPC来进行
 * 跨进程通信。
 *
 * */


/**service回调
 * (1)onStartCommand()	其他组件(如活动)通过调用startService()来请求启动服务时，系统调用该方法。
 * 如果你实现该方法，你有责任在工作完成时通过stopSelf()或者stopService()方法来停止服务。
 * (2)onBind	当其他组件想要通过bindService()来绑定服务时，系统调用该方法。如果你实现该方法，
 * 你需要返回IBinder对象来提供一个接口，以便客户来与服务通信。你必须实现该方法，如果你不允许绑定，
 * 则直接返回null。
 * (3)onUnbind()	当客户中断所有服务发布的特殊接口时，系统调用该方法。
 * (4)onRebind()	当新的客户端与服务连接，且此前它已经通过onUnbind(Intent)通知断开连接时，
 * 系统调用该方法。
 * (5)onCreate()	当服务通过onStartCommand()和onBind()被第一次创建的时候，系统调用该方法。
 * 该调用要求执行一次性安装。
 * (6)onDestroy()	当服务不再有用或者被销毁时，系统调用该方法。你的服务需要实现该方法来清理任何资源，
 * 如线程，已注册的监听器，接收器等。
 *
 * */
public class MyService extends Service {
    @Override
    public IBinder onBind(Intent arg0){
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this,"服务已经启动！",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"服务已经停止！",Toast.LENGTH_LONG).show();
    }
}
