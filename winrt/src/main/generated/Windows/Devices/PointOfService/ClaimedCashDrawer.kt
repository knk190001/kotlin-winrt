package Windows.Devices.PointOfService

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

@ABIMarker(ClaimedCashDrawer.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedCashDrawer;{ca3f99af-abb8-42c1-8a84-5c66512f5a75})")
@WinRTByReference(brClass = ClaimedCashDrawer.ByReference::class)
public class ClaimedCashDrawer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedCashDrawer.WithDefault, IClaimedCashDrawer2.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __2077204736_Interface: IClaimedCashDrawer.WithDefault by lazy {
    as_2077204736()
  }


  private val __31162574_Interface: IClaimedCashDrawer2.WithDefault by lazy {
    as_31162574()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2077204736_Ptr: JNAPointer? by lazy {
    __2077204736_Interface.__2077204736_Ptr
  }


  public override val __31162574_Ptr: JNAPointer? by lazy {
    __31162574_Interface.__31162574_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2077204736_Interface, __31162574_Interface, __1260617006_Interface)

  private fun as_2077204736(): IClaimedCashDrawer.WithDefault {
    if(pointer == NULL) {
      return(IClaimedCashDrawer.ABI.makeIClaimedCashDrawer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedCashDrawer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedCashDrawer.ABI.makeIClaimedCashDrawer(ref.value))
  }

  private fun as_31162574(): IClaimedCashDrawer2.WithDefault {
    if(pointer == NULL) {
      return(IClaimedCashDrawer2.ABI.makeIClaimedCashDrawer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedCashDrawer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedCashDrawer2.ABI.makeIClaimedCashDrawer2(ref.value))
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
      IByReference<ClaimedCashDrawer> {
    public override fun getValue() = ClaimedCashDrawer(pointer.getPointer(0))

    public fun setValue(value: ClaimedCashDrawer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedCashDrawer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedCashDrawer {
      val address = segment.toRawLongValue()
      return ClaimedCashDrawer(Pointer(address))
    }

    public override fun toNative(obj: ClaimedCashDrawer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
