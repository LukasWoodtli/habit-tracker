package org.woodtli.habit.repository.search;

import org.woodtli.habit.domain.Weight;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Weight} entity.
 */
public interface WeightSearchRepository extends ElasticsearchRepository<Weight, Long> {
}
