package br.com.safadao.todlist.api.controller;

import br.com.safadao.todlist.domain.model.ListTask;
import br.com.safadao.todlist.domain.service.ListTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/list-task")
public class ListTaskController {
    @Autowired
    private ListTaskService listTaskService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ListTask create(@RequestBody ListTask listTask) {
        return listTaskService.create(listTask);
    }
}
