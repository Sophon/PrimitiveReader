package com.example.library.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.data.Document
import com.example.library.R
import com.example.library.databinding.ItemDocumentBinding

class LibraryAdapter(
        val items: List<Document>
): RecyclerView.Adapter<DocumentHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentHolder {
        val binding = DataBindingUtil.inflate<ItemDocumentBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_document,
                parent,
                false
        )

        return DocumentHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: DocumentHolder, position: Int) {
        holder.bind(items[position])
    }
}
