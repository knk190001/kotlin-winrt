package Microsoft.UI.Input

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

@ABIMarker(CrossSlidingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.CrossSlidingEventArgs;{7679641f-ba9f-543c-a7c8-6229a98f89ef})")
@WinRTByReference(brClass = CrossSlidingEventArgs.ByReference::class)
public class CrossSlidingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICrossSlidingEventArgs.WithDefault, IWinRTObject {
  private val __246625424_Interface: ICrossSlidingEventArgs.WithDefault by lazy {
    as_246625424()
  }


  public override val __246625424_Ptr: JNAPointer? by lazy {
    __246625424_Interface.__246625424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__246625424_Interface)

  private fun as_246625424(): ICrossSlidingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICrossSlidingEventArgs.ABI.makeICrossSlidingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICrossSlidingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICrossSlidingEventArgs.ABI.makeICrossSlidingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CrossSlidingEventArgs> {
    public override fun getValue() = CrossSlidingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CrossSlidingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CrossSlidingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CrossSlidingEventArgs {
      val address = segment.toRawLongValue()
      return CrossSlidingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CrossSlidingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
