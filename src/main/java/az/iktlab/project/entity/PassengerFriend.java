package az.iktlab.project.entity;

public class PassengerFriend {
        private Long passengerId;
        private Long friendId;

    public PassengerFriend() {
    }

    public PassengerFriend(Long passengerId, Long friendId) {
        this.passengerId = passengerId;
        this.friendId = friendId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Long getFriendId() {
        return friendId;
    }

    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }

    @Override
    public String toString() {
        return "PassengerFriend{" +
                "passengerId=" + passengerId +
                ", friendId=" + friendId +
                '}';
    }
}
