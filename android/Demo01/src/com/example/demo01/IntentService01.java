package com.example.demo01;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

public class IntentService01 extends IntentService{

	public IntentService01(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		MyHandler handler = new MyHandler(Looper.getMainLooper(),new Callback() {
			@Override
			public boolean handleMessage(Message msg) {
				// TODO Auto-generated method stub
				return false;
			}
		} );
		
	}
	
	public class MyHandler extends Handler {
		
		MyHandler(Looper looper,Callback callback){
			super(looper, callback);
		}
		
		@Override
		public void dispatchMessage(Message msg) {
			// TODO Auto-generated method stub
			super.dispatchMessage(msg);
		}

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
		}

		@Override
		public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
			// TODO Auto-generated method stub
			return super.sendMessageAtTime(msg, uptimeMillis);
		}
		
	}

}
