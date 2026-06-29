package iam_service.service;

import iam_service.model.dto.post.PostDTO;
import iam_service.model.response.IamResponse;
import jakarta.validation.constraints.NotNull;

public interface PostService {
    IamResponse<PostDTO> getById(@NotNull Integer postId);
}
