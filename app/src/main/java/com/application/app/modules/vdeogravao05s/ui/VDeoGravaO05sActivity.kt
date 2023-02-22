package com.application.app.modules.vdeogravao05s.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityVDeoGravaO05sBinding
import com.application.app.modules.vdeogravao05s.`data`.viewmodel.VDeoGravaO05sVM
import com.application.app.modules.vdeogravaoaposrejeio.ui.VDeoGravaOAposRejeiOActivity
import kotlin.String
import kotlin.Unit

class VDeoGravaO05sActivity :
    BaseActivity<ActivityVDeoGravaO05sBinding>(R.layout.activity_v_deo_grava_o_0_5s) {
  private val viewModel: VDeoGravaO05sVM by viewModels<VDeoGravaO05sVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.vDeoGravaO05sVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSnapshotEightyOne.setOnClickListener {
      val destIntent = VDeoGravaOAposRejeiOActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "V_DEO_GRAVA_O05S_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VDeoGravaO05sActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
