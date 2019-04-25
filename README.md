# Guessing Music Game

---

## 紹介

学んだ JAVA を使って私の趣味である音楽をもっと楽しく聞けるゲームを作りたくて、また、既存発売されたゲームにはランダム出題機能がなかったので企画しました。

ボタンを押すとランダムに音楽が流れます。何の曲かを推測し、答えるゲームです。

## 技術

Language：JAVA

Tool：GUI(Swing、AWT)

Library：JavaMusicAPI（MusicThread を作るため）

## LinkedList-の特徴を利用したアルゴリズム

![image](https://user-images.githubusercontent.com/33077726/56746533-5be63380-67b7-11e9-9396-c50b48a526a5.png)

## 画面の説明

**ゲームの説明ページ**

![info_1](https://user-images.githubusercontent.com/33077726/56746636-8df79580-67b7-11e9-9025-90151d9c0e31.png)

![info_2](https://user-images.githubusercontent.com/33077726/56746674-a49dec80-67b7-11e9-9bf3-5810f5e67385.png)

---

**正解と誤答の場合の画面とゲームリスタート**

![answer_wrong](https://user-images.githubusercontent.com/33077726/56746718-bd0e0700-67b7-11e9-8505-6dee506e3c9b.png)

![answer_label](https://user-images.githubusercontent.com/33077726/56746720-bda69d80-67b7-11e9-9c15-64f0337bd46c.png)

**押すと歌が流れるボータンと答え入力欄**

![music_listning](https://user-images.githubusercontent.com/33077726/56746799-dc0c9900-67b7-11e9-83aa-4552137ea9df.jpg)

### これから

今は OOP の適用が画面の方しかできませんでしたが、Model と Controller も OOP 規則を純粋しながら
初めからやり直して作りたいです。ユーザーのローカルにある音楽を入れて問題を出すようにしてみたいです。
