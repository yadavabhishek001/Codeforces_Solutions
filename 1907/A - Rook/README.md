<h2><a href="https://codeforces.com/contest/1907/problem/A" target="_blank" rel="noopener noreferrer">1907A — Rook</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1907A](https://codeforces.com/contest/1907/problem/A) |

## Topics
`implementation`

---

## Problem Statement

<div class="header"><div class="title">A. Rook</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>As you probably know, chess is a game that is played on a board with 64 squares arranged in an <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-1"><span class="MJXp-mn" id="MJXp-Span-2">8</span><span class="MJXp-mo" id="MJXp-Span-3" style="margin-left: 0.267em; margin-right: 0.267em;">×</span><span class="MJXp-mn" id="MJXp-Span-4">8</span></span></span>$8\times 8$ grid. Columns of this board are labeled with letters from <span class="tex-font-style-bf">a</span> to <span class="tex-font-style-bf">h</span>, and rows are labeled with digits from <span class="tex-font-style-bf">1</span> to <span class="tex-font-style-bf">8</span>. Each square is described by the row and column it belongs to.</p><center> <img class="tex-graphics" src="https://espresso.codeforces.com/47121ab1618eef1f0d41aa54223134101ea3d337.png" style="max-width: 100.0%;max-height: 100.0%;"> </center><p>The rook is a piece in the game of chess. During its turn, it may move any non-zero number of squares horizontally or vertically. Your task is to find all possible moves for a rook on an empty chessboard.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of input contains single integer <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-5"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-6">t</span></span></span>$t$ (<span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-7"><span class="MJXp-mn" id="MJXp-Span-8">1</span><span class="MJXp-mo" id="MJXp-Span-9" style="margin-left: 0.333em; margin-right: 0.333em;">≤</span><span class="MJXp-mi MJXp-italic" id="MJXp-Span-10">t</span><span class="MJXp-mo" id="MJXp-Span-11" style="margin-left: 0.333em; margin-right: 0.333em;">≤</span><span class="MJXp-mn" id="MJXp-Span-12">64</span></span></span>$1 \le t \le 64$) — the number of test cases. The descriptions of test cases follow.</p><p>Each test case contains one string of two characters, description of the square where rook is positioned. The first character is a letter from <span class="tex-font-style-bf">a</span> to <span class="tex-font-style-bf">h</span>, the label of column, and the second character is a digit from <span class="tex-font-style-bf">1</span> to <span class="tex-font-style-bf">8</span>, the label of row. </p><p>The same position may occur in more than one test case.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output descriptions of all squares where the rook can move, in the same format as in the input. </p><p>You can output squares in any order per test case.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006067107481652846" id="id005011341420251819" class="input-output-copier">Copy</div></div><pre id="id006067107481652846"><div class="test-example-line test-example-line-even test-example-line-0">1</div><div class="test-example-line test-example-line-odd test-example-line-1">d5</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id000712069064641242" id="id007016052768807945" class="input-output-copier">Copy</div></div><pre id="id000712069064641242">d1
d2
b5
g5
h5
d3
e5
f5
d8
a5
d6
d7
c5
d4
</pre></div></div></div>