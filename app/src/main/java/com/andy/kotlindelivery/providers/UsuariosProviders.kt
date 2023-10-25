package com.andy.kotlindelivery.providers

import com.andy.kotlindelivery.api.ApiRoutes
import com.andy.kotlindelivery.models.ResponseHttp
import com.andy.kotlindelivery.models.Usuario
import com.andy.kotlindelivery.routers.UsuariosRoutes
import retrofit2.Call

class UsuariosProviders {
    private var usuariosRoutes: UsuariosRoutes? = null
    init {
        val api =ApiRoutes()
        usuariosRoutes =api.getUsuariosRoutes()
    }

    fun register(usuario: Usuario): Call<ResponseHttp>?{
        return usuariosRoutes?.register(usuario)
    }


}