package com.heima.article.service;

import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;

public interface AppArticleService {

    /**
     *
     * @param type 1 加载更多  2 加载更新
     * @param dto 封装数据
     * @return 数据列表
     */
    public ResponseResult load(Short type, ArticleHomeDto dto);
}