package controllers
import play.api.Play.current
import play.api.mvc._
import play.api.db._
import views._

object Application extends Controller {

  def index = Action {
    var outString = ""
    val conn = DB.getConnection()
    val stmt = conn.createStatement
    val rs = stmt.executeQuery("SELECT * FROM articles ")
    while (rs.next()) {
       outString += rs.getString("title")+ "\n" + rs.getString("content")
    }
    conn.close()
    Ok(html.index(outString))
  }

}