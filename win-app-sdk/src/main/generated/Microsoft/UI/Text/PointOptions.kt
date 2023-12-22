package Microsoft.UI.Text

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

@ABIMarker(PointOptions.ABI::class)
@Signature("enum(Microsoft.UI.Text.PointOptions;u4)")
@WinRTByReference(brClass = PointOptions.ByReference::class)
public enum class PointOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  IncludeInset(1),
  Start(32),
  ClientCoordinates(256),
  AllowOffClient(512),
  Transform(1024),
  NoHorizontalScroll(65536),
  NoVerticalScroll(262144),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PointOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> IncludeInset
      32 -> Start
      256 -> ClientCoordinates
      512 -> AllowOffClient
      1024 -> Transform
      65536 -> NoHorizontalScroll
      262144 -> NoVerticalScroll
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PointOptions> {
    public fun setValue(newValue: PointOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PointOptions =
        PointOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PointOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PointOptions =
        PointOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: PointOptions): Int = obj.value
  }
}
