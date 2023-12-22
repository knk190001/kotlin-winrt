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

@ABIMarker(PerceptionInfraredFrame.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrame;{b0886276-849e-4c7a-8ae6-b56064532153})")
@WinRTByReference(brClass = PerceptionInfraredFrame.ByReference::class)
public class PerceptionInfraredFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrame.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __642554113_Interface: IPerceptionInfraredFrame.WithDefault by lazy {
    as_642554113()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __642554113_Ptr: JNAPointer? by lazy {
    __642554113_Interface.__642554113_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__642554113_Interface, __1260617006_Interface)

  private fun as_642554113(): IPerceptionInfraredFrame.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrame.ABI.makeIPerceptionInfraredFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrame.ABI.makeIPerceptionInfraredFrame(ref.value))
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
      IByReference<PerceptionInfraredFrame> {
    public override fun getValue() = PerceptionInfraredFrame(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionInfraredFrame {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrame(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
