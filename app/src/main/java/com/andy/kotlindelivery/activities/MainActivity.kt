package com.andy.kotlindelivery.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.andy.kotlindelivery.R

class MainActivity : AppCompatActivity() {

    var imageViewGotoRegister: ImageView? = null
    var editTxtEmail: EditText? = null
    var editTxTContrasena: EditText? = null
    var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewGotoRegister = findViewById(R.id.imgview_goregister)
        editTxtEmail = findViewById(R.id.edittxt_email)
        editTxTContrasena = findViewById(R.id.edittxt_contrasena)
        btnLogin = findViewById(R.id.btn_login)

        imageViewGotoRegister?.setOnClickListener{ goToRegister() }
    }

    private fun login(){
        val email = editTxtEmail?.text.toString() //NULL POINTE EXCEPTION
        val contrasena = editTxTContrasena?.text.toString()
    }

    fun String.isEmailValid() : Boolean{
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

    private fun isValidForm(email:String, password:String) : Boolean{
        if(email.isBlank()) {
            Toast.makeText(this,"Debes ingresar el email", Toast.LENGTH_LONG).show()
            return false
        }
        if(password.isBlank()) {
            Toast.makeText(this,"Debes ingresar la contraseña", Toast.LENGTH_LONG).show()
            return false
        }
        if(!email.isEmailValid()) {
            return false
        }
        return true
    }

    private fun goToRegister(){
        val i = Intent( this, RegisterActivity::class.java)
        startActivity(i)
        finish()
    }
}