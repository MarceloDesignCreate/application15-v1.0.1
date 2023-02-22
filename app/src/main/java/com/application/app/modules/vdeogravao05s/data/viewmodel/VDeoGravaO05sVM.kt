package com.application.app.modules.vdeogravao05s.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.vdeogravao05s.`data`.model.VDeoGravaO05sModel
import org.koin.core.KoinComponent

class VDeoGravaO05sVM : ViewModel(), KoinComponent {
  val vDeoGravaO05sModel: MutableLiveData<VDeoGravaO05sModel> =
      MutableLiveData(VDeoGravaO05sModel())

  var navArguments: Bundle? = null
}
