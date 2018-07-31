package com.example.app

import org.scalatra._

class AuthServlet extends ScalatraServlet {
  // form画面へ遷移
  get("/") {
    views.html.login()
  }

  post("/") {
    val id = params("id")
    val pass = params("pass")
    println(id)
    views.html.admin(id)
  }

}
