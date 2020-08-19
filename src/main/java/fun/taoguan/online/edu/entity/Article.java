package fun.taoguan.online.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章信息表
 * </p>
 *
 * @author GuanTao
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("edu_article")
@ApiModel(value="Article对象", description="文章信息表")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章ID")
    @TableId(value = "ARTICLE_ID", type = IdType.AUTO)
    private Integer articleId;

    @ApiModelProperty(value = "文章标题")
    @TableField("TITLE")
    private String title;

    @ApiModelProperty(value = "文章摘要")
    @TableField("SUMMARY")
    private String summary;

    @ApiModelProperty(value = "文章关键字")
    @TableField("KEY_WORD")
    private String keyWord;

    @ApiModelProperty(value = "文章图片URL")
    @TableField("IMAGE_URL")
    private String imageUrl;

    @ApiModelProperty(value = "文章来源")
    @TableField("SOURCE")
    private String source;

    @ApiModelProperty(value = "文章作者")
    @TableField("AUTHOR")
    private String author;

    @ApiModelProperty(value = "文章创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "文章发布时间")
    @TableField("PUBLISH_TIME")
    private LocalDateTime publishTime;

    @ApiModelProperty(value = "文章访问链接")
    @TableField("LINK")
    private String link;

    @ApiModelProperty(value = "文章类型 2文章")
    @TableField("ARTICLE_TYPE")
    private Integer articleType;

    @ApiModelProperty(value = "文章点击量")
    @TableField("CLICK_NUM")
    private Integer clickNum;

    @ApiModelProperty(value = "点赞数量")
    @TableField("PRAISE_COUNT")
    private Integer praiseCount;

    @ApiModelProperty(value = "评论数")
    @TableField("COMMENT_NUM")
    private Integer commentNum;

    @ApiModelProperty(value = "排序值")
    @TableField("SORT")
    private Integer sort;


}
