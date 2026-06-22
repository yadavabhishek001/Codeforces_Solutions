<h2><a href="https://codeforces.com/contest/1385/problem/A" target="_blank" rel="noopener noreferrer">1385A — Three Pairwise Maximums</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1385A](https://codeforces.com/contest/1385/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Three Pairwise Maximums</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given three positive (i.e. strictly greater than zero) integers <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-1"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-2">x</span></span></span>$x$, <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-3"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-4">y</span></span></span>$y$ and <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-5"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-6">z</span></span></span>$z$.</p><p>Your task is to find positive integers <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-7"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-8">a</span></span></span>$a$, <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-9"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-10">b</span></span></span>$b$ and <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-11"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-12">c</span></span></span>$c$ such that <span class="MathJax_Preview" style="color: inherit;"><span class="MJXp-math" id="MJXp-Span-13"><span class="MJXp-mi MJXp-italic" id="MJXp-Span-14">x</span><span class="MJXp-mo" id="MJXp-Span-15" style="margin-left: 0.333em; margin-right: 0.333em;">=</span><span class="MJXp-mo" id="MJXp-Span-16">max</span></span></span>$x = \max(a, b)$, <span class="MathJax_Preview">y = \max(a, c)</span>$y = \max(a, c)$ and <span class="MathJax_Preview">z = \max(b, c)</span>$z = \max(b, c)$, or determine that it is impossible to find such <span class="MathJax_Preview">a</span>$a$, <span class="MathJax_Preview">b</span>$b$ and <span class="MathJax_Preview">c</span>$c$.</p><p>You have to answer <span class="MathJax_Preview">t</span>$t$ independent test cases. Print required <span class="MathJax_Preview">a</span>$a$, <span class="MathJax_Preview">b</span>$b$ and <span class="MathJax_Preview">c</span>$c$ in any (arbitrary) order.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer <span class="MathJax_Preview">t</span>$t$ (<span class="MathJax_Preview">1 \le t \le 2 \cdot 10^4</span>$1 \le t \le 2 \cdot 10^4$) — the number of test cases. Then <span class="MathJax_Preview">t</span>$t$ test cases follow.</p><p>The only line of the test case contains three integers <span class="MathJax_Preview">x</span>$x$, <span class="MathJax_Preview">y</span>$y$, and <span class="MathJax_Preview">z</span>$z$ (<span class="MathJax_Preview">1 \le x, y, z \le 10^9</span>$1 \le x, y, z \le 10^9$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the answer:</p><ul> <li> "<span class="tex-font-style-tt">NO</span>" in the only line of the output if a solution doesn't exist; </li><li> or "<span class="tex-font-style-tt">YES</span>" in the first line and <span class="tex-font-style-bf">any</span> valid triple of positive integers <span class="MathJax_Preview">a</span>$a$, <span class="MathJax_Preview">b</span>$b$ and <span class="MathJax_Preview">c</span>$c$ (<span class="MathJax_Preview">1 \le a, b, c \le 10^9</span>$1 \le a, b, c \le 10^9$) in the second line. You can print <span class="MathJax_Preview">a</span>$a$, <span class="MathJax_Preview">b</span>$b$ and <span class="MathJax_Preview">c</span>$c$ <span class="tex-font-style-bf">in any order</span>. </li></ul></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0046511113857078556" id="id007836285822753146" class="input-output-copier">Copy</div></div><pre id="id0046511113857078556">5
3 2 3
100 100 100
50 49 49
10 30 20
1 1000000000 1000000000
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id006426278589184646" id="id006489460774424624" class="input-output-copier">Copy</div></div><pre id="id006426278589184646">YES
3 2 1
YES
100 100 100
NO
NO
YES
1 1 1000000000
</pre></div></div></div>