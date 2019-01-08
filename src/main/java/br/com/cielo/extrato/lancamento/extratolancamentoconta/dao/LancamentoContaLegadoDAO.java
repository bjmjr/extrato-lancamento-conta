package br.com.cielo.extrato.lancamento.extratolancamentoconta.dao;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.extrato.lancamento.extratolancamentoconta.model.LancamentoContaLegado;


@Service
public class LancamentoContaLegadoDAO {

	public LancamentoContaLegado findLancamentoContaLegado() {

		try {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<LancamentoContaLegado> typeReference = new TypeReference<LancamentoContaLegado>() {
			};
			InputStream is = TypeReference.class.getResourceAsStream("/json/lancamento-conta-legado.json");

			return mapper.readValue(is, typeReference);

		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
