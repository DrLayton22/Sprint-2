package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Message
import com.example.myapplication.MessageAdapter

class MessagesWindow : AppCompatActivity() {

    private lateinit var connectionInfoTextView: TextView
    private lateinit var messageText: EditText
    private lateinit var sendMessageButton: ImageButton
    private lateinit var recyclerView: RecyclerView
    private val messageList = mutableListOf<Message>()
    private val adapter = MessageAdapter(messageList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages_window)

        recyclerView = findViewById(R.id.messagesRecyclerView)
        messageText = findViewById(R.id.MessageText)
        sendMessageButton = findViewById(R.id.sendMessage)

        // Configurar el RecyclerView
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        // Recuperar datos del Intent
        val intent = intent
        val nickName = intent.getStringExtra("nickName")
        val serverAddress = intent.getStringExtra("serverAddress")

        // Configurar el TextView de conexión
        connectionInfoTextView = findViewById(R.id.connectionInfoTextView)
        connectionInfoTextView.text = "Connectat a $serverAddress com a $nickName"

        // Configurar el botón de envío
        sendMessageButton.setOnClickListener {
            // Obtener el texto del mensaje
            val message = messageText.text.toString()

            // Comprobar si el mensaje no está vacío
            if (message.isNotEmpty()) {
                // Agregar el mensaje a la lista de mensajes
                val username = "Nombre de Usuario" // Reemplaza con el nombre de usuario real
                messageList.add(Message(username, message))

                // Notificar al adaptador de cambios en los datos
                adapter.notifyDataSetChanged()

                // Borrar el texto del mensaje
                messageText.text.clear()

                // Desplazarse automáticamente al último mensaje
                val lastIndex = messageList.size - 1 // Índice del último elemento
                recyclerView.smoothScrollToPosition(lastIndex)
            }
        }
    }
}

