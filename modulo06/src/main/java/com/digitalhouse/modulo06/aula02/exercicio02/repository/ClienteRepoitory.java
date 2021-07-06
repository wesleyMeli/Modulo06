package com.digitalhouse.modulo06.aula02.exercicio02.repository;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio02.dao.ClienteDao;
import com.digitalhouse.modulo06.aula02.exercicio02.model.LojaCliente;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class ClienteRepoitory extends GenericRepositoryPersistence<ClienteDao, LojaCliente, Long>{

}
