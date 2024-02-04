package br.com.erudio.br.com.erudio;

import br.com.erudio.br.com.erudio.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {}