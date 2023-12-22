package Windows.Devices.Geolocation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(GeovisitMonitor.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.GeovisitMonitor;{80118aaf-5944-4591-83c1-396647f54f2c})")
@WinRTByReference(brClass = GeovisitMonitor.ByReference::class)
public class GeovisitMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeovisitMonitor.WithDefault, IWinRTObject {
  private val __447644161_Interface: IGeovisitMonitor.WithDefault by lazy {
    as_447644161()
  }


  public override val __447644161_Ptr: JNAPointer? by lazy {
    __447644161_Interface.__447644161_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__447644161_Interface)

  public constructor() : this(ABI.activate())

  private fun as_447644161(): IGeovisitMonitor.WithDefault {
    if(pointer == NULL) {
      return(IGeovisitMonitor.ABI.makeIGeovisitMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeovisitMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeovisitMonitor.ABI.makeIGeovisitMonitor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeovisitMonitor> {
    public override fun getValue() = GeovisitMonitor(pointer.getPointer(0))

    public fun setValue(value: GeovisitMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeovisitMonitor, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGeovisitMonitorStatics_Instance: IGeovisitMonitorStatics by lazy {
      createIGeovisitMonitorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.GeovisitMonitor".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIGeovisitMonitorStatics(): IGeovisitMonitorStatics {
      val refiid = Guid.REFIID(IGeovisitMonitorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.GeovisitMonitor".toHandle(),refiid,interfacePtr)
      val result = IGeovisitMonitorStatics.ABI.makeIGeovisitMonitorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GeovisitMonitor {
      val address = segment.toRawLongValue()
      return GeovisitMonitor(Pointer(address))
    }

    public override fun toNative(obj: GeovisitMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetLastReportAsync() = ABI.IGeovisitMonitorStatics_Instance.GetLastReportAsync()
  }
}
