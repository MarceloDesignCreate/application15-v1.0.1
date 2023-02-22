package com.application.app.modules.ligaodeleticiarejeitada.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.ligaodeleticiarejeitada.`data`.model.LigaODeLeticiaRejeitadaModel
import org.koin.core.KoinComponent

class LigaODeLeticiaRejeitadaVM : ViewModel(), KoinComponent {
  val ligaODeLeticiaRejeitadaModel: MutableLiveData<LigaODeLeticiaRejeitadaModel> =
      MutableLiveData(LigaODeLeticiaRejeitadaModel())

  var navArguments: Bundle? = null
}
