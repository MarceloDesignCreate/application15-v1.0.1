package com.application.app.modules.pushnotificationextendido.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PushNotificationExtendidoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChamadadevoz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chamada_de_voz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetciaVilella: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_let_cia_vilella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSoPaulo: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_o_paulo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewudio: String? = MyApp.getInstance().resources.getString(R.string.lbl_udio_capture)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewvdeo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_v_deo_capture2)

)
