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

@ABIMarker(TileOptions.ABI::class)
@Signature("enum(Windows.UI.StartScreen.TileOptions;u4)")
@WinRTByReference(brClass = TileOptions.ByReference::class)
public enum class TileOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ShowNameOnLogo(1),
  ShowNameOnWideLogo(2),
  CopyOnDeployment(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TileOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ShowNameOnLogo
      2 -> ShowNameOnWideLogo
      4 -> CopyOnDeployment
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TileOptions> {
    public fun setValue(newValue: TileOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TileOptions =
        TileOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TileOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TileOptions =
        TileOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: TileOptions): Int = obj.value
  }
}
