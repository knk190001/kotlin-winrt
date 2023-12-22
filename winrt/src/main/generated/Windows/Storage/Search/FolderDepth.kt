package Windows.Storage.Search

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

@ABIMarker(FolderDepth.ABI::class)
@Signature("enum(Windows.Storage.Search.FolderDepth;i4)")
@WinRTByReference(brClass = FolderDepth.ByReference::class)
public enum class FolderDepth(
  public val value: Int
) : NativeMapped {
  Shallow(0),
  Deep(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FolderDepth {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Shallow
      1 -> Deep
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FolderDepth> {
    public fun setValue(newValue: FolderDepth): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FolderDepth =
        FolderDepth.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FolderDepth, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FolderDepth =
        FolderDepth.values()[0].fromNative(value, null)

    public override fun toNative(obj: FolderDepth): Int = obj.value
  }
}
