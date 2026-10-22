
package com.vibechat.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fondo = LinearLayout(this)
        fondo.orientation = LinearLayout.VERTICAL
        fondo.setPadding(32, 48, 32, 24)
        fondo.setBackgroundColor(Color.rgb(245, 250, 247))

        val titulo = TextView(this)
        titulo.text = "VibeChat 💚"
        titulo.textSize = 30f
        titulo.setTextColor(Color.rgb(0, 130, 75))
        titulo.gravity = Gravity.CENTER
        fondo.addView(titulo)

        val bienvenida = TextView(this)
        bienvenida.text = "Conéctate con tus amigos"
        bienvenida.textSize = 18f
        bienvenida.gravity = Gravity.CENTER
        bienvenida.setPadding(0, 24, 0, 24)
        fondo.addView(bienvenida)

        val mensaje = EditText(this)
        mensaje.hint = "Escribe tu mensaje..."
        fondo.addView(mensaje)

        val enviar = Button(this)
        enviar.text = "Enviar"
        fondo.addView(enviar)

        val estado = TextView(this)
        estado.text = "Bienvenido a VibeChat"
        estado.textSize = 16f
        estado.setPadding(0, 24, 0, 0)
        fondo.addView(estado)

        enviar.setOnClickListener {
            val texto = mensaje.text.toString().trim()
            if (texto.isNotEmpty()) {
                estado.text = "Mensaje preparado: $texto"
                mensaje.text.clear()
            }
        }

        setContentView(fondo)
    }
}
