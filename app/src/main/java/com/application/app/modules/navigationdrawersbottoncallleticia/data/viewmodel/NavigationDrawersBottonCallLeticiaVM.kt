package com.application.app.modules.navigationdrawersbottoncallleticia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.navigationdrawersbottoncallleticia.`data`.model.Listfile1RowModel
import com.application.app.modules.navigationdrawersbottoncallleticia.`data`.model.NavigationDrawersBottonCallLeticiaModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NavigationDrawersBottonCallLeticiaVM : ViewModel(), KoinComponent {
  val navigationDrawersBottonCallLeticiaModel:
      MutableLiveData<NavigationDrawersBottonCallLeticiaModel> =
      MutableLiveData(NavigationDrawersBottonCallLeticiaModel())

  var navArguments: Bundle? = null

  val listfileList: MutableLiveData<MutableList<Listfile1RowModel>> =
      MutableLiveData(mutableListOf())
}
