package sa.com.saib.notifications.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sa.com.saib.notifications.admin.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
