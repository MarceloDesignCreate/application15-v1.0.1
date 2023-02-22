package com.application.app.modules.aberturadecmera.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAberturaDeCMeraBinding
import com.application.app.modules.aberturadecmera.`data`.viewmodel.AberturaDeCMeraVM
import com.application.app.modules.niciodavdeocapturade30s.ui.NicioDaVDeoCapturaDe30sActivity
import kotlin.String
import kotlin.Unit

class AberturaDeCMeraActivity :
    BaseActivity<ActivityAberturaDeCMeraBinding>(R.layout.activity_abertura_de_c_mera) {
  private val viewModel: AberturaDeCMeraVM by viewModels<AberturaDeCMeraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aberturaDeCMeraVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBackground.setOnClickListener {
      val destIntent = NicioDaVDeoCapturaDe30sActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ABERTURA_DE_C_MERA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AberturaDeCMeraActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
