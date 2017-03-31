/* ************************* META-DADOS GLOBAIS DA APLICAÇÃO ******************************
  ********************** Configurações padrão para toda a aplicação *************************
  ************ Obs: configurações corporativas devem estar no nível anterior,****************
  ************              preferencialmente na camada Bridge               ****************
  *******************************************************************************************/


@PlcConfigApplication(
	definition=@PlcConfigApplicationDefinition(name="proex_base",acronym="proex_base",version=1,release=0),
	classesDiscreteDomain={
			br.net.proex.enumeration.SegAcaoRealizada.class,
			br.net.proex.enumeration.SegTipoAcesso.class,
			br.net.proex.enumeration.SegVisibilidadeCampo.class,
			br.net.proex.enumeration.SegAcao.class					
	},
	classesLookup={}
)


package com.powerlogic.jcompany.config.app;

import com.powerlogic.jcompany.config.application.PlcConfigApplication;
import com.powerlogic.jcompany.config.application.PlcConfigApplicationDefinition;
