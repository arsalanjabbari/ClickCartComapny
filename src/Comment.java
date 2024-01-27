import java.util.ArrayList;
import java.util.List;

public class Comment {

    private static int nextCommentId = 1;

    private final int id;
    private final String content;
    private final List<Comment> replies;

    public Comment(String content) {
        this.id = nextCommentId++;
        this.content = content;
        this.replies = new ArrayList<>();
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
    public void deleteComment() {
        // Add logic to delete the comment, e.g., remove it from a list
        System.out.println("Comment deleted: " + this);
    }

    // Method to reply to the comment
    public void replyComment(String replyContent) {
        Comment reply = new Comment(replyContent);
        replies.add(reply);
        System.out.println("Replied to comment " + id + ": " + reply);
    }

    // Method to write a new comment connected to a ProductDescription
    public static Comment writeComment(String content, ProductDescription productDescription) {
        Comment newComment = new Comment(content);
        productDescription.addComment(newComment);
        System.out.println("New comment written: " + newComment);
        return newComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", replies=" + replies +
                '}';
    }

}
