package com.application.app.modules.ligaodeleticiarejeitada.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class LigaODeLeticiaRejeitadaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetcia: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_cia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoatendida: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_o_atendida)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelar: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancelar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLigarnovamente: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ligar_novamente)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_s)

)
