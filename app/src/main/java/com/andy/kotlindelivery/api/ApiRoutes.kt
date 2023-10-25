package com.andy.kotlindelivery.api

import com.andy.kotlindelivery.routers.UsuariosRoutes

class ApiRoutes {
    val API_URL = "http://192.168.100.92:3000/api/"
    val retrofit = RetrofitClient()

    fun getUsuariosRoutes(): UsuariosRoutes {
        return retrofit.getClient(API_URL).create(UsuariosRoutes::class.java)
    }
}