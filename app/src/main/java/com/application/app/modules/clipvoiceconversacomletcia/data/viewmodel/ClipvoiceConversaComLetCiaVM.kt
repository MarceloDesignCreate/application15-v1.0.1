package com.application.app.modules.clipvoiceconversacomletcia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.clipvoiceconversacomletcia.`data`.model.ClipvoiceConversaComLetCiaModel
import org.koin.core.KoinComponent

class ClipvoiceConversaComLetCiaVM : ViewModel(), KoinComponent {
  val clipvoiceConversaComLetCiaModel: MutableLiveData<ClipvoiceConversaComLetCiaModel> =
      MutableLiveData(ClipvoiceConversaComLetCiaModel())

  var navArguments: Bundle? = null
}
