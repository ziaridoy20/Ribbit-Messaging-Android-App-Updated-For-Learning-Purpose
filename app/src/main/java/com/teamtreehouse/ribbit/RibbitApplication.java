package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	@Override
	public void onCreate() {

		super.onCreate();
		Parse.initialize(this, "GjE31qK1jndCaO7o3MyhUCjc3NXTwXNGI4Ws8nKR",
				"cun3w9rrg1N85oiprMKhQy1Sh9k3mydTyQagnMjH");
		/*
		 * first one is Application Id, Second one is Client Id From Parse.com
		 */
		

	}

}
