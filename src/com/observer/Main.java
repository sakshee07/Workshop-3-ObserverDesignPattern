package com.observer;

public class Main {
public static void main(String[] args) {
		Subject subject = new Subject();
		
		AboutPage about = new AboutPage();
		DashBoardPage dashBoard = new DashBoardPage();
		BillingPage billing = new BillingPage();
		LogInPage login = new LogInPage();
		RegistarionPage registration = new RegistarionPage();
		
		subject.register(registration);
		subject.register(login);
		subject.register(billing);
		subject.register(dashBoard);
		subject.register(about);
	
		subject.update("data");
		
		subject.unregister(registration);
	
	}

}
