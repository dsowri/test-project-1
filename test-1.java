public class HTMLGenerator {
    public static void main(String[] args) {
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<html>\n");
        htmlContent.append("<body>\n");
        htmlContent.append("<h2>Howdy folks!!!! Welcome to Webhook from GitHub to Jenkins!!!</h2>\n");
        htmlContent.append("</body>\n");
        htmlContent.append("</html>\n");

        System.out.println(htmlContent.toString());
    }
}
