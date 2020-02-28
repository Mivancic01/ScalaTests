
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[String],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: Seq[String])(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("Task List")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<h2>Task List</h2>

<ul>
  """),_display_(/*7.4*/for((task, i) <- tasks.zipWithIndex) yield /*7.40*/{_display_(Seq[Any](format.raw/*7.41*/("""
  """),format.raw/*8.3*/("""<li>"""),_display_(/*8.8*/task),format.raw/*8.12*/("""</li>
  <form method="post" action=""""),_display_(/*9.32*/routes/*9.38*/.MarkLewisController.deleteTask),format.raw/*9.69*/("""">
    """),_display_(/*10.6*/helper/*10.12*/.CSRF.formField),format.raw/*10.27*/("""
    """),format.raw/*11.5*/("""<input type="hidden" name="index" value=""""),_display_(/*11.47*/i),format.raw/*11.48*/(""""/>
    <input type="submit" value="Delete"/>
  </form>
  """)))}),format.raw/*14.4*/("""
"""),format.raw/*15.1*/("""</ul>

<form method="post" action=""""),_display_(/*17.30*/routes/*17.36*/.MarkLewisController.addTask),format.raw/*17.64*/("""">
  """),_display_(/*18.4*/helper/*18.10*/.CSRF.formField),format.raw/*18.25*/("""
  """),format.raw/*19.3*/("""<input type="text" name="newTask">
  <input type="submit">
</form>

<div>
  <a href=""""),_display_(/*24.13*/routes/*24.19*/.MarkLewisController.logout()),format.raw/*24.48*/("""">Logout</a>
</div>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,flash)

  def f:((Seq[String]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,flash) => apply(tasks)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-19T12:14:58.210276700
                  SOURCE: D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/app/views/login.scala.html
                  HASH: 37f6fcce4f2cda2ea567fc7551b53fbbbee6a6d4
                  MATRIX: 754->1|916->68|946->73|971->90|1009->91|1037->93|1093->124|1144->160|1182->161|1212->165|1242->170|1266->174|1330->212|1344->218|1395->249|1430->258|1445->264|1481->279|1514->285|1583->327|1605->328|1697->390|1726->392|1791->430|1806->436|1855->464|1888->471|1903->477|1939->492|1970->496|2088->587|2103->593|2153->622
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|39->14|40->15|42->17|42->17|42->17|43->18|43->18|43->18|44->19|49->24|49->24|49->24
                  -- GENERATED --
              */
          