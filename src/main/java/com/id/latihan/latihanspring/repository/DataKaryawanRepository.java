package com.id.latihan.latihanspring.repository;

import java.util.Optional;

import com.id.latihan.latihanspring.model.DataKaryawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataKaryawanRepository extends JpaRepository<DataKaryawan,Long> {

    Optional<DataKaryawan> findByUsername(String nik);

    Boolean existsBynik(String nik);


}
