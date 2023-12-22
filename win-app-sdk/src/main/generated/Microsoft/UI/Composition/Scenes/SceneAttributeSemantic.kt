package Microsoft.UI.Composition.Scenes

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

@ABIMarker(SceneAttributeSemantic.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Scenes.SceneAttributeSemantic;i4)")
@WinRTByReference(brClass = SceneAttributeSemantic.ByReference::class)
public enum class SceneAttributeSemantic(
  public val value: Int
) : NativeMapped {
  Index(0),
  Vertex(1),
  Normal(2),
  TexCoord0(3),
  TexCoord1(4),
  Color(5),
  Tangent(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SceneAttributeSemantic {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Index
      1 -> Vertex
      2 -> Normal
      3 -> TexCoord0
      4 -> TexCoord1
      5 -> Color
      6 -> Tangent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SceneAttributeSemantic> {
    public fun setValue(newValue: SceneAttributeSemantic): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SceneAttributeSemantic =
        SceneAttributeSemantic.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SceneAttributeSemantic, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SceneAttributeSemantic =
        SceneAttributeSemantic.values()[0].fromNative(value, null)

    public override fun toNative(obj: SceneAttributeSemantic): Int = obj.value
  }
}
