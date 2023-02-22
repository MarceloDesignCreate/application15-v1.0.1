package com.application.app.modules.conversandocomletcia.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ConversandoComLetCiaModel(
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
  var txtHelloLorettaF: String? =
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
  var txtDigiteumamens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_digite_uma_mens)

)
