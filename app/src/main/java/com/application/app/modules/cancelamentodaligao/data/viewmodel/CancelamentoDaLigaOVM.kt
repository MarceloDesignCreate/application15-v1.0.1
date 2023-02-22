package com.application.app.modules.cancelamentodaligao.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.cancelamentodaligao.`data`.model.CancelamentoDaLigaOModel
import org.koin.core.KoinComponent

class CancelamentoDaLigaOVM : ViewModel(), KoinComponent {
  val cancelamentoDaLigaOModel: MutableLiveData<CancelamentoDaLigaOModel> =
      MutableLiveData(CancelamentoDaLigaOModel())

  var navArguments: Bundle? = null
}
