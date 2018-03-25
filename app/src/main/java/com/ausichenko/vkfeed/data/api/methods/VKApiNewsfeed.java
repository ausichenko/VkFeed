package com.ausichenko.vkfeed.data.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;

public class VKApiNewsfeed extends VKApiBase {

    public VKRequest addBan(VKParameters params) {
        return prepareRequest("addBan", params);
    }

    public VKRequest deleteBan(VKParameters params) {
        return prepareRequest("deleteBan", params);
    }

    public VKRequest deleteList(VKParameters params) {
        return prepareRequest("deleteList", params);
    }

    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }

    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    public VKRequest getLists(VKParameters params) {
        return prepareRequest("getLists", params);
    }

    public VKRequest getMentions(VKParameters params) {
        return prepareRequest("getMentions", params);
    }

    public VKRequest getRecommended(VKParameters params) {
        return prepareRequest("getRecommended", params);
    }

    public VKRequest getSuggestedSources(VKParameters params) {
        return prepareRequest("getSuggestedSources", params);
    }

    public VKRequest ignoreItem(VKParameters params) {
        return prepareRequest("ignoreItem", params);
    }

    public VKRequest saveList(VKParameters params) {
        return prepareRequest("saveList", params);
    }

    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    public VKRequest unignoreItem(VKParameters params) {
        return prepareRequest("unignoreItem", params);
    }

    public VKRequest unsubscribe(VKParameters params) {
        return prepareRequest("unsubscribe", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "newsfeed";
    }
}
