package com.application.app.modules.vdeochamadaparaleticia.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class VDeoChamadaParaLeticiaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_chamada_de_v_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetcia: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_cia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsApp: String? = MyApp.getInstance().resources.getString(R.string.lbl_chamando)

)
