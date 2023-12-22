package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadyITADataFormat.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.PlayReadyITADataFormat;i4)")
@WinRTByReference(brClass = PlayReadyITADataFormat.ByReference::class)
public enum class PlayReadyITADataFormat(
  public val value: Int
) : NativeMapped {
  SerializedProperties(0),
  SerializedProperties_WithContentProtectionWrapper(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlayReadyITADataFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SerializedProperties
      1 -> SerializedProperties_WithContentProtectionWrapper
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlayReadyITADataFormat> {
    public fun setValue(newValue: PlayReadyITADataFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlayReadyITADataFormat =
        PlayReadyITADataFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlayReadyITADataFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlayReadyITADataFormat =
        PlayReadyITADataFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlayReadyITADataFormat): Int = obj.value
  }
}
