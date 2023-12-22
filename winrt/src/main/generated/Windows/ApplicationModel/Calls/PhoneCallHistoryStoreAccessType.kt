package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneCallHistoryStoreAccessType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType;i4)")
@WinRTByReference(brClass = PhoneCallHistoryStoreAccessType.ByReference::class)
public enum class PhoneCallHistoryStoreAccessType(
  public val value: Int
) : NativeMapped {
  AppEntriesReadWrite(0),
  AllEntriesLimitedReadWrite(1),
  AllEntriesReadWrite(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallHistoryStoreAccessType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AppEntriesReadWrite
      1 -> AllEntriesLimitedReadWrite
      2 -> AllEntriesReadWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneCallHistoryStoreAccessType> {
    public fun setValue(newValue: PhoneCallHistoryStoreAccessType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallHistoryStoreAccessType =
        PhoneCallHistoryStoreAccessType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallHistoryStoreAccessType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallHistoryStoreAccessType =
        PhoneCallHistoryStoreAccessType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallHistoryStoreAccessType): Int = obj.value
  }
}
