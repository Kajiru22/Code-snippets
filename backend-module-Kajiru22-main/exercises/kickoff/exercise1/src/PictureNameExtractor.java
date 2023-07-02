public class PictureNameExtractor {

    //test

    public String extract(String filename) {

        return filename.replaceAll("\\d{8}|Pic|.jpg", "")
                .replaceAll("-", " ")
                .toLowerCase()
                .trim();
    }
//more testing
}
