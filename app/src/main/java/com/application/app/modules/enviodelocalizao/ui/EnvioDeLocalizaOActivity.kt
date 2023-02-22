package com.application.app.modules.enviodelocalizao.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.ActivityEnvioDeLocalizaOBinding
import com.application.app.modules.enviodelocalizao.`data`.model.ListellipsenineRowModel
import com.application.app.modules.enviodelocalizao.`data`.viewmodel.EnvioDeLocalizaOVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnvioDeLocalizaOActivity :
    BaseActivity<ActivityEnvioDeLocalizaOBinding>(R.layout.activity_envio_de_localiza_o) {
  private val viewModel: EnvioDeLocalizaOVM by viewModels<EnvioDeLocalizaOVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsenineAdapter =
    ListellipsenineAdapter(viewModel.listellipsenineList.value?:mutableListOf())
    binding.recyclerListellipsenine.adapter = listellipsenineAdapter
    listellipsenineAdapter.setOnItemClickListener(
    object : ListellipsenineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsenineRowModel) {
        onClickRecyclerListellipsenine(view, position, item)
      }
    }
    )
    viewModel.listellipsenineList.observe(this) {
      listellipsenineAdapter.updateData(it)
    }
    binding.envioDeLocalizaOVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipsenine(
    view: View,
    position: Int,
    item: ListellipsenineRowModel
  ): Unit {
    when(view.id) {


      R.id.imageCamera -> {
        ImagePickerFragmentDialog().show(supportFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
    }
  }

  companion object {
    const val TAG: String = "ENVIO_DE_LOCALIZA_O_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnvioDeLocalizaOActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
