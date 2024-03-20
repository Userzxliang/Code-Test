

fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
    intervals.sortBy { it[0] }
    for (i in 0 until intervals.size - 1) {
        if (intervals[i][1] > intervals[i + 1][0]) {
            return false
        }
    }
    return true
}
