package com.manager;
import org.kie.api.KieServices;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author Acring
 * Drools管理类， 生成发放KieSession, 控制Kie事件
 */
public class KieSessionManager {
	
	KieServices kieServices;
	KieContainer kieContainer;
	KieSession kieSession;
	
	public KieSessionManager(String kieSessionName){
		this.kieServices = KieServices.Factory.get();
		this.kieContainer = kieServices.getKieClasspathContainer();
		this.kieSession = kieContainer.newKieSession(kieSessionName);
		this.setKieEvent();
	}
	
	public KieSession getKieSession(){  // ����kieSession����
		return this.kieSession;
	}

	/**
	 * 设置插入，更新，删除的事件函数
	 */
	private void setKieEvent(){
		this.kieSession.addEventListener(new RuleRuntimeEventListener() {
			
			@Override
			public void objectUpdated(ObjectUpdatedEvent arg0) {
				System.out.println("update"+arg0.getObject().toString());
			}
			
			@Override
			public void objectInserted(ObjectInsertedEvent arg0) {
				System.out.println("inserted: "+arg0.getObject().toString());
			}
			
			@Override
			public void objectDeleted(ObjectDeletedEvent arg0) {
				System.out.println("deleted: "+arg0.getOldObject().toString());
			}
		});
	}
}
