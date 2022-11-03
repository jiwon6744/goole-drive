package goole.drive.domain;

import goole.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Long filedId;
    private List<String> keywords;
}
