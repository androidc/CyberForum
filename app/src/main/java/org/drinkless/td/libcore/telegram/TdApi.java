package org.drinkless.td.libcore.telegram;

import java.util.Arrays;

public class TdApi {
    private static final char[] HEX_CHARACTERS = "0123456789ABCDEF".toCharArray();

    public abstract static class TLObject {

        public abstract int getConstructor();

        public String toString() {
            StringBuilder s = new StringBuilder();
            toStringBuilder(0, s);
            return s.toString();
        }

        protected abstract void toStringBuilder(int shift, StringBuilder s);
    }

    public abstract static class TLFunction extends TLObject {
    }

    public static class Audio extends TLObject {
        public int duration;
        public String mimeType;
        public File audio;

        public Audio() {
        }

        public Audio(int duration, String mimeType, File audio) {
            this.duration = duration;
            this.mimeType = mimeType;
            this.audio = audio;
        }

        public static final int CONSTRUCTOR = 1958659931;

        @Override
        public int getConstructor() {
            return 1958659931;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Audio").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("duration").append(" = ").append(duration).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("mimeType").append(" = ").append(mimeType).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("audio").append(" = "); audio.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class AuthState extends TLObject {
    }

    public static class AuthStateWaitPhoneNumber extends AuthState {

        public AuthStateWaitPhoneNumber() {
        }

        public static final int CONSTRUCTOR = 167878457;

