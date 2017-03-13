package model;

import java.awt.Graphics;

public class Boom {
	private int toaDoX;
	private int toaDoY;
	private int levelBoom;
	private boolean phatNo;
	public Boom(int toaDoX, int toaDoY, int levelBoom, boolean phatNo) {
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
		this.levelBoom = levelBoom;
		this.phatNo = phatNo;
	}
	public int getToaDoX() {
		return toaDoX;
	}
	public void setToaDoX(int toaDoX) {
		this.toaDoX = toaDoX;
	}
	public int getToaDoY() {
		return toaDoY;
	}
	public void setToaDoY(int toaDoY) {
		this.toaDoY = toaDoY;
	}
	public int getLevelBoom() {
		return levelBoom;
	}
	public void setLevelBoom(int levelBoom) {
		this.levelBoom = levelBoom;
	}
	public boolean isPhatNo() {
		return phatNo;
	}
	public void setPhatNo(boolean phatNo) {
		this.phatNo = phatNo;
	}
	public void veBoom(Graphics g){
		// TO DO
	}
}
