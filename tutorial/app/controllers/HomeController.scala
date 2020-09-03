package controllers

import models.Model
import javax.inject._
import models.Model.MessageTable
import play.api._
import play.api.mvc._

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import slick.jdbc.H2Profile.api._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val messages = TableQuery[MessageTable]
  //val db = Database.forConfig("chapter04")


  def index() = Action{ request =>
    //Model.populate
    //Model.exec(Model.populate)
    Model.printCurrentDatabaseState
    val seq = Model.testQuery()
    val str = seq.mkString("\n")
    Ok(str)
    //Ok(Model.getString)
    //Ok("HELLO WORLD!")
  }
  
}
