package com.application.app.modules.conversandocomletcia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.conversandocomletcia.`data`.model.ConversandoComLetCiaModel
import org.koin.core.KoinComponent

class ConversandoComLetCiaVM : ViewModel(), KoinComponent {
  val conversandoComLetCiaModel: MutableLiveData<ConversandoComLetCiaModel> =
      MutableLiveData(ConversandoComLetCiaModel())

  var navArguments: Bundle? = null
}
