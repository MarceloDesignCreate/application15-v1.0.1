package com.application.app.modules.touchhome3d.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.touchhome3d.`data`.model.TouchHome3dModel
import org.koin.core.KoinComponent

class TouchHome3dVM : ViewModel(), KoinComponent {
  val touchHome3dModel: MutableLiveData<TouchHome3dModel> = MutableLiveData(TouchHome3dModel())

  var navArguments: Bundle? = null
}
