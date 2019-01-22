package com.example.administrator.myreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
/**Android broadcast
 * 广播接收器用于响应来自其他应用程序或者系统的广播消息。这些消息有时被称为事件或者意图。
 * 例如，应用程序可以初始化广播来让其他的应用程序知道一些数据已经被下载到设备，并可以为他们所用。
 * 这样广播接收器可以定义适当的动作来拦截这些通信。
 *
 *(1)创建
 * 广播接收器需要实现为BroadcastReceiver类的子类，并重写onReceive()方法来接收以Intent对象为参数的消息。
 *(2)注册
 *应用程序通过在AndroidManifest.xml中注册广播接收器来监听制定的广播意图。假设我们将要注册MyReceiver来
 * 监听系统产生的ACTION_BOOT_COMPLETED事件。该事件由Android系统的启动进程完成时发出。
 *
 * 重要的系统事件常量
 *android.intent.action.BATTERY_CHANGED	持久的广播，包含电池的充电状态，级别和其他信息。
 * android.intent.action.BATTERY_LOW	标识设备的低电量条件。
 * android.intent.action.BATTERY_OKAY	标识电池在电量低之后，现在已经好了。
 * android.intent.action.BOOT_COMPLETED	在系统完成启动后广播一次。
 * android.intent.action.BUG_REPORT	显示报告bug的活动。
 * android.intent.action.CALL	执行呼叫数据指定的某人。
 * android.intent.action.CALL_BUTTON	用户点击"呼叫"按钮打开拨号器或者其他拨号的合适界面。
 * android.intent.action.DATE_CHANGED	日期发生改变。
 * android.intent.action.REBOOT	设备重启。
 *
 *
 * (3)自定义意图
 * 如果你想要应用程序中生成并发送自定义意图，你需要在活动类中通过sendBroadcast()来创建并发送这些意图。
 * 如果你使用sendStickyBroadcast(Intent)方法，则意图是持久的(sticky)，这意味者你发出的意图在广播完成后一直保持着。
 * */
public class MyReceiver extends BroadcastReceiver {
    @Override
    //广播接收器需要实现为BroadcastReceiver类的子类，并重写onReceive()方法
    // 来接收以Intent对象为参数的消息。
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "检测到意图",Toast.LENGTH_LONG).show();
    }
}
