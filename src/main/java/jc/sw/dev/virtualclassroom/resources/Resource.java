package jc.sw.dev.virtualclassroom.resources;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Resource {

    private final String id;
    private final String name;
    private final Integer size;
    private final String type;

}
