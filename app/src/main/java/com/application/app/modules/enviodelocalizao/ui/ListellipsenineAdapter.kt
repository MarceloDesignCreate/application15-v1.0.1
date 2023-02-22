package com.application.app.modules.enviodelocalizao.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListellipsenineBinding
import com.application.app.modules.enviodelocalizao.`data`.model.ListellipsenineRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsenineAdapter(
  var list: List<ListellipsenineRowModel>
) : RecyclerView.Adapter<ListellipsenineAdapter.RowListellipsenineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsenineVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsenine,parent,false)
    return RowListellipsenineVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsenineVH, position: Int) {
    val listellipsenineRowModel = ListellipsenineRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsenineRowModel = list[position]
    holder.binding.listellipsenineRowModel = listellipsenineRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsenineRowModel>) {
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
      item: ListellipsenineRowModel
    ) {
    }
  }

  inner class RowListellipsenineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsenineBinding = RowListellipsenineBinding.bind(itemView)
    init {
      binding.imageCamera.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListellipsenineRowModel())
      }
    }
  }
}
