package br.com.ffwds.screenmatch.repository;

import br.com.ffwds.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
