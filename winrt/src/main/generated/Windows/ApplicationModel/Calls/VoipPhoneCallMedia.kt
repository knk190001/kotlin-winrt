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

@ABIMarker(VoipPhoneCallMedia.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.VoipPhoneCallMedia;u4)")
@WinRTByReference(brClass = VoipPhoneCallMedia.ByReference::class)
public enum class VoipPhoneCallMedia(
  public val value: Int
) : NativeMapped {
  None(0),
  Audio(1),
  Video(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VoipPhoneCallMedia {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Audio
      2 -> Video
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VoipPhoneCallMedia> {
    public fun setValue(newValue: VoipPhoneCallMedia): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VoipPhoneCallMedia =
        VoipPhoneCallMedia.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VoipPhoneCallMedia, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VoipPhoneCallMedia =
        VoipPhoneCallMedia.values()[0].fromNative(value, null)

    public override fun toNative(obj: VoipPhoneCallMedia): Int = obj.value
  }
}
