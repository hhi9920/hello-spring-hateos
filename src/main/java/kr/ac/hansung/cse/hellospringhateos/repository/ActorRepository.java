package kr.ac.hansung.cse.hellospringhateos.repository;

import kr.ac.hansung.cse.hellospringhateos.entity.ActorEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepository extends PagingAndSortingRepository<ActorEntity, Long> {

}