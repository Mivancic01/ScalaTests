
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[LoginData],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[LoginData])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<h2>Login page</h2>

<form method="get" action="validateGet">
    <br>
    <h3>Get Task List without User Validation</h3>
    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit">
</form>

<form method="post" action=""""),_display_(/*16.30*/routes/*16.36*/.MarkLewisController.validateLoginPost()),format.raw/*16.76*/("""">
    """),_display_(/*17.6*/helper/*17.12*/.CSRF.formField),format.raw/*17.27*/("""
    """),format.raw/*18.5*/("""<br>
    <h3>Login as User</h3>
    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit">
</form>

"""),_display_(/*27.2*/helper/*27.8*/.form(action = routes.MarkLewisController.validateLoginForm())/*27.70*/{_display_(Seq[Any](format.raw/*27.71*/("""
  """),_display_(/*28.4*/helper/*28.10*/.CSRF.formField),format.raw/*28.25*/("""
  """),_display_(/*29.4*/helper/*29.10*/.inputText(loginForm("Username"))),format.raw/*29.43*/("""
  """),_display_(/*30.4*/helper/*30.10*/.inputText(loginForm("Password"))),format.raw/*30.43*/("""
  """),format.raw/*31.3*/("""<div class="form-actions">
      <button type="submit">Login</button>
  </div>
""")))}),format.raw/*34.2*/("""

"""),format.raw/*36.1*/("""<form method="post" action=""""),_display_(/*36.30*/routes/*36.36*/.MarkLewisController.createUser()),format.raw/*36.69*/("""">
    """),_display_(/*37.6*/helper/*37.12*/.CSRF.formField),format.raw/*37.27*/("""
    """),format.raw/*38.5*/("""<br>
    <h3>Create User</h3>
    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit">
</form>
""")))}))
      }
    }
  }

  def render(loginForm:Form[LoginData],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(request,flash)

  def f:((Form[LoginData]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (request,flash) => apply(loginForm)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-02T22:59:42.665024300
                  SOURCE: D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/app/views/login1.scala.html
                  HASH: a64b57aaa7885930d0d9c5edd7a75eacf9897e28
                  MATRIX: 767->1|945->84|975->89|996->102|1034->103|1062->105|1409->425|1424->431|1485->471|1520->480|1535->486|1571->501|1604->507|1829->706|1843->712|1914->774|1953->775|1984->780|1999->786|2035->801|2066->806|2081->812|2135->845|2166->850|2181->856|2235->889|2266->893|2379->976|2410->980|2466->1009|2481->1015|2535->1048|2570->1057|2585->1063|2621->1078|2654->1084
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|41->16|41->16|41->16|42->17|42->17|42->17|43->18|52->27|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|59->34|61->36|61->36|61->36|61->36|62->37|62->37|62->37|63->38
                  -- GENERATED --
              */
          