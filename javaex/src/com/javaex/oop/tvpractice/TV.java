package com.javaex.oop.tvpractice;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if (channel >=1 && channel <= 255) {
			this.channel = channel;
		} else {
			System.out.println("1 ~ 255 채널을 입력하세요");
		}
	}
	
	public void channel(boolean up) {
		int nextChannel = 0;
		
		if (up) {
			nextChannel = this.channel + 1;
		}
		
		if (nextChannel <= 255) {
			this.channel = nextChannel;
		} 
	}
	
	public void volume(int volume) {
		if (volume >= 1 && volume <= 255) {
			this.volume = volume;
		} else {
			System.out.println("볼륨을 1 ~ 100으로 설정해주세요");
		}
	}
	
	public void volume(boolean up) {
		int nextVolume = 0;
		
		if(up) {
			nextVolume = this.volume + 1;
		}
		
		if (nextVolume <= 100) {
			this.volume = nextVolume;
		}
	}
	
	public void status() {
		String msg = String.format("현재 TV는 %s 상태이며, 현재 채널은 %d 번, 현재 볼륨은 %d 입니다",
				this.power ? "on": "off", this.channel, this.volume);
		
		System.out.println(msg);
	}
	
}
