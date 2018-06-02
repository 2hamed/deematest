package com.hmomeni.deematest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.deema.adcontainer.InterstitialAdContainer
import com.deema.adcontainer.VideoContainer
import com.deema.adcontainer.listener.InterstitialListener
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var interstitialAdContainer: InterstitialAdContainer
    lateinit var videoContainer: VideoContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoContainer = VideoContainer(this, "40")
        interstitialAdContainer = InterstitialAdContainer(this, "39")

        loadInter.setOnClickListener {
            interstitialAdContainer.loadAd(object : InterstitialListener {
                override fun onSuccess() {
                    interstitialAdContainer.showAd()
                }

                override fun onFailure(p0: Exception?) {
                    p0?.printStackTrace()
                }

                override fun closed() {
                }
            })
        }


        videoBtn.setOnClickListener {
            videoContainer.loadAd(object : InterstitialListener {
                override fun onSuccess() {
                    videoContainer.showAd()
                }

                override fun onFailure(p0: Exception?) {
                    p0?.printStackTrace()
                }

                override fun closed() {
                }
            })
        }

        banner.loadAd()
    }
}
