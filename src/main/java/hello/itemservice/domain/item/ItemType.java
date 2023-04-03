package hello.itemservice.domain.item;

public enum ItemType {
    // (괄호)안의 description은 Enum의 String field 이다.
    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) { // 생성자 Enum타입
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
