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

@ABIMarker(BarcodeScanner.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScanner;{bea33e06-b264-4f03-a9c1-45b20f01134f})")
@WinRTByReference(brClass = BarcodeScanner.ByReference::class)
public class BarcodeScanner(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScanner.WithDefault, IBarcodeScanner2.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __1247617475_Interface: IBarcodeScanner.WithDefault by lazy {
    as_1247617475()
  }


  private val __21436011_Interface: IBarcodeScanner2.WithDefault by lazy {
    as_21436011()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1247617475_Ptr: JNAPointer? by lazy {
    __1247617475_Interface.__1247617475_Ptr
  }


  public override val __21436011_Ptr: JNAPointer? by lazy {
    __21436011_Interface.__21436011_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1247617475_Interface, __21436011_Interface, __1260617006_Interface)

  private fun as_1247617475(): IBarcodeScanner.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScanner.ABI.makeIBarcodeScanner(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScanner>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScanner.ABI.makeIBarcodeScanner(ref.value))
  }

  private fun as_21436011(): IBarcodeScanner2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScanner2.ABI.makeIBarcodeScanner2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScanner2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScanner2.ABI.makeIBarcodeScanner2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BarcodeScanner>
      {
    public override fun getValue() = BarcodeScanner(pointer.getPointer(0))

    public fun setValue(value: BarcodeScanner): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScanner, MemoryAddress> {
    public val IBarcodeScannerStatics2_Instance: IBarcodeScannerStatics2 by lazy {
      createIBarcodeScannerStatics2()
    }


    public val IBarcodeScannerStatics_Instance: IBarcodeScannerStatics by lazy {
      createIBarcodeScannerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBarcodeScannerStatics2(): IBarcodeScannerStatics2 {
      val refiid = Guid.REFIID(IBarcodeScannerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.BarcodeScanner".toHandle(),refiid,interfacePtr)
      val result = IBarcodeScannerStatics2.ABI.makeIBarcodeScannerStatics2(interfacePtr.value)
      return result
    }

    public fun createIBarcodeScannerStatics(): IBarcodeScannerStatics {
      val refiid = Guid.REFIID(IBarcodeScannerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.BarcodeScanner".toHandle(),refiid,interfacePtr)
      val result = IBarcodeScannerStatics.ABI.makeIBarcodeScannerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BarcodeScanner {
      val address = segment.toRawLongValue()
      return BarcodeScanner(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.IBarcodeScannerStatics2_Instance.GetDeviceSelector(connectionTypes)

    public fun GetDefaultAsync() = ABI.IBarcodeScannerStatics_Instance.GetDefaultAsync()

    public fun FromIdAsync(deviceId: String) =
        ABI.IBarcodeScannerStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IBarcodeScannerStatics_Instance.GetDeviceSelector()
  }
}
