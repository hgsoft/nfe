package com.fincatto.documentofiscal.cte300.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.classes.CTCodigoSituacaoTributariaICMS;
import com.fincatto.documentofiscal.validadores.BigDecimalParser;

/**
 * @author Caio
 * @info Prestação sujeito à tributação normal do ICMS
 * */

@Root(name = "ICMS00")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoInformacoesRelativasImpostosICMS00 extends DFBase {

	@Element(name = "CST", required = true)
    private CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria;
	
	@Element(name = "vBC", required = true)
    private String baseCalculoICMS;
	
	@Element(name = "pICMS", required = true)
    private String aliquotaICMS;
	
	@Element(name = "vICMS", required = true)
    private String valorICMS;

	public CTeNotaInfoInformacoesRelativasImpostosICMS00() {
		this.codigoSituacaoTributaria = null;
		this.baseCalculoICMS = null;
		this.aliquotaICMS = null;
		this.valorICMS = null;
	}

	public CTCodigoSituacaoTributariaICMS getCodigoSituacaoTributaria() {
		return codigoSituacaoTributaria;
	}

	/**
	 * classificação Tributária do Serviço<br>
	 * 00 - tributação normal ICMS
	 * */
	public void setCodigoSituacaoTributaria(CTCodigoSituacaoTributariaICMS codigoSituacaoTributaria) {
		this.codigoSituacaoTributaria = codigoSituacaoTributaria;
	}

	public String getBaseCalculoICMS() {
		return baseCalculoICMS;
	}

	/**
	 * Valor da BC do ICMS
	 * */
	public void setBaseCalculoICMS(BigDecimal baseCalculoICMS) {
		this.baseCalculoICMS = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoICMS, "Valor da BC do ICMS");
	}

	public String getAliquotaICMS() {
		return aliquotaICMS;
	}

	/**
	 * Alíquota do ICMS
	 * */
	public void setAliquotaICMS(BigDecimal aliquotaICMS) {
		this.aliquotaICMS = BigDecimalParser.tamanho5Com2CasasDecimais(aliquotaICMS, "Alíquota do ICMS");
	}

	public String getValorICMS() {
		return valorICMS;
	}

	/**
	 * Valor do ICMS
	 * */
	public void setValorICMS(BigDecimal valorICMS) {
		this.valorICMS = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMS, "Valor do ICMS");
	}
}
