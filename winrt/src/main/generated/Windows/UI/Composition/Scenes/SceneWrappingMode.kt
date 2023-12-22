package Windows.UI.Composition.Scenes

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

@ABIMarker(SceneWrappingMode.ABI::class)
@Signature("enum(Windows.UI.Composition.Scenes.SceneWrappingMode;i4)")
@WinRTByReference(brClass = SceneWrappingMode.ByReference::class)
public enum class SceneWrappingMode(
  public val value: Int
) : NativeMapped {
  ClampToEdge(0),
  MirroredRepeat(1),
  Repeat(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SceneWrappingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ClampToEdge
      1 -> MirroredRepeat
      2 -> Repeat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SceneWrappingMode> {
    public fun setValue(newValue: SceneWrappingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SceneWrappingMode =
        SceneWrappingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SceneWrappingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SceneWrappingMode =
        SceneWrappingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SceneWrappingMode): Int = obj.value
  }
}
