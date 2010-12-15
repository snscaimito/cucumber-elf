require 'rubygems'
require 'watir-webdriver'

FOREST_PAGE = 'http://localhost:8080/elf/forest'

browser = Watir::Browser.new

Before do
  @browser = browser
end

at_exit do
  browser.close
end

