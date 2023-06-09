package edu.stanford.cardinalkit.domain.usecases.tasklogs

import edu.stanford.cardinalkit.domain.models.tasks.CKTaskLog
import edu.stanford.cardinalkit.domain.repositories.TaskLogRepository

class UploadTaskLog(
    private val repository: TaskLogRepository
) {
    suspend operator fun invoke(log: CKTaskLog) = repository.uploadTaskLog(log)
}
