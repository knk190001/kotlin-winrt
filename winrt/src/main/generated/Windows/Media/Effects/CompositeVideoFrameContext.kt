package Windows.Media.Effects

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

@ABIMarker(CompositeVideoFrameContext.ABI::class)
@Signature("rc(Windows.Media.Effects.CompositeVideoFrameContext;{6c30024b-f514-4278-a5f7-b9188049d110})")
@WinRTByReference(brClass = CompositeVideoFrameContext.ByReference::class)
public class CompositeVideoFrameContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositeVideoFrameContext.WithDefault, IWinRTObject {
  private val __1839476110_Interface: ICompositeVideoFrameContext.WithDefault by lazy {
    as_1839476110()
  }


  public override val __1839476110_Ptr: JNAPointer? by lazy {
    __1839476110_Interface.__1839476110_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1839476110_Interface)

  private fun as_1839476110(): ICompositeVideoFrameContext.WithDefault {
    if(pointer == NULL) {
      return(ICompositeVideoFrameContext.ABI.makeICompositeVideoFrameContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositeVideoFrameContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositeVideoFrameContext.ABI.makeICompositeVideoFrameContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositeVideoFrameContext> {
    public override fun getValue() = CompositeVideoFrameContext(pointer.getPointer(0))

    public fun setValue(value: CompositeVideoFrameContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositeVideoFrameContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositeVideoFrameContext {
      val address = segment.toRawLongValue()
      return CompositeVideoFrameContext(Pointer(address))
    }

    public override fun toNative(obj: CompositeVideoFrameContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
