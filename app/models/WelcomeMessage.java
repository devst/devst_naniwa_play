package models;

import play.db.jpa.Model;

public class WelcomeMessage extends Model {
	public String getMessage() {
		return "Hello! Play Framework!!3/3は勉強会ですよ_1";
	}
}
