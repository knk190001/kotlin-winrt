package Windows.UI.Xaml.Controls

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

@ABIMarker(SnapPointsType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.SnapPointsType;i4)")
@WinRTByReference(brClass = SnapPointsType.ByReference::class)
public enum class SnapPointsType(
  public val value: Int
) : NativeMapped {
  None(0),
  Optional(1),
  Mandatory(2),
  OptionalSingle(3),
  MandatorySingle(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SnapPointsType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Optional
      2 -> Mandatory
      3 -> OptionalSingle
      4 -> MandatorySingle
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SnapPointsType> {
    public fun setValue(newValue: SnapPointsType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SnapPointsType =
        SnapPointsType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SnapPointsType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SnapPointsType =
        SnapPointsType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SnapPointsType): Int = obj.value
  }
}
