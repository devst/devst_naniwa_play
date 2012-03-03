package models;

import play.db.jpa.Model;

public class WelcomeMessage extends Model {
	public String getMessage() {
		return "こんにちは、石井です！";
	}
}
