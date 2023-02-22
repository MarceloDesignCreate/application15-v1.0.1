package com.application.app.modules.niciodavdeocapturade30s.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNicioDaVDeoCapturaDe30sBinding
import com.application.app.modules.niciodavdeocapturade30s.`data`.viewmodel.NicioDaVDeoCapturaDe30sVM
import com.application.app.modules.vdeogravao05s.ui.VDeoGravaO05sActivity
import kotlin.String
import kotlin.Unit

class NicioDaVDeoCapturaDe30sActivity :
    BaseActivity<ActivityNicioDaVDeoCapturaDe30sBinding>(R.layout.activity_nicio_da_v_deo_captura_de_30s)
    {
  private val viewModel: NicioDaVDeoCapturaDe30sVM by viewModels<NicioDaVDeoCapturaDe30sVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nicioDaVDeoCapturaDe30sVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSnapshotSixtyOne.setOnClickListener {
      val destIntent = VDeoGravaO05sActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NICIO_DA_V_DEO_CAPTURA_DE30S_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NicioDaVDeoCapturaDe30sActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
