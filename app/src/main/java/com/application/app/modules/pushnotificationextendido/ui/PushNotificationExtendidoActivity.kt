package com.application.app.modules.pushnotificationextendido.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPushNotificationExtendidoBinding
import com.application.app.modules.pushnotificationextendido.`data`.viewmodel.PushNotificationExtendidoVM
import kotlin.String
import kotlin.Unit

class PushNotificationExtendidoActivity :
    BaseActivity<ActivityPushNotificationExtendidoBinding>(R.layout.activity_push_notification_extendido)
    {
  private val viewModel: PushNotificationExtendidoVM by viewModels<PushNotificationExtendidoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pushNotificationExtendidoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PUSH_NOTIFICATION_EXTENDIDO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PushNotificationExtendidoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
