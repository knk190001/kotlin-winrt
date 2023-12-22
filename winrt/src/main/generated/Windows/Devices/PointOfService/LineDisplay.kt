package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(LineDisplay.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplay;{24f5df4e-3c99-44e2-b73f-e51be3637a8c})")
@WinRTByReference(brClass = LineDisplay.ByReference::class)
public class LineDisplay(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplay.WithDefault, ILineDisplay2.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __915136943_Interface: ILineDisplay.WithDefault by lazy {
    as_915136943()
  }


  private val __1695525789_Interface: ILineDisplay2.WithDefault by lazy {
    as_1695525789()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __915136943_Ptr: JNAPointer? by lazy {
    __915136943_Interface.__915136943_Ptr
  }


  public override val __1695525789_Ptr: JNAPointer? by lazy {
    __1695525789_Interface.__1695525789_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__915136943_Interface, __1695525789_Interface, __1260617006_Interface)

  private fun as_915136943(): ILineDisplay.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplay.ABI.makeILineDisplay(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplay>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplay.ABI.makeILineDisplay(ref.value))
  }

  private fun as_1695525789(): ILineDisplay2.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplay2.ABI.makeILineDisplay2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplay2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplay2.ABI.makeILineDisplay2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LineDisplay> {
    public override fun getValue() = LineDisplay(pointer.getPointer(0))

    public fun setValue(value: LineDisplay): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplay, MemoryAddress> {
    public val ILineDisplayStatics2_Instance: ILineDisplayStatics2 by lazy {
      createILineDisplayStatics2()
    }


    public val ILineDisplayStatics_Instance: ILineDisplayStatics by lazy {
      createILineDisplayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILineDisplayStatics2(): ILineDisplayStatics2 {
      val refiid = Guid.REFIID(ILineDisplayStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.LineDisplay".toHandle(),refiid,interfacePtr)
      val result = ILineDisplayStatics2.ABI.makeILineDisplayStatics2(interfacePtr.value)
      return result
    }

    public fun createILineDisplayStatics(): ILineDisplayStatics {
      val refiid = Guid.REFIID(ILineDisplayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.LineDisplay".toHandle(),refiid,interfacePtr)
      val result = ILineDisplayStatics.ABI.makeILineDisplayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LineDisplay {
      val address = segment.toRawLongValue()
      return LineDisplay(Pointer(address))
    }

    public override fun toNative(obj: LineDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StatisticsCategorySelector() =
        ABI.ILineDisplayStatics2_Instance.get_StatisticsCategorySelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.ILineDisplayStatics_Instance.FromIdAsync(deviceId)

    public fun GetDefaultAsync() = ABI.ILineDisplayStatics_Instance.GetDefaultAsync()

    public fun GetDeviceSelector() = ABI.ILineDisplayStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.ILineDisplayStatics_Instance.GetDeviceSelector(connectionTypes)
  }
}
