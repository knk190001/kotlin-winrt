package Windows.UI.Input

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(EdgeGestureEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.EdgeGestureEventArgs;{44fa4a24-2d09-42e1-8b5e-368208796a4c})")
@WinRTByReference(brClass = EdgeGestureEventArgs.ByReference::class)
public class EdgeGestureEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEdgeGestureEventArgs.WithDefault, IWinRTObject {
  private val __1900294393_Interface: IEdgeGestureEventArgs.WithDefault by lazy {
    as_1900294393()
  }


  public override val __1900294393_Ptr: JNAPointer? by lazy {
    __1900294393_Interface.__1900294393_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1900294393_Interface)

  private fun as_1900294393(): IEdgeGestureEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEdgeGestureEventArgs.ABI.makeIEdgeGestureEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEdgeGestureEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEdgeGestureEventArgs.ABI.makeIEdgeGestureEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EdgeGestureEventArgs> {
    public override fun getValue() = EdgeGestureEventArgs(pointer.getPointer(0))

    public fun setValue(value: EdgeGestureEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EdgeGestureEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EdgeGestureEventArgs {
      val address = segment.toRawLongValue()
      return EdgeGestureEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EdgeGestureEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
