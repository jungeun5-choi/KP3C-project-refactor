package com.example.kp3coutsourcingproject.post.dto;

import com.example.kp3coutsourcingproject.common.dto.ApiResponseDto;
import com.example.kp3coutsourcingproject.common.file.Post_Image;
import com.example.kp3coutsourcingproject.post.entity.Post;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto extends ApiResponseDto {
	private Long id;
	private String username;
	private String nickname;
	private String content;
	private LocalDateTime createdAt;

	private List<Post_Image> imageUrlList;

	private List<PostResponseDto> children;

	public PostResponseDto(Post post) {
		this.id = post.getId();
		this.username=post.getUser().getUsername();
		this.nickname = post.getUser().getNickname();
		this.content = post.getContent();
		this.createdAt = post.getCreatedAt();
		this.imageUrlList = post.getImagetList();
		this.children = post.getChildren()
				.stream()
				.map(PostResponseDto::new)
				.collect(Collectors.toList());
	}
}
