package com.example.kp3coutsourcingproject.post.dto;

import com.example.kp3coutsourcingproject.common.file.Post_Image;
import com.example.kp3coutsourcingproject.post.entity.Post;
import lombok.*;

@Setter
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostImageDto {
    Long id;
    String imgUrl;

    public PostImageDto (Post_Image postImage) {
        this.id = postImage.getId();
        this.imgUrl = postImage.getImgUrl();
    }
}
