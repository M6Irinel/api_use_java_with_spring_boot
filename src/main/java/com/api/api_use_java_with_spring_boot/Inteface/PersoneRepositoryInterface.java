package com.api.api_use_java_with_spring_boot.Inteface;

import com.api.api_use_java_with_spring_boot.Table.Persone;
import org.springframework.data.repository.CrudRepository;

public interface PersoneRepositoryInterface
  extends CrudRepository<Persone, Long> {}
