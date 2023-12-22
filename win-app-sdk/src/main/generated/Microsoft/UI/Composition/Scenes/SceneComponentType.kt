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

@ABIMarker(SceneComponentType.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Scenes.SceneComponentType;i4)")
@WinRTByReference(brClass = SceneComponentType.ByReference::class)
public enum class SceneComponentType(
  public val value: Int
) : NativeMapped {
  MeshRendererComponent(0),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SceneComponentType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> MeshRendererComponent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SceneComponentType> {
    public fun setValue(newValue: SceneComponentType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SceneComponentType =
        SceneComponentType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SceneComponentType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SceneComponentType =
        SceneComponentType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SceneComponentType): Int = obj.value
  }
}
