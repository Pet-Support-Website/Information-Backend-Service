package seniorproject.article.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagArticleDto {
    Long id;
    String title;
    String source;
    String content;
    String imgUrl;
}
