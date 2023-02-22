package com.application.app.modules.niciodavdeocapturade30s.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class NicioDaVDeoCapturaDe30sModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_s)

)
