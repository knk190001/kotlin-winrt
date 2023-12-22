package Microsoft.UI.Content

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

@ABIMarker(ContentCoordinateRoundingMode.ABI::class)
@Signature("enum(Microsoft.UI.Content.ContentCoordinateRoundingMode;i4)")
@WinRTByReference(brClass = ContentCoordinateRoundingMode.ByReference::class)
public enum class ContentCoordinateRoundingMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Floor(1),
  Round(2),
  Ceiling(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContentCoordinateRoundingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Floor
      2 -> Round
      3 -> Ceiling
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ContentCoordinateRoundingMode> {
    public fun setValue(newValue: ContentCoordinateRoundingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContentCoordinateRoundingMode =
        ContentCoordinateRoundingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContentCoordinateRoundingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContentCoordinateRoundingMode =
        ContentCoordinateRoundingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContentCoordinateRoundingMode): Int = obj.value
  }
}
