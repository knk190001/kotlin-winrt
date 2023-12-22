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

@ABIMarker(PhoneCallHistoryEntryQueryDesiredMedia.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia;u4)")
@WinRTByReference(brClass = PhoneCallHistoryEntryQueryDesiredMedia.ByReference::class)
public enum class PhoneCallHistoryEntryQueryDesiredMedia(
  public val value: Int
) : NativeMapped {
  None(0),
  Audio(1),
  Video(2),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallHistoryEntryQueryDesiredMedia {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Audio
      2 -> Video
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneCallHistoryEntryQueryDesiredMedia> {
    public fun setValue(newValue: PhoneCallHistoryEntryQueryDesiredMedia): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallHistoryEntryQueryDesiredMedia =
        PhoneCallHistoryEntryQueryDesiredMedia.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallHistoryEntryQueryDesiredMedia, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallHistoryEntryQueryDesiredMedia =
        PhoneCallHistoryEntryQueryDesiredMedia.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallHistoryEntryQueryDesiredMedia): Int = obj.value
  }
}
