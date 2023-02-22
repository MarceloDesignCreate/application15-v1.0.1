package com.application.app.modules.pushnotification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPushNotificationBinding
import com.application.app.modules.pushnotification.`data`.model.SpinnerGroupSeventyNineModel
import com.application.app.modules.pushnotification.`data`.viewmodel.PushNotificationVM
import kotlin.String
import kotlin.Unit

class PushNotificationActivity :
    BaseActivity<ActivityPushNotificationBinding>(R.layout.activity_push_notification) {
  private val viewModel: PushNotificationVM by viewModels<PushNotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupSeventyNineList.value = mutableListOf(
    SpinnerGroupSeventyNineModel("Item1"),
    SpinnerGroupSeventyNineModel("Item2"),
    SpinnerGroupSeventyNineModel("Item3"),
    SpinnerGroupSeventyNineModel("Item4"),
    SpinnerGroupSeventyNineModel("Item5")
    )
    val spinnerGroupSeventyNineAdapter =
    SpinnerGroupSeventyNineAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventyNineList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyNine.adapter = spinnerGroupSeventyNineAdapter
    binding.pushNotificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PUSH_NOTIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PushNotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
