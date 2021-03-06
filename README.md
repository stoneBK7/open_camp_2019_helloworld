Googleドキュメントでブラッシュアップしたものを共有しておりますので、こちらも活用下さい(2019/05/19)
https://docs.google.com/document/d/1fP-ZXU6gBuKmG1Cvwev5H362K7hArFZAMIvW1NyNcOo/edit?usp=sharing

# ワークショップ01(表示されているテキストを変更しよう)
## 概要
これは「オープンキャンプ in 南島原 2019」のワークショップで実施する課題の内容です。

## ステップ1
XML形式の定義ファイル(`activity_main.xml`)を変更して、「Hello World」を日本語の「こんにちは世界」に変更してみましょう。

#### ヒント1 XML形式の定義ファイル(`activity_main.xml`)とは
ユーザが実際に利用する画面デザインを定義するファイルです。<br>
定義フィアルだけではなく、実際に処理などを記述しているソースコードからも定義することや変更することができます。

#### ヒント2「デザインモード」や「テキストモード」に切り替える方法
画面の中央辺りにあるタブの`Design`や`Text`を選択することで、実際の画面の様なグラフィカルなもので見たり、XML形式で記載されたテキスト情報を見ることができます。

#### ヒント3 テキストビュー(TextView)とは
プログラムを行う人を補助する仕組みとして予め、ボタンや画面に文字列を表示する為のパーツが沢山用意されています。<br>
その中の1つとしてTextViewというものがあります。これが何かというと、画面に文字列を表示するために使われるものです。

## ステップ2
`MainActivity.kt`に処理を記述して「こんにちは、○○さん」と表示してみましょう。<br>
○○さんは、自分の名前や好きな名前を記述して下さい。

#### テキストビューの宣言の仕方
XML形式の定義ファイル(`activity_main.xml`)に配置されているテキストビューの情報を変更したりする為には、以下のソースコードを宣言します。
```
val textView = findViewById<TextView>(R.id.text_view)
```
上記で書いたコードを少しだけ解説します。<br>
・`val`(定数)として宣言しています。<br>
・`textView`は、変数名を指しており、任意の名称で記述することができます。<br>
　(プログラムの世界では予約語というものが存在します。その予約語で定義されているキーワードだけは、変数名など実装者が任意に定義する名称に利用することができません)<br>
・`findViewById`は、後ろに記述している`text_view`というID名を検索するためのおまじないです。<br>
　これによって、画面デザインの定義ファイルに定義しているTextViewの部品を見つけてくれます。<br>
・`<TextView>`は、型を宣言しています。
