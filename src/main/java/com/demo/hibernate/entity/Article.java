package com.demo.hibernate.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/6
 * @Description:
 * @CodeReviewer:
 */
@Entity
public class Article {
    private String id;

    @Id
    @javax.persistence.Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String createUserId;

    @Basic
    @javax.persistence.Column(name = "create_user_id")
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    private Timestamp createdAt;

    @Basic
    @javax.persistence.Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Integer orderNum;

    @Basic
    @javax.persistence.Column(name = "order_num")
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    private Timestamp postAt;

    @Basic
    @javax.persistence.Column(name = "post_at")
    public Timestamp getPostAt() {
        return postAt;
    }

    public void setPostAt(Timestamp postAt) {
        this.postAt = postAt;
    }

    private String recommendFlag;

    @Basic
    @javax.persistence.Column(name = "recommend_flag")
    public String getRecommendFlag() {
        return recommendFlag;
    }

    public void setRecommendFlag(String recommendFlag) {
        this.recommendFlag = recommendFlag;
    }

    private String seoDescription;

    @Basic
    @javax.persistence.Column(name = "seo_description")
    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    private String seoKeywords;

    @Basic
    @javax.persistence.Column(name = "seo_keywords")
    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String updateUserId;

    @Basic
    @javax.persistence.Column(name = "update_user_id")
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    private Timestamp updatedAt;

    @Basic
    @javax.persistence.Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Integer ver;

    @Basic
    @javax.persistence.Column(name = "ver")
    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    private String category;

    @Basic
    @javax.persistence.Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String titlePic;

    @Basic
    @javax.persistence.Column(name = "title_pic")
    public String getTitlePic() {
        return titlePic;
    }

    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic;
    }

    private String content;

    @Basic
    @javax.persistence.Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private Integer visits;

    @Basic
    @javax.persistence.Column(name = "visits")
    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    private Integer isInformation;

    @Basic
    @javax.persistence.Column(name = "is_information")
    public Integer getIsInformation() {
        return isInformation;
    }

    public void setIsInformation(Integer isInformation) {
        this.isInformation = isInformation;
    }

    private String articleSource;

    @Basic
    @javax.persistence.Column(name = "article_source")
    public String getArticleSource() {
        return articleSource;
    }

    public void setArticleSource(String articleSource) {
        this.articleSource = articleSource;
    }

    private String editor;

    @Basic
    @javax.persistence.Column(name = "editor")
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    private String specialTopic;

    @Basic
    @javax.persistence.Column(name = "special_topic")
    public String getSpecialTopic() {
        return specialTopic;
    }

    public void setSpecialTopic(String specialTopic) {
        this.specialTopic = specialTopic;
    }

    private String externalUrl;

    @Basic
    @javax.persistence.Column(name = "external_url")
    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    private String tag;

    @Basic
    @javax.persistence.Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    private String contentType;

    @Basic
    @javax.persistence.Column(name = "content_type")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != null ? !id.equals(article.id) : article.id != null) return false;
        if (createUserId != null ? !createUserId.equals(article.createUserId) : article.createUserId != null)
            return false;
        if (createdAt != null ? !createdAt.equals(article.createdAt) : article.createdAt != null) return false;
        if (orderNum != null ? !orderNum.equals(article.orderNum) : article.orderNum != null) return false;
        if (postAt != null ? !postAt.equals(article.postAt) : article.postAt != null) return false;
        if (recommendFlag != null ? !recommendFlag.equals(article.recommendFlag) : article.recommendFlag != null)
            return false;
        if (seoDescription != null ? !seoDescription.equals(article.seoDescription) : article.seoDescription != null)
            return false;
        if (seoKeywords != null ? !seoKeywords.equals(article.seoKeywords) : article.seoKeywords != null) return false;
        if (status != null ? !status.equals(article.status) : article.status != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (updateUserId != null ? !updateUserId.equals(article.updateUserId) : article.updateUserId != null)
            return false;
        if (updatedAt != null ? !updatedAt.equals(article.updatedAt) : article.updatedAt != null) return false;
        if (ver != null ? !ver.equals(article.ver) : article.ver != null) return false;
        if (category != null ? !category.equals(article.category) : article.category != null) return false;
        if (titlePic != null ? !titlePic.equals(article.titlePic) : article.titlePic != null) return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;
        if (visits != null ? !visits.equals(article.visits) : article.visits != null) return false;
        if (isInformation != null ? !isInformation.equals(article.isInformation) : article.isInformation != null)
            return false;
        if (articleSource != null ? !articleSource.equals(article.articleSource) : article.articleSource != null)
            return false;
        if (editor != null ? !editor.equals(article.editor) : article.editor != null) return false;
        if (specialTopic != null ? !specialTopic.equals(article.specialTopic) : article.specialTopic != null)
            return false;
        if (externalUrl != null ? !externalUrl.equals(article.externalUrl) : article.externalUrl != null) return false;
        if (tag != null ? !tag.equals(article.tag) : article.tag != null) return false;
        if (contentType != null ? !contentType.equals(article.contentType) : article.contentType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        result = 31 * result + (postAt != null ? postAt.hashCode() : 0);
        result = 31 * result + (recommendFlag != null ? recommendFlag.hashCode() : 0);
        result = 31 * result + (seoDescription != null ? seoDescription.hashCode() : 0);
        result = 31 * result + (seoKeywords != null ? seoKeywords.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (ver != null ? ver.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (titlePic != null ? titlePic.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (visits != null ? visits.hashCode() : 0);
        result = 31 * result + (isInformation != null ? isInformation.hashCode() : 0);
        result = 31 * result + (articleSource != null ? articleSource.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + (specialTopic != null ? specialTopic.hashCode() : 0);
        result = 31 * result + (externalUrl != null ? externalUrl.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
