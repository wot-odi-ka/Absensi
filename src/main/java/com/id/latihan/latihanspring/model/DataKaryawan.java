package com.id.latihan.latihanspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

@Table(name = "data_karyawan")  
public class DataKaryawan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long karyawan_id;

    @Column(length = 20)
    private String nik;

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Column(length = 100)
    private String name_karyawan;

    @Column(length = 10)
    private String gender;

    @Column(length = 50)
    private String position_karyawan;

    @Column(length = 50)
    private String status;

    @Column(length = 500)
    private String alamat;

    @Column(length = 13)
    private String no_hp;

    @Column(length = 100)
    private String imageProfil;

    @Column()
    @CreationTimestamp 
    private Timestamp create_on;

    public Timestamp getCreate_on() {
        return this.create_on;
    }

    public void setCreate_on(Timestamp create_on) {
        this.create_on = create_on;
    }

    @Column()
    private Date UpdateOn;

    public Date getUpdateOn() {
        return this.UpdateOn;
    }

    public void setUpdateOn(Date UpdateOn) {
        this.UpdateOn = UpdateOn;
    }



    public String getImageProfil() {
        return imageProfil;
    }

    public void setImageProfil(String imageProfil) {
        this.imageProfil = imageProfil;
    }

    public Long getKaryawan_id() {
        return karyawan_id;
    }

    public void setKaryawan_id(Long karyawan_id) {
        this.karyawan_id = karyawan_id;
    }

    public String getName_karyawan() {
        return name_karyawan;
    }

    public void setName_karyawan(String name_karyawan) {
        this.name_karyawan = name_karyawan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition_karyawan() {
        return position_karyawan;
    }

    public void setPosition_karyawan(String position_karyawan) {
        this.position_karyawan = position_karyawan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
}
