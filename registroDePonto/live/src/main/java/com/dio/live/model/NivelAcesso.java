package com.dio.live.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class NivelAcesso {

	@Id
	private long id;
	
	private String descricao;
	
}
