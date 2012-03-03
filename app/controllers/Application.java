package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	String message = (new WelcomeMessage()).getMessage();
    	String message2 = (new KamiyaMessage()).getMessage();
        render(message,message2);
    }
}