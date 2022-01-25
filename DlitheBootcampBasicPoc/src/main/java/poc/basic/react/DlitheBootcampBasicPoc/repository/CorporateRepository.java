package poc.basic.react.DlitheBootcampBasicPoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.basic.react.DlitheBootcampBasicPoc.entity.Corporate;
@Repository
public interface CorporateRepository extends JpaRepository<Corporate,String>
{

}
