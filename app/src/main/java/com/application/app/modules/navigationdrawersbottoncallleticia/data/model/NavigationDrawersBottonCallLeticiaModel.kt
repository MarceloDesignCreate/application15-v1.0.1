package com.application.app.modules.navigationdrawersbottoncallleticia.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class NavigationDrawersBottonCallLeticiaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdicionarparti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adicionar_parti)

)
