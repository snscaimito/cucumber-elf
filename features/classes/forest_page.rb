class ForestPage

  def initialize(browser_to_be_used)
    @browser = browser_to_be_used
  end

  def self.open(browser)
    page = ForestPage.new(browser)
    browser.goto FOREST_PAGE
#    browser.goto "file:///Users/sns/Documents/Caimito Technologies Inc./playground/fantasy-cucumber/workspace/elf/src/main/resources/org/example/elf/pages/Forest.html"
    return page
  end

  def method_missing(m, *args)
    puts "Sorry, I (#{self}) don't know about any #{m} method."
  end

  def elves_are_not_there
    @browser.link(:id, "startOver").click
  end

  def elves_line_up(elves)
    elves.each do |elf|
      @browser.text_field(:id, "elfName").set(elf['elf'])
      @browser.text_field(:id, "elfHeight").set(elf['height'])
      @browser.button(:id, "submit").click
    end
  end

  def order_of_elves
    elves = []

    begin
      elf_number = 0
      elf = @browser.div(:id => "elf", :index => elf_number)
      while !elf.nil?
        elves.push [elf.text]

        elf_number = elf_number + 1
        elf = @browser.div(:id => "elf", :index => elf_number)
      end

    rescue
      return elves
    end
  end

end
