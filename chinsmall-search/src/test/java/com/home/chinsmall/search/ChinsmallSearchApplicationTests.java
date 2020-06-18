package com.home.chinsmall.search;

import com.home.chinsmall.search.config.ElasticsearchConfig;
import java.io.IOException;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChinsmallSearchApplicationTests {

  @Autowired
  private RestHighLevelClient client;

  @Test
  void contextLoads() throws IOException {
    // 测试存储数据
    IndexRequest request = new IndexRequest("users");
    request.id("1");
    request.source("username", "zhangsan", "age", "18", "gender", "male");

    IndexResponse response = client.index(request, ElasticsearchConfig.COMMON_OPTIONS);
    System.out.println(response);
  }

  @Data
  class User {

    private String username;
    private int age;
    private String gender;
  }

  @Test
  public void search() throws IOException {
    SearchRequest request = new SearchRequest();
    // 索引（这是不定参数，可以设置多个索引）
    request.indices("users");
    // 检索条件
    SearchSourceBuilder builder = new SearchSourceBuilder();
    builder.query(QueryBuilders.matchQuery("username", "zhangsan"));
    TermsAggregationBuilder aggregationBuilder = AggregationBuilders.terms("ageAgg").field("age").size(10);
    builder.aggregation(aggregationBuilder);
    request.source(builder);
    // 执行
    SearchResponse response = client.search(request, ElasticsearchConfig.COMMON_OPTIONS);
    System.out.println(response);
  }
}
