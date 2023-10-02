import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StoreListToMapSorted {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        LinkedHashMap<String, Long> notesRecords = noteLst.stream()
                .sorted(Comparator.comparingLong(Notes::getTagId).reversed())
                .collect(Collectors.toMap(Notes::getTagName, Notes::getTagId,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Notes : " + notesRecords);

        // noteLst = null;
        Optional.ofNullable(noteLst)
                .orElseGet(Collections::emptyList)
                .stream().filter(Objects::nonNull)
                .map(Notes::getTagName)
                .forEach(System.out::println);
    }
}

class Notes {
    int serial;
    String tagName;
    long tagId;

    public String getTagName() {
        return tagName;
    }

    public long getTagId() {
        return tagId;
    }

    Notes(int serial, String tagName, int tagId) {
        this.serial = serial;
        this.tagName = tagName;
        this.tagId = tagId;
    }
}
