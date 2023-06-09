package edu.stanford.cardinalkit.domain.repositories

import edu.stanford.cardinalkit.domain.models.Response
import edu.stanford.cardinalkit.domain.models.tasks.CKTaskLog
import kotlinx.coroutines.flow.Flow

interface TaskLogRepository {
    fun getTaskLogs(): Flow<Response<List<CKTaskLog>>>
    suspend fun uploadTaskLog(log: CKTaskLog): Flow<Response<Void?>>
}
