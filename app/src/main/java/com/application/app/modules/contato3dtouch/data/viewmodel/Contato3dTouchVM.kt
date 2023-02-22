package com.application.app.modules.contato3dtouch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.contato3dtouch.`data`.model.Contato3dTouchModel
import org.koin.core.KoinComponent

class Contato3dTouchVM : ViewModel(), KoinComponent {
  val contato3dTouchModel: MutableLiveData<Contato3dTouchModel> =
      MutableLiveData(Contato3dTouchModel())

  var navArguments: Bundle? = null
}
