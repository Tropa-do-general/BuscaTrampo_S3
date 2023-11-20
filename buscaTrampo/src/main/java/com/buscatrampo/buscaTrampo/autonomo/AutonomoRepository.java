package com.buscatrampo.buscaTrampo.autonomo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lincoln
 */
public interface AutonomoRepository extends JpaRepository<Autonomo,Long> {
}
