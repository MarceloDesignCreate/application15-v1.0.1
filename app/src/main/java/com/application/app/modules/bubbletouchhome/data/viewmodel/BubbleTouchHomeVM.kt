package com.application.app.modules.bubbletouchhome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.bubbletouchhome.`data`.model.BubbleTouchHomeModel
import com.application.app.modules.bubbletouchhome.`data`.model.ListgrouptwentynineRowModel
import kotlin.collections.MutableList
import org.json.JSONObject
import org.koin.core.KoinComponent

class BubbleTouchHomeVM : ViewModel(), KoinComponent {
  val bubbleTouchHomeModel: MutableLiveData<BubbleTouchHomeModel> =
      MutableLiveData(BubbleTouchHomeModel())


  var navArguments: Bundle? = null


  val listgrouptwentynineList: MutableLiveData<MutableList<ListgrouptwentynineRowModel>> =
      MutableLiveData(mutableListOf())


  var facebookAuthResponse: JSONObject = JSONObject()
}
