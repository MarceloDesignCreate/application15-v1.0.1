package com.application.app.modules.pushnotificationextendido.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.pushnotificationextendido.`data`.model.PushNotificationExtendidoModel
import org.koin.core.KoinComponent

class PushNotificationExtendidoVM : ViewModel(), KoinComponent {
  val pushNotificationExtendidoModel: MutableLiveData<PushNotificationExtendidoModel> =
      MutableLiveData(PushNotificationExtendidoModel())

  var navArguments: Bundle? = null
}
