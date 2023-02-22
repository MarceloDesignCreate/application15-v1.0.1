package com.application.app.modules.terceiraconversacomletcia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.terceiraconversacomletcia.`data`.model.TerceiraConversaComLetCiaModel
import org.koin.core.KoinComponent

class TerceiraConversaComLetCiaVM : ViewModel(), KoinComponent {
  val terceiraConversaComLetCiaModel: MutableLiveData<TerceiraConversaComLetCiaModel> =
      MutableLiveData(TerceiraConversaComLetCiaModel())

  var navArguments: Bundle? = null
}
