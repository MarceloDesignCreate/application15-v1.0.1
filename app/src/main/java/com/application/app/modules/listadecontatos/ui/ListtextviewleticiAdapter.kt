package com.application.app.modules.listadecontatos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListtextviewleticiBinding
import com.application.app.modules.listadecontatos.`data`.model.ListtextviewleticiRowModel
import kotlin.Int
import kotlin.collections.List

class ListtextviewleticiAdapter(
  var list: List<ListtextviewleticiRowModel>
) : RecyclerView.Adapter<ListtextviewleticiAdapter.RowListtextviewleticiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtextviewleticiVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtextviewletici,parent,false)
    return RowListtextviewleticiVH(view)
  }

  override fun onBindViewHolder(holder: RowListtextviewleticiVH, position: Int) {
    val listtextviewleticiRowModel = ListtextviewleticiRowModel()
    // TODO uncomment following line after integration with data source
    // val listtextviewleticiRowModel = list[position]
    holder.binding.listtextviewleticiRowModel = listtextviewleticiRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtextviewleticiRowModel>) {
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
      item: ListtextviewleticiRowModel
    ) {
    }
  }

  inner class RowListtextviewleticiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtextviewleticiBinding = RowListtextviewleticiBinding.bind(itemView)
    init {
      binding.linearRowtextviewconverTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListtextviewleticiRowModel())
      }
    }
  }
}
