package Model;

import lombok.Getter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public class Shortcut {

    private final String shortCut ;

    public Shortcut(Key ... keyN) {
        Stream<Key> stream = Stream.of(keyN);

        this.shortCut = stream.map(Key::getValue)
                .collect(Collectors.joining(" + "));
    }
}
