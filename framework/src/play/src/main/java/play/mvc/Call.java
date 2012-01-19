package play.mvc;

/**
 * Defines a 'call', describing an HTTP request. For example used to create links or populate redirect data.
 * <p>
 * These values are usually generated by the reverse router.
 */
public abstract class Call {
    
    /**
     * The request URL.
     */
    public abstract String url();
    
    /**
     * The request HTTP method.
     */
    public abstract String method();
    
    public String absoluteURL(Http.Request request) {
        return absoluteURL(request, false);
    }
    
    public String absoluteURL(Http.Request request, boolean secure) {
        return "http" + (secure ? "s" : "") + "://" + request.host() + this.url();
    }
    
    public String webSocketURL(Http.Request request) {
        return webSocketURL(request, false);
    }
    
    public String webSocketURL(Http.Request request, boolean secure) {
      return "ws" + (secure ? "s" : "") + "://" + request.host() + this.url();
    }
    
}