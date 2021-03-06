package co.com.sofka.stepverifier;

import reactor.core.publisher.Flux;

public final class UppercaseConverter {

    private final Flux<String> source;

    public UppercaseConverter(Flux<String> source) {
        this.source = source;
    }

    public Flux<String> getUpperCase() {
        return source
                .map(String::toUpperCase);
    }
}
