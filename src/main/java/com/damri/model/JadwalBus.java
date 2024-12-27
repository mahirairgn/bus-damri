package com.damri.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jadwal_bus")
public class JadwalBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jadwal")
    private Integer idJadwal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus", nullable = false)
    private Bus bus;

    @NotNull
    @Column(name = "id_rute", nullable = false)
    private Integer idRute;

    @NotNull
    @Column(name = "id_pengemudi", nullable = false)
    private Integer idPengemudi;

    @NotNull
    @Column(name = "tanggal", nullable = false)
    private Date tanggal;

    @NotNull
    @Column(name = "jam_berangkat", nullable = false)
    private Time jamBerangkat;

    @NotNull
    @Column(name = "jam_tiba", nullable = false)
    private Time jamTiba;

    @Size(max = 50)
    @Column(name = "status", columnDefinition = "varchar(50) default 'Dijadwalkan'")
    private String status = "Dijadwalkan";
}