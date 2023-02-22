package com.application.app.modules.listadecontatos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListtextviewanthonBinding
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewanthonRowModel
import kotlin.Int
import kotlin.collections.List

class ListtextviewanthonAdapter(
  var list: List<ListtextviewanthonRowModel>
) : RecyclerView.Adapter<ListtextviewanthonAdapter.RowListtextviewanthonVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtextviewanthonVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtextviewanthon,parent,false)
    return RowListtextviewanthonVH(view)
  }

  override fun onBindViewHolder(holder: RowListtextviewanthonVH, position: Int) {
    val listtextviewanthonRowModel = ListtextviewanthonRowModel()
    // TODO uncomment following line after integration with data source
    // val listtextviewanthonRowModel = list[position]
    holder.binding.listtextviewanthonRowModel = listtextviewanthonRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtextviewanthonRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListtextviewanthonRowModel
    ) {
    }
  }

  inner class RowListtextviewanthonVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtextviewanthonBinding = RowListtextviewanthonBinding.bind(itemView)
  }
}
