class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
class SocialMediaList {
    UserNode head;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search user by ID or Name
    UserNode searchUser(String key) {
        UserNode temp = head;
        while (temp != null) {
            if (String.valueOf(temp.userId).equals(key) ||
                temp.name.equalsIgnoreCase(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    void addFriend(int id1, int id2) {
        UserNode u1 = searchUser(String.valueOf(id1));
        UserNode u2 = searchUser(String.valueOf(id2));

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendNode(u1, id2);
        addFriendNode(u2, id1);

        System.out.println("Friend connection added");
    }

    private void addFriendNode(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove friend connection
    void removeFriend(int id1, int id2) {
        UserNode u1 = searchUser(String.valueOf(id1));
        UserNode u2 = searchUser(String.valueOf(id2));

        if (u1 == null || u2 == null) return;

        removeFriendNode(u1, id2);
        removeFriendNode(u2, id1);

        System.out.println("Friend connection removed");
    }

    private void removeFriendNode(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;

        if (temp != null && temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }

        while (temp != null && temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Display friends of a user
    void displayFriends(int userId) {
        UserNode user = searchUser(String.valueOf(userId));
        if (user == null) return;

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendHead;
        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    // Find mutual friends
    void findMutualFriends(int id1, int id2) {
        UserNode u1 = searchUser(String.valueOf(id1));
        UserNode u2 = searchUser(String.valueOf(id2));

        if (u1 == null || u2 == null) return;

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }

    // Count friends for each user
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}
public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Amit", 21);
        sm.addUser(2, "Neha", 22);
        sm.addUser(3, "Rahul", 23);
        sm.addUser(4, "Priya", 20);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);

        sm.displayFriends(2);
        sm.findMutualFriends(1, 2);
        sm.countFriends();

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}

