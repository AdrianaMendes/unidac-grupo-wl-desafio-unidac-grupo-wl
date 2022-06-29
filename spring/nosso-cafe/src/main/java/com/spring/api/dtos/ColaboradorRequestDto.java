package com.spring.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorRequestDto {
	private String nome;
	private String cpf;
}
