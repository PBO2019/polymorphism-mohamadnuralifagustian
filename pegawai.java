public class pegawai {
    protected int tarif;

    public static void main (String [] args){
        Supervisor supervisor = new Supervisor();
        Staff staff = new Staff();
        Gaji gaji = new Gaji();

        gaji.menghitunggaji(supervisor.tarif);
        gaji.menghitunggaji(staff.tarif);
}
}
