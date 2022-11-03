package goole.drive.domain;

import goole.drive.domain.*;
import goole.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
}


