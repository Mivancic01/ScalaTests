package controllers

import javax.inject.{Inject, Singleton, _}
import model.MarkLewisMemoryModel
import play.api._
import play.api.mvc.{AbstractController, ControllerComponents, _}
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.{JsValue, Json}

case class LoginData(username: String, password: String)

@Singleton
class MarkLewisController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  val loginForm = Form(mapping(
    "Username" -> text(3, 10),
    "Password" -> text(8)
  )(LoginData.apply)(LoginData.unapply))

  def product(prodType: String, prodNum: Int) = Action{
    Ok(s"Product type is: $prodType, product number is: $prodNum")
  }

  def login = Action{ implicit request =>
    Ok(views.html.login1(loginForm))
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
        Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> username)
      }
      else{
        Redirect(routes.MarkLewisController.login()).flashing("error" -> "Invalid username password combination")
      }
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def createUser() = Action{ request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args =>
      val username = args("username").head
      val password = args("password").head
      if(MarkLewisMemoryModel.createUser(username, password)){
        Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> username)
      }
      else{
        Redirect(routes.MarkLewisController.login()).flashing("error" -> "Creation failed")
      }
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def TodoIndex = Action{ implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username =>
      val tasks = MarkLewisMemoryModel.getTasks(username)
      Ok(views.html.login(tasks))
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def logout = Action{
    Redirect(routes.MarkLewisController.login()).withNewSession
  }

  def addTask = Action{ implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{username =>
      val postVals = request.body.asFormUrlEncoded
      postVals.map{ args =>
        val task = args("newTask").head
        MarkLewisMemoryModel.addTask(username, task)
        Redirect(routes.MarkLewisController.TodoIndex())
      }.getOrElse(Redirect(routes.MarkLewisController.login()))
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def deleteTask = Action{ implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{username =>
      val postVals = request.body.asFormUrlEncoded
      postVals.map{ args =>
        val index = args("index").head.toInt
        MarkLewisMemoryModel.removeTask(username, index)
        Redirect(routes.MarkLewisController.TodoIndex())
      }.getOrElse(Redirect(routes.MarkLewisController.login()))
    }.getOrElse(Redirect(routes.MarkLewisController.login()))
  }

  def validateLoginForm = Action{ implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.login1(formWithErrors)),
      ld => if(MarkLewisMemoryModel.validateUser(ld.username, ld.password)){
        Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> ld.username)
      }
      else{
        Redirect(routes.MarkLewisController.login()).flashing("error" -> "Invalid username password combination")
      }
    )
  }
}
