package telran.controller;

import telran.dao.Forum;
import telran.data.Post;
import telran.data.User;
import telran.data.UserAdmin;

public class ForumApp {

    public static void main(String[] args) {

        User user1 = new User("Leon", 34);
        User user2 = new User("Max", 28);
        User user3 = new UserAdmin( "Andrew", 38, "star");

        Post post1 = new Post(user1, 123, "Hello", "What a beautiful day!");
        Post post2 = new Post(user2, 124, "Hello", "What a beautiful world!");
        Post post3 = new Post(user1, 125, "Once day", "Nice to see you!");
        Post post4 = new Post(user2, 126, "Hey", "It's time to eat!");
        Post post5 = new Post(new User("Olga", 29), 127, "Hey", "Never say to me tomorrow");
        Post post6 = new Post(user2, 128, "Bye", "See you tomorrow!");
        Post post7 = new Post(user1, 129, "Good Bye", "See you later!");
        Post post8 = new Post(user3, 130, "I'm admin", "My name is Andrew");

        Forum myForum = new Forum(50);
        myForum.addPost(post1);
        myForum.addPost(post2);
        myForum.addPost(post3);
        myForum.addPost(post4);
        myForum.addPost(post5);
        myForum.addPost(post6);
        myForum.addPost(post7);
        myForum.addPost(post8);

        post2.addLike();
        post2.addLike();

        myForum.displayPost();
        Post[] postsByLeon = myForum.getPostsByAuthor("Leon", 5);
        display(postsByLeon);

        myForum.updatePostByAdmin(123);

    }

    public static void display(Object[] objects){
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null){
                System.out.println(objects[i]);
            }
        }
    }

}
