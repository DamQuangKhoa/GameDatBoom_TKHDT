package view;
import model.*;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

public class VaoGame extends JPanel{
	public static HinhAnh hinhAnh;
	public static NhanVat nhanVat;
	public static BanDo banDo;
	public static Boom boom;
	public static Item item;
	public static Boss boss;
	public static QuaiVat quaiVat;
	public VaoGame() throws IOException {
		/*HAU DA THUC HIEN CAC BUOC NAY
		 * */
		hinhAnh=new HinhAnh();
		nhanVat=new NhanVat(2, 3, 3, 2, 1, 1, hinhAnh);
		banDo=new BanDo(hinhAnh,nhanVat);
		
		/*PHAN TIEP THEO LA XUAT HIEN ITEM
		 * */
		item=null;
		
		/*PHAN TIEP THEO LA TIEU DIET QUAI VAT
		 * */
		quaiVat=null;
		
		/*PHAN TIEP THEO LA TIEU DIET BOSS
		 * */
		boss=null;
	}
	@Override
	public void paint(Graphics g) {
		/*HAU DA VE PHAN NAY
		 * */
		banDo.veMap(g);
		nhanVat.veNhanVat(g);
	}
}
