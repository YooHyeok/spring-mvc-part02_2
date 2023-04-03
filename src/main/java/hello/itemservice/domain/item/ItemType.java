package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description; // Enum의 String field

    ItemType(String description) { // 생성자 Enum타입
        this.description = description;
    }
}
