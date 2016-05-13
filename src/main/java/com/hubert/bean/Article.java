package com.hubert.bean;

public class Article {
	private String oId;
	//标题
	private String articleTitle;
	//文章标签
	private String articleTags;
	//作者email
	private String articleAuthorEmail;
	//作者id
	private String articleAuthorId;
	//文章内容
	private String articleContent;
	//评论数
	private Integer articleCommentCount;
	//浏览数
	private Integer articleViewCount;
	//点赞数
	private Integer articleGoodCount;
	//创建时间
	private Integer articleCreateTime;
	//修改时间
	private Integer articleUpdateTime;
	//修改类型
	private Integer articleEditType;
	//当前状态
	private Integer articleStatus;
	//文章类型
	private Integer articleType;
	//文章发布时ip
	private String articleIp;
	
	public Article() {
		super();
	}

	public Article(String oId, String articleTitle, String articleTags, String articleAuthorEmail,
			String articleAuthorId, String articleContent, Integer articleCommentCount, Integer articleViewCount,
			Integer articleGoodCount, Integer articleCreateTime, Integer articleUpdateTime, Integer articleEditType,
			Integer articleStatus, Integer articleType, String articleIp) {
		super();
		this.oId = oId;
		this.articleTitle = articleTitle;
		this.articleTags = articleTags;
		this.articleAuthorEmail = articleAuthorEmail;
		this.articleAuthorId = articleAuthorId;
		this.articleContent = articleContent;
		this.articleCommentCount = articleCommentCount;
		this.articleViewCount = articleViewCount;
		this.articleGoodCount = articleGoodCount;
		this.articleCreateTime = articleCreateTime;
		this.articleUpdateTime = articleUpdateTime;
		this.articleEditType = articleEditType;
		this.articleStatus = articleStatus;
		this.articleType = articleType;
		this.articleIp = articleIp;
	}

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleTags() {
		return articleTags;
	}

	public void setArticleTags(String articleTags) {
		this.articleTags = articleTags;
	}

	public String getArticleAuthorEmail() {
		return articleAuthorEmail;
	}

	public void setArticleAuthorEmail(String articleAuthorEmail) {
		this.articleAuthorEmail = articleAuthorEmail;
	}

	public String getArticleAuthorId() {
		return articleAuthorId;
	}

	public void setArticleAuthorId(String articleAuthorId) {
		this.articleAuthorId = articleAuthorId;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Integer getArticleCommentCount() {
		return articleCommentCount;
	}

	public void setArticleCommentCount(Integer articleCommentCount) {
		this.articleCommentCount = articleCommentCount;
	}

	public Integer getArticleViewCount() {
		return articleViewCount;
	}

	public void setArticleViewCount(Integer articleViewCount) {
		this.articleViewCount = articleViewCount;
	}

	public Integer getArticleGoodCount() {
		return articleGoodCount;
	}

	public void setArticleGoodCount(Integer articleGoodCount) {
		this.articleGoodCount = articleGoodCount;
	}

	public Integer getArticleCreateTime() {
		return articleCreateTime;
	}

	public void setArticleCreateTime(Integer articleCreateTime) {
		this.articleCreateTime = articleCreateTime;
	}

	public Integer getArticleUpdateTime() {
		return articleUpdateTime;
	}

	public void setArticleUpdateTime(Integer articleUpdateTime) {
		this.articleUpdateTime = articleUpdateTime;
	}

	public Integer getArticleEditType() {
		return articleEditType;
	}

	public void setArticleEditType(Integer articleEditType) {
		this.articleEditType = articleEditType;
	}

	public Integer getArticleStatus() {
		return articleStatus;
	}

	public void setArticleStatus(Integer articleStatus) {
		this.articleStatus = articleStatus;
	}

	public Integer getArticleType() {
		return articleType;
	}

	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}

	public String getArticleIp() {
		return articleIp;
	}

	public void setArticleIp(String articleIp) {
		this.articleIp = articleIp;
	}

	@Override
	public String toString() {
		return "Article [oId=" + oId + ", articleTitle=" + articleTitle + ", articleTags=" + articleTags
				+ ", articleAuthorEmail=" + articleAuthorEmail + ", articleAuthorId=" + articleAuthorId
				+ ", articleContent=" + articleContent + ", articleCommentCount=" + articleCommentCount
				+ ", articleViewCount=" + articleViewCount + ", articleGoodCount=" + articleGoodCount
				+ ", articleCreateTime=" + articleCreateTime + ", articleUpdateTime=" + articleUpdateTime
				+ ", articleEditType=" + articleEditType + ", articleStatus=" + articleStatus + ", articleType="
				+ articleType + ", articleIp=" + articleIp + "]";
	}
	
}
