package com.application.app.modules.enviodelocalizao.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsenineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDocumento: String? = MyApp.getInstance().resources.getString(R.string.lbl_documento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCmera: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_mera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGaleria: String? = MyApp.getInstance().resources.getString(R.string.lbl_galeria)

)
