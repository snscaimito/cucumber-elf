Given /^I am in the forest$/ do
  @current_page = ForestPage::open @browser
end

When /^I call the following elves to line up:$/ do |elves|
  # table is a | Kadra  | 6' 20" |
  @current_page.elves_line_up elves.hashes
end

Then /^they line up in the following order:$/ do |order_of_elves|
  # table is a | Kadra  |
  order_of_elves.diff!(@current_page.order_of_elves)
end

When /^the elves are not lined up$/ do
  @current_page.elves_are_not_there
end