package endler.exercise2.exceptions;

import javax.persistence.PersistenceException;

public class ExpiredCard extends PersistenceException {

    public ExpiredCard(String errorMessage){
        super(errorMessage);
    }

}
