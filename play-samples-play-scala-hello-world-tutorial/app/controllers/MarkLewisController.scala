package controllers

import akka.actor.ActorSystem
import javax.inject.{Inject, Singleton, _}
import model.MarkLewisMemoryModel
import play.api._
import play.api.mvc.{AbstractController, ControllerComponents, _}
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.{JsValue, Json}
import play.api.libs.concurrent.CustomExecutionContext
import slick.jdbc.H2Profile.api._

import scala.concurrent.{ExecutionContext, Future}

case class LoginData(username: String, password: String)

@Singleton
class MarkLewisController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {
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
    request.body.asFormUrlEncoded match {
      case Some(args) =>
      {
        if(MarkLewisMemoryModel.validateUser(args("username").head, args("password").head))
          Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> args("username").head)
        else
          Redirect(routes.MarkLewisController.login()).flashing("error" -> "Invalid username password combination")
      }

      case None => Redirect(routes.MarkLewisController.login())
    }
}

  def createUser() = Action{ request =>
    request.body.asFormUrlEncoded match {
      case Some(args) =>
      {
        if(MarkLewisMemoryModel.createUser(args("username").head, args("password").head))
          Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> args("username").head)
        else
          Redirect(routes.MarkLewisController.login()).flashing("error" -> "Creation failed")
      }

      case None => Redirect(routes.MarkLewisController.login())
    }
}

  def TodoIndex = Action{ implicit request =>
    request.session.get("username") match {
      case Some(username) =>
        val tasks = MarkLewisMemoryModel.getTasks(username)
        Ok(views.html.login(tasks))
      case None => Redirect(routes.MarkLewisController.login())
    }
}

  def logout = Action{
  Redirect(routes.MarkLewisController.login()).withNewSession
}

  def addTask = Action{ implicit request =>
    (request.session.get("username"), request.body.asFormUrlEncoded) match {
      case (Some(username), Some(args)) => {
        val task = args("newTask").head
        MarkLewisMemoryModel.addTask(username, task)
        Redirect(routes.MarkLewisController.TodoIndex())
      }
      case (_, _) => Redirect(routes.MarkLewisController.login())
    }
}

  def deleteTask = Action{ implicit request =>
    (request.session.get("username"), request.body.asFormUrlEncoded) match {
      case (Some(username), Some(args)) =>{
        val index = args("index").head.toInt
        MarkLewisMemoryModel.removeTask(username, index)
        Redirect(routes.MarkLewisController.TodoIndex())
      }
      case (_, _) => Redirect(routes.MarkLewisController.login())
    }
}

  def validateLoginForm = Action{ implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.login1(formWithErrors)),
      ld => if(MarkLewisMemoryModel.validateUser(ld.username, ld.password))
        Redirect(routes.MarkLewisController.TodoIndex()).withSession("username" -> ld.username)
      else
        Redirect(routes.MarkLewisController.login()).flashing("error" -> "Invalid username password combination")
    )
}

  def testAsync = Action.async{request =>
  Future{Ok("The site is ready")}
}

  def getTraffic(msg: String) = Future{
    val r = scala.util.Random
    val ret = r.nextInt(5) + 2
    Thread.sleep(ret*1000)
    ret
}

  def delayAsync = Action.async{request =>
    val traffic1 = getTraffic("server1")
    val traffic2 = getTraffic("server2")
    val traffic3 = getTraffic("server3")

    for{
      t1 <- traffic1
      t2 <- traffic2
      t3 <- traffic3
      total = t1 + t2 + t3
    }yield Ok(s"The site is ready $t1 + $t2 + $t3")
  }
}
