
package com.packtpub.retrofit;


public class Info {

    private String seed;
    private int results;
    private int page;
    private String version;

    /**
     * 
     * @return
     *     The seed
     */
    public String getSeed() {
        return seed;
    }

    /**
     * 
     * @param seed
     *     The seed
     */
    public void setSeed(String seed) {
        this.seed = seed;
    }

    /**
     * 
     * @return
     *     The results
     */
    public int getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(int results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The page
     */
    public int getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
