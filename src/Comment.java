import java.util.ArrayList;
import java.util.List;

public class Comment {

    private static int nextCommentId = 0;

    private static int id;
    private final String content;
    private static List<Comment> replies;

    public Comment(String content) {
        id = nextCommentId++;
        this.content = content;
        replies = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<Comment> getReplies() {
        return replies;
    }

    // Method to delete the comment
    public static void deleteComment(ProductDescription product, Comment comment) {
        product.getComments().remove(comment);
        System.out.println("Comment deleted: " + comment);
    }

    // Method to reply to the comment
    public static void replyComment(ProductDescription product, Comment alphaCm, String replyContent) {
        Comment reply = writeComment(replyContent, product);
        alphaCm.getReplies().add(reply);
//        System.out.println("Replied to comment " + ++id + ": " + reply);
    }

    // Method to write a new comment connected to a ProductDescription
    public static Comment writeComment(String content, ProductDescription productDescription) {
        Comment newComment = new Comment(content);
        productDescription.addComment(productDescription, newComment);
        System.out.println("New comment written: " + newComment);
        return newComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + getId() +
                ", content='" + getContent() + '\'' +
                ", replies=" + getReplies() +
                '}';
    }
}
