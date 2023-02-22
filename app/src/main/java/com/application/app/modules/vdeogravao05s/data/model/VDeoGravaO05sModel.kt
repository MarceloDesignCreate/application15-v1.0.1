package com.application.app.modules.vdeogravao05s.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class VDeoGravaO05sModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_5_s)

)
