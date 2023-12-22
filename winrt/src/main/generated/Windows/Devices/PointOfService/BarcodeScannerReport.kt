package Windows.Devices.PointOfService

import Windows.Devices.PointOfService.IBarcodeScannerReportFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BarcodeScannerReport.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerReport;{5ce4d8b0-a489-4b96-86c4-f0bf8a37753d})")
@WinRTByReference(brClass = BarcodeScannerReport.ByReference::class)
public class BarcodeScannerReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerReport.WithDefault, IWinRTObject {
  private val __1209122257_Interface: IBarcodeScannerReport.WithDefault by lazy {
    as_1209122257()
  }


  public override val __1209122257_Ptr: JNAPointer? by lazy {
    __1209122257_Interface.__1209122257_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1209122257_Interface)

  public constructor(
    scanDataType: WinDef.UINT,
    scanData: IBuffer,
    scanDataLabel: IBuffer
  ) : this(ABI.activate(scanDataType, scanData, scanDataLabel))

  private fun as_1209122257(): IBarcodeScannerReport.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerReport.ABI.makeIBarcodeScannerReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerReport.ABI.makeIBarcodeScannerReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerReport> {
    public override fun getValue() = BarcodeScannerReport(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerReport, MemoryAddress> {
    public val IBarcodeScannerReportFactory_Instance: IBarcodeScannerReportFactory by lazy {
      createIBarcodeScannerReportFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBarcodeScannerReportFactory(): IBarcodeScannerReportFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.BarcodeScannerReport".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBarcodeScannerReportFactory.ABI.makeIBarcodeScannerReportFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      scanDataType: WinDef.UINT,
      scanData: IBuffer,
      scanDataLabel: IBuffer
    ): JNAPointer? = IBarcodeScannerReportFactory_Instance.CreateInstance(scanDataType, scanData,
        scanDataLabel)?.pointer

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerReport {
      val address = segment.toRawLongValue()
      return BarcodeScannerReport(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
