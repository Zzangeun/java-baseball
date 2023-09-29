## 숫자야구 기능구현
### 입력
-[ ] 사용자로부터 3자리 숫자를 입력받음
-[ ] 게임이 끝난 뒤 사용자로부터 재시작/종료를 입력받음
### 볼, 스트라이크 계산
-[ ] 볼이 몇갠지
-[ ] 볼 중에 스트라이크가 몇개인지
### 계산 결과 출력
-[ ] 볼, 스트라이크, 낫싱 표시
-[ ] 정답을 맞췄을 때

---

## commit message convention
```
<type>: <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>
```
### Subject line
Subject line 에는 변경 사항에 대한 간결한 설명이 포함되어 있어야 함

#### Allowed `<type>`
* feat (feature)
* fix (bug fix)
* docs (documentation)
* style (formatting, missing semicolons, …)
* refactor
* test (when adding missing tests)
* chore (maintain)

#### `<subject>` text
* 현재형으로 쓰기 : “바꿈” not “바꿨음”
* 끝에 마침표 (.) 쓰지 않기

### Message body
* 현재형으로 쓰기 : “바꿈” not “바꿨음”
* 변화에 대한 동기와 이전과의 차이점 포함하기

### Message footer

#### Referencing issues

Closed bugs 는 Closes로 #(issue 번호)로 마지막 줄에 명시해야 함:
```
Closes #234
```

여러 issue에 대해선 나열하여 명시:
```
Closes #123, #245, #992
```

예시
--------

```
feat: ng:disabled, ng:checked, ng:multiple, ng:readonly, ng:selected

New directives for proper binding these attributes in older browsers (IE).
Added coresponding description, live examples and e2e tests.

Closes #351
```

```
style: add couple of missing semi colons
```

```
docs: updated fixed docs from Google Docs

Couple of typos fixed:
- indentation
- batchLogbatchLog -> batchLog
- start periodic checking
- missing brace
```