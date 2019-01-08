package br.com.cielo.extrato.lancamento.extratolancamentoconta.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.lancamento.extratolancamentoconta.dao.LancamentoContaLegadoDAO;
import br.com.cielo.extrato.lancamento.extratolancamentoconta.model.LancamentoContaLegado;
import br.com.cielo.extrato.lancamento.extratolancamentoconta.model.dto.ControleLancamentoOutputDTO;

@RestController("/lancamentoContaLegado")
public class LancamentoContaLegadoController {

	@Autowired
	private LancamentoContaLegadoDAO lancamentoContaLegadoDAO;

	@GetMapping
	public ResponseEntity<List<ControleLancamentoOutputDTO>> findLancamentosLegados() {
		LancamentoContaLegado lancamentos = lancamentoContaLegadoDAO.findLancamentoContaLegado();
		List<ControleLancamentoOutputDTO> output = lancamentos.getListaControleLancamento().stream()
				.map(cl -> new ControleLancamentoOutputDTO(cl)).collect(Collectors.toList());
		return ResponseEntity.ok().body(output);

	}

}
