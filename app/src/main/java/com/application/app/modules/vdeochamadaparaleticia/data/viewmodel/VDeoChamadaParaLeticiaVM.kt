package com.application.app.modules.vdeochamadaparaleticia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.vdeochamadaparaleticia.`data`.model.VDeoChamadaParaLeticiaModel
import org.koin.core.KoinComponent

class VDeoChamadaParaLeticiaVM : ViewModel(), KoinComponent {
  val vDeoChamadaParaLeticiaModel: MutableLiveData<VDeoChamadaParaLeticiaModel> =
      MutableLiveData(VDeoChamadaParaLeticiaModel())

  var navArguments: Bundle? = null
}
