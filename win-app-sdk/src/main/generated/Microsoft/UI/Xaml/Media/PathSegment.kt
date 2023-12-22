package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PathSegment.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.PathSegment;{b922ebbe-08f0-57e9-8785-7e57097f3bd4})")
@WinRTByReference(brClass = PathSegment.ByReference::class)
public open class PathSegment(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPathSegment.WithDefault, IWinRTObject {
  private val __1930461571_Interface: IPathSegment.WithDefault by lazy {
    as_1930461571()
  }


  public override val __1930461571_Ptr: JNAPointer? by lazy {
    __1930461571_Interface.__1930461571_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1930461571_Interface)

  private fun as_1930461571(): IPathSegment.WithDefault {
    if(pointer == NULL) {
      return(IPathSegment.ABI.makeIPathSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathSegment.ABI.makeIPathSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathSegment> {
    public override fun getValue() = PathSegment(pointer.getPointer(0))

    public fun setValue(value: PathSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PathSegment {
      val address = segment.toRawLongValue()
      return PathSegment(Pointer(address))
    }

    public override fun toNative(obj: PathSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
