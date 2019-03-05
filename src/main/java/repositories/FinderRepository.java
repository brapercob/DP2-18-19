package repositories;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import domain.Finder;
import domain.Task;


public interface FinderRepository extends JpaRepository<Finder, Integer>{

    //@Query("select m.finder from Member m where m.id=?1")
    //public Finder getFinderByLoggedWorker(int workerId);

    //@Query("select t from Task t where (t.category.name=?1 or t.category.nameEsp=?1) and t.endDate>CURRENT_DATE")
    //public Collection<Task> filterTasksByCategory(String category);

    //@Query("select t from Task t where t.warranty.title=?1 and t.endDate>CURRENT_DATE")
    //public Collection<Task> filterTasksByWarranty(String warranty);

    //@Query("select t from Task t where t.maxPrice<=?1 and t.endDate>CURRENT_DATE")
    //public Collection<Task> filterTasksByMaxPrice(Double maxPrice);

    //@Query("select t from Task t where t.maxPrice>=?1 and t.endDate>CURRENT_DATE")
    public Collection<Task> filterTasksByMinPrice(Double minPrice);

    @Query("select p from Procession p")
    public Collection<Procession> getAllProcession();

    @Query("select p from Procession p where p.description like %?1%) //and p.endDate>CURRENT_DATE")
    public Collection<Procession> filterProcessionByKeyWordInDescription(String keyWord);

    @Query("select p from Procession p where p.area.name=?1 ")
    public Collection<Procession> filterProcessionByArea(String area);

    @Query("select p from Procession p where p.minDate>=?1 and p.maxDate>CURRENT_DATE ")
    public Collection<Procession> filterProcessionByMinDate(Date minDate);

    @Query("select p from Task p where p.maxDate<=?1 and p.maxDate>CURRENT_DATE")
    public Collection<Procession> filterProcessionByMaxDate(Date maxDate);



}
