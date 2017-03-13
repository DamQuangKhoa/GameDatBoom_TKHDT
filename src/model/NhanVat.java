package model;

import java.awt.Graphics;
import java.util.ArrayList;

public class NhanVat {
	private int huongDi;
	private int toaDoX;
	private int toaDoY;
	private int capDoBoom;
	private int soMang;
	private int manChoi;
	private HinhAnh hinhAnh;
	public static final int LEN=1,XUONG=2,TRAI=3,PHAI=4;
	private ArrayList<Boom> danhSachBoom;
	
	public NhanVat(int huongDi, int toaDoX, int toaDoY, int capDoBoom, int soMang, int manChoi,HinhAnh hinhAnh) {
		this.huongDi = huongDi;
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
		this.capDoBoom = capDoBoom;
		this.soMang = soMang;
		this.manChoi = manChoi;
		this.hinhAnh=hinhAnh;
		danhSachBoom=new ArrayList<>();
	}
	public int getHuongDi() {
		return huongDi;
	}
	public void setHuongDi(int huongDi) {
		this.huongDi = huongDi;
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
	public int getCapDoBoom() {
		return capDoBoom;
	}
	public void setCapDoBoom(int capDoBoom) {
		this.capDoBoom = capDoBoom;
	}
	public int getSoMang() {
		return soMang;
	}
	public void setSoMang(int soMang) {
		this.soMang = soMang;
	}
	public int getManChoi() {
		return manChoi;
	}
	public void setManChoi(int manChoi) {
		this.manChoi = manChoi;
	}
	
	public ArrayList<Boom> getDanhSachBoom() {
		return danhSachBoom;
	}
	public void setDanhSachBoom(ArrayList<Boom> danhSachBoom) {
		this.danhSachBoom = danhSachBoom;
	}
	public void veNhanVat(Graphics g){
			switch (huongDi) {
			case LEN:
				g.drawImage(hinhAnh.nhanVatXoayLen, toaDoX*20+10, toaDoY*20,20,30,null);
				break;
			case XUONG:
				g.drawImage(hinhAnh.nhanVatXoayXuong, toaDoX*20+10, toaDoY*20,20,30,null);
				break;
			case TRAI:
				g.drawImage(hinhAnh.nhanVatXoayTrai, toaDoX*20+10, toaDoY*20,20,30,null);
				break;
			case PHAI:
				g.drawImage(hinhAnh.nhanVatXoayPhai, toaDoX*20+10, toaDoY*20,20,30,null);
				break;
			default:
				break;
			}
//			if()
	}
}
