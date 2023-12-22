package Microsoft.UI.Composition

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

@ABIMarker(AnimationPropertyAccessMode.ABI::class)
@Signature("enum(Microsoft.UI.Composition.AnimationPropertyAccessMode;i4)")
@WinRTByReference(brClass = AnimationPropertyAccessMode.ByReference::class)
public enum class AnimationPropertyAccessMode(
  public val value: Int
) : NativeMapped {
  None(0),
  ReadOnly(1),
  WriteOnly(2),
  ReadWrite(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationPropertyAccessMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ReadOnly
      2 -> WriteOnly
      3 -> ReadWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AnimationPropertyAccessMode> {
    public fun setValue(newValue: AnimationPropertyAccessMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationPropertyAccessMode =
        AnimationPropertyAccessMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationPropertyAccessMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationPropertyAccessMode =
        AnimationPropertyAccessMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationPropertyAccessMode): Int = obj.value
  }
}
