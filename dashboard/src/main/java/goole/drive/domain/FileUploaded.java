package goole.drive.domain;

import goole.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
}
