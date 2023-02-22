package com.application.app.modules.conversandocomletcia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityConversandoComLetCiaBinding
import com.application.app.modules.conversandocomletcia.`data`.viewmodel.ConversandoComLetCiaVM
import kotlin.String
import kotlin.Unit

class ConversandoComLetCiaActivity :
    BaseActivity<ActivityConversandoComLetCiaBinding>(R.layout.activity_conversando_com_let_cia) {
  private val viewModel: ConversandoComLetCiaVM by viewModels<ConversandoComLetCiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.conversandoComLetCiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CONVERSANDO_COM_LET_CIA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConversandoComLetCiaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
