package Microsoft.UI.Xaml.Input

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

@ABIMarker(KeyTipPlacementMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Input.KeyTipPlacementMode;i4)")
@WinRTByReference(brClass = KeyTipPlacementMode.ByReference::class)
public enum class KeyTipPlacementMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Bottom(1),
  Top(2),
  Left(3),
  Right(4),
  Center(5),
  Hidden(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KeyTipPlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Bottom
      2 -> Top
      3 -> Left
      4 -> Right
      5 -> Center
      6 -> Hidden
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KeyTipPlacementMode> {
    public fun setValue(newValue: KeyTipPlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KeyTipPlacementMode =
        KeyTipPlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KeyTipPlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KeyTipPlacementMode =
        KeyTipPlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: KeyTipPlacementMode): Int = obj.value
  }
}