        @Override
        public int getConstructor() {
            return 167878457;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateWaitPhoneNumber").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AuthStateWaitCode extends AuthState {

        public AuthStateWaitCode() {
        }

        public static final int CONSTRUCTOR = -1154394952;

        @Override
        public int getConstructor() {
            return -1154394952;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateWaitCode").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AuthStateWaitName extends AuthState {

        public AuthStateWaitName() {
        }

        public static final int CONSTRUCTOR = -245435948;

        @Override
        public int getConstructor() {
            return -245435948;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateWaitName").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AuthStateWaitPassword extends AuthState {
        public String hint;
        public boolean hasRecovery;
        public String emailUnconfirmedPattern;

        public AuthStateWaitPassword() {
        }

        public AuthStateWaitPassword(String hint, boolean hasRecovery, String emailUnconfirmedPattern) {
            this.hint = hint;
            this.hasRecovery = hasRecovery;
            this.emailUnconfirmedPattern = emailUnconfirmedPattern;
        }

        public static final int CONSTRUCTOR = -338450931;

        @Override
        public int getConstructor() {
            return -338450931;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateWaitPassword").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("hint").append(" = ").append(hint).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("hasRecovery").append(" = ").append(hasRecovery).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("emailUnconfirmedPattern").append(" = ").append(emailUnconfirmedPattern).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AuthStateOk extends AuthState {

        public AuthStateOk() {
        }

        public static final int CONSTRUCTOR = 1222968966;

        @Override
        public int getConstructor() {
            return 1222968966;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateOk").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AuthStateLoggingOut extends AuthState {

        public AuthStateLoggingOut() {
        }

        public static final int CONSTRUCTOR = 965468001;

        @Override
        public int getConstructor() {
            return 965468001;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AuthStateLoggingOut").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Chat extends TLObject {
        public long id;
        public Message topMessage;
        public int unreadCount;
        public int lastReadInboxMessageId;
        public int lastReadOutboxMessageId;
        public NotificationSettings notificationSettings;
        public ChatInfo type;

        public Chat() {
        }

        public Chat(long id, Message topMessage, int unreadCount, int lastReadInboxMessageId, int lastReadOutboxMessageId, NotificationSettings notificationSettings, ChatInfo type) {
            this.id = id;
            this.topMessage = topMessage;
            this.unreadCount = unreadCount;
            this.lastReadInboxMessageId = lastReadInboxMessageId;
            this.lastReadOutboxMessageId = lastReadOutboxMessageId;
            this.notificationSettings = notificationSettings;
            this.type = type;
        }

        public static final int CONSTRUCTOR = -437749334;

        @Override
        public int getConstructor() {
            return -437749334;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Chat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("topMessage").append(" = "); topMessage.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("unreadCount").append(" = ").append(unreadCount).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastReadInboxMessageId").append(" = ").append(lastReadInboxMessageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastReadOutboxMessageId").append(" = ").append(lastReadOutboxMessageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("notificationSettings").append(" = "); notificationSettings.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("type").append(" = "); type.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class ChatInfo extends TLObject {
    }

    public static class PrivateChatInfo extends ChatInfo {
        public User user;

        public PrivateChatInfo() {
        }

        public PrivateChatInfo(User user) {
            this.user = user;
        }

        public static final int CONSTRUCTOR = -241270753;

        @Override
        public int getConstructor() {
            return -241270753;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("PrivateChatInfo").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("user").append(" = "); user.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GroupChatInfo extends ChatInfo {
        public GroupChat groupChat;

        public GroupChatInfo() {
        }

        public GroupChatInfo(GroupChat groupChat) {
            this.groupChat = groupChat;
        }

        public static final int CONSTRUCTOR = 1106069512;

        @Override
        public int getConstructor() {
            return 1106069512;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GroupChatInfo").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("groupChat").append(" = "); groupChat.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ChatParticipant extends TLObject {
        public User user;
        public int inviterId;
        public int joinDate;

        public ChatParticipant() {
        }

        public ChatParticipant(User user, int inviterId, int joinDate) {
            this.user = user;
            this.inviterId = inviterId;
            this.joinDate = joinDate;
        }

        public static final int CONSTRUCTOR = 395682475;

        @Override
        public int getConstructor() {
            return 395682475;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ChatParticipant").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("user").append(" = "); user.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("inviterId").append(" = ").append(inviterId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("joinDate").append(" = ").append(joinDate).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Chats extends TLObject {
        public Chat[] chats;

        public Chats() {
        }

        public Chats(Chat[] chats) {
            this.chats = chats;
        }

        public static final int CONSTRUCTOR = -203185581;

        @Override
        public int getConstructor() {
            return -203185581;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Chats").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chats").append(" = ").append("Chat[]").append(" {").append(Arrays.toString(chats));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Contacts extends TLObject {
        public User[] users;

        public Contacts() {
        }

        public Contacts(User[] users) {
            this.users = users;
        }

        public static final int CONSTRUCTOR = 1238821485;

        @Override
        public int getConstructor() {
            return 1238821485;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Contacts").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("users").append(" = ").append("User[]").append(" {").append(Arrays.toString(users));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Document extends TLObject {
        public String fileName;
        public String mimeType;
        public PhotoSize thumb;
        public File document;

        public Document() {
        }

        public Document(String fileName, String mimeType, PhotoSize thumb, File document) {
            this.fileName = fileName;
            this.mimeType = mimeType;
            this.thumb = thumb;
            this.document = document;
        }

        public static final int CONSTRUCTOR = 742605884;

        @Override
        public int getConstructor() {
            return 742605884;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Document").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fileName").append(" = ").append(fileName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("mimeType").append(" = ").append(mimeType).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("thumb").append(" = "); thumb.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("document").append(" = "); document.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Error extends TLObject {
        public int code;
        public String text;

        public Error() {
        }

        public Error(int code, String text) {
            this.code = code;
            this.text = text;
        }

        public static final int CONSTRUCTOR = -994444869;

        @Override
        public int getConstructor() {
            return -994444869;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Error").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("code").append(" = ").append(code).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("text").append(" = ").append(text).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class File extends TLObject {
        public int id;
        public String persistentId;
        public int size;
        public String path;

        public File() {
        }

        public File(int id, String persistentId, int size, String path) {
            this.id = id;
            this.persistentId = persistentId;
            this.size = size;
            this.path = path;
        }

        public static final int CONSTRUCTOR = -1956331593;

        @Override
        public int getConstructor() {
            return -1956331593;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("File").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("persistentId").append(" = ").append(persistentId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("size").append(" = ").append(size).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("path").append(" = ").append(path).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GroupChat extends TLObject {
        public int id;
        public String title;
        public int participantsCount;
        public ProfilePhoto photo;
        public boolean left;

        public GroupChat() {
        }

        public GroupChat(int id, String title, int participantsCount, ProfilePhoto photo, boolean left) {
            this.id = id;
            this.title = title;
            this.participantsCount = participantsCount;
            this.photo = photo;
            this.left = left;
        }

        public static final int CONSTRUCTOR = 1946833410;

        @Override
        public int getConstructor() {
            return 1946833410;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GroupChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("participantsCount").append(" = ").append(participantsCount).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("left").append(" = ").append(left).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GroupChatFull extends TLObject {
        public GroupChat groupChat;
        public int adminId;
        public ChatParticipant[] participants;
        public String inviteLink;

        public GroupChatFull() {
        }

        public GroupChatFull(GroupChat groupChat, int adminId, ChatParticipant[] participants, String inviteLink) {
            this.groupChat = groupChat;
            this.adminId = adminId;
            this.participants = participants;
            this.inviteLink = inviteLink;
        }

        public static final int CONSTRUCTOR = -2117185800;

        @Override
        public int getConstructor() {
            return -2117185800;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GroupChatFull").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("groupChat").append(" = "); groupChat.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("adminId").append(" = ").append(adminId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("participants").append(" = ").append("ChatParticipant[]").append(" {").append(Arrays.toString(participants));
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("inviteLink").append(" = ").append(inviteLink).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class InputFile extends TLObject {
    }

    public static class InputFileId extends InputFile {
        public int id;

        public InputFileId() {
        }

        public InputFileId(int id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = 1553438243;

        @Override
        public int getConstructor() {
            return 1553438243;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputFileId").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputFilePersistentId extends InputFile {
        public String persistentId;

        public InputFilePersistentId() {
        }

        public InputFilePersistentId(String persistentId) {
            this.persistentId = persistentId;
        }

        public static final int CONSTRUCTOR = 1856539551;

        @Override
        public int getConstructor() {
            return 1856539551;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputFilePersistentId").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("persistentId").append(" = ").append(persistentId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputFileLocal extends InputFile {
        public String path;

        public InputFileLocal() {
        }

        public InputFileLocal(String path) {
            this.path = path;
        }

        public static final int CONSTRUCTOR = 2056030919;

        @Override
        public int getConstructor() {
            return 2056030919;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputFileLocal").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("path").append(" = ").append(path).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class InputMessageContent extends TLObject {
    }

    public static class InputMessageText extends InputMessageContent {
        public String text;

        public InputMessageText() {
        }

        public InputMessageText(String text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = -54904775;

        @Override
        public int getConstructor() {
            return -54904775;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageText").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("text").append(" = ").append(text).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageAudio extends InputMessageContent {
        public InputFile audio;
        public int duration;

        public InputMessageAudio() {
        }

        public InputMessageAudio(InputFile audio, int duration) {
            this.audio = audio;
            this.duration = duration;
        }

        public static final int CONSTRUCTOR = 382036537;

        @Override
        public int getConstructor() {
            return 382036537;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageAudio").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("audio").append(" = "); audio.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("duration").append(" = ").append(duration).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageDocument extends InputMessageContent {
        public InputFile document;

        public InputMessageDocument() {
        }

        public InputMessageDocument(InputFile document) {
            this.document = document;
        }

        public static final int CONSTRUCTOR = 75474869;

        @Override
        public int getConstructor() {
            return 75474869;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageDocument").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("document").append(" = "); document.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessagePhoto extends InputMessageContent {
        public InputFile photo;
        public String caption;

        public InputMessagePhoto() {
        }

        public InputMessagePhoto(InputFile photo, String caption) {
            this.photo = photo;
            this.caption = caption;
        }

        public static final int CONSTRUCTOR = 762116923;

        @Override
        public int getConstructor() {
            return 762116923;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessagePhoto").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("caption").append(" = ").append(caption).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageSticker extends InputMessageContent {
        public InputFile sticker;

        public InputMessageSticker() {
        }

        public InputMessageSticker(InputFile sticker) {
            this.sticker = sticker;
        }

        public static final int CONSTRUCTOR = 1579676898;

        @Override
        public int getConstructor() {
            return 1579676898;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageSticker").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("sticker").append(" = "); sticker.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageVideo extends InputMessageContent {
        public InputFile video;
        public String caption;
        public int duration;

        public InputMessageVideo() {
        }

        public InputMessageVideo(InputFile video, String caption, int duration) {
            this.video = video;
            this.caption = caption;
            this.duration = duration;
        }

        public static final int CONSTRUCTOR = -54736938;

        @Override
        public int getConstructor() {
            return -54736938;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageVideo").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("video").append(" = "); video.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("caption").append(" = ").append(caption).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("duration").append(" = ").append(duration).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageLocation extends InputMessageContent {
        public double longitude;
        public double latitude;

        public InputMessageLocation() {
        }

        public InputMessageLocation(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        public static final int CONSTRUCTOR = 1494132433;

        @Override
        public int getConstructor() {
            return 1494132433;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageLocation").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("longitude").append(" = ").append(longitude).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("latitude").append(" = ").append(latitude).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageVenue extends InputMessageContent {
        public double longitude;
        public double latitude;
        public String title;
        public String address;
        public String provider;
        public String venueId;

        public InputMessageVenue() {
        }

        public InputMessageVenue(double longitude, double latitude, String title, String address, String provider, String venueId) {
            this.longitude = longitude;
            this.latitude = latitude;
            this.title = title;
            this.address = address;
            this.provider = provider;
            this.venueId = venueId;
        }

        public static final int CONSTRUCTOR = -971070542;

        @Override
        public int getConstructor() {
            return -971070542;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageVenue").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("longitude").append(" = ").append(longitude).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("latitude").append(" = ").append(latitude).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("address").append(" = ").append(address).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("provider").append(" = ").append(provider).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("venueId").append(" = ").append(venueId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageContact extends InputMessageContent {
        public String phoneNumber;
        public String firstName;
        public String lastName;

        public InputMessageContact() {
        }

        public InputMessageContact(String phoneNumber, String firstName, String lastName) {
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public static final int CONSTRUCTOR = -1144016580;

        @Override
        public int getConstructor() {
            return -1144016580;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageContact").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("phoneNumber").append(" = ").append(phoneNumber).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("firstName").append(" = ").append(firstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastName").append(" = ").append(lastName).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class InputMessageForwarded extends InputMessageContent {
        public long fromChatId;
        public int messageId;

        public InputMessageForwarded() {
        }

        public InputMessageForwarded(long fromChatId, int messageId) {
            this.fromChatId = fromChatId;
            this.messageId = messageId;
        }

        public static final int CONSTRUCTOR = 863879612;

        @Override
        public int getConstructor() {
            return 863879612;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("InputMessageForwarded").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fromChatId").append(" = ").append(fromChatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageId").append(" = ").append(messageId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class LinkState extends TLObject {
    }

    public static class LinkStateNone extends LinkState {

        public LinkStateNone() {
        }

        public static final int CONSTRUCTOR = 951430287;

        @Override
        public int getConstructor() {
            return 951430287;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("LinkStateNone").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class LinkStateKnowsPhoneNumber extends LinkState {

        public LinkStateKnowsPhoneNumber() {
        }

        public static final int CONSTRUCTOR = 380898199;

        @Override
        public int getConstructor() {
            return 380898199;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("LinkStateKnowsPhoneNumber").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class LinkStateContact extends LinkState {

        public LinkStateContact() {
        }

        public static final int CONSTRUCTOR = -731324681;

        @Override
        public int getConstructor() {
            return -731324681;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("LinkStateContact").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Location extends TLObject {
        public double longitude;
        public double latitude;

        public Location() {
        }

        public Location(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        public static final int CONSTRUCTOR = -1691941094;

        @Override
        public int getConstructor() {
            return -1691941094;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Location").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("longitude").append(" = ").append(longitude).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("latitude").append(" = ").append(latitude).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Message extends TLObject {
        public int id;
        public int fromId;
        public long chatId;
        public int date;
        public int forwardFromId;
        public int forwardDate;
        public int replyToMessageId;
        public MessageContent message;

        public Message() {
        }

        public Message(int id, int fromId, long chatId, int date, int forwardFromId, int forwardDate, int replyToMessageId, MessageContent message) {
            this.id = id;
            this.fromId = fromId;
            this.chatId = chatId;
            this.date = date;
            this.forwardFromId = forwardFromId;
            this.forwardDate = forwardDate;
            this.replyToMessageId = replyToMessageId;
            this.message = message;
        }

        public static final int CONSTRUCTOR = -818144677;

        @Override
        public int getConstructor() {
            return -818144677;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Message").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fromId").append(" = ").append(fromId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("date").append(" = ").append(date).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("forwardFromId").append(" = ").append(forwardFromId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("forwardDate").append(" = ").append(forwardDate).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("replyToMessageId").append(" = ").append(replyToMessageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("message").append(" = "); message.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class MessageContent extends TLObject {
    }

    public static class MessageText extends MessageContent {
        public String text;

        public MessageText() {
        }

        public MessageText(String text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = 934458430;

        @Override
        public int getConstructor() {
            return 934458430;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageText").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("text").append(" = ").append(text).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageAudio extends MessageContent {
        public Audio audio;

        public MessageAudio() {
        }

        public MessageAudio(Audio audio) {
            this.audio = audio;
        }

        public static final int CONSTRUCTOR = 239258829;

        @Override
        public int getConstructor() {
            return 239258829;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageAudio").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("audio").append(" = "); audio.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageDocument extends MessageContent {
        public Document document;

        public MessageDocument() {
        }

        public MessageDocument(Document document) {
            this.document = document;
        }

        public static final int CONSTRUCTOR = -410248975;

        @Override
        public int getConstructor() {
            return -410248975;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageDocument").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("document").append(" = "); document.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageSticker extends MessageContent {
        public Sticker sticker;

        public MessageSticker() {
        }

        public MessageSticker(Sticker sticker) {
            this.sticker = sticker;
        }

        public static final int CONSTRUCTOR = 1779022878;

        @Override
        public int getConstructor() {
            return 1779022878;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageSticker").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("sticker").append(" = "); sticker.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessagePhoto extends MessageContent {
        public Photo photo;
        public String caption;

        public MessagePhoto() {
        }

        public MessagePhoto(Photo photo, String caption) {
            this.photo = photo;
            this.caption = caption;
        }

        public static final int CONSTRUCTOR = 1469704153;

        @Override
        public int getConstructor() {
            return 1469704153;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessagePhoto").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("caption").append(" = ").append(caption).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageVideo extends MessageContent {
        public Video video;
        public String caption;

        public MessageVideo() {
        }

        public MessageVideo(Video video, String caption) {
            this.video = video;
            this.caption = caption;
        }

        public static final int CONSTRUCTOR = 1267590961;

        @Override
        public int getConstructor() {
            return 1267590961;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageVideo").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("video").append(" = "); video.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("caption").append(" = ").append(caption).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageWebPage extends MessageContent {
        public String text;
        public WebPage webPage;

        public MessageWebPage() {
        }

        public MessageWebPage(String text, WebPage webPage) {
            this.text = text;
            this.webPage = webPage;
        }

        public static final int CONSTRUCTOR = 424964389;

        @Override
        public int getConstructor() {
            return 424964389;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageWebPage").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("text").append(" = ").append(text).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("webPage").append(" = "); webPage.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageLocation extends MessageContent {
        public Location location;

        public MessageLocation() {
        }

        public MessageLocation(Location location) {
            this.location = location;
        }

        public static final int CONSTRUCTOR = 161545583;

        @Override
        public int getConstructor() {
            return 161545583;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageLocation").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("location").append(" = "); location.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageVenue extends MessageContent {
        public Location location;
        public String title;
        public String address;
        public String provider;
        public String venueId;

        public MessageVenue() {
        }

        public MessageVenue(Location location, String title, String address, String provider, String venueId) {
            this.location = location;
            this.title = title;
            this.address = address;
            this.provider = provider;
            this.venueId = venueId;
        }

        public static final int CONSTRUCTOR = 586749589;

        @Override
        public int getConstructor() {
            return 586749589;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageVenue").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("location").append(" = "); location.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("address").append(" = ").append(address).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("provider").append(" = ").append(provider).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("venueId").append(" = ").append(venueId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageContact extends MessageContent {
        public String phoneNumber;
        public String firstName;
        public String lastName;
        public int userId;

        public MessageContact() {
        }

        public MessageContact(String phoneNumber, String firstName, String lastName, int userId) {
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = 216059403;

        @Override
        public int getConstructor() {
            return 216059403;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageContact").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("phoneNumber").append(" = ").append(phoneNumber).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("firstName").append(" = ").append(firstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastName").append(" = ").append(lastName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageGroupChatCreate extends MessageContent {
        public String title;
        public User[] participants;

        public MessageGroupChatCreate() {
        }

        public MessageGroupChatCreate(String title, User[] participants) {
            this.title = title;
            this.participants = participants;
        }

        public static final int CONSTRUCTOR = -1856328772;

        @Override
        public int getConstructor() {
            return -1856328772;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageGroupChatCreate").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("participants").append(" = ").append("User[]").append(" {").append(Arrays.toString(participants));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatChangeTitle extends MessageContent {
        public String title;

        public MessageChatChangeTitle() {
        }

        public MessageChatChangeTitle(String title) {
            this.title = title;
        }

        public static final int CONSTRUCTOR = 748272449;

        @Override
        public int getConstructor() {
            return 748272449;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatChangeTitle").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatChangePhoto extends MessageContent {
        public Photo photo;

        public MessageChatChangePhoto() {
        }

        public MessageChatChangePhoto(Photo photo) {
            this.photo = photo;
        }

        public static final int CONSTRUCTOR = 319630249;

        @Override
        public int getConstructor() {
            return 319630249;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatChangePhoto").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatDeletePhoto extends MessageContent {

        public MessageChatDeletePhoto() {
        }

        public static final int CONSTRUCTOR = -184374809;

        @Override
        public int getConstructor() {
            return -184374809;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatDeletePhoto").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatAddParticipant extends MessageContent {
        public User user;

        public MessageChatAddParticipant() {
        }

        public MessageChatAddParticipant(User user) {
            this.user = user;
        }

        public static final int CONSTRUCTOR = 1826239662;

        @Override
        public int getConstructor() {
            return 1826239662;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatAddParticipant").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("user").append(" = "); user.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatJoinByLink extends MessageContent {
        public int inviterId;

        public MessageChatJoinByLink() {
        }

        public MessageChatJoinByLink(int inviterId) {
            this.inviterId = inviterId;
        }

        public static final int CONSTRUCTOR = 1832922905;

        @Override
        public int getConstructor() {
            return 1832922905;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatJoinByLink").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("inviterId").append(" = ").append(inviterId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageChatDeleteParticipant extends MessageContent {
        public User user;

        public MessageChatDeleteParticipant() {
        }

        public MessageChatDeleteParticipant(User user) {
            this.user = user;
        }

        public static final int CONSTRUCTOR = 2091163657;

        @Override
        public int getConstructor() {
            return 2091163657;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageChatDeleteParticipant").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("user").append(" = "); user.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageDeleted extends MessageContent {

        public MessageDeleted() {
        }

        public static final int CONSTRUCTOR = 2145503191;

        @Override
        public int getConstructor() {
            return 2145503191;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageDeleted").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class MessageUnsupported extends MessageContent {

        public MessageUnsupported() {
        }

        public static final int CONSTRUCTOR = -1816726139;

        @Override
        public int getConstructor() {
            return -1816726139;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("MessageUnsupported").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Messages extends TLObject {
        public Message[] messages;

        public Messages() {
        }

        public Messages(Message[] messages) {
            this.messages = messages;
        }

        public static final int CONSTRUCTOR = -1942796183;

        @Override
        public int getConstructor() {
            return -1942796183;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Messages").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messages").append(" = ").append("Message[]").append(" {").append(Arrays.toString(messages));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class NotificationSettings extends TLObject {
        public int muteFor;
        public String sound;
        public boolean showPreviews;
        public int eventsMask;

        public NotificationSettings() {
        }

        public NotificationSettings(int muteFor, String sound, boolean showPreviews, int eventsMask) {
            this.muteFor = muteFor;
            this.sound = sound;
            this.showPreviews = showPreviews;
            this.eventsMask = eventsMask;
        }

        public static final int CONSTRUCTOR = 826646433;

        @Override
        public int getConstructor() {
            return 826646433;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("NotificationSettings").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("muteFor").append(" = ").append(muteFor).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("sound").append(" = ").append(sound).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("showPreviews").append(" = ").append(showPreviews).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("eventsMask").append(" = ").append(eventsMask).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class NotificationSettingsScope extends TLObject {
    }

    public static class NotificationSettingsForChat extends NotificationSettingsScope {
        public long chatId;

        public NotificationSettingsForChat() {
        }

        public NotificationSettingsForChat(long chatId) {
            this.chatId = chatId;
        }

        public static final int CONSTRUCTOR = 1920084409;

        @Override
        public int getConstructor() {
            return 1920084409;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("NotificationSettingsForChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class NotificationSettingsForPrivateChats extends NotificationSettingsScope {

        public NotificationSettingsForPrivateChats() {
        }

        public static final int CONSTRUCTOR = 792026226;

        @Override
        public int getConstructor() {
            return 792026226;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("NotificationSettingsForPrivateChats").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class NotificationSettingsForGroupChats extends NotificationSettingsScope {

        public NotificationSettingsForGroupChats() {
        }

        public static final int CONSTRUCTOR = -1019160145;

        @Override
        public int getConstructor() {
            return -1019160145;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("NotificationSettingsForGroupChats").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class NotificationSettingsForAllChats extends NotificationSettingsScope {

        public NotificationSettingsForAllChats() {
        }

        public static final int CONSTRUCTOR = 2121050176;

        @Override
        public int getConstructor() {
            return 2121050176;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("NotificationSettingsForAllChats").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Ok extends TLObject {

        public Ok() {
        }

        public static final int CONSTRUCTOR = -722616727;

        @Override
        public int getConstructor() {
            return -722616727;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Ok").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class OptionValue extends TLObject {
    }

    public static class OptionBoolean extends OptionValue {
        public boolean value;

        public OptionBoolean() {
        }

        public OptionBoolean(boolean value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 280624660;

        @Override
        public int getConstructor() {
            return 280624660;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("OptionBoolean").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append(value).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class OptionEmpty extends OptionValue {

        public OptionEmpty() {
        }

        public static final int CONSTRUCTOR = 1025799436;

        @Override
        public int getConstructor() {
            return 1025799436;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("OptionEmpty").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class OptionInteger extends OptionValue {
        public int value;

        public OptionInteger() {
        }

        public OptionInteger(int value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 1383938450;

        @Override
        public int getConstructor() {
            return 1383938450;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("OptionInteger").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append(value).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class OptionString extends OptionValue {
        public String value;

        public OptionString() {
        }

        public OptionString(String value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = -841614037;

        @Override
        public int getConstructor() {
            return -841614037;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("OptionString").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append(value).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Photo extends TLObject {
        public long id;
        public PhotoSize[] photos;

        public Photo() {
        }

        public Photo(long id, PhotoSize[] photos) {
            this.id = id;
            this.photos = photos;
        }

        public static final int CONSTRUCTOR = 700401344;

        @Override
        public int getConstructor() {
            return 700401344;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Photo").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photos").append(" = ").append("PhotoSize[]").append(" {").append(Arrays.toString(photos));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class PhotoSize extends TLObject {
        public String type;
        public File photo;
        public int width;
        public int height;

        public PhotoSize() {
        }

        public PhotoSize(String type, File photo, int width, int height) {
            this.type = type;
            this.photo = photo;
            this.width = width;
            this.height = height;
        }

        public static final int CONSTRUCTOR = -796190918;

        @Override
        public int getConstructor() {
            return -796190918;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("PhotoSize").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("type").append(" = ").append(type).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("width").append(" = ").append(width).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("height").append(" = ").append(height).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ProfilePhoto extends TLObject {
        public long id;
        public File small;
        public File big;

        public ProfilePhoto() {
        }

        public ProfilePhoto(long id, File small, File big) {
            this.id = id;
            this.small = small;
            this.big = big;
        }

        public static final int CONSTRUCTOR = -1954106867;

        @Override
        public int getConstructor() {
            return -1954106867;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ProfilePhoto").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("small").append(" = "); small.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("big").append(" = "); big.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class ReplyMarkup extends TLObject {
    }

    public static class ReplyMarkupHideKeyboard extends ReplyMarkup {
        public boolean personal;

        public ReplyMarkupHideKeyboard() {
        }

        public ReplyMarkupHideKeyboard(boolean personal) {
            this.personal = personal;
        }

        public static final int CONSTRUCTOR = 1614435429;

        @Override
        public int getConstructor() {
            return 1614435429;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ReplyMarkupHideKeyboard").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("personal").append(" = ").append(personal).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ReplyMarkupForceReply extends ReplyMarkup {
        public boolean personal;

        public ReplyMarkupForceReply() {
        }

        public ReplyMarkupForceReply(boolean personal) {
            this.personal = personal;
        }

        public static final int CONSTRUCTOR = -1880611604;

        @Override
        public int getConstructor() {
            return -1880611604;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ReplyMarkupForceReply").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("personal").append(" = ").append(personal).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ReplyMarkupShowKeyboard extends ReplyMarkup {
        public String[][] rows;
        public boolean resizeKeyboard;
        public boolean oneTime;
        public boolean personal;

        public ReplyMarkupShowKeyboard() {
        }

        public ReplyMarkupShowKeyboard(String[][] rows, boolean resizeKeyboard, boolean oneTime, boolean personal) {
            this.rows = rows;
            this.resizeKeyboard = resizeKeyboard;
            this.oneTime = oneTime;
            this.personal = personal;
        }

        public static final int CONSTRUCTOR = 22090330;

        @Override
        public int getConstructor() {
            return 22090330;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ReplyMarkupShowKeyboard").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("rows").append(" = ").append("String[][]").append(" {").append(Arrays.deepToString(rows));
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("resizeKeyboard").append(" = ").append(resizeKeyboard).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("oneTime").append(" = ").append(oneTime).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("personal").append(" = ").append(personal).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class SendMessageAction extends TLObject {
    }

    public static class SendMessageTypingAction extends SendMessageAction {

        public SendMessageTypingAction() {
        }

        public static final int CONSTRUCTOR = 381645902;

        @Override
        public int getConstructor() {
            return 381645902;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageTypingAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageCancelAction extends SendMessageAction {

        public SendMessageCancelAction() {
        }

        public static final int CONSTRUCTOR = -44119819;

        @Override
        public int getConstructor() {
            return -44119819;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageCancelAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageRecordVideoAction extends SendMessageAction {

        public SendMessageRecordVideoAction() {
        }

        public static final int CONSTRUCTOR = -1584933265;

        @Override
        public int getConstructor() {
            return -1584933265;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageRecordVideoAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageUploadVideoAction extends SendMessageAction {
        public int progress;

        public SendMessageUploadVideoAction() {
        }

        public SendMessageUploadVideoAction(int progress) {
            this.progress = progress;
        }

        public static final int CONSTRUCTOR = -378127636;

        @Override
        public int getConstructor() {
            return -378127636;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageUploadVideoAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("progress").append(" = ").append(progress).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageRecordAudioAction extends SendMessageAction {

        public SendMessageRecordAudioAction() {
        }

        public static final int CONSTRUCTOR = -718310409;

        @Override
        public int getConstructor() {
            return -718310409;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageRecordAudioAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageUploadAudioAction extends SendMessageAction {
        public int progress;

        public SendMessageUploadAudioAction() {
        }

        public SendMessageUploadAudioAction(int progress) {
            this.progress = progress;
        }

        public static final int CONSTRUCTOR = -212740181;

        @Override
        public int getConstructor() {
            return -212740181;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageUploadAudioAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("progress").append(" = ").append(progress).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageUploadPhotoAction extends SendMessageAction {
        public int progress;

        public SendMessageUploadPhotoAction() {
        }

        public SendMessageUploadPhotoAction(int progress) {
            this.progress = progress;
        }

        public static final int CONSTRUCTOR = -774682074;

        @Override
        public int getConstructor() {
            return -774682074;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageUploadPhotoAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("progress").append(" = ").append(progress).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageUploadDocumentAction extends SendMessageAction {
        public int progress;

        public SendMessageUploadDocumentAction() {
        }

        public SendMessageUploadDocumentAction(int progress) {
            this.progress = progress;
        }

        public static final int CONSTRUCTOR = -1441998364;

        @Override
        public int getConstructor() {
            return -1441998364;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageUploadDocumentAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("progress").append(" = ").append(progress).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageGeoLocationAction extends SendMessageAction {

        public SendMessageGeoLocationAction() {
        }

        public static final int CONSTRUCTOR = 393186209;

        @Override
        public int getConstructor() {
            return 393186209;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageGeoLocationAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessageChooseContactAction extends SendMessageAction {

        public SendMessageChooseContactAction() {
        }

        public static final int CONSTRUCTOR = 1653390447;

        @Override
        public int getConstructor() {
            return 1653390447;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessageChooseContactAction").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Sticker extends TLObject {
        public int width;
        public int height;
        public String emoji;
        public PhotoSize thumb;
        public File sticker;

        public Sticker() {
        }

        public Sticker(int width, int height, String emoji, PhotoSize thumb, File sticker) {
            this.width = width;
            this.height = height;
            this.emoji = emoji;
            this.thumb = thumb;
            this.sticker = sticker;
        }

        public static final int CONSTRUCTOR = -18463009;

        @Override
        public int getConstructor() {
            return -18463009;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Sticker").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("width").append(" = ").append(width).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("height").append(" = ").append(height).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("emoji").append(" = ").append(emoji).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("thumb").append(" = "); thumb.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("sticker").append(" = "); sticker.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Stickers extends TLObject {
        public Sticker[] stickers;

        public Stickers() {
        }

        public Stickers(Sticker[] stickers) {
            this.stickers = stickers;
        }

        public static final int CONSTRUCTOR = 1974859260;

        @Override
        public int getConstructor() {
            return 1974859260;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Stickers").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("stickers").append(" = ").append("Sticker[]").append(" {").append(Arrays.toString(stickers));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class Update extends TLObject {
    }

    public static class UpdateNewMessage extends Update {
        public Message message;

        public UpdateNewMessage() {
        }

        public UpdateNewMessage(Message message) {
            this.message = message;
        }

        public static final int CONSTRUCTOR = -563105266;

        @Override
        public int getConstructor() {
            return -563105266;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateNewMessage").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("message").append(" = "); message.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateMessageId extends Update {
        public long chatId;
        public int oldId;
        public int newId;

        public UpdateMessageId() {
        }

        public UpdateMessageId(long chatId, int oldId, int newId) {
            this.chatId = chatId;
            this.oldId = oldId;
            this.newId = newId;
        }

        public static final int CONSTRUCTOR = 1840811241;

        @Override
        public int getConstructor() {
            return 1840811241;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateMessageId").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("oldId").append(" = ").append(oldId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("newId").append(" = ").append(newId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateMessageDate extends Update {
        public long chatId;
        public int messageId;
        public int newDate;

        public UpdateMessageDate() {
        }

        public UpdateMessageDate(long chatId, int messageId, int newDate) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.newDate = newDate;
        }

        public static final int CONSTRUCTOR = 211076103;

        @Override
        public int getConstructor() {
            return 211076103;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateMessageDate").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageId").append(" = ").append(messageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("newDate").append(" = ").append(newDate).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateMessageContent extends Update {
        public long chatId;
        public int messageId;
        public MessageContent newContent;

        public UpdateMessageContent() {
        }

        public UpdateMessageContent(long chatId, int messageId, MessageContent newContent) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.newContent = newContent;
        }

        public static final int CONSTRUCTOR = 561472729;

        @Override
        public int getConstructor() {
            return 561472729;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateMessageContent").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageId").append(" = ").append(messageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("newContent").append(" = "); newContent.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateMessageSendFailed extends Update {
        public long chatId;
        public int messageId;
        public int errorCode;
        public String errorDescription;

        public UpdateMessageSendFailed() {
        }

        public UpdateMessageSendFailed(long chatId, int messageId, int errorCode, String errorDescription) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.errorCode = errorCode;
            this.errorDescription = errorDescription;
        }

        public static final int CONSTRUCTOR = 2098937137;

        @Override
        public int getConstructor() {
            return 2098937137;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateMessageSendFailed").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageId").append(" = ").append(messageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("errorCode").append(" = ").append(errorCode).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("errorDescription").append(" = ").append(errorDescription).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateChatReadInbox extends Update {
        public long chatId;
        public int lastReadInboxMessageId;
        public int unreadCount;

        public UpdateChatReadInbox() {
        }

        public UpdateChatReadInbox(long chatId, int lastReadInboxMessageId, int unreadCount) {
            this.chatId = chatId;
            this.lastReadInboxMessageId = lastReadInboxMessageId;
            this.unreadCount = unreadCount;
        }

        public static final int CONSTRUCTOR = -58810942;

        @Override
        public int getConstructor() {
            return -58810942;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateChatReadInbox").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastReadInboxMessageId").append(" = ").append(lastReadInboxMessageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("unreadCount").append(" = ").append(unreadCount).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateChatReadOutbox extends Update {
        public long chatId;
        public int lastReadOutboxMessageId;

        public UpdateChatReadOutbox() {
        }

        public UpdateChatReadOutbox(long chatId, int lastReadOutboxMessageId) {
            this.chatId = chatId;
            this.lastReadOutboxMessageId = lastReadOutboxMessageId;
        }

        public static final int CONSTRUCTOR = 877103058;

        @Override
        public int getConstructor() {
            return 877103058;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateChatReadOutbox").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastReadOutboxMessageId").append(" = ").append(lastReadOutboxMessageId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateNotificationSettings extends Update {
        public NotificationSettingsScope scope;
        public NotificationSettings notificationSettings;

        public UpdateNotificationSettings() {
        }

        public UpdateNotificationSettings(NotificationSettingsScope scope, NotificationSettings notificationSettings) {
            this.scope = scope;
            this.notificationSettings = notificationSettings;
        }

        public static final int CONSTRUCTOR = -1767306883;

        @Override
        public int getConstructor() {
            return -1767306883;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateNotificationSettings").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("scope").append(" = "); scope.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("notificationSettings").append(" = "); notificationSettings.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateDeleteMessages extends Update {
        public long chatId;
        public int[] messages;

        public UpdateDeleteMessages() {
        }

        public UpdateDeleteMessages(long chatId, int[] messages) {
            this.chatId = chatId;
            this.messages = messages;
        }

        public static final int CONSTRUCTOR = -1920566645;

        @Override
        public int getConstructor() {
            return -1920566645;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateDeleteMessages").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messages").append(" = ").append("int[]").append(" {").append(Arrays.toString(messages));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserAction extends Update {
        public long chatId;
        public int userId;
        public SendMessageAction action;

        public UpdateUserAction() {
        }

        public UpdateUserAction(long chatId, int userId, SendMessageAction action) {
            this.chatId = chatId;
            this.userId = userId;
            this.action = action;
        }

        public static final int CONSTRUCTOR = 223420164;

        @Override
        public int getConstructor() {
            return 223420164;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("action").append(" = "); action.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserStatus extends Update {
        public int userId;
        public UserStatus status;

        public UpdateUserStatus() {
        }

        public UpdateUserStatus(int userId, UserStatus status) {
            this.userId = userId;
            this.status = status;
        }

        public static final int CONSTRUCTOR = 469489699;

        @Override
        public int getConstructor() {
            return 469489699;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserStatus").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("status").append(" = "); status.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserName extends Update {
        public int userId;
        public String firstName;
        public String lastName;
        public String username;

        public UpdateUserName() {
        }

        public UpdateUserName(int userId, String firstName, String lastName, String username) {
            this.userId = userId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
        }

        public static final int CONSTRUCTOR = -1489818765;

        @Override
        public int getConstructor() {
            return -1489818765;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserName").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("firstName").append(" = ").append(firstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastName").append(" = ").append(lastName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("username").append(" = ").append(username).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserPhoneNumber extends Update {
        public int userId;
        public String phoneNumber;

        public UpdateUserPhoneNumber() {
        }

        public UpdateUserPhoneNumber(int userId, String phoneNumber) {
            this.userId = userId;
            this.phoneNumber = phoneNumber;
        }

        public static final int CONSTRUCTOR = 1973399777;

        @Override
        public int getConstructor() {
            return 1973399777;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserPhoneNumber").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("phoneNumber").append(" = ").append(phoneNumber).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserProfilePhoto extends Update {
        public int userId;
        public ProfilePhoto profilePhoto;

        public UpdateUserProfilePhoto() {
        }

        public UpdateUserProfilePhoto(int userId, ProfilePhoto profilePhoto) {
            this.userId = userId;
            this.profilePhoto = profilePhoto;
        }

        public static final int CONSTRUCTOR = -1996167678;

        @Override
        public int getConstructor() {
            return -1996167678;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserProfilePhoto").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("profilePhoto").append(" = "); profilePhoto.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserLinks extends Update {
        public int userId;
        public LinkState myLink;
        public LinkState foreignLink;

        public UpdateUserLinks() {
        }

        public UpdateUserLinks(int userId, LinkState myLink, LinkState foreignLink) {
            this.userId = userId;
            this.myLink = myLink;
            this.foreignLink = foreignLink;
        }

        public static final int CONSTRUCTOR = -993224878;

        @Override
        public int getConstructor() {
            return -993224878;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserLinks").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("myLink").append(" = "); myLink.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("foreignLink").append(" = "); foreignLink.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateUserBlocked extends Update {
        public int userId;
        public boolean isBlocked;

        public UpdateUserBlocked() {
        }

        public UpdateUserBlocked(int userId, boolean isBlocked) {
            this.userId = userId;
            this.isBlocked = isBlocked;
        }

        public static final int CONSTRUCTOR = 1341545325;

        @Override
        public int getConstructor() {
            return 1341545325;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateUserBlocked").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("isBlocked").append(" = ").append(isBlocked).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateChatTitle extends Update {
        public long chatId;
        public String title;

        public UpdateChatTitle() {
        }

        public UpdateChatTitle(long chatId, String title) {
            this.chatId = chatId;
            this.title = title;
        }

        public static final int CONSTRUCTOR = 1931125386;

        @Override
        public int getConstructor() {
            return 1931125386;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateChatTitle").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateChatParticipantsCount extends Update {
        public long chatId;
        public int participantsCount;

        public UpdateChatParticipantsCount() {
        }

        public UpdateChatParticipantsCount(long chatId, int participantsCount) {
            this.chatId = chatId;
            this.participantsCount = participantsCount;
        }

        public static final int CONSTRUCTOR = 1188647993;

        @Override
        public int getConstructor() {
            return 1188647993;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateChatParticipantsCount").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("participantsCount").append(" = ").append(participantsCount).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateNewAuthorization extends Update {
        public int date;
        public String device;
        public String location;

        public UpdateNewAuthorization() {
        }

        public UpdateNewAuthorization(int date, String device, String location) {
            this.date = date;
            this.device = device;
            this.location = location;
        }

        public static final int CONSTRUCTOR = -176559980;

        @Override
        public int getConstructor() {
            return -176559980;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateNewAuthorization").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("date").append(" = ").append(date).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("device").append(" = ").append(device).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("location").append(" = ").append(location).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateFileProgress extends Update {
        public int fileId;
        public int size;
        public int ready;

        public UpdateFileProgress() {
        }

        public UpdateFileProgress(int fileId, int size, int ready) {
            this.fileId = fileId;
            this.size = size;
            this.ready = ready;
        }

        public static final int CONSTRUCTOR = 1340921194;

        @Override
        public int getConstructor() {
            return 1340921194;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateFileProgress").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fileId").append(" = ").append(fileId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("size").append(" = ").append(size).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("ready").append(" = ").append(ready).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateFile extends Update {
        public File file;

        public UpdateFile() {
        }

        public UpdateFile(File file) {
            this.file = file;
        }

        public static final int CONSTRUCTOR = 114132831;

        @Override
        public int getConstructor() {
            return 114132831;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateFile").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("file").append(" = "); file.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateOption extends Update {
        public String name;
        public OptionValue value;

        public UpdateOption() {
        }

        public UpdateOption(String name, OptionValue value) {
            this.name = name;
            this.value = value;
        }

        public static final int CONSTRUCTOR = 900822020;

        @Override
        public int getConstructor() {
            return 900822020;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateOption").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("name").append(" = ").append(name).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = "); value.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UpdateStickers extends Update {

        public UpdateStickers() {
        }

        public static final int CONSTRUCTOR = -456211753;

        @Override
        public int getConstructor() {
            return -456211753;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UpdateStickers").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class User extends TLObject {
        public int id;
        public String firstName;
        public String lastName;
        public String username;
        public String phoneNumber;
        public UserStatus status;
        public ProfilePhoto profilePhoto;
        public LinkState myLink;
        public LinkState foreignLink;

        public User() {
        }

        public User(int id, String firstName, String lastName, String username, String phoneNumber, UserStatus status, ProfilePhoto profilePhoto, LinkState myLink, LinkState foreignLink) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.phoneNumber = phoneNumber;
            this.status = status;
            this.profilePhoto = profilePhoto;
            this.myLink = myLink;
            this.foreignLink = foreignLink;
        }

        public static final int CONSTRUCTOR = 992307343;

        @Override
        public int getConstructor() {
            return 992307343;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("User").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("id").append(" = ").append(id).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("firstName").append(" = ").append(firstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastName").append(" = ").append(lastName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("username").append(" = ").append(username).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("phoneNumber").append(" = ").append(phoneNumber).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("status").append(" = "); status.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("profilePhoto").append(" = "); profilePhoto.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("myLink").append(" = "); myLink.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("foreignLink").append(" = "); foreignLink.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserFull extends TLObject {
        public User user;
        public boolean isBlocked;
        public String realFirstName;
        public String realLastName;

        public UserFull() {
        }

        public UserFull(User user, boolean isBlocked, String realFirstName, String realLastName) {
            this.user = user;
            this.isBlocked = isBlocked;
            this.realFirstName = realFirstName;
            this.realLastName = realLastName;
        }

        public static final int CONSTRUCTOR = -295122843;

        @Override
        public int getConstructor() {
            return -295122843;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserFull").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("user").append(" = "); user.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("isBlocked").append(" = ").append(isBlocked).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("realFirstName").append(" = ").append(realFirstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("realLastName").append(" = ").append(realLastName).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserProfilePhotos extends TLObject {
        public int totalCount;
        public Photo[] photos;

        public UserProfilePhotos() {
        }

        public UserProfilePhotos(int totalCount, Photo[] photos) {
            this.totalCount = totalCount;
            this.photos = photos;
        }

        public static final int CONSTRUCTOR = -1425984405;

        @Override
        public int getConstructor() {
            return -1425984405;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserProfilePhotos").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("totalCount").append(" = ").append(totalCount).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photos").append(" = ").append("Photo[]").append(" {").append(Arrays.toString(photos));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public abstract static class UserStatus extends TLObject {
    }

    public static class UserStatusEmpty extends UserStatus {

        public UserStatusEmpty() {
        }

        public static final int CONSTRUCTOR = 164646985;

        @Override
        public int getConstructor() {
            return 164646985;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusEmpty").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserStatusOnline extends UserStatus {
        public int expires;

        public UserStatusOnline() {
        }

        public UserStatusOnline(int expires) {
            this.expires = expires;
        }

        public static final int CONSTRUCTOR = -306628279;

        @Override
        public int getConstructor() {
            return -306628279;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusOnline").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("expires").append(" = ").append(expires).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserStatusOffline extends UserStatus {
        public int wasOnline;

        public UserStatusOffline() {
        }

        public UserStatusOffline(int wasOnline) {
            this.wasOnline = wasOnline;
        }

        public static final int CONSTRUCTOR = 9203775;

        @Override
        public int getConstructor() {
            return 9203775;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusOffline").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("wasOnline").append(" = ").append(wasOnline).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserStatusRecently extends UserStatus {

        public UserStatusRecently() {
        }

        public static final int CONSTRUCTOR = -496024847;

        @Override
        public int getConstructor() {
            return -496024847;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusRecently").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserStatusLastWeek extends UserStatus {

        public UserStatusLastWeek() {
        }

        public static final int CONSTRUCTOR = 129960444;

        @Override
        public int getConstructor() {
            return 129960444;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusLastWeek").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UserStatusLastMonth extends UserStatus {

        public UserStatusLastMonth() {
        }

        public static final int CONSTRUCTOR = 2011940674;

        @Override
        public int getConstructor() {
            return 2011940674;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UserStatusLastMonth").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class Video extends TLObject {
        public int duration;
        public PhotoSize thumb;
        public int width;
        public int height;
        public File video;

        public Video() {
        }

        public Video(int duration, PhotoSize thumb, int width, int height, File video) {
            this.duration = duration;
            this.thumb = thumb;
            this.width = width;
            this.height = height;
            this.video = video;
        }

        public static final int CONSTRUCTOR = 481641164;

        @Override
        public int getConstructor() {
            return 481641164;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("Video").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("duration").append(" = ").append(duration).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("thumb").append(" = "); thumb.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("width").append(" = ").append(width).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("height").append(" = ").append(height).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("video").append(" = "); video.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class WebPage extends TLObject {
        public String url;
        public String displayUrl;
        public String type;
        public String siteName;
        public String title;
        public String description;
        public Photo photo;
        public String embedUrl;
        public String embedType;
        public int embedWidth;
        public int embedHeight;
        public int duration;
        public String author;

        public WebPage() {
        }

        public WebPage(String url, String displayUrl, String type, String siteName, String title, String description, Photo photo, String embedUrl, String embedType, int embedWidth, int embedHeight, int duration, String author) {
            this.url = url;
            this.displayUrl = displayUrl;
            this.type = type;
            this.siteName = siteName;
            this.title = title;
            this.description = description;
            this.photo = photo;
            this.embedUrl = embedUrl;
            this.embedType = embedType;
            this.embedWidth = embedWidth;
            this.embedHeight = embedHeight;
            this.duration = duration;
            this.author = author;
        }

        public static final int CONSTRUCTOR = -38536859;

        @Override
        public int getConstructor() {
            return -38536859;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("WebPage").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("url").append(" = ").append(url).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("displayUrl").append(" = ").append(displayUrl).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("type").append(" = ").append(type).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("siteName").append(" = ").append(siteName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("description").append(" = ").append(description).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("photo").append(" = "); photo.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("embedUrl").append(" = ").append(embedUrl).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("embedType").append(" = ").append(embedType).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("embedWidth").append(" = ").append(embedWidth).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("embedHeight").append(" = ").append(embedHeight).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("duration").append(" = ").append(duration).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("author").append(" = ").append(author).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestBytes extends TLObject {
        public byte[] value;

        public TestBytes() {
        }

        public TestBytes(byte[] value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 667099484;

        @Override
        public int getConstructor() {
            return 667099484;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestBytes").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append("bytes { "); { for (byte k : value) { int b = (int)k & 255; s.append(HEX_CHARACTERS[b >> 4]).append(HEX_CHARACTERS[b & 15]).append(' '); } } s.append("}\n");
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestEmpty extends TLObject {

        public TestEmpty() {
        }

        public static final int CONSTRUCTOR = 1453429851;

        @Override
        public int getConstructor() {
            return 1453429851;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestEmpty").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestInt extends TLObject {
        public int value;

        public TestInt() {
        }

        public TestInt(int value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 1472758404;

        @Override
        public int getConstructor() {
            return 1472758404;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestInt").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append(value).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestString extends TLObject {
        public String value;

        public TestString() {
        }

        public TestString(String value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = -705221530;

        @Override
        public int getConstructor() {
            return -705221530;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestString").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append(value).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestVectorInt extends TLObject {
        public int[] value;

        public TestVectorInt() {
        }

        public TestVectorInt(int[] value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = -278984267;

        @Override
        public int getConstructor() {
            return -278984267;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestVectorInt").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append("int[]").append(" {").append(Arrays.toString(value));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestVectorIntObject extends TLObject {
        public TestInt[] value;

        public TestVectorIntObject() {
        }

        public TestVectorIntObject(TestInt[] value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 1915770327;

        @Override
        public int getConstructor() {
            return 1915770327;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestVectorIntObject").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append("TestInt[]").append(" {").append(Arrays.toString(value));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestVectorString extends TLObject {
        public String[] value;

        public TestVectorString() {
        }

        public TestVectorString(String[] value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = 1800468445;

        @Override
        public int getConstructor() {
            return 1800468445;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestVectorString").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append("String[]").append(" {").append(Arrays.toString(value));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestVectorStringObject extends TLObject {
        public TestString[] value;

        public TestVectorStringObject() {
        }

        public TestVectorStringObject(TestString[] value) {
            this.value = value;
        }

        public static final int CONSTRUCTOR = -1261798902;

        @Override
        public int getConstructor() {
            return -1261798902;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestVectorStringObject").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = ").append("TestString[]").append(" {").append(Arrays.toString(value));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class AddChatParticipant extends TLFunction {
        public long chatId;
        public int userId;
        public int forwardLimit;

        public AddChatParticipant() {
        }

        public AddChatParticipant(long chatId, int userId, int forwardLimit) {
            this.chatId = chatId;
            this.userId = userId;
            this.forwardLimit = forwardLimit;
        }

        public static final int CONSTRUCTOR = 572126454;

        @Override
        public int getConstructor() {
            return 572126454;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("AddChatParticipant").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("forwardLimit").append(" = ").append(forwardLimit).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class BlockUser extends TLFunction {
        public int userId;

        public BlockUser() {
        }

        public BlockUser(int userId) {
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = -200788058;

        @Override
        public int getConstructor() {
            return -200788058;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("BlockUser").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class CancelDownloadFile extends TLFunction {
        public int fileId;

        public CancelDownloadFile() {
        }

        public CancelDownloadFile(int fileId) {
            this.fileId = fileId;
        }

        public static final int CONSTRUCTOR = 18489866;

        @Override
        public int getConstructor() {
            return 18489866;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("CancelDownloadFile").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fileId").append(" = ").append(fileId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ChangeChatTitle extends TLFunction {
        public long chatId;
        public String title;

        public ChangeChatTitle() {
        }

        public ChangeChatTitle(long chatId, String title) {
            this.chatId = chatId;
            this.title = title;
        }

        public static final int CONSTRUCTOR = -503002783;

        @Override
        public int getConstructor() {
            return -503002783;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ChangeChatTitle").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class CheckAuthPassword extends TLFunction {
        public String password;

        public CheckAuthPassword() {
        }

        public CheckAuthPassword(String password) {
            this.password = password;
        }

        public static final int CONSTRUCTOR = -1138590405;

        @Override
        public int getConstructor() {
            return -1138590405;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("CheckAuthPassword").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("password").append(" = ").append(password).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class CreateGroupChat extends TLFunction {
        public int[] participantIds;
        public String title;

        public CreateGroupChat() {
        }

        public CreateGroupChat(int[] participantIds, String title) {
            this.participantIds = participantIds;
            this.title = title;
        }

        public static final int CONSTRUCTOR = -586035961;

        @Override
        public int getConstructor() {
            return -586035961;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("CreateGroupChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("participantIds").append(" = ").append("int[]").append(" {").append(Arrays.toString(participantIds));
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("title").append(" = ").append(title).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class CreatePrivateChat extends TLFunction {
        public int userId;

        public CreatePrivateChat() {
        }

        public CreatePrivateChat(int userId) {
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = 1204324690;

        @Override
        public int getConstructor() {
            return 1204324690;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("CreatePrivateChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class DeleteChatHistory extends TLFunction {
        public long chatId;

        public DeleteChatHistory() {
        }

        public DeleteChatHistory(long chatId) {
            this.chatId = chatId;
        }

        public static final int CONSTRUCTOR = -1065852609;

        @Override
        public int getConstructor() {
            return -1065852609;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("DeleteChatHistory").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class DeleteChatParticipant extends TLFunction {
        public long chatId;
        public int userId;

        public DeleteChatParticipant() {
        }

        public DeleteChatParticipant(long chatId, int userId) {
            this.chatId = chatId;
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = -1090865113;

        @Override
        public int getConstructor() {
            return -1090865113;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("DeleteChatParticipant").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class DeleteMessages extends TLFunction {
        public long chatId;
        public int[] messageIds;

        public DeleteMessages() {
        }

        public DeleteMessages(long chatId, int[] messageIds) {
            this.chatId = chatId;
            this.messageIds = messageIds;
        }

        public static final int CONSTRUCTOR = 1789583863;

        @Override
        public int getConstructor() {
            return 1789583863;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("DeleteMessages").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageIds").append(" = ").append("int[]").append(" {").append(Arrays.toString(messageIds));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class DownloadFile extends TLFunction {
        public int fileId;

        public DownloadFile() {
        }

        public DownloadFile(int fileId) {
            this.fileId = fileId;
        }

        public static final int CONSTRUCTOR = 888468545;

        @Override
        public int getConstructor() {
            return 888468545;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("DownloadFile").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fileId").append(" = ").append(fileId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ForwardMessages extends TLFunction {
        public long chatId;
        public long fromChatId;
        public int[] messageIds;

        public ForwardMessages() {
        }

        public ForwardMessages(long chatId, long fromChatId, int[] messageIds) {
            this.chatId = chatId;
            this.fromChatId = fromChatId;
            this.messageIds = messageIds;
        }

        public static final int CONSTRUCTOR = 489073125;

        @Override
        public int getConstructor() {
            return 489073125;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ForwardMessages").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fromChatId").append(" = ").append(fromChatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageIds").append(" = ").append("int[]").append(" {").append(Arrays.toString(messageIds));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetAuthState extends TLFunction {

        public GetAuthState() {
        }

        public static final int CONSTRUCTOR = 1193342487;

        @Override
        public int getConstructor() {
            return 1193342487;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetAuthState").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetChat extends TLFunction {
        public long chatId;

        public GetChat() {
        }

        public GetChat(long chatId) {
            this.chatId = chatId;
        }

        public static final int CONSTRUCTOR = -1645526841;

        @Override
        public int getConstructor() {
            return -1645526841;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetChatHistory extends TLFunction {
        public long chatId;
        public int fromId;
        public int offset;
        public int limit;

        public GetChatHistory() {
        }

        public GetChatHistory(long chatId, int fromId, int offset, int limit) {
            this.chatId = chatId;
            this.fromId = fromId;
            this.offset = offset;
            this.limit = limit;
        }

        public static final int CONSTRUCTOR = 1089149649;

        @Override
        public int getConstructor() {
            return 1089149649;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetChatHistory").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fromId").append(" = ").append(fromId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("offset").append(" = ").append(offset).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("limit").append(" = ").append(limit).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetChats extends TLFunction {
        public int offset;
        public int limit;

        public GetChats() {
        }

        public GetChats(int offset, int limit) {
            this.offset = offset;
            this.limit = limit;
        }

        public static final int CONSTRUCTOR = -446917367;

        @Override
        public int getConstructor() {
            return -446917367;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetChats").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("offset").append(" = ").append(offset).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("limit").append(" = ").append(limit).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetContacts extends TLFunction {

        public GetContacts() {
        }

        public static final int CONSTRUCTOR = 854387241;

        @Override
        public int getConstructor() {
            return 854387241;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetContacts").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetFile extends TLFunction {
        public int fileId;

        public GetFile() {
        }

        public GetFile(int fileId) {
            this.fileId = fileId;
        }

        public static final int CONSTRUCTOR = -225569621;

        @Override
        public int getConstructor() {
            return -225569621;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetFile").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("fileId").append(" = ").append(fileId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetGroupChat extends TLFunction {
        public int groupChatId;

        public GetGroupChat() {
        }

        public GetGroupChat(int groupChatId) {
            this.groupChatId = groupChatId;
        }

        public static final int CONSTRUCTOR = 752932470;

        @Override
        public int getConstructor() {
            return 752932470;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetGroupChat").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("groupChatId").append(" = ").append(groupChatId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetGroupChatFull extends TLFunction {
        public int groupChatId;

        public GetGroupChatFull() {
        }

        public GetGroupChatFull(int groupChatId) {
            this.groupChatId = groupChatId;
        }

        public static final int CONSTRUCTOR = 1598493541;

        @Override
        public int getConstructor() {
            return 1598493541;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetGroupChatFull").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("groupChatId").append(" = ").append(groupChatId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetMe extends TLFunction {

        public GetMe() {
        }

        public static final int CONSTRUCTOR = -191516033;

        @Override
        public int getConstructor() {
            return -191516033;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetMe").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetMessage extends TLFunction {
        public long chatId;
        public int messageId;

        public GetMessage() {
        }

        public GetMessage(long chatId, int messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        public static final int CONSTRUCTOR = -1209218520;

        @Override
        public int getConstructor() {
            return -1209218520;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetMessage").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("messageId").append(" = ").append(messageId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetNotificationSettings extends TLFunction {
        public NotificationSettingsScope scope;

        public GetNotificationSettings() {
        }

        public GetNotificationSettings(NotificationSettingsScope scope) {
            this.scope = scope;
        }

        public static final int CONSTRUCTOR = 907144391;

        @Override
        public int getConstructor() {
            return 907144391;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetNotificationSettings").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("scope").append(" = "); scope.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetOption extends TLFunction {
        public String name;

        public GetOption() {
        }

        public GetOption(String name) {
            this.name = name;
        }

        public static final int CONSTRUCTOR = -1572495746;

        @Override
        public int getConstructor() {
            return -1572495746;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetOption").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("name").append(" = ").append(name).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetStickers extends TLFunction {
        public String emoji;

        public GetStickers() {
        }

        public GetStickers(String emoji) {
            this.emoji = emoji;
        }

        public static final int CONSTRUCTOR = 1712531528;

        @Override
        public int getConstructor() {
            return 1712531528;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetStickers").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("emoji").append(" = ").append(emoji).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetUser extends TLFunction {
        public int userId;

        public GetUser() {
        }

        public GetUser(int userId) {
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = -501534519;

        @Override
        public int getConstructor() {
            return -501534519;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetUser").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetUserFull extends TLFunction {
        public int userId;

        public GetUserFull() {
        }

        public GetUserFull(int userId) {
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = -1977480168;

        @Override
        public int getConstructor() {
            return -1977480168;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetUserFull").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class GetUserProfilePhotos extends TLFunction {
        public int userId;
        public int offset;
        public int limit;

        public GetUserProfilePhotos() {
        }

        public GetUserProfilePhotos(int userId, int offset, int limit) {
            this.userId = userId;
            this.offset = offset;
            this.limit = limit;
        }

        public static final int CONSTRUCTOR = 1810450184;

        @Override
        public int getConstructor() {
            return 1810450184;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("GetUserProfilePhotos").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("offset").append(" = ").append(offset).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("limit").append(" = ").append(limit).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class RecoverAuthPassword extends TLFunction {
        public String recoverCode;

        public RecoverAuthPassword() {
        }

        public RecoverAuthPassword(String recoverCode) {
            this.recoverCode = recoverCode;
        }

        public static final int CONSTRUCTOR = 130965839;

        @Override
        public int getConstructor() {
            return 130965839;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("RecoverAuthPassword").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("recoverCode").append(" = ").append(recoverCode).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class RequestAuthPasswordRecovery extends TLFunction {

        public RequestAuthPasswordRecovery() {
        }

        public static final int CONSTRUCTOR = -1561685090;

        @Override
        public int getConstructor() {
            return -1561685090;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("RequestAuthPasswordRecovery").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class ResetAuth extends TLFunction {
        public boolean force;

        public ResetAuth() {
        }

        public ResetAuth(boolean force) {
            this.force = force;
        }

        public static final int CONSTRUCTOR = -78661379;

        @Override
        public int getConstructor() {
            return -78661379;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("ResetAuth").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("force").append(" = ").append(force).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendChatAction extends TLFunction {
        public long chatId;
        public SendMessageAction action;

        public SendChatAction() {
        }

        public SendChatAction(long chatId, SendMessageAction action) {
            this.chatId = chatId;
            this.action = action;
        }

        public static final int CONSTRUCTOR = 346586363;

        @Override
        public int getConstructor() {
            return 346586363;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendChatAction").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("action").append(" = "); action.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SendMessage extends TLFunction {
        public long chatId;
        public int replyToMessageId;
        public boolean disableWebPagePreview;
        public ReplyMarkup replyMarkup;
        public InputMessageContent message;

        public SendMessage() {
        }

        public SendMessage(long chatId, int replyToMessageId, boolean disableWebPagePreview, ReplyMarkup replyMarkup, InputMessageContent message) {
            this.chatId = chatId;
            this.replyToMessageId = replyToMessageId;
            this.disableWebPagePreview = disableWebPagePreview;
            this.replyMarkup = replyMarkup;
            this.message = message;
        }

        public static final int CONSTRUCTOR = 1724012230;

        @Override
        public int getConstructor() {
            return 1724012230;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SendMessage").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("chatId").append(" = ").append(chatId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("replyToMessageId").append(" = ").append(replyToMessageId).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("disableWebPagePreview").append(" = ").append(disableWebPagePreview).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("replyMarkup").append(" = "); replyMarkup.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("message").append(" = "); message.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetAuthBotToken extends TLFunction {
        public String token;

        public SetAuthBotToken() {
        }

        public SetAuthBotToken(String token) {
            this.token = token;
        }

        public static final int CONSTRUCTOR = 746751619;

        @Override
        public int getConstructor() {
            return 746751619;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetAuthBotToken").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("token").append(" = ").append(token).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetAuthCode extends TLFunction {
        public String code;

        public SetAuthCode() {
        }

        public SetAuthCode(String code) {
            this.code = code;
        }

        public static final int CONSTRUCTOR = -1819184790;

        @Override
        public int getConstructor() {
            return -1819184790;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetAuthCode").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("code").append(" = ").append(code).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetAuthName extends TLFunction {
        public String firstName;
        public String lastName;

        public SetAuthName() {
        }

        public SetAuthName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public static final int CONSTRUCTOR = 2074658130;

        @Override
        public int getConstructor() {
            return 2074658130;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetAuthName").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("firstName").append(" = ").append(firstName).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("lastName").append(" = ").append(lastName).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetAuthPhoneNumber extends TLFunction {
        public String phoneNumber;

        public SetAuthPhoneNumber() {
        }

        public SetAuthPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public static final int CONSTRUCTOR = 1502564090;

        @Override
        public int getConstructor() {
            return 1502564090;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetAuthPhoneNumber").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("phoneNumber").append(" = ").append(phoneNumber).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetNotificationSettings extends TLFunction {
        public NotificationSettingsScope scope;
        public NotificationSettings notificationSettings;

        public SetNotificationSettings() {
        }

        public SetNotificationSettings(NotificationSettingsScope scope, NotificationSettings notificationSettings) {
            this.scope = scope;
            this.notificationSettings = notificationSettings;
        }

        public static final int CONSTRUCTOR = -134430483;

        @Override
        public int getConstructor() {
            return -134430483;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetNotificationSettings").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("scope").append(" = "); scope.toStringBuilder(shift, s);
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("notificationSettings").append(" = "); notificationSettings.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class SetOption extends TLFunction {
        public String name;
        public OptionValue value;

        public SetOption() {
        }

        public SetOption(String name, OptionValue value) {
            this.name = name;
            this.value = value;
        }

        public static final int CONSTRUCTOR = 2114670322;

        @Override
        public int getConstructor() {
            return 2114670322;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("SetOption").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("name").append(" = ").append(name).append('\n');
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("value").append(" = "); value.toStringBuilder(shift, s);
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallBytes extends TLFunction {
        public byte[] x;

        public TestCallBytes() {
        }

        public TestCallBytes(byte[] x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = -372062627;

        @Override
        public int getConstructor() {
            return -372062627;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallBytes").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append("bytes { "); { for (byte k : x) { int b = (int)k & 255; s.append(HEX_CHARACTERS[b >> 4]).append(HEX_CHARACTERS[b & 15]).append(' '); } } s.append("}\n");
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallEmpty extends TLFunction {

        public TestCallEmpty() {
        }

        public static final int CONSTRUCTOR = 482209969;

        @Override
        public int getConstructor() {
            return 482209969;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallEmpty").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallString extends TLFunction {
        public String x;

        public TestCallString() {
        }

        public TestCallString(String x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = -1706148074;

        @Override
        public int getConstructor() {
            return -1706148074;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallString").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append(x).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallVectorInt extends TLFunction {
        public int[] x;

        public TestCallVectorInt() {
        }

        public TestCallVectorInt(int[] x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = 1339160226;

        @Override
        public int getConstructor() {
            return 1339160226;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallVectorInt").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append("int[]").append(" {").append(Arrays.toString(x));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallVectorIntObject extends TLFunction {
        public TestInt[] x;

        public TestCallVectorIntObject() {
        }

        public TestCallVectorIntObject(TestInt[] x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = -918272776;

        @Override
        public int getConstructor() {
            return -918272776;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallVectorIntObject").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append("TestInt[]").append(" {").append(Arrays.toString(x));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallVectorString extends TLFunction {
        public String[] x;

        public TestCallVectorString() {
        }

        public TestCallVectorString(String[] x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = 1331730807;

        @Override
        public int getConstructor() {
            return 1331730807;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallVectorString").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append("String[]").append(" {").append(Arrays.toString(x));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestCallVectorStringObject extends TLFunction {
        public TestString[] x;

        public TestCallVectorStringObject() {
        }

        public TestCallVectorStringObject(TestString[] x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = 178414472;

        @Override
        public int getConstructor() {
            return 178414472;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestCallVectorStringObject").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append("TestString[]").append(" {").append(Arrays.toString(x));
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestSquareInt extends TLFunction {
        public int x;

        public TestSquareInt() {
        }

        public TestSquareInt(int x) {
            this.x = x;
        }

        public static final int CONSTRUCTOR = -924631417;

        @Override
        public int getConstructor() {
            return -924631417;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestSquareInt").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("x").append(" = ").append(x).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class TestTestNet extends TLFunction {

        public TestTestNet() {
        }

        public static final int CONSTRUCTOR = -1597860997;

        @Override
        public int getConstructor() {
            return -1597860997;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("TestTestNet").append(" {\n");
            shift += 2;
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

    public static class UnblockUser extends TLFunction {
        public int userId;

        public UnblockUser() {
        }

        public UnblockUser(int userId) {
            this.userId = userId;
        }

        public static final int CONSTRUCTOR = -50809642;

        @Override
        public int getConstructor() {
            return -50809642;
        }

        @Override
        protected void toStringBuilder(int shift, StringBuilder s) {
            s.append("UnblockUser").append(" {\n");
            shift += 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("userId").append(" = ").append(userId).append('\n');
            shift -= 2;
            for (int i = 0; i < shift; i++) { s.append(' '); } s.append("}\n");
        }
    }

}
