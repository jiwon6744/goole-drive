package goole.drive.domain;

import goole.drive.domain.*;
import goole.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long filedId;
    private List<String> keywords;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
