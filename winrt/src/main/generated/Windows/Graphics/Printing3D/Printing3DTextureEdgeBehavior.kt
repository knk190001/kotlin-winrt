package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DTextureEdgeBehavior.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Printing3DTextureEdgeBehavior;i4)")
@WinRTByReference(brClass = Printing3DTextureEdgeBehavior.ByReference::class)
public enum class Printing3DTextureEdgeBehavior(
  public val value: Int
) : NativeMapped {
  None(0),
  Wrap(1),
  Mirror(2),
  Clamp(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Printing3DTextureEdgeBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Wrap
      2 -> Mirror
      3 -> Clamp
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<Printing3DTextureEdgeBehavior> {
    public fun setValue(newValue: Printing3DTextureEdgeBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Printing3DTextureEdgeBehavior =
        Printing3DTextureEdgeBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Printing3DTextureEdgeBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Printing3DTextureEdgeBehavior =
        Printing3DTextureEdgeBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: Printing3DTextureEdgeBehavior): Int = obj.value
  }
}
