package thigk2.VuongHuyHoang.BaiThiGiuaKi;

public class DiaDiem {
    private String ten;
    private String diaChi;
    private int hinh;

    public DiaDiem(String ten, String diaChi, int hinh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }

    public String getTen() { return ten; }
    public String getDiaChi() { return diaChi; }
    public int getHinh() { return hinh; }
}
