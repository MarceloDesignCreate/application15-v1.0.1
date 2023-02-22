package com.application.app.modules.navigationdrawersbottoncallleticia.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListfile1Binding
import com.application.app.modules.navigationdrawersbottoncallleticia.`data`.model.Listfile1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfileAdapter(
  var list: List<Listfile1RowModel>
) : RecyclerView.Adapter<ListfileAdapter.RowListfile1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfile1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfile1,parent,false)
    return RowListfile1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfile1VH, position: Int) {
    val listfile1RowModel = Listfile1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfile1RowModel = list[position]
    holder.binding.listfile1RowModel = listfile1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfile1RowModel>) {
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
      item: Listfile1RowModel
    ) {
    }
  }

  inner class RowListfile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfile1Binding = RowListfile1Binding.bind(itemView)
    init {
      binding.btnCamera.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listfile1RowModel())
      }
    }
  }
}
