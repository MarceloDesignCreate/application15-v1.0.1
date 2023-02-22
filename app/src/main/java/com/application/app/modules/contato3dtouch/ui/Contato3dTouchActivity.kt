package com.application.app.modules.contato3dtouch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityContato3dTouchBinding
import com.application.app.modules.contato3dtouch.`data`.viewmodel.Contato3dTouchVM
import kotlin.String
import kotlin.Unit

class Contato3dTouchActivity :
    BaseActivity<ActivityContato3dTouchBinding>(R.layout.activity_contato_3d_touch) {
  private val viewModel: Contato3dTouchVM by viewModels<Contato3dTouchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contato3dTouchVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONTATO3D_TOUCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Contato3dTouchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
