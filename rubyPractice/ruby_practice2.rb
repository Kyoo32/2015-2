#encoding = utf-8
#lotto numbering

def draw(num)
	draw_arrays = Array.new
	while draw_arrays.size < num
		draw_arrays << (1..45).to_a.sample(6).sort
	end
	draw_arrays.uniq!

	draw_arrays.each do |array|
		puts array.inspect
	end
end

draw(10)
