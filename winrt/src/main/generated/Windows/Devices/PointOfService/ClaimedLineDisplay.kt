package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ClaimedLineDisplay.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedLineDisplay;{120ac970-9a75-4acf-aae7-09972bcf8794})")
@WinRTByReference(brClass = ClaimedLineDisplay.ByReference::class)
public class ClaimedLineDisplay(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedLineDisplay.WithDefault, IClaimedLineDisplay2.WithDefault,
    IClaimedLineDisplay3.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1323330894_Interface: IClaimedLineDisplay.WithDefault by lazy {
    as_1323330894()
  }


  private val __1926415296_Interface: IClaimedLineDisplay2.WithDefault by lazy {
    as_1926415296()
  }


  private val __1926415297_Interface: IClaimedLineDisplay3.WithDefault by lazy {
    as_1926415297()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1323330894_Ptr: JNAPointer? by lazy {
    __1323330894_Interface.__1323330894_Ptr
  }


  public override val __1926415296_Ptr: JNAPointer? by lazy {
    __1926415296_Interface.__1926415296_Ptr
  }


  public override val __1926415297_Ptr: JNAPointer? by lazy {
    __1926415297_Interface.__1926415297_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1323330894_Interface, __1926415296_Interface, __1926415297_Interface,
        __1260617006_Interface)

  private fun as_1323330894(): IClaimedLineDisplay.WithDefault {
    if(pointer == NULL) {
      return(IClaimedLineDisplay.ABI.makeIClaimedLineDisplay(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedLineDisplay>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedLineDisplay.ABI.makeIClaimedLineDisplay(ref.value))
  }

  private fun as_1926415296(): IClaimedLineDisplay2.WithDefault {
    if(pointer == NULL) {
      return(IClaimedLineDisplay2.ABI.makeIClaimedLineDisplay2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedLineDisplay2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedLineDisplay2.ABI.makeIClaimedLineDisplay2(ref.value))
  }

  private fun as_1926415297(): IClaimedLineDisplay3.WithDefault {
    if(pointer == NULL) {
      return(IClaimedLineDisplay3.ABI.makeIClaimedLineDisplay3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedLineDisplay3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedLineDisplay3.ABI.makeIClaimedLineDisplay3(ref.value))
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
      IByReference<ClaimedLineDisplay> {
    public override fun getValue() = ClaimedLineDisplay(pointer.getPointer(0))

    public fun setValue(value: ClaimedLineDisplay): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedLineDisplay, MemoryAddress> {
    public val IClaimedLineDisplayStatics_Instance: IClaimedLineDisplayStatics by lazy {
      createIClaimedLineDisplayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIClaimedLineDisplayStatics(): IClaimedLineDisplayStatics {
      val refiid = Guid.REFIID(IClaimedLineDisplayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.ClaimedLineDisplay".toHandle(),refiid,interfacePtr)
      val result = IClaimedLineDisplayStatics.ABI.makeIClaimedLineDisplayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ClaimedLineDisplay {
      val address = segment.toRawLongValue()
      return ClaimedLineDisplay(Pointer(address))
    }

    public override fun toNative(obj: ClaimedLineDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IClaimedLineDisplayStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IClaimedLineDisplayStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.IClaimedLineDisplayStatics_Instance.GetDeviceSelector(connectionTypes)
  }
}
