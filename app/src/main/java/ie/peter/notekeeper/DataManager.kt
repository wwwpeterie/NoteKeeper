package ie.peter.notekeeper

import java.util.HashMap

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialiseCourses()
        initialiseNotes()
    }


    private fun initialiseCourses(){
        var course = CourseInfo("Android_intents", "Android Programming with Intents")
        courses.set(course.courseId,course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId,course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language",courseId = "java_lang")
        courses.set(course.courseId,course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId,course)
    }


    private fun initialiseNotes(){
        //var course = CourseInfo("Android_intents", "Android Programming with Intents")
        //courses.set(course.courseId,course)

        var c = courses.get("Android_intents")
        if (c != null) {
            var note = NoteInfo(c," Note", "This is hte notew")
            notes.add(note)

            note = NoteInfo(c,"TEst ", "This  hte notew")
            notes.add(note)

            note = NoteInfo(c,"TEst Note", "This is  notew")
            notes.add(note)
            }


    }
}