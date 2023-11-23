package br.com.safadao.todlist.domain.repository;

import br.com.safadao.todlist.domain.model.ListTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListTaskRepository extends JpaRepository<ListTask, Integer> {
}
