digit_by_char = {
    's': 0,
    'c': 0,
    'z': 0,
    'x': 0,
    't': 1,
    'd': 1,
    'th': 1,
    'n': 2,
    'm': 3,
    'r': 4,
    'l': 5,
    'ch': 6,
    'j': 6,
    'g': 6,
    'sh': 6,
    'cz': 6,
    'ss': 6,
    'sc': 6,
    'sch': 6,
    'tsch': 6,
    'k': 7,
    'q': 7,
    'f': 8,
    'ph': 8,
    'v': 8,
    'gh': 8,
    'p': 9,
    'b': 9,
}

def process(line):
    filename = ""
    for i in range(len(line)):
        if line[i:i + 4] in digit_by_char:
            filename += str(digit_by_char[line[i:i + 4]])
        elif line[i:i + 3] in digit_by_char:
            filename += str(digit_by_char[line[i:i + 3]])
        elif line[i:i + 2] in digit_by_char:
            filename += str(digit_by_char[line[i:i + 2]])
        elif line[i:i + 1] in digit_by_char:
            filename += str(digit_by_char[line[i:i + 1]])
        elif line[i] in digit_by_char:
            filename += str(digit_by_char[line[i]])
    if filename and len(filename) <= 5:
        with open(filename + ".txt", "a") as fa:
            fa.write(line)


with open("words_alpha.txt", "r") as fin:
    for line in fin:
        process(line)
