package com.application.app.modules.navigationdrawersbottoncallleticia.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.BottomsheetNavigationDrawersBottonCallLeticiaBinding
import com.application.app.modules.ligaodeleticiarejeitada.ui.LigaODeLeticiaRejeitadaActivity
import com.application.app.modules.navigationdrawersbottoncallleticia.`data`.model.Listfile1RowModel
import com.application.app.modules.navigationdrawersbottoncallleticia.`data`.viewmodel.NavigationDrawersBottonCallLeticiaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NavigationDrawersBottonCallLeticiaBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetNavigationDrawersBottonCallLeticiaBinding>(R.layout.bottomsheet_navigation_drawers_botton_call_leticia)
    {
  private val viewModel: NavigationDrawersBottonCallLeticiaVM by
      viewModels<NavigationDrawersBottonCallLeticiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listfileAdapter = ListfileAdapter(viewModel.listfileList.value?:mutableListOf())
    binding.recyclerListfile.adapter = listfileAdapter
    listfileAdapter.setOnItemClickListener(
    object : ListfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfile1RowModel) {
        onClickRecyclerListfile(view, position, item)
      }
    }
    )
    viewModel.listfileList.observe(requireActivity()) {
      listfileAdapter.updateData(it)
    }
    binding.navigationDrawersBottonCallLeticiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = LigaODeLeticiaRejeitadaActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerListfile(
    view: View,
    position: Int,
    item: Listfile1RowModel
  ): Unit {
    when(view.id) {


      R.id.btnCamera -> {
        ImagePickerFragmentDialog().show(childFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
    }
  }

  companion object {
    const val TAG: String = "NAVIGATION_DRAWERS_BOTTON_CALL_LETICIA_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): NavigationDrawersBottonCallLeticiaBottomsheet {
      val fragment = NavigationDrawersBottonCallLeticiaBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
