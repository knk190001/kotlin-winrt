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

@ABIMarker(PhoneCallHistoryEntryOtherAppReadAccess.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess;i4)")
@WinRTByReference(brClass = PhoneCallHistoryEntryOtherAppReadAccess.ByReference::class)
public enum class PhoneCallHistoryEntryOtherAppReadAccess(
  public val value: Int
) : NativeMapped {
  Full(0),
  SystemOnly(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallHistoryEntryOtherAppReadAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Full
      1 -> SystemOnly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneCallHistoryEntryOtherAppReadAccess> {
    public fun setValue(newValue: PhoneCallHistoryEntryOtherAppReadAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallHistoryEntryOtherAppReadAccess =
        PhoneCallHistoryEntryOtherAppReadAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallHistoryEntryOtherAppReadAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallHistoryEntryOtherAppReadAccess =
        PhoneCallHistoryEntryOtherAppReadAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallHistoryEntryOtherAppReadAccess): Int = obj.value
  }
}
