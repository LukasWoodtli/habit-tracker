package org.woodtli.habit.repository.search;

import org.woodtli.habit.domain.Points;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Points} entity.
 */
public interface PointsSearchRepository extends ElasticsearchRepository<Points, Long> {
}
