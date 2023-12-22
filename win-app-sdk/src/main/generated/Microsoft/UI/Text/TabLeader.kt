package Microsoft.UI.Text

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

@ABIMarker(TabLeader.ABI::class)
@Signature("enum(Microsoft.UI.Text.TabLeader;i4)")
@WinRTByReference(brClass = TabLeader.ByReference::class)
public enum class TabLeader(
  public val value: Int
) : NativeMapped {
  Spaces(0),
  Dots(1),
  Dashes(2),
  Lines(3),
  ThickLines(4),
  Equals(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): TabLeader {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Spaces
      1 -> Dots
      2 -> Dashes
      3 -> Lines
      4 -> ThickLines
      5 -> Equals
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TabLeader> {
    public fun setValue(newValue: TabLeader): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TabLeader =
        TabLeader.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TabLeader, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TabLeader =
        TabLeader.values()[0].fromNative(value, null)

    public override fun toNative(obj: TabLeader): Int = obj.value
  }
}
