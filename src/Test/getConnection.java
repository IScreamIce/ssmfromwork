import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

public class getConnection {

    @Autowired
    private Connection connection;
    Logger logger = Logger.getLogger(getConnection.class);

    @Test
    public void getConnection() {
        logger.info(connection);
    }

}
