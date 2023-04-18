package is.hi.bst4.vinnsla;


public enum View {
    LOGIN("vidskipti-view.fxml"),
    GREIDSLA("greidsla-view.fxml"),
    PONTUN("pontun-view.fxml");

    private final String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

