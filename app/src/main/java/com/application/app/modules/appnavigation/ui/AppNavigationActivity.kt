package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.aberturadecmera.ui.AberturaDeCMeraActivity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.bubbletouchhome.ui.BubbleTouchHomeActivity
import com.application.app.modules.cancelamentodaligao.ui.CancelamentoDaLigaOActivity
import com.application.app.modules.clipvoiceconversacomletcia.ui.ClipvoiceConversaComLetCiaActivity
import com.application.app.modules.contato3dtouch.ui.Contato3dTouchActivity
import com.application.app.modules.conversandocomletcia.ui.ConversandoComLetCiaActivity
import com.application.app.modules.enviodelocalizao.ui.EnvioDeLocalizaOActivity
import com.application.app.modules.ligaodeleticiarejeitada.ui.LigaODeLeticiaRejeitadaActivity
import com.application.app.modules.listadecontatos.ui.ListaDeContatosActivity
import com.application.app.modules.localizao.ui.LocalizaOActivity
import com.application.app.modules.navigationdrawersbottoncallleticia.ui.NavigationDrawersBottonCallLeticiaBottomsheet
import com.application.app.modules.niciodavdeocapturade30s.ui.NicioDaVDeoCapturaDe30sActivity
import com.application.app.modules.pushnotification.ui.PushNotificationActivity
import com.application.app.modules.pushnotificationextendido.ui.PushNotificationExtendidoActivity
import com.application.app.modules.terceiraconversacomletcia.ui.TerceiraConversaComLetCiaActivity
import com.application.app.modules.touchhome3d.ui.TouchHome3dActivity
import com.application.app.modules.vdeochamadaparaleticia.ui.VDeoChamadaParaLeticiaActivity
import com.application.app.modules.vdeogravao05s.ui.VDeoGravaO05sActivity
import com.application.app.modules.vdeogravaoaposrejeio.ui.VDeoGravaOAposRejeiOActivity
import com.application.app.modules.videochamadaemgrupobetterprice.ui.VideoChamadaEmGrupoBetterPriceBottomsheet
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearVdeoGravaoAposRejeio.setOnClickListener {
      val destIntent = VDeoGravaOAposRejeiOActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConversandoComLetcia.setOnClickListener {
      val destIntent = ConversandoComLetCiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListaDeContatos.setOnClickListener {
      val destIntent = ListaDeContatosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTerceiraConversaComLetcia.setOnClickListener {
      val destIntent = TerceiraConversaComLetCiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVideoChamadaEmGrupoBetterPrice.setOnClickListener {
      val destFragment = VideoChamadaEmGrupoBetterPriceBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, VideoChamadaEmGrupoBetterPriceBottomsheet.TAG)
    }
    binding.linearBubbleTouchHome.setOnClickListener {
      val destIntent = BubbleTouchHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNavigationDrawersBottonCallLeticia.setOnClickListener {
      val destFragment = NavigationDrawersBottonCallLeticiaBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager,
          NavigationDrawersBottonCallLeticiaBottomsheet.TAG)
    }
    binding.linearLocalizao.setOnClickListener {
      val destIntent = LocalizaOActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPushNotification.setOnClickListener {
      val destIntent = PushNotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearnicioDaVdeoCapturaDe30s.setOnClickListener {
      val destIntent = NicioDaVDeoCapturaDe30sActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCancelamentoDaLigao.setOnClickListener {
      val destIntent = CancelamentoDaLigaOActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPushNotificationExtendido.setOnClickListener {
      val destIntent = PushNotificationExtendidoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAberturaDeCmera.setOnClickListener {
      val destIntent = AberturaDeCMeraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLigaoDeLeticiaRejeitada.setOnClickListener {
      val destIntent = LigaODeLeticiaRejeitadaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEnvioDeLocalizao.setOnClickListener {
      val destIntent = EnvioDeLocalizaOActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVdeoChamadaParaLeticia.setOnClickListener {
      val destIntent = VDeoChamadaParaLeticiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearClipvoiceConversaComLetcia.setOnClickListener {
      val destIntent = ClipvoiceConversaComLetCiaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVdeoGravao05s.setOnClickListener {
      val destIntent = VDeoGravaO05sActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContato3DTouch.setOnClickListener {
      val destIntent = Contato3dTouchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTouchHome3D.setOnClickListener {
      val destIntent = TouchHome3dActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
