package fun.taoguan.online.edu.service.impl;

import fun.taoguan.online.edu.entity.Article;
import fun.taoguan.online.edu.mapper.ArticleMapper;
import fun.taoguan.online.edu.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章信息表 服务实现类
 * </p>
 *
 * @author GuanTao
 * @since 2020-09-20
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
