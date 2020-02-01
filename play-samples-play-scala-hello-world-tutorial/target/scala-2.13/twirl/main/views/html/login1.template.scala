
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

object login1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<h2>Login</h2>

<form method="get" action="validateGet">
    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit">
</form>

<form method="post" action=""""),_display_(/*14.30*/routes/*14.36*/.MarkLewisController.validateLoginPost()),format.raw/*14.76*/("""">
    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit">
</form>

<form method="post" action=""""),_display_(/*22.30*/routes/*22.36*/.MarkLewisController.createUser()),format.raw/*22.69*/("""">
    <br>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-02T00:43:05.865146100
                  SOURCE: D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/app/views/login1.scala.html
                  HASH: ab0f5f2590c9bce5942d71abd3d2c32f281cb4e8
                  MATRIX: 723->1|819->3|849->8|870->21|908->22|936->24|1216->277|1231->283|1292->323|1516->520|1531->526|1585->559
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|39->14|39->14|39->14|47->22|47->22|47->22
                  -- GENERATED --
              */
          