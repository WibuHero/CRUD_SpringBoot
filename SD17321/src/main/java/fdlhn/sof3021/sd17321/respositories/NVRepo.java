package fdlhn.sof3021.sd17321.respositories;


import java.util.ArrayList;

public class NVRepo {
    private ArrayList<NhanVien> ds;

    public NVRepo() {
        this.ds = new ArrayList<>();

        this.ds.add(new NhanVien("NV001", "Cộng", "Quang", "Nguyễn",  "Nam", "06/05/2003","Bắc Ninh", "0123456789", "nqc12345", "SamSung", "Quản lý", "OK"));
        this.ds.add(new NhanVien("NV002", "Cộng", "Quang", "Nguyễn", "Nữ", "06/05/2003", "Bắc Ninh", "0123456789", "nqc12345", "SamSung", "Nhân viên", "Not OK"));
    }

    public ArrayList<NhanVien> getAll(){
        return this.ds;
    }
    public void update(NhanVien nv){
        for(int i = 0; i <ds.size(); i++){
            if(nv.getMa().equals(ds.get(i).getMa())){
                ds.set(i, nv);
            }
        }
    }

    public void insert(NhanVien nv){
        ds.add(nv);
    }

    public void delete(NhanVien nv){
        for(int i = 0; i <ds.size(); i++){
            if(nv.getMa().equals(ds.get(i).getMa())){
                ds.remove(i);
            }
        }
    }

    public NhanVien findByMa(String ma){

        for(int i = 0; i <ds.size(); i++){
            if(ds.get(i).getMa().equalsIgnoreCase(ma)){

                return ds.get(i);
            }
        }
        return null;
    }
}
