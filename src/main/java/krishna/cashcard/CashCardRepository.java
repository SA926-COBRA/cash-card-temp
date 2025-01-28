package krishna.cashcard;

import org.springframework.data.repository.CrudRepository;

interface CashCardRepository extends
        CrudRepository<CashCard, Long> {
}
