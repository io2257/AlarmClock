# 주요 기능 및 수정사항
* 기본 알람 기능에 광고 시청 기능 추가
  ![alert_alarm_fullscreen](https://github.com/user-attachments/assets/0848c879-82a7-4bcc-95c2-1490990607b1)


</br></br>

* 광고 시청 영상 예시 ([K-Digital Training] 벤처 스타트업 아카데미를 소개합니다!)
![Screenshot_20240828_131533](https://github.com/user-attachments/assets/9514d819-6d80-468f-ba62-37a205c8c942)
(출처) https://youtu.be/bNmpH27FypY?si=o447ugR9O56ya3Mh

</br></br>


* 광고 시청 이후 연관 퀴즈 풀이 예시
![quiz](https://github.com/user-attachments/assets/f6bd5451-6cb7-4821-b0b0-94786c3547b8)


</br></br>



* 퀴즈 정답을 맞추면 일정량의 포인트를 제공
![point_popup](https://github.com/user-attachments/assets/e7e9fc12-07da-4498-bac9-30a890f29da6)
![Screenshot_20240828_131616](https://github.com/user-attachments/assets/41d21089-72ab-4740-8624-66833a1fe646)

</br></br></br></br>



# 주요 기능 별 연관 소스코드 Path

### 기본 알람 기능에 광고 시청 기능 추가
* AlarmClock/app/src/main/java/com/better/alarm/ui/alert/AlarmAlertFullScreen.kt
</br>showAds() 메소드가 본 기능의 핵심 구현체입니다.

</br></br></br></br>

### 광고 시청 이후 연관 퀴즈 풀이 예시
* AlarmClock/app/src/main/java/com/better/alarm/ui/alert/AlarmAlertFullScreen.kt
</br>showQuiz() 메소드가 본 기능의 핵심 구현체입니다.

</br></br>

* AlarmClock/app/src/main/res/layout/quiz_dialog.xml
</br></br>퀴즈 팝업의 레이아웃 정보입니다.

</br></br></br></br>

### 퀴즈 정답을 맞추면 일정량의 포인트를 제공
* AlarmClock/app/src/main/java/com/better/alarm/data/PointManager.kt
</br>Kotlin Context가 Point정보를 유지하도록 구현하였습니다.
</br></br>

* AlarmClock/app/src/main/java/com/better/alarm/ui/list/InfoFragment.kt
</br>computeTexts 함수가 Point 정보를 표시하는 기능을 합니다.





</br></br></br></br></br></br></br></br>




# Simple alarm clock
Simple Alarm Clock is an alarm clock for Android smartphones and tablets that brings pure alarm experience to you by combining powerful features and clean interface.
The interface of our Alarm clock is designed to be simple, intuitive and efficient. By removing what is not essential, we make access to everything you need even easier.

# Features
* Low volume gentle alarm which starts some time before the main alarm (when you are in good sleep phase to wake up, you will hear the low volume alarm and wake up most refreshed. 30 minutes is most of the time enough to catch the fast sleep phase)
* Cool time picker like in Jelly Bean. No more spinning, only phone-style keyboard!
* Volume fade in and vibration starting only after completed fade in
* Snooze for some time with one click or to a snooze to selected time with out time picker
* Longclick to dismiss - prevents accidental alarm dismiss
* Longclick on snooze button for adjustable snooze time with a convenient time picker

# Open source
The application code is branched from AOSP and is open source. Additional feature requests are appreciated! You can submit bugreports and feature requests by sending an email to developers!

# License
Apache 2.0
