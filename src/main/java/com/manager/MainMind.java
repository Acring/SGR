package com.manager;


import org.kie.api.runtime.KieSession;
import com.predicate.*;


public class MainMind {
	public static void main(String []args){

		KieSessionManager kieSessionManager = new KieSessionManager("ksession-rules");
		KieSession kieSession = kieSessionManager.getKieSession();


		kieSession.fireAllRules();
	}
	
	
}
