package Windows.Devices.Perception

import Windows.Foundation.IClosable
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

@ABIMarker(PerceptionColorFrame.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionColorFrame;{fe621549-2cbf-4f94-9861-f817ea317747})")
@WinRTByReference(brClass = PerceptionColorFrame.ByReference::class)
public class PerceptionColorFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionColorFrame.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __185919191_Interface: IPerceptionColorFrame.WithDefault by lazy {
    as_185919191()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __185919191_Ptr: JNAPointer? by lazy {
    __185919191_Interface.__185919191_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__185919191_Interface, __1260617006_Interface)

  private fun as_185919191(): IPerceptionColorFrame.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrame.ABI.makeIPerceptionColorFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrame.ABI.makeIPerceptionColorFrame(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionColorFrame> {
    public override fun getValue() = PerceptionColorFrame(pointer.getPointer(0))

    public fun setValue(value: PerceptionColorFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionColorFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionColorFrame {
      val address = segment.toRawLongValue()
      return PerceptionColorFrame(Pointer(address))
    }

    public override fun toNative(obj: PerceptionColorFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
