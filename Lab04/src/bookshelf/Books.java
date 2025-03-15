package bookshelf;

public class Books { // Used inheritance here, class Books is a child class of Bookshelf
    private String novelType = "";
    private String novelTitle = "";
    private int novelLength = 0;
    private int novelIllustrationCount = 0;
//    Encapsulation here and throughout, private variables and public getters, constructors
    public String getNovelType() {
        return novelType;
    }

    public String getNovelTitle() {
        return novelTitle;
    }

    public int getNovelLength() {
        return novelLength;
    }

    public int getNovelIllustrationCount() {
        return novelIllustrationCount;
    }

    public Books(String type, String title, int length, int illustration) {
        if (type == null || type.isEmpty()) {
            novelType = "N/A";
        } else {
            novelType = type;
        }
        if (title == null || title.isEmpty()) {
            novelTitle = "N/A";
        } else {
            novelTitle = title;
        }
        if (length <= 0){
            novelLength = 1;
        } else {
            novelLength = length;
        }
        if (illustration <= 0){
            novelIllustrationCount = 1;
        } else {
            novelIllustrationCount = illustration;
        }
    }

    @Override
    public String toString() {
        return "Novel Type: " + novelType + "\n" + "Novel Title: " + novelTitle + "\n" + "Novel Length: " + novelLength + " page(s)" + "\n" + "Novel Illustration Count: " + novelIllustrationCount;
    }
}
