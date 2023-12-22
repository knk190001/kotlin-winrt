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

@ABIMarker(SceneAlphaMode.ABI::class)
@Signature("enum(Windows.UI.Composition.Scenes.SceneAlphaMode;i4)")
@WinRTByReference(brClass = SceneAlphaMode.ByReference::class)
public enum class SceneAlphaMode(
  public val value: Int
) : NativeMapped {
  Opaque(0),
  AlphaTest(1),
  Blend(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SceneAlphaMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Opaque
      1 -> AlphaTest
      2 -> Blend
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SceneAlphaMode> {
    public fun setValue(newValue: SceneAlphaMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SceneAlphaMode =
        SceneAlphaMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SceneAlphaMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SceneAlphaMode =
        SceneAlphaMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SceneAlphaMode): Int = obj.value
  }
}
