package com.application.app.modules.videochamadaemgrupobetterprice.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.BottomsheetVideoChamadaEmGrupoBetterPriceBinding
import com.application.app.modules.conversandocomletcia.ui.ConversandoComLetCiaActivity
import com.application.app.modules.videochamadaemgrupobetterprice.`data`.model.ListfileRowModel
import com.application.app.modules.videochamadaemgrupobetterprice.`data`.viewmodel.VideoChamadaEmGrupoBetterPriceVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VideoChamadaEmGrupoBetterPriceBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetVideoChamadaEmGrupoBetterPriceBinding>(R.layout.bottomsheet_video_chamada_em_grupo_better_price)
    {
  private val viewModel: VideoChamadaEmGrupoBetterPriceVM by
      viewModels<VideoChamadaEmGrupoBetterPriceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listfileAdapter = ListfileAdapter(viewModel.listfileList.value?:mutableListOf())
    binding.recyclerListfile.adapter = listfileAdapter
    listfileAdapter.setOnItemClickListener(
    object : ListfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfileRowModel) {
        onClickRecyclerListfile(view, position, item)
      }
    }
    )
    viewModel.listfileList.observe(requireActivity()) {
      listfileAdapter.updateData(it)
    }
    binding.videoChamadaEmGrupoBetterPriceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = ConversandoComLetCiaActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerListfile(
    view: View,
    position: Int,
    item: ListfileRowModel
  ): Unit {
    when(view.id) {
      R.id.btnCheckmark ->  {
        val destIntent = ConversandoComLetCiaActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        dismiss()
      }


      R.id.btnCamera -> { 
        ImagePickerFragmentDialog().show(childFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
    }
  }

  companion object {
    const val TAG: String = "VIDEO_CHAMADA_EM_GRUPO_BETTER_PRICE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): VideoChamadaEmGrupoBetterPriceBottomsheet {
      val fragment = VideoChamadaEmGrupoBetterPriceBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
