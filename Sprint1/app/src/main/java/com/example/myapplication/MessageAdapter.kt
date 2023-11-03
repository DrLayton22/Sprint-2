package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Message

class MessageAdapter(private val messageList: List<Message>) : RecyclerView.Adapter<MessageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.my_msg_viewholder, parent, false)
        return MessageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]
        holder.bind(message)
    }

    override fun getItemCount(): Int {
        return messageList.size
    }
}
