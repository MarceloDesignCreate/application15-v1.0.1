package com.application.app.modules.vdeogravaoaposrejeio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.vdeogravaoaposrejeio.`data`.model.VDeoGravaOAposRejeiOModel
import org.koin.core.KoinComponent

class VDeoGravaOAposRejeiOVM : ViewModel(), KoinComponent {
  val vDeoGravaOAposRejeiOModel: MutableLiveData<VDeoGravaOAposRejeiOModel> =
      MutableLiveData(VDeoGravaOAposRejeiOModel())

  var navArguments: Bundle? = null
}
