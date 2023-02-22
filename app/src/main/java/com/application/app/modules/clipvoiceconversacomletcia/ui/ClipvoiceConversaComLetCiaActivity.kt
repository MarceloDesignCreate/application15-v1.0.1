package com.application.app.modules.clipvoiceconversacomletcia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityClipvoiceConversaComLetCiaBinding
import com.application.app.modules.clipvoiceconversacomletcia.`data`.viewmodel.ClipvoiceConversaComLetCiaVM
import kotlin.String
import kotlin.Unit

class ClipvoiceConversaComLetCiaActivity :
    BaseActivity<ActivityClipvoiceConversaComLetCiaBinding>(R.layout.activity_clipvoice_conversa_com_let_cia)
    {
  private val viewModel: ClipvoiceConversaComLetCiaVM by viewModels<ClipvoiceConversaComLetCiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.clipvoiceConversaComLetCiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CLIPVOICE_CONVERSA_COM_LET_CIA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ClipvoiceConversaComLetCiaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
