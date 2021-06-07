package kr.ac.hansung.cse.hellospringhateos.repository;

import kr.ac.hansung.cse.hellospringhateos.entity.AlbumEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlbumRepository extends PagingAndSortingRepository<AlbumEntity, Long> {

}