package com.damri.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kapasitas_bus")
public class KapasitasBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kapasitas")
    private Integer idKapasitas;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus", nullable = false)
    private Bus bus;

    @NotNull
    @Column(name = "total_kursi", nullable = false)
    private Integer totalKursi;

    @Column(name = "kursi_terisi", nullable = false, columnDefinition = "integer default 0")
    private Integer kursiTerisi = 0;
}