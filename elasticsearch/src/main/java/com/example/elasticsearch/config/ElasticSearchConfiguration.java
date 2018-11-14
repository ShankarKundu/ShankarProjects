package com.example.elasticsearch.config;

import brave.sampler.Sampler;
import com.example.elasticsearch.domain.Book;
import lombok.extern.slf4j.Slf4j;

import org.elasticsearch.client.Client;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
@Slf4j
@EnableElasticsearchRepositories(basePackages="com.exampl.elasticsearch.config")
@EnableCaching
public class ElasticSearchConfiguration  {

    @Autowired
    private Environment environment;
    private TransportClient client = null;


    @Bean
    public ElasticsearchTemplate elasticsearchTemplate(){
        ElasticsearchTemplate esTemplate = new ElasticsearchTemplate(client());
        esTemplate.createIndex(Book.class);
        esTemplate.putMapping(Book.class);
        esTemplate.refresh(Book.class);
        return  esTemplate;
    }

    private Client client() {

        try {
            Settings settings = Settings.builder()
                    .put("cluster.name", environment.getProperty("es.cluster-name"))
                    .put("node.name", environment.getProperty("es.node-name"))
                    .put("client.transport.sniff", environment.getProperty("es.transport-sniff"))
                    .put("http.enabled", environment.getProperty("es.http-enabled"))
                    .build();

            client = new PreBuiltTransportClient(settings);
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(environment.getProperty("es.host")),
                    Integer.parseInt(environment.getProperty("es.port"))));
        } catch (UnknownHostException e) {
            log.error("Exception occurred while getting Client : {}", e);
        }
        return client;
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
