package model;

public class Matakuliah {
    int idMatakuliah;
    String namaMataKuliah;

    public int getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(int idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getSingkatanMataKuliah() {
        return singkatanMataKuliah;
    }

    public void setSingkatanMataKuliah(String singkatanMataKuliah) {
        this.singkatanMataKuliah = singkatanMataKuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    String singkatanMataKuliah;
    String namaDosen;
    String kontakDosen;

    public Matakuliah(int idMatakuliah, String namaMataKuliah, String singkatanMataKuliah, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMatakuliah = idMatakuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.singkatanMataKuliah = singkatanMataKuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    boolean aktif;
}
