package Microsoft.Windows.ApplicationModel.Resources

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

@ABIMarker(ResourceCandidateKind.ABI::class)
@Signature("enum(Microsoft.Windows.ApplicationModel.Resources.ResourceCandidateKind;i4)")
@WinRTByReference(brClass = ResourceCandidateKind.ByReference::class)
public enum class ResourceCandidateKind(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  String(1),
  FilePath(2),
  EmbeddedData(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ResourceCandidateKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> String
      2 -> FilePath
      3 -> EmbeddedData
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ResourceCandidateKind> {
    public fun setValue(newValue: ResourceCandidateKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ResourceCandidateKind =
        ResourceCandidateKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ResourceCandidateKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ResourceCandidateKind =
        ResourceCandidateKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ResourceCandidateKind): Int = obj.value
  }
}
