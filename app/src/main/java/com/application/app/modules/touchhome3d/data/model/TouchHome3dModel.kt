package com.application.app.modules.touchhome3d.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class TouchHome3dModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoutubeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_youtube)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPinterest: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinterest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNetflix: String? = MyApp.getInstance().resources.getString(R.string.lbl_netflix)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTiktok: String? = MyApp.getInstance().resources.getString(R.string.lbl_tik_tok)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendario: String? = MyApp.getInstance().resources.getString(R.string.lbl_calend_rio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrive: String? = MyApp.getInstance().resources.getString(R.string.lbl_drive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeet: String? = MyApp.getInstance().resources.getString(R.string.lbl_meet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsApp: String? = MyApp.getInstance().resources.getString(R.string.lbl_whatsapp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInstagram: String? = MyApp.getInstance().resources.getString(R.string.lbl_instagram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessenger: String? = MyApp.getInstance().resources.getString(R.string.lbl_messenger)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)

)
