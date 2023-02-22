package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVdeoGravaoAposRejeio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_v_deo_grava_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtnicioDaVdeoCapturaDe30s: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nicio_da_v_deo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAberturaDeCmera: String? =
      MyApp.getInstance().resources.getString(R.string.msg_abertura_de_c_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConversandoComLetcia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_conversando_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVideoChamadaEmGrupoBetterPrice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_video_chamada_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClipvoiceConversaComLetcia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_clipvoice_conve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVdeoGravao05s: String? =
      MyApp.getInstance().resources.getString(R.string.msg_v_deo_grava_o2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVdeoChamadaParaLeticia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_v_deo_chamada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContato3DTouch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contato_3d_touc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListaDeContatos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lista_de_contat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBubbleTouchHome: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bubble_touch_ho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushNotification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_push_notificati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocalizao: String? = MyApp.getInstance().resources.getString(R.string.lbl_localiza_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTouchHome3D: String? = MyApp.getInstance().resources.getString(R.string.lbl_touch_home_3d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNavigationDrawersBottonCallLeticia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_navigation_draw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushNotificationExtendido: String? =
      MyApp.getInstance().resources.getString(R.string.msg_push_notificati2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelamentoDaLigao: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cancelamento_da)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerceiraConversaComLetcia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terceira_conver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnvioDeLocalizao: String? =
      MyApp.getInstance().resources.getString(R.string.msg_envio_de_locali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLigaoDeLeticiaRejeitada: String? =
      MyApp.getInstance().resources.getString(R.string.msg_liga_o_de_leti)

)
