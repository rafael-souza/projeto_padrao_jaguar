package br.net.proex.controller.exception;

import br.net.proex.commons.AppException;

public class AppAcessoNegadoException extends AppException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppAcessoNegadoException() {
		setMessage("Acesso Negado!");
	}
}
