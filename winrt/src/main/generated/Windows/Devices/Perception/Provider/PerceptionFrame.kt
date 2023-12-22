package Windows.Devices.Perception.Provider

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

@ABIMarker(PerceptionFrame.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionFrame;{7cfe7825-54bb-4d9d-bec5-8ef66151d2ac})")
@WinRTByReference(brClass = PerceptionFrame.ByReference::class)
public class PerceptionFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionFrame.WithDefault, IWinRTObject {
  private val __1010981277_Interface: IPerceptionFrame.WithDefault by lazy {
    as_1010981277()
  }


  public override val __1010981277_Ptr: JNAPointer? by lazy {
    __1010981277_Interface.__1010981277_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1010981277_Interface)

  private fun as_1010981277(): IPerceptionFrame.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionFrame.ABI.makeIPerceptionFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionFrame.ABI.makeIPerceptionFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionFrame> {
    public override fun getValue() = PerceptionFrame(pointer.getPointer(0))

    public fun setValue(value: PerceptionFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionFrame {
      val address = segment.toRawLongValue()
      return PerceptionFrame(Pointer(address))
    }

    public override fun toNative(obj: PerceptionFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
