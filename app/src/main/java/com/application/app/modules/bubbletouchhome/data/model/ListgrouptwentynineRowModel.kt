package com.application.app.modules.bubbletouchhome.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListgrouptwentynineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewJnior: String? = MyApp.getInstance().resources.getString(R.string.lbl_j_nior)

)
