package com.example.library.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.core.data.Document

class LibraryAdapter: ListAdapter<Document, DocumentHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DocumentHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

class DiffCallback: DiffUtil.ItemCallback<Document>() {
    override fun areItemsTheSame(oldItem: Document, newItem: Document): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: Document, newItem: Document): Boolean {
        TODO("Not yet implemented")
    }
}