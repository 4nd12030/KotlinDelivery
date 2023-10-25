package com.andy.kotlindelivery.routers

import com.andy.kotlindelivery.models.ResponseHttp
import com.andy.kotlindelivery.models.Usuario
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UsuariosRoutes {

    @POST("usuarios/create")
    fun register (@Body usuario: Usuario) : Call<ResponseHttp>
}