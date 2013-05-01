package br.com.caelum.tarefas.testes;

import java.util.List;

import br.com.caelum.tarefas.jdbc.bean.Tarefa;
import br.com.caelum.tarefas.jdbc.dao.TarefaDAO;

public class TestaLista {
	public static void main(String[] args) {
		TarefaDAO dao = new TarefaDAO();
		List<Tarefa> tarefas = dao.lista();
		for (Tarefa tarefa : tarefas) {
			System.out.println(tarefa.getId());
		}
	}
}
