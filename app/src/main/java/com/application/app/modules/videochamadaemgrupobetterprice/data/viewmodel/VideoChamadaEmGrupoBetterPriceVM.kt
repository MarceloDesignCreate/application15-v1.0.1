package com.application.app.modules.videochamadaemgrupobetterprice.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.videochamadaemgrupobetterprice.`data`.model.ListfileRowModel
import com.application.app.modules.videochamadaemgrupobetterprice.`data`.model.VideoChamadaEmGrupoBetterPriceModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VideoChamadaEmGrupoBetterPriceVM : ViewModel(), KoinComponent {
  val videoChamadaEmGrupoBetterPriceModel: MutableLiveData<VideoChamadaEmGrupoBetterPriceModel> =
      MutableLiveData(VideoChamadaEmGrupoBetterPriceModel())

  var navArguments: Bundle? = null

  val listfileList: MutableLiveData<MutableList<ListfileRowModel>> =
      MutableLiveData(mutableListOf())
}
