package Windows.Phone.Notification.Management

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

@ABIMarker(PhoneMediaType.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneMediaType;i4)")
@WinRTByReference(brClass = PhoneMediaType.ByReference::class)
public enum class PhoneMediaType(
  public val value: Int
) : NativeMapped {
  AudioOnly(0),
  AudioVideo(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneMediaType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AudioOnly
      1 -> AudioVideo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneMediaType> {
    public fun setValue(newValue: PhoneMediaType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneMediaType =
        PhoneMediaType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneMediaType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneMediaType =
        PhoneMediaType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneMediaType): Int = obj.value
  }
}
