package com.application.app.modules.aberturadecmera.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aberturadecmera.`data`.model.AberturaDeCMeraModel
import org.koin.core.KoinComponent

class AberturaDeCMeraVM : ViewModel(), KoinComponent {
  val aberturaDeCMeraModel: MutableLiveData<AberturaDeCMeraModel> =
      MutableLiveData(AberturaDeCMeraModel())

  var navArguments: Bundle? = null
}
