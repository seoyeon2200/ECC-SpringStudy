import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.web.bind.annotation.PostMapping;

public class ArticleController {
    private ArticleRepository articleRepository;

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString()); //폼 데이터를 DTO로 받기
        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        // 2. 리파지터리로 엔티티를 dB에 저장
        Ariticle saved = articleRepository.save(article);
        return ""; //DTO에 폼 데이터가 잘 담겼는지 확인
    }

    public Article(Long id. String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }


}
