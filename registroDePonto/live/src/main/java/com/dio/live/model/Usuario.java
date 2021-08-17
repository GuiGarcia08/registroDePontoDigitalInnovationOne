package com.dio.live.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {

	@Id
	private long Id;
	
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	
	private String nome;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private NivelAcesso nivelAcesso;
	
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	
	private BigDecimal tolerancia;
	
	private LocalDateTime inicioJornada;
	
	private LocalDateTime finalJornada;
}
