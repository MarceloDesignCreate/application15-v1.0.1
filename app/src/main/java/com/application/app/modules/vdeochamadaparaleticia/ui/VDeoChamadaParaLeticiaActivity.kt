package com.application.app.modules.vdeochamadaparaleticia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityVDeoChamadaParaLeticiaBinding
import com.application.app.modules.conversandocomletcia.ui.ConversandoComLetCiaActivity
import com.application.app.modules.vdeochamadaparaleticia.`data`.viewmodel.VDeoChamadaParaLeticiaVM
import com.application.app.modules.videochamadaemgrupobetterprice.ui.VideoChamadaEmGrupoBetterPriceBottomsheet
import kotlin.String
import kotlin.Unit

class VDeoChamadaParaLeticiaActivity :
    BaseActivity<ActivityVDeoChamadaParaLeticiaBinding>(R.layout.activity_v_deo_chamada_para_leticia)
    {
  private val viewModel: VDeoChamadaParaLeticiaVM by viewModels<VDeoChamadaParaLeticiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.vDeoChamadaParaLeticiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroupSeventeen.setOnClickListener {
      val destIntent = ConversandoComLetCiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSmilingbeautif.setOnClickListener {
      val destFragment = VideoChamadaEmGrupoBetterPriceBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, VideoChamadaEmGrupoBetterPriceBottomsheet.TAG)
    }
  }

  companion object {
    const val TAG: String = "V_DEO_CHAMADA_PARA_LETICIA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VDeoChamadaParaLeticiaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
