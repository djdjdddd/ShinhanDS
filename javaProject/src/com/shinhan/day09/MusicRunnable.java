package com.shinhan.day09;

public class MusicRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("ėė ėŽė");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
