package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidNumericControlDescription.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription;{638d5e86-1d97-4c75-927f-5ff58ba05e32})")
@WinRTByReference(brClass = HidNumericControlDescription.ByReference::class)
public class HidNumericControlDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidNumericControlDescription.WithDefault, IWinRTObject {
  private val __404150100_Interface: IHidNumericControlDescription.WithDefault by lazy {
    as_404150100()
  }


  public override val __404150100_Ptr: JNAPointer? by lazy {
    __404150100_Interface.__404150100_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__404150100_Interface)

  private fun as_404150100(): IHidNumericControlDescription.WithDefault {
    if(pointer == NULL) {
      return(IHidNumericControlDescription.ABI.makeIHidNumericControlDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidNumericControlDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidNumericControlDescription.ABI.makeIHidNumericControlDescription(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidNumericControlDescription> {
    public override fun getValue() = HidNumericControlDescription(pointer.getPointer(0))

    public fun setValue(value: HidNumericControlDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidNumericControlDescription, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidNumericControlDescription {
      val address = segment.toRawLongValue()
      return HidNumericControlDescription(Pointer(address))
    }

    public override fun toNative(obj: HidNumericControlDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
