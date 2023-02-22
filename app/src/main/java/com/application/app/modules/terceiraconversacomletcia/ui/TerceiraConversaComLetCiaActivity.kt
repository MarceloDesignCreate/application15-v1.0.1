package com.application.app.modules.terceiraconversacomletcia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTerceiraConversaComLetCiaBinding
import com.application.app.modules.terceiraconversacomletcia.`data`.viewmodel.TerceiraConversaComLetCiaVM
import kotlin.String
import kotlin.Unit

class TerceiraConversaComLetCiaActivity :
    BaseActivity<ActivityTerceiraConversaComLetCiaBinding>(R.layout.activity_terceira_conversa_com_let_cia)
    {
  private val viewModel: TerceiraConversaComLetCiaVM by viewModels<TerceiraConversaComLetCiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.terceiraConversaComLetCiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TERCEIRA_CONVERSA_COM_LET_CIA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TerceiraConversaComLetCiaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
