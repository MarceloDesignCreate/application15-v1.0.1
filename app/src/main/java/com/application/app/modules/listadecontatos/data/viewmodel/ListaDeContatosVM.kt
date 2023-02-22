package com.application.app.modules.listadecontatos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.listadecontatos.`data`.model.ListaDeContatosModel
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewanthonRowModel
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewleticiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ListaDeContatosVM : ViewModel(), KoinComponent {
  val listaDeContatosModel: MutableLiveData<ListaDeContatosModel> =
      MutableLiveData(ListaDeContatosModel())

  var navArguments: Bundle? = null

  val listtextviewanthonList: MutableLiveData<MutableList<ListtextviewanthonRowModel>> =
      MutableLiveData(mutableListOf())

  val listtextviewleticiList: MutableLiveData<MutableList<ListtextviewleticiRowModel>> =
      MutableLiveData(mutableListOf())
}
