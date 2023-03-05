package com.shinhan.day06;

public class Radio implements Volume{
	
	int volLevel;
	
	@Override
	public void volumeUp(int volLevel) {
		this.volLevel += volLevel;
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + this.volLevel);
		}
		
	

	@Override
	public void volumeDown(int volLevel) {
		this.volLevel -= volLevel;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + this.volLevel);
		}

}
