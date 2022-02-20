package com.kihyeonkim.herokubatch.common.context

import com.kihyeonkim.herokubatch.common.enumeration.DataSourceType

class DatabaseContextHolder {
	companion object {
		private val databaseContextHolder: ThreadLocal<DataSourceType> = ThreadLocal()

		fun setDataSourceType(dataSourceType: DataSourceType?) {
			if (dataSourceType == null) {
				throw NullPointerException()
			}
			databaseContextHolder.set(dataSourceType)
		}

		fun getDataSourceType(): DataSourceType {
			return databaseContextHolder.get()
		}

		fun clearDataSourceType() {
			databaseContextHolder.remove()
		}
	}
}