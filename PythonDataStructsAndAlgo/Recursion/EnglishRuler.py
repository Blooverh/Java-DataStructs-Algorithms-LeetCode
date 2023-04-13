def draw_line(tick_length, tick_lable=' '):
    """Draw one line with given tick length(followed by optional label)"""
    line= '-' *tick_length

    if tick_lable:
        line+= ' ' + tick_lable
    
    print(line)

def draw_interval(center_length ):
    """Draw tick interval based upon a central tick length."""
    if center_length >0: #stop when length drops to 0 
        draw_interval(center_length-1) # recursively draws top ticks 
        draw_line(center_length) #draw center tick 
        draw_interval(center_length-1) #recursively draw bottom ticks

def draw_ruler(num_inches, major_length):
    """Draw the englishe ruler wirh given number of inches, major tick length."""
    draw_line(major_length, '0')# draw inch line 0
    for j in range(1, 1+num_inches):
        draw_interval(major_length-1) #draw interior ticks
        draw_line(major_length, str(j)) #draw inch line with value j and label

draw_ruler(3,3)

"""Major tick length is the # of "-" before the number of inches """