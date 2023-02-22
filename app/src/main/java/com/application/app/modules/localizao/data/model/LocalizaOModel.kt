package com.application.app.modules.localizao.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class LocalizaOModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScancode: String? = MyApp.getInstance().resources.getString(R.string.msg_enviar_localiza)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetci: String? =
      MyApp.getInstance().resources.getString(R.string.msg_localiza_o_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_locais_pr_ximos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_localiza_o_atu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_precis_o_de_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_empresa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_precis_o_de_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciSix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_estacionamento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_precis_o_de_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_restaurante)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextviewLetciNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_precis_o_de_100)

)
