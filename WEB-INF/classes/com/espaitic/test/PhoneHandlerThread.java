package com.espaitic.test;

import com.alcatel_lucent.test.SimpleTest;

public class PhoneHandlerThread extends Thread {

	public void run() {
		
		super.run();
	
		for(;;){
			try {
//Última versión
				//Pausar 25 minutos 
				Thread.sleep(25 * 60 * 1000);
				try{
					SimpleTest.pingPhoneHandler();
				}catch(Exception e){
					System.out.println("Error en pingPhoneHandler");
					e.printStackTrace();
				}
// Primera versión				
//				if(i>0){
//					try{
//						System.out.println("Parando PhoneHandler ("+i+")");
//						SimpleTest.endPhoneHandler();
//					}catch(Exception e){
//						System.out.println("Error en endPhoneHandler");
//						e.printStackTrace();
//					}
//				}else{
//					i++;
//				}
//				System.out.println("Publicación de PhoneHandler en centralita... ("+i+")");
//				SimpleTest.startPhoneHandler();	        
//				//Pausar 60 minutos 
//				Thread.sleep(60 * 60 * 1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
			}
		}
	}
	
	
	
//	public static void main(String[] args) {
//		PhoneHandlerThread thread = new PhoneHandlerThread();
//		thread.start();
//	}

}
