package com.application.app.modules.pushnotification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.pushnotification.`data`.model.PushNotificationModel
import com.application.app.modules.pushnotification.`data`.model.SpinnerGroupSeventyNineModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PushNotificationVM : ViewModel(), KoinComponent {
  val pushNotificationModel: MutableLiveData<PushNotificationModel> =
      MutableLiveData(PushNotificationModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyNineList: MutableLiveData<MutableList<SpinnerGroupSeventyNineModel>> =
      MutableLiveData()
}
