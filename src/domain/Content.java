package domain;

public abstract class Content {

    private String title;
    private String description;
    protected static final double xpDefault = 10;

    public abstract double xpCalc();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
