class Gamer {   //Default объект
    private String nickname;
    private boolean isActive;

    /**public Gamer(String nickname, boolean isActive){ // контруктор объекта
        this.isActive = isActive;
        this.nickname = nickname;
    }
    */
    public void setNickname(String nickname) {
        if (nickname.length() > 2){
            this.nickname = nickname;
        } else {
            nickname = "";
        }
    }

    public void setisActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean getisActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public Gamer(String nickname,boolean isActive){
        this.nickname = nickname;
        if (isActive) this.isActive = true;
        else this.isActive = false;
}
}

