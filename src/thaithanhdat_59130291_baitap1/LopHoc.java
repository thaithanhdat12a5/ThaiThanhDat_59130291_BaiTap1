/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_59130291_baitap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LopHoc{
    QLDS qlds = new QLDS();
    ArrayList<GiaoVien> dsgv = new ArrayList<>();
    ArrayList<HocSinh> dshs = new ArrayList<>();
    public int themHocSinh(HocSinh hs)
    {
        dshs.add(hs);
        return dshs.size();
    }
    public int themGiaoVien(GiaoVien gv)
    {
        dsgv.add(gv);
        return dsgv.size();
    }
    public void inDSHS()
    {
        for(HocSinh i : dshs)
        {
            System.out.println("\nHoTen: " + i.hoTen + "\n"
                + "Tuoi: " + i.tuoi + "\n"
                + "DiaChi: " + i.diaChi + "\n"
                + "SĐT: " + i.soDT+"\n"+
                     "Lop: "+i.lop+"\n"+
                     "Nang Khieu: "+i.nangKhieu+
                     "\n--------------------------------");
        }
    }  
    public void inDSGV()
    {
        for(GiaoVien i : dsgv)
        {
            System.out.println("\nHoTen: " + i.hoTen + "\n"
                + "Tuoi: " + i.tuoi + "\n"
                + "DiaChi: " + i.diaChi + "\n"
                + "SĐT: " + i.soDT+"\n"+
                     "Mon day: "+i.monDay+"\n"+
                     "To Bo Mon: "+i.toBoMon+
                     "\n--------------------------------");
        }
    }

   
}
