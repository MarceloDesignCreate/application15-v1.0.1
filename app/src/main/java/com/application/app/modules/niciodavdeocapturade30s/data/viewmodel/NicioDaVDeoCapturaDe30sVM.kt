package com.application.app.modules.niciodavdeocapturade30s.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.niciodavdeocapturade30s.`data`.model.NicioDaVDeoCapturaDe30sModel
import org.koin.core.KoinComponent

class NicioDaVDeoCapturaDe30sVM : ViewModel(), KoinComponent {
  val nicioDaVDeoCapturaDe30sModel: MutableLiveData<NicioDaVDeoCapturaDe30sModel> =
      MutableLiveData(NicioDaVDeoCapturaDe30sModel())

  var navArguments: Bundle? = null
}
