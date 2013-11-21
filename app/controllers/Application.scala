package controllers
import play.api.Play.current
import play.api.mvc._
import play.api.db._

object Application extends Controller {

	def index = Action {
		var outString = "Number is "
			val conn = DB.getConnection()
			val stmt = conn.createStatement
			val rs = stmt.executeQuery("SELECT 9 as testkey ")
			while (rs.next()) {
				outString += rs.getString("testkey")
			}
		conn.close()
		Ok(outString)
	}

}
