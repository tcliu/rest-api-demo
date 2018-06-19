package app.hateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

public class RestResource<T> extends ResourceSupport {

    private final T content;

    @JsonCreator
    public RestResource(@JsonProperty("content") T content, Link... links) {
        this.content = content;
        add(links);
    }

    public static <T> RestResource<T> of(T content, Link... links) {
        return new RestResource<>(content, links);
    }

    public T getContent() {
        return content;
    }
}
