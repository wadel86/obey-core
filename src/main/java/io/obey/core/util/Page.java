package io.obey.core.util;

public class Page {
    private final int page;
    private final int size;

    public Page(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int elementToSkip(){
        throw new RuntimeException("Not implemented yet!");
    }

    public static Page create(String page, String size){
        throw new RuntimeException("Not implemented yet!");
    }

    public static Page createPreviewPage(int size){
        throw new RuntimeException("Not implemented yet!");
    }
}
