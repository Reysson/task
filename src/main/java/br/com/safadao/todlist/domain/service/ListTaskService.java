package br.com.safadao.todlist.domain.service;

import br.com.safadao.todlist.domain.model.ListTask;
import br.com.safadao.todlist.domain.repository.ListTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListTaskService {

    @Autowired
    private ListTaskRepository listTaskRepository;

    public ListTask create(ListTask listTask) {
        return listTaskRepository.save(listTask);
    }
}
