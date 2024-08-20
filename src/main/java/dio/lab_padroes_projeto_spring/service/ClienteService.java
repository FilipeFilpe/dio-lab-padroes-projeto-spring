package dio.lab_padroes_projeto_spring.service;

import dio.lab_padroes_projeto_spring.model.Cliente;

/**
 * Interface que define o padrao <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter multiplas implementtações dessa
 * mesma interface.
 * 
 * @author FilipeFilpe
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
