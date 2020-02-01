package controllers

import javax.inject.{Inject, Singleton, _}
import model.MarkLewisMemoryModel
import play.api._
import play.api.mvc.{AbstractController, ControllerComponents, _}
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.{JsValue, Json}

@Singleton
class MarkLewisController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def TodoIndex = Action{
    val username = "asa"
    val tasks = MarkLewisMemoryModel.getTasks(username)
    Ok(views.html.login(tasks))
  }

  def product(prodType: String, prodNum: Int) = Action{
    Ok(s"Product type is: $prodType, product number is: $prodNum")
  }

  def login = Action{
    Ok(views.html.login1())
  }

  def validateLoginGet(username: String, password: String) = Action{
    Ok("validate login works")
  }

  def validateLoginPost = Action{ request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args =>
      val username = args("username").head
      val password = args("password").head
      if(MarkLewisMemoryModel.validateUser(username, password)){
        Redirect(routes.MarkLewisController.TodoIndex())
      }
      else{
        Redirect(routes.MarkLewisController.login())
      }
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def createUser() = Action{ request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args =>
      val username = args("username").head
      val password = args("password").head
      if(MarkLewisMemoryModel.createUser(username, password)){
        Redirect(routes.MarkLewisController.TodoIndex())
      }
      else{
        Redirect(routes.MarkLewisController.login())
      }
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

}
