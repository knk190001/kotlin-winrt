package Windows.Storage.Provider

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(StorageProviderInSyncPolicy.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderInSyncPolicy;u4)")
@WinRTByReference(brClass = StorageProviderInSyncPolicy.ByReference::class)
public enum class StorageProviderInSyncPolicy(
  public val value: Int
) : NativeMapped {
  Default(0),
  FileCreationTime(1),
  FileReadOnlyAttribute(2),
  FileHiddenAttribute(4),
  FileSystemAttribute(8),
  DirectoryCreationTime(16),
  DirectoryReadOnlyAttribute(32),
  DirectoryHiddenAttribute(64),
  DirectorySystemAttribute(128),
  FileLastWriteTime(256),
  DirectoryLastWriteTime(512),
  PreserveInsyncForSyncEngine(-2147483648),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderInSyncPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> FileCreationTime
      2 -> FileReadOnlyAttribute
      4 -> FileHiddenAttribute
      8 -> FileSystemAttribute
      16 -> DirectoryCreationTime
      32 -> DirectoryReadOnlyAttribute
      64 -> DirectoryHiddenAttribute
      128 -> DirectorySystemAttribute
      256 -> FileLastWriteTime
      512 -> DirectoryLastWriteTime
      -2147483648 -> PreserveInsyncForSyncEngine
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderInSyncPolicy> {
    public fun setValue(newValue: StorageProviderInSyncPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderInSyncPolicy =
        StorageProviderInSyncPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderInSyncPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderInSyncPolicy =
        StorageProviderInSyncPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderInSyncPolicy): Int = obj.value
  }
}
