package Windows.Media.Capture.Frames

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

@ABIMarker(BufferMediaFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.BufferMediaFrame;{b5b153c7-9b84-4062-b79c-a365b2596854})")
@WinRTByReference(brClass = BufferMediaFrame.ByReference::class)
public class BufferMediaFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBufferMediaFrame.WithDefault, IWinRTObject {
  private val __993697391_Interface: IBufferMediaFrame.WithDefault by lazy {
    as_993697391()
  }


  public override val __993697391_Ptr: JNAPointer? by lazy {
    __993697391_Interface.__993697391_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__993697391_Interface)

  private fun as_993697391(): IBufferMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IBufferMediaFrame.ABI.makeIBufferMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBufferMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBufferMediaFrame.ABI.makeIBufferMediaFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BufferMediaFrame> {
    public override fun getValue() = BufferMediaFrame(pointer.getPointer(0))

    public fun setValue(value: BufferMediaFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BufferMediaFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BufferMediaFrame {
      val address = segment.toRawLongValue()
      return BufferMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: BufferMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
