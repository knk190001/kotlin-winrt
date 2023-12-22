package Microsoft.UI.Xaml.Media

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

@ABIMarker(RenderingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.RenderingEventArgs;{a67c8f8d-1885-5fc9-975c-901224f79b1e})")
@WinRTByReference(brClass = RenderingEventArgs.ByReference::class)
public class RenderingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRenderingEventArgs.WithDefault, IWinRTObject {
  private val __1122017444_Interface: IRenderingEventArgs.WithDefault by lazy {
    as_1122017444()
  }


  public override val __1122017444_Ptr: JNAPointer? by lazy {
    __1122017444_Interface.__1122017444_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1122017444_Interface)

  private fun as_1122017444(): IRenderingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRenderingEventArgs.ABI.makeIRenderingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRenderingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRenderingEventArgs.ABI.makeIRenderingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RenderingEventArgs> {
    public override fun getValue() = RenderingEventArgs(pointer.getPointer(0))

    public fun setValue(value: RenderingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RenderingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RenderingEventArgs {
      val address = segment.toRawLongValue()
      return RenderingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RenderingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
