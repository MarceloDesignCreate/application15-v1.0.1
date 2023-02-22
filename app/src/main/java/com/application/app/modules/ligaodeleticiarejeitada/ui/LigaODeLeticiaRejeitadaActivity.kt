package com.application.app.modules.ligaodeleticiarejeitada.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLigaODeLeticiaRejeitadaBinding
import com.application.app.modules.ligaodeleticiarejeitada.`data`.viewmodel.LigaODeLeticiaRejeitadaVM
import com.application.app.modules.navigationdrawersbottoncallleticia.ui.NavigationDrawersBottonCallLeticiaBottomsheet
import com.application.app.modules.terceiraconversacomletcia.ui.TerceiraConversaComLetCiaActivity
import kotlin.String
import kotlin.Unit

class LigaODeLeticiaRejeitadaActivity :
    BaseActivity<ActivityLigaODeLeticiaRejeitadaBinding>(R.layout.activity_liga_o_de_leticia_rejeitada)
    {
  private val viewModel: LigaODeLeticiaRejeitadaVM by viewModels<LigaODeLeticiaRejeitadaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ligaODeLeticiaRejeitadaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtoncall.setOnClickListener {
      val destFragment = NavigationDrawersBottonCallLeticiaBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager,
          NavigationDrawersBottonCallLeticiaBottomsheet.TAG)
    }
    binding.linearClipvoicecapt.setOnClickListener {
      val destIntent = TerceiraConversaComLetCiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LIGA_O_DE_LETICIA_REJEITADA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LigaODeLeticiaRejeitadaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
