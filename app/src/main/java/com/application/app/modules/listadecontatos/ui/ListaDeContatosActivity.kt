package com.application.app.modules.listadecontatos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityListaDeContatosBinding
import com.application.app.modules.conversandocomletcia.ui.ConversandoComLetCiaActivity
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewanthonRowModel
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewleticiRowModel
import com.application.app.modules.listadecontatos.`data`.viewmodel.ListaDeContatosVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ListaDeContatosActivity :
    BaseActivity<ActivityListaDeContatosBinding>(R.layout.activity_lista_de_contatos) {
  private val viewModel: ListaDeContatosVM by viewModels<ListaDeContatosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtextviewanthonAdapter =
    ListtextviewanthonAdapter(viewModel.listtextviewanthonList.value?:mutableListOf())
    binding.recyclerListtextviewanthon.adapter = listtextviewanthonAdapter
    listtextviewanthonAdapter.setOnItemClickListener(
    object : ListtextviewanthonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtextviewanthonRowModel) {
        onClickRecyclerListtextviewanthon(view, position, item)
      }
    }
    )
    viewModel.listtextviewanthonList.observe(this) {
      listtextviewanthonAdapter.updateData(it)
    }
    val listtextviewleticiAdapter =
    ListtextviewleticiAdapter(viewModel.listtextviewleticiList.value?:mutableListOf())
    binding.recyclerListtextviewletici.adapter = listtextviewleticiAdapter
    listtextviewleticiAdapter.setOnItemClickListener(
    object : ListtextviewleticiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtextviewleticiRowModel) {
        onClickRecyclerListtextviewletici(view, position, item)
      }
    }
    )
    viewModel.listtextviewleticiList.observe(this) {
      listtextviewleticiAdapter.updateData(it)
    }
    binding.listaDeContatosVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtextviewanthon(
    view: View,
    position: Int,
    item: ListtextviewanthonRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtextviewletici(
    view: View,
    position: Int,
    item: ListtextviewleticiRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowtextviewconverTwo ->  {
        val destIntent = ConversandoComLetCiaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "LISTA_DE_CONTATOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ListaDeContatosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
