package com.hmomeni.deematest

import android.app.Application
import com.deema.Ads

class App: Application() {
	override fun onCreate() {
		super.onCreate()
		Ads.init(baseContext)
	}
}