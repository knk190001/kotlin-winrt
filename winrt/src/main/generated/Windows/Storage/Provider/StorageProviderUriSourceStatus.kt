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

@ABIMarker(StorageProviderUriSourceStatus.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderUriSourceStatus;i4)")
@WinRTByReference(brClass = StorageProviderUriSourceStatus.ByReference::class)
public enum class StorageProviderUriSourceStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NoSyncRoot(1),
  FileNotFound(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderUriSourceStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NoSyncRoot
      2 -> FileNotFound
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderUriSourceStatus> {
    public fun setValue(newValue: StorageProviderUriSourceStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderUriSourceStatus =
        StorageProviderUriSourceStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderUriSourceStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderUriSourceStatus =
        StorageProviderUriSourceStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderUriSourceStatus): Int = obj.value
  }
}
