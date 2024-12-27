package com.damri.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bus")
    private Integer id;

    @NotNull
    @Size(max = 20)
    @Column(name = "plat_nomor", nullable = false)
    private String platNomor;

    @NotNull
    @Column(name = "id_jenis_bus", nullable = false)
    private Integer idJenisBus;

    @NotNull
    @Column(name = "kapasitas", nullable = false)
    private Integer kapasitas;

    @Size(max = 50)
    @Column(name = "status_operasional", nullable = false, columnDefinition = "varchar(50) default 'Beroperasi'")
    private String statusOperasional = "Beroperasi";

    @OneToMany(mappedBy = "bus", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JadwalBus> listJadwalBus;

    @OneToMany(mappedBy = "bus", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<KapasitasBus> listKapasitasBus;

    @OneToMany(mappedBy = "bus", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PemeliharaanBus> listPemeliharaanBus;

}