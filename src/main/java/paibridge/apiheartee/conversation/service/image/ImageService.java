package paibridge.apiheartee.conversation.service.image;

import com.google.cloud.vision.v1.EntityAnnotation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import paibridge.apiheartee.conversation.service.image.dto.ChatDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageUploader imageUploader;
    private final ImageTextExtractor imageTextExtractor;
    private final TextFormatter textFormatter;

    public String uploadImage(MultipartFile image) throws IOException {
        String uploadedUrl = imageUploader.uploadImage(image);

        return uploadedUrl;
    }

    public ArrayList<ChatDto> extractChatsFromImage(MultipartFile image) throws IOException{
        // 이미지가 여러 개 들어가는 경우를 고려하여 작성할 것
        ArrayList<List<EntityAnnotation>> textList = imageTextExtractor.extractTextListFromImage(image);

        ArrayList<ChatDto> chats = textFormatter.formatAnnotationsToChat(textList);

        return chats;
    }
}