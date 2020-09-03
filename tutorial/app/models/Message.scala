package models

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import slick.jdbc.H2Profile.api._

object Model
{
  case class Message(sender: String, content: String, id: Long = 0L)

  // Schema:
  class MessageTable(tag: Tag) extends Table[Message](tag, "message") {
    def id      = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def sender  = column[String]("sender")
    def content = column[String]("content")
    def * = (sender, content, id).mapTo[Message]
  }

  val messages = TableQuery[MessageTable]

  val db = Database.forConfig("chapter04")

  def exec[T](program: DBIO[T]): T =
    Await.result(db.run(program), 5000.milliseconds)

  def testData = Seq(
    Message("Dave", "Hello, HAL. Do you read me, HAL?"),
    Message("HAL",  "Affirmative, Dave. I read you."),
    Message("Dave", "Open the pod bay doors, HAL."),
    Message("HAL",  "I'm sorry, Dave. I'm afraid I can't do that."))

  def populate =
    DBIO.seq(
      messages.schema.create,
      messages ++= testData
    )

  def printCurrentDatabaseState(): String = {
    println("\nState of the database:")
    exec(messages.result.map(_.foreach(println))).result.toString
  }

  def testQuery() = {
    exec(messages.filter(_.sender === "HAL").result)
  }

  def getString: String = "Hello beautiful world!"
}


