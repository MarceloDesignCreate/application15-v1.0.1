package com.application.app.modules.listadecontatos.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListtextviewleticiRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewletici: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_cia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewconverTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_posso_te_ligar)

)
