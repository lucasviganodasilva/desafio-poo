package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentLists = new LinkedHashSet<>();
    private Set<Content> contentConcluded = new LinkedHashSet<>();

    public void bootcampSubscribe(Bootcamp bootcamp) {
        this.contentLists.addAll(bootcamp.getBootcampContents());
        bootcamp.getBootcampDevs().add(this);
    }

    public void advanced() {
        Optional<Content> content = this.contentLists.stream().findFirst();
        if (content.isPresent()) {
            this.contentConcluded.add(content.get());
            this.contentLists.remove(content.get());
        }
        else {
            System.out.println("Content not found");
        }
    }

    public double xpTotal() {
        return this.contentConcluded.stream().mapToDouble(Content::xpCalc).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentLists() {
        return contentLists;
    }

    public void setContentLists(Set<Content> contentLists) {
        this.contentLists = contentLists;
    }

    public Set<Content> getContentConcluded() {
        return contentConcluded;
    }

    public void setContentConcluded(Set<Content> contentConcluded) {
        this.contentConcluded = contentConcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentLists, dev.contentLists) && Objects.equals(contentConcluded, dev.contentConcluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentLists, contentConcluded);
    }
}
