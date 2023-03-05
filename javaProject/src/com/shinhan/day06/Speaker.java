package com.shinhan.day06;

public class Speaker implements Volume{

	int volLevel;
	
	@Override
	public void volumeUp(int volLevel) {
		this.volLevel += volLevel;
		if(this.volLevel > 100) {
			this.volLevel = 100;
			
			// speak를 쓰지 말고, getClass().getSimpleName() 을 써서 클래스명 쓰는 걸 코드화하자.
			System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + this.volLevel);
		}
		
	}

	@Override
	public void volumeDown(int volLevel) {
		this.volLevel -= volLevel;
		if(this.volLevel < 0){
			this.volLevel = 0;
			System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + this.volLevel);
		}
	}
	
	

}
