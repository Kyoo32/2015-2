def sum(a,b)
sum = 0

a.upto(b) do |x|
 sum = sum + x
end

puts sum 

end



sum(1, 10)
sum(11, 20)
sum(21, 30)
