package com.tcliffe.dc7.models.data;


import com.tcliffe.dc7.models.Nation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NationDao extends CrudRepository<Nation, Integer> {
}
