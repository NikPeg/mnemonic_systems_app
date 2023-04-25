import os

dir = '.'
for f in os.listdir(dir):
    if f not in {"delete5.py", "main.py", "words_alpha.txt"} and len(f) >= 9:
        os.remove(os.path.join(dir, f))
