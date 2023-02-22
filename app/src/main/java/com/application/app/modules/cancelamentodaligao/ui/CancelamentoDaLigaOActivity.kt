package com.application.app.modules.cancelamentodaligao.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCancelamentoDaLigaOBinding
import com.application.app.modules.cancelamentodaligao.`data`.viewmodel.CancelamentoDaLigaOVM
import kotlin.String
import kotlin.Unit

class CancelamentoDaLigaOActivity :
    BaseActivity<ActivityCancelamentoDaLigaOBinding>(R.layout.activity_cancelamento_da_liga_o) {
  private val viewModel: CancelamentoDaLigaOVM by viewModels<CancelamentoDaLigaOVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cancelamentoDaLigaOVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CANCELAMENTO_DA_LIGA_O_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CancelamentoDaLigaOActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
