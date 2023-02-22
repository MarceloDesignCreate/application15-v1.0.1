package com.application.app.modules.enviodelocalizao.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.enviodelocalizao.`data`.model.EnvioDeLocalizaOModel
import com.application.app.modules.enviodelocalizao.`data`.model.ListellipsenineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EnvioDeLocalizaOVM : ViewModel(), KoinComponent {
  val envioDeLocalizaOModel: MutableLiveData<EnvioDeLocalizaOModel> =
      MutableLiveData(EnvioDeLocalizaOModel())

  var navArguments: Bundle? = null

  val listellipsenineList: MutableLiveData<MutableList<ListellipsenineRowModel>> =
      MutableLiveData(mutableListOf())
}
