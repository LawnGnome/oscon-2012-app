package org.s31.oscon2012;

import android.app.Application;

public class OsconApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Schedule.buildSchedule(this);
	}

}
