package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);

    private Set<Dev> bootcampDevs = new HashSet<>();
    private Set<Content> bootcampContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getDevsOnBootcamp() {
        return bootcampDevs;
    }

    public void setDevsOnBootcamp(Set<Dev> devsOnBootcamp) {
        this.bootcampDevs = devsOnBootcamp;
    }

    public Set<Content> getContentOnBootcamp() {
        return bootcampContents;
    }

    public void setContentOnBootcamp(Set<Content> contentOnBootcamp) {
        this.bootcampContents = contentOnBootcamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(bootcampDevs, bootcamp.bootcampDevs) && Objects.equals(bootcampContents, bootcamp.bootcampContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finalDate, bootcampDevs, bootcampContents);
    }
}
