
 class manager extends staff{
    public manager(String nama, String alamat, double gajiPokok, double tunjangan, int level) {
        super(nama, alamat, gajiPokok, tunjangan, level);
    }
    public double bayarManager(){
        if (getLevel() == 1){
            return bayargaji()+3000;
        } else if (getLevel() == 2) {
            return bayargaji()+4000;
        }else if(getLevel() == 3){
            return bayargaji()+5000;
        }
        return 0;
    }
    public void cetakInfo(){
        System.out.println("Manager : " +getNama());
        System.out.println("Alamat :  " +getAlamat());
        System.out.println("mendapat gaji sebesar Rp" +bayarManager());
    }
}