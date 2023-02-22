package com.application.app.modules.listadecontatos.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListtextviewanthonRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewanthon: String? = MyApp.getInstance().resources.getString(R.string.lbl_anthonny)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_04_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewconver: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reuni_o_marcada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
