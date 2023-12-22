package Windows.UI.Xaml.Media

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

@ABIMarker(Stereo3DVideoPackingMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Stereo3DVideoPackingMode;i4)")
@WinRTByReference(brClass = Stereo3DVideoPackingMode.ByReference::class)
public enum class Stereo3DVideoPackingMode(
  public val value: Int
) : NativeMapped {
  None(0),
  SideBySide(1),
  TopBottom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Stereo3DVideoPackingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SideBySide
      2 -> TopBottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Stereo3DVideoPackingMode>
      {
    public fun setValue(newValue: Stereo3DVideoPackingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Stereo3DVideoPackingMode =
        Stereo3DVideoPackingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Stereo3DVideoPackingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Stereo3DVideoPackingMode =
        Stereo3DVideoPackingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: Stereo3DVideoPackingMode): Int = obj.value
  }
}
