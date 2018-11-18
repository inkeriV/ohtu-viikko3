
package ohtu.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface IO {
    @Autowired
    void print(String toPrint);
    int readInt(String prompt);
    String readLine(String prompt);
}
