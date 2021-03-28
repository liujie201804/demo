//package com.example.demo.mybatisPlus.controller;
//
//import org.elasticsearch.action.search.SearchRequest;
//import org.elasticsearch.action.search.SearchResponse;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.index.query.MatchQueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.SearchHit;
//import org.elasticsearch.search.aggregations.AggregationBuilders;
//import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
//import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author jieliu
// */
//@RestController
//@RequestMapping("/search")
//public class EsController {
//
//    @Resource
//    private RestHighLevelClient client;
//
//
//    @RequestMapping("/test")
//    void contextLoads() throws IOException {
//        //1、创建查询请求，规定查询的索引
//        SearchRequest request = new SearchRequest("bank");
//        //2、创建条件构造
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        //3、构造条件
//        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("address", "Lane");
//        builder.query(matchQueryBuilder);
//        //聚合年龄分布
//        TermsAggregationBuilder ageAgg = AggregationBuilders.terms("ageAgg").field("age");
//        builder.aggregation(ageAgg);
//
//        //聚合平均年龄
//        AvgAggregationBuilder balanceAvg = AggregationBuilders.avg("balanceAvg").field("balance");
//        builder.aggregation(balanceAvg);
//
//
//        //4、将构造好的条件放入请求中
//        request.source(builder);
//
//        //5、开始执行发送request请求
//        SearchResponse searchResponse = client.search(request, RequestOptions.DEFAULT);
//
//        //6、开始处理返回的数据
//        SearchHit[] hits = searchResponse.getHits().getHits();
//        List<String> list = new ArrayList<String>();
//        for (SearchHit hit : hits) {
//            String hitString = hit.getSourceAsString();
//            System.out.println(hitString);
//            list.add(hitString);
//        }
//
//    }
//}
