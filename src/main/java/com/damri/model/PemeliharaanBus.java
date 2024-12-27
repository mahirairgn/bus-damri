package com.damri.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pemeliharaan_bus")
public class PemeliharaanBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pemeliharaan")
    private Integer idPemeliharaan;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus", nullable = false)
    private Bus bus;

    @NotNull
    @Column(name = "tanggal_pemeliharaan", nullable = false)
    private Date tanggalPemeliharaan;

    @Size(max = 50)
    @Column(name = "status_pemeliharaan", columnDefinition = "varchar(50) default 'Dijadwalkan'")
    private String statusPemeliharaan = "Dijadwalkan";

    @Column(name = "keterangan", columnDefinition = "TEXT")
    private String keterangan;
}
