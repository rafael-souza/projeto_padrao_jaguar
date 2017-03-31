package br.net.proex.persistence.jpa;

import java.util.List;

import com.powerlogic.jcompany.commons.PlcBaseContextVO;
import com.powerlogic.jcompany.commons.annotation.PlcAggregationDAOIoC;
import com.powerlogic.jcompany.commons.config.stereotypes.SPlcDataAccessObject;
import com.powerlogic.jcompany.persistence.jpa.PlcQuery;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryFirstLine;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryLineAmount;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryOrderBy;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryParameter;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryService;

import br.net.proex.entity.seg.SegMenuEntity;
/**
 * Classe de Persistência gerada pelo assistente
 */

@PlcAggregationDAOIoC(SegMenuEntity.class)
@SPlcDataAccessObject
@PlcQueryService
public class SegMenuDAO extends AppJpaDAO  {

	@PlcQuery("querySel")
	public native List<SegMenuEntity> findList(
			PlcBaseContextVO context,
			@PlcQueryOrderBy String dynamicOrderByPlc,
			@PlcQueryFirstLine Integer primeiraLinhaPlc, 
			@PlcQueryLineAmount Integer numeroLinhasPlc,		   
			
			@PlcQueryParameter(name = "id", expression="id = :id") Long id,
			@PlcQueryParameter(name="nome", expression="nome like '%' || :nome || '%' ") String nome,
			@PlcQueryParameter(name="url", expression="url like '%' || :url || '%' ") String url
	);

	@PlcQuery("querySel")
	public native Long findCount(
			PlcBaseContextVO context,
			
			@PlcQueryParameter(name = "id", expression="id = :id") Long id,
			@PlcQueryParameter(name="nome", expression="nome like '%' || :nome || '%' ") String nome,
			@PlcQueryParameter(name="url", expression="url like '%' || :url || '%' ") String url
	);
	
}
