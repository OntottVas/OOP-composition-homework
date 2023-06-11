public class TestAuthor {
    public static void main(String[] args) {
        Author kFollet = new Author("Ken Follet", "ken@follet.org", 'm');

        System.out.println(kFollet);
        kFollet.setEmail("follet@ken.org");
        System.out.println("Name: " + kFollet.getName());
        System.out.println("Email: " + kFollet.getEmail());
        System.out.println("Gender: " + kFollet.getGender());
    }
}
