package com.application.app.modules.vdeogravaoaposrejeio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityVDeoGravaOAposRejeiOBinding
import com.application.app.modules.vdeogravaoaposrejeio.`data`.viewmodel.VDeoGravaOAposRejeiOVM
import kotlin.String
import kotlin.Unit

class VDeoGravaOAposRejeiOActivity :
    BaseActivity<ActivityVDeoGravaOAposRejeiOBinding>(R.layout.activity_v_deo_grava_o_apos_rejei_o)
    {
  private val viewModel: VDeoGravaOAposRejeiOVM by viewModels<VDeoGravaOAposRejeiOVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.vDeoGravaOAposRejeiOVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "V_DEO_GRAVA_O_APOS_REJEI_O_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VDeoGravaOAposRejeiOActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
