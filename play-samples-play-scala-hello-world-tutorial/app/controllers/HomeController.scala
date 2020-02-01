package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.{JsValue, Json}

case class Todo(name: String, priority: Int, complete: Boolean)

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def test(msg: String, n: Int) = Action { implicit request: Request[AnyContent] =>
    Ok(List.fill(n)(msg) mkString "\n")
  }

  def headers = Action { request =>
    val headers: Headers = request.headers
    val ucType: Option[String] = headers.get("Content-Type")
    val lcType: Option[String] = headers.get("content-type")
    val cookies: Cookies = request.cookies
    val cookie: Option[Cookie] = cookies.get("DemoCookie")
    val value: Option[String] = cookie.map(_.value)
    Ok(Seq(
      s"Headers: $headers",
      s"Content-Type: $ucType",
      s"content-type: $lcType",
    s"Cookies: $cookies",
    s"Cookie value: $value"
    ).mkString("\n"))
  }

  def displayInfo = Action { request =>
    val method: String = request.method
    val uri: String = request.uri
    val path: String = request.path
    val query: Map[String, Seq[String]] = request.queryString
    val queryValues: String = query.values.mkString(", ")

    Ok(Seq(
      s"Method: $method",
      s"uri: $uri",
      s"path: $path",
      s"query = $queryValues"
    ) mkString "\n")

  }

  def TestTwirl(name: String) = Action {implicit request: Request[AnyContent] =>
    Ok(views.html.helloWorld(name))
  }

  def TestForm() = Action {implicit request: Request[AnyContent] =>
    val todoForm = Form(mapping(
      "name" -> text,
      "priority" -> number,
      "complete" -> boolean
    )(Todo.apply)(Todo.unapply))
    val populatedForm = todoForm.bindFromRequest()(request)
    Ok("TODO FORM!")
  }

  def JsonIndex= Action(parse.json) { request =>
    // ...the request body is automaically JSON -- no need to call `asJson`:
    val json: JsValue = request.body
    Ok(Json.obj(
      "message" -> "The request contained JSON data",
      "data" -> json
    ))
  }

  def TodoIndex= TODO
  
}
