package com.application.app.modules.localizao.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.localizao.`data`.model.LocalizaOModel
import org.koin.core.KoinComponent

class LocalizaOVM : ViewModel(), KoinComponent {
  val localizaOModel: MutableLiveData<LocalizaOModel> = MutableLiveData(LocalizaOModel())

  var navArguments: Bundle? = null
}
