package interfaces;

import java.util.ArrayList;
import java.util.Date;

import entities.HoaDon;

public interface IHoaDon {
	public ArrayList<HoaDon> getDanhSachHoaDon();
	public boolean createHoaDon(HoaDon x);
	public ArrayList<HoaDon> getDanhSachHoaDonTheoThoiGian(Date batDau, Date ketThuc);
	public HoaDon getHoaDonByID(HoaDon x);
	public int getSoHoaDonTrongNgay();
        public boolean updateHoaDon(HoaDon x);
        public boolean cancelHoaDon(HoaDon x);
}
