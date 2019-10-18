package com.tora;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

public class ResourceUtils {

    public static String getPath(String resource) {
        try {
            if (resource.startsWith("/")) {
                return URLDecoder.decode(ResourceUtils.class.getResource(resource).getPath(), "UTF-8");
            } else {
                return URLDecoder.decode(ResourceUtils.class.getClassLoader().getResource(resource).getPath(), "UTF-8");
            }
        } catch (NullPointerException | UnsupportedEncodingException e) {
            throw new RuntimeException("File not found: " + resource, e);
        }
    }

    public static URI getURI(String resource) {
        try {
            if (resource.startsWith("/")) {
                return ResourceUtils.class.getResource(resource).toURI();
            } else {
                return ResourceUtils.class.getClassLoader().getResource(resource).toURI();
            }
        } catch (NullPointerException | URISyntaxException e) {
            throw new RuntimeException("File not found: " + resource, e);
        }
    }
}