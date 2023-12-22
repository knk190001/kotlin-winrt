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

@ABIMarker(PosPrinter.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.PosPrinter;{2a03c10e-9a19-4a01-994f-12dfad6adcbf})")
@WinRTByReference(brClass = PosPrinter.ByReference::class)
public class PosPrinter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPosPrinter.WithDefault, IPosPrinter2.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __574109573_Interface: IPosPrinter.WithDefault by lazy {
    as_574109573()
  }


  private val __617527629_Interface: IPosPrinter2.WithDefault by lazy {
    as_617527629()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __574109573_Ptr: JNAPointer? by lazy {
    __574109573_Interface.__574109573_Ptr
  }


  public override val __617527629_Ptr: JNAPointer? by lazy {
    __617527629_Interface.__617527629_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__574109573_Interface, __617527629_Interface, __1260617006_Interface)

  private fun as_574109573(): IPosPrinter.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinter.ABI.makeIPosPrinter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinter.ABI.makeIPosPrinter(ref.value))
  }

  private fun as_617527629(): IPosPrinter2.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinter2.ABI.makeIPosPrinter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinter2.ABI.makeIPosPrinter2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PosPrinter> {
    public override fun getValue() = PosPrinter(pointer.getPointer(0))

    public fun setValue(value: PosPrinter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PosPrinter, MemoryAddress> {
    public val IPosPrinterStatics2_Instance: IPosPrinterStatics2 by lazy {
      createIPosPrinterStatics2()
    }


    public val IPosPrinterStatics_Instance: IPosPrinterStatics by lazy {
      createIPosPrinterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPosPrinterStatics2(): IPosPrinterStatics2 {
      val refiid = Guid.REFIID(IPosPrinterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.PosPrinter".toHandle(),refiid,interfacePtr)
      val result = IPosPrinterStatics2.ABI.makeIPosPrinterStatics2(interfacePtr.value)
      return result
    }

    public fun createIPosPrinterStatics(): IPosPrinterStatics {
      val refiid = Guid.REFIID(IPosPrinterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.PosPrinter".toHandle(),refiid,interfacePtr)
      val result = IPosPrinterStatics.ABI.makeIPosPrinterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PosPrinter {
      val address = segment.toRawLongValue()
      return PosPrinter(Pointer(address))
    }

    public override fun toNative(obj: PosPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.IPosPrinterStatics2_Instance.GetDeviceSelector(connectionTypes)

    public fun GetDefaultAsync() = ABI.IPosPrinterStatics_Instance.GetDefaultAsync()

    public fun FromIdAsync(deviceId: String) = ABI.IPosPrinterStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IPosPrinterStatics_Instance.GetDeviceSelector()
  }
}
