package fpt.java5.assignment.repository.record;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class Find10RepositoryImp implements Find10Repository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> find10Staff(int limit) {
		return entityManager.createQuery("SELECT "
				+ "r.staff.id,"
				+ "r.staff.department.name,"
				+ "r.staff.name,"
				+ "SUM(case when r.type=1 then 1 else 0 end),"
				+ "SUM(case when r.type=0 then 1 else 0 end),"
				+ "(SUM(case when r.type=1 then 1 else 0 end) - SUM(case when r.type=0 then 1 else 0 end)) AS GeneralArch,"
				+ "r.staff.photo"
				+ " FROM Record r "
				+ " GROUP BY r.staff.id"
				+ " ORDER BY(SUM(case when r.type=1 then 1 else 0 end) - SUM(case when r.type=0 then 1 else 0 end)) DESC ")
				.setMaxResults(limit).getResultList();
		
	}

}
