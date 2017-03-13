package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.ModelTong;
import model.NhanVat;
import view.GiaoDienTong;
import view.VaoGame;

public class ControllerTong implements ControlTheGame{
	private GiaoDienTong giaoDienTong;
	private ModelTong modelTong;
	
	public ControllerTong(GiaoDienTong giaoDienTong, ModelTong modelTong) {
		this.giaoDienTong = giaoDienTong;
		this.modelTong = modelTong;
	}

	public GiaoDienTong getGiaoDienTong() {
		return giaoDienTong;
	}

	public ModelTong getModelTong() {
		return modelTong;
	}
	@Override
	public void diChuyenNhanVatVaDatBoom() {
		giaoDienTong.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				NhanVat nhanVat = modelTong.getNhanVat();
				int toaDoX = nhanVat.getToaDoX();
				int toaDoY = nhanVat.getToaDoY();
				int huongDi = nhanVat.getHuongDi();
				int phiaTren= modelTong.getBanDo().mapGame[toaDoX][toaDoY];
				int phiaDuoi= modelTong.getBanDo().mapGame[toaDoX][toaDoY];
				int benTrai= modelTong.getBanDo().mapGame[toaDoX][toaDoY];
				int benPhai= modelTong.getBanDo().mapGame[toaDoX][toaDoY];
				if (toaDoY - 1 >= 0) {
					phiaTren = modelTong.getBanDo().mapGame[toaDoX][toaDoY - 1];
				}
				if (toaDoY + 1 <= 19) {
					phiaDuoi = modelTong.getBanDo().mapGame[toaDoX][toaDoY + 1];
				}
				if (toaDoX - 1 >= 0) {
					benTrai = modelTong.getBanDo().mapGame[toaDoX - 1][toaDoY];
				}
				if (toaDoX + 1 <= 19) {
					benPhai = modelTong.getBanDo().mapGame[toaDoX + 1][toaDoY];
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (toaDoY > 0) {
						if (huongDi != 1) {
							nhanVat.setHuongDi(1);
						} else if (phiaTren == 0) {
							nhanVat.setToaDoY(toaDoY - 1);
						}
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (toaDoY < 19) {
						if (huongDi != 2) {
							nhanVat.setHuongDi(2);
						}else if (phiaDuoi== 0) {
							nhanVat.setToaDoY(toaDoY + 1);
						}
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (toaDoX > 0) {
						if (huongDi != 3) {
							nhanVat.setHuongDi(3);
						} else if (benTrai== 0) {
							nhanVat.setToaDoX(toaDoX - 1);
						}
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (toaDoX < 19) {
						if (huongDi != 4) {
							nhanVat.setHuongDi(4);
						} else if (benPhai== 0) {
							nhanVat.setToaDoX(toaDoX + 1);
						}
					}
				}
				/*DAT BOOM VIET O DAY NHA
				 * */
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					// TO DO DAT BOOM NHA MOI NGUOI
				}
				giaoDienTong.repaint();
			}
		});
	}

	@Override
	public void xuLyBoomNo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyAnItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyMatMau() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyTieuDietQuaiVat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyNewGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyQuaManVaThuaCuoc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyTieuDietBossVaChienThang() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuLyMenu() {
		// TODO Auto-generated method stub
		
	}
}
