package com.example.datadiri.models;

import android.os.Parcel;
import android.os.Parcelable;

public class DataDiri implements Parcelable {

    private String nama;
    private String fakultas;
    private String programStudi;
    private String password;
    private String confirmPassword;
    private String alasan;
    private String prestasi;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String wargaNegara;
    private String agama;
    private String alamat;
    private String rt;
    private String rw;
    private String kodePos;
    private String provinsi;
    private String kota;
    private String noHp;
    private String email;

    public DataDiri() {
    }

    public DataDiri(String nama, String fakultas, String programStudi, String password, String confirmPassword, String alasan, String prestasi, String tempatLahir, String tanggalLahir, String jenisKelamin, String wargaNegara, String agama, String alamat, String rt, String rw, String kodePos, String provinsi, String kota, String noHp, String email) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.programStudi = programStudi;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.alasan = alasan;
        this.prestasi = prestasi;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.wargaNegara = wargaNegara;
        this.agama = agama;
        this.alamat = alamat;
        this.rt = rt;
        this.rw = rw;
        this.kodePos = kodePos;
        this.provinsi = provinsi;
        this.kota = kota;
        this.noHp = noHp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getPrestasi() {
        return prestasi;
    }

    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getWargaNegara() {
        return wargaNegara;
    }

    public void setWargaNegara(String wargaNegara) {
        this.wargaNegara = wargaNegara;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.fakultas);
        dest.writeString(this.programStudi);
        dest.writeString(this.password);
        dest.writeString(this.confirmPassword);
        dest.writeString(this.alasan);
        dest.writeString(this.prestasi);
        dest.writeString(this.tempatLahir);
        dest.writeString(this.tanggalLahir);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.wargaNegara);
        dest.writeString(this.agama);
        dest.writeString(this.alamat);
        dest.writeString(this.rt);
        dest.writeString(this.rw);
        dest.writeString(this.kodePos);
        dest.writeString(this.provinsi);
        dest.writeString(this.kota);
        dest.writeString(this.noHp);
        dest.writeString(this.email);
    }

    protected DataDiri(Parcel in) {
        this.nama = in.readString();
        this.fakultas = in.readString();
        this.programStudi = in.readString();
        this.password = in.readString();
        this.confirmPassword = in.readString();
        this.alasan = in.readString();
        this.prestasi = in.readString();
        this.tempatLahir = in.readString();
        this.tanggalLahir = in.readString();
        this.jenisKelamin = in.readString();
        this.wargaNegara = in.readString();
        this.agama = in.readString();
        this.alamat = in.readString();
        this.rt = in.readString();
        this.rw = in.readString();
        this.kodePos = in.readString();
        this.provinsi = in.readString();
        this.kota = in.readString();
        this.noHp = in.readString();
        this.email = in.readString();
    }

    public static final Parcelable.Creator<DataDiri> CREATOR = new Parcelable.Creator<DataDiri>() {
        @Override
        public DataDiri createFromParcel(Parcel source) {
            return new DataDiri(source);
        }

        @Override
        public DataDiri[] newArray(int size) {
            return new DataDiri[size];
        }
    };
}


