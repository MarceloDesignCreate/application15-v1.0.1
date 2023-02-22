package com.application.app.modules.videochamadaemgrupobetterprice.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class VideoChamadaEmGrupoBetterPriceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBetterPrices: String? = MyApp.getInstance().resources.getString(R.string.lbl_better_prices)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPessoasCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_pessoas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJunior: String? = MyApp.getInstance().resources.getString(R.string.lbl_junior)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyrella: String? = MyApp.getInstance().resources.getString(R.string.lbl_myrella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNayara: String? = MyApp.getInstance().resources.getString(R.string.lbl_nayara)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJessyca: String? = MyApp.getInstance().resources.getString(R.string.lbl_jessyca)

)
