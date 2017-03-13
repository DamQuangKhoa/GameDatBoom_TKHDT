package controller;

public interface ControlTheGame {
	/*TAT CA CAC BIEN TINH TRONG GAME DUOC MAC DINH LA FALSE;
	 * */
	public static boolean batDauLoadGame=false;
	public static boolean daBatDauGameChua=false;
	public static boolean dangChoiGame=false;
	public static boolean daTamNgung=false;
	public static boolean chienThangChua=false;
	public static boolean thuaCuocChua=false;
	public static boolean quaManChua=false;
	public static boolean xuatHienBossChua=false;
	public static boolean bossChetChua=false;
	public void diChuyenNhanVatVaDatBoom();
	public void xuLyBoomNo();
	public void xuLyAnItem();
	public void xuLyMatMau();
	public void xuLyTieuDietQuaiVat();
	public void xuLyNewGame();
	public void xuLyQuaManVaThuaCuoc();
	public void xuLyTieuDietBossVaChienThang();
	public void xuLyMenu();
}
