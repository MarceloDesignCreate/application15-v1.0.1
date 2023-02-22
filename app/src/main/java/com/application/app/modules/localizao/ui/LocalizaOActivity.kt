package com.application.app.modules.localizao.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLocalizaOBinding
import com.application.app.modules.localizao.`data`.viewmodel.LocalizaOVM
import kotlin.String
import kotlin.Unit

class LocalizaOActivity : BaseActivity<ActivityLocalizaOBinding>(R.layout.activity_localiza_o) {
  private val viewModel: LocalizaOVM by viewModels<LocalizaOVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.localizaOVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "LOCALIZA_O_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LocalizaOActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
