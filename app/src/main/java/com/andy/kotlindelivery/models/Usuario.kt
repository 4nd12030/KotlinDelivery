package com.andy.kotlindelivery.models

import com.google.gson.annotations.SerializedName

class Usuario (
    @SerializedName("id") val id : String? = null,
    @SerializedName("nombre") val nombre:String,
    @SerializedName("apellido") val apellido : String,
    @SerializedName("email") val email:String,
    @SerializedName("telefono") val telefono : String,
    @SerializedName("contrasena") val contrasena:String,
    @SerializedName("image") val image : String? = null,
    @SerializedName("session_token") val sessionToken:String? = null,
    @SerializedName("is_available") val is_available : Boolean? = null,
) {
    override fun toString(): String {
        return "Usuario(id='$id', nombre='$nombre', apellido='$apellido', email='$email', telefono='$telefono', contrasena='$contrasena', image='$image', session_token='$sessionToken', is_available=$is_available)"
    }
}