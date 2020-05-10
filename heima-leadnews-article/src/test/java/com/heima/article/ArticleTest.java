package com.heima.article;

import com.heima.article.ArticleJarApplication;
import com.heima.article.service.AppArticleService;
import com.heima.common.article.constans.ArticleConstans;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.pojos.ApUser;
import com.heima.utils.threadlocal.AppThreadLocalUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试文章列表相关接口
 */
@SpringBootTest(classes = ArticleJarApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleTest {

    @Autowired
    private AppArticleService appArticleService;

    /**
     * 测试load
     */
    @Test
    public void testLoad() {
        ApUser apUser = new ApUser();
        apUser.setId(1l);
        AppThreadLocalUtils.setUser(apUser);
        ArticleHomeDto dto = new ArticleHomeDto();
        ResponseResult data = appArticleService.load( ArticleConstans.LOADTYPE_LOAD_MORE, dto);
        System.out.println(data.getData());
    }

}