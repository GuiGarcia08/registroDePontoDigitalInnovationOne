package com.dio.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoDeHoras {

	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	@Entity
	public class BancoDeHorasId implements Serializable{
		
		private Long idBancoDeHoras;
		
		private Long idMovimento;
		
		private Long idUsuario;
	}

	@EmbeddedId
	private BancoDeHorasId id;
	
	private LocalDateTime dataTrabalhada;
	
	private BigDecimal qtdHorasTrabalhadas;
	
	private BigDecimal saldoHoras;
}
