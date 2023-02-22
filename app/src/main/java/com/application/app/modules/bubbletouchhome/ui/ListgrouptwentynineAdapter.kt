package com.application.app.modules.bubbletouchhome.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListgrouptwentynineBinding
import com.application.app.modules.bubbletouchhome.`data`.model.ListgrouptwentynineRowModel
import kotlin.Int
import kotlin.collections.List

class ListgrouptwentynineAdapter(
  var list: List<ListgrouptwentynineRowModel>
) : RecyclerView.Adapter<ListgrouptwentynineAdapter.RowListgrouptwentynineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgrouptwentynineVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgrouptwentynine,parent,false)
    return RowListgrouptwentynineVH(view)
  }

  override fun onBindViewHolder(holder: RowListgrouptwentynineVH, position: Int) {
    val listgrouptwentynineRowModel = ListgrouptwentynineRowModel()
    // TODO uncomment following line after integration with data source
    // val listgrouptwentynineRowModel = list[position]
    holder.binding.listgrouptwentynineRowModel = listgrouptwentynineRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgrouptwentynineRowModel>) {
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
      item: ListgrouptwentynineRowModel
    ) {
    }
  }

  inner class RowListgrouptwentynineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgrouptwentynineBinding = RowListgrouptwentynineBinding.bind(itemView)
  }
}
