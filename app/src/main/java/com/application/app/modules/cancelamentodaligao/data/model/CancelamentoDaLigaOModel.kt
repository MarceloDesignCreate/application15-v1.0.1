package com.application.app.modules.cancelamentodaligao.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class CancelamentoDaLigaOModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetci: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_cia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEstouchegando: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_estou_chegando)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiNinaRiley: String? = MyApp.getInstance().resources.getString(R.string.msg_posso_te_ligar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_localiza_o_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewinterl: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_interlagos_sp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_22_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDigiteumamens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_digite_uma_mens)

)
