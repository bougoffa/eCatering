package AF.Formation.eCatering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AF.Formation.eCatering.model.TA_CUSTOMER;

public interface CustomerRepository extends JpaRepository<TA_CUSTOMER, Long> {

}
