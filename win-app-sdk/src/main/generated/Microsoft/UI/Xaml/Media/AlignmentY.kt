package Microsoft.UI.Xaml.Media

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

@ABIMarker(AlignmentY.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.AlignmentY;i4)")
@WinRTByReference(brClass = AlignmentY.ByReference::class)
public enum class AlignmentY(
  public val value: Int
) : NativeMapped {
  Top(0),
  Center(1),
  Bottom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AlignmentY {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Top
      1 -> Center
      2 -> Bottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AlignmentY> {
    public fun setValue(newValue: AlignmentY): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AlignmentY =
        AlignmentY.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AlignmentY, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AlignmentY =
        AlignmentY.values()[0].fromNative(value, null)

    public override fun toNative(obj: AlignmentY): Int = obj.value
  }
}
