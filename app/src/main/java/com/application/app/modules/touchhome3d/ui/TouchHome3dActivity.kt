package com.application.app.modules.touchhome3d.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTouchHome3dBinding
import com.application.app.modules.touchhome3d.`data`.viewmodel.TouchHome3dVM
import kotlin.String
import kotlin.Unit

class TouchHome3dActivity :
    BaseActivity<ActivityTouchHome3dBinding>(R.layout.activity_touch_home_3d) {
  private val viewModel: TouchHome3dVM by viewModels<TouchHome3dVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.touchHome3dVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TOUCH_HOME3D_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TouchHome3dActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
