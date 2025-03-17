package org.testcases;

import com.microsoft.playwright.*;

public class PageStarter {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;

    public PageStarter(){
        this.playwright = Playwright.create();
        this.browser = this.playwright.chromium().launch
                (new BrowserType.LaunchOptions()
                        .setHeadless(false));
        this.browserContext = this.browser.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(1920,1080));
        this.page = this.browserContext.newPage();
    }
    public PageStarter(String login, String password){
        this.playwright = Playwright.create();
        this.browser = this.playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false));
        this.browserContext = this.browser.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(1920,1080)
                        .setHttpCredentials(login, password));
    }

    public void teardown(){
        this.page.close();
        this.browserContext.close();
        this.browser.close();
        this.playwright.close();
    }
}
