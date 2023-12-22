package Windows.UI.StartScreen

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

@ABIMarker(TileSize.ABI::class)
@Signature("enum(Windows.UI.StartScreen.TileSize;i4)")
@WinRTByReference(brClass = TileSize.ByReference::class)
public enum class TileSize(
  public val value: Int
) : NativeMapped {
  Default(0),
  Square30x30(1),
  Square70x70(2),
  Square150x150(3),
  Wide310x150(4),
  Square310x310(5),
  Square71x71(6),
  Square44x44(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): TileSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Square30x30
      2 -> Square70x70
      3 -> Square150x150
      4 -> Wide310x150
      5 -> Square310x310
      6 -> Square71x71
      7 -> Square44x44
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TileSize> {
    public fun setValue(newValue: TileSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TileSize =
        TileSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TileSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TileSize =
        TileSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: TileSize): Int = obj.value
  }
}
