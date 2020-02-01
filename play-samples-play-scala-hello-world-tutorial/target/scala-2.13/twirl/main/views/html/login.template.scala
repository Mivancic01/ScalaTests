
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/main("Task List")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<h2>Task List</h2>

<ul>
  """),_display_(/*7.4*/for(task <- tasks) yield /*7.22*/{_display_(Seq[Any](format.raw/*7.23*/("""
  """),format.raw/*8.3*/("""<li>"""),_display_(/*8.8*/task),format.raw/*8.12*/("""</li>
  """)))}),format.raw/*9.4*/("""
"""),format.raw/*10.1*/("""</ul>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(tasks)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => apply(tasks)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-02T00:37:06.663452500
                  SOURCE: D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/app/views/login.scala.html
                  HASH: 3e9c9890ca97098cc761a179d8c413c930012ef2
                  MATRIX: 734->1|849->21|879->26|904->43|942->44|970->46|1026->77|1059->95|1097->96|1127->100|1157->105|1181->109|1220->119|1249->121
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10
                  -- GENERATED --
              */
          