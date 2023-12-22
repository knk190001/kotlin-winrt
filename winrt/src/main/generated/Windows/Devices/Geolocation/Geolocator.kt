package Windows.Devices.Geolocation

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(Geolocator.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geolocator;{a9c3bf62-4524-4989-8aa9-de019d2e551f})")
@WinRTByReference(brClass = Geolocator.ByReference::class)
public class Geolocator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeolocator.WithDefault, IGeolocatorWithScalarAccuracy.WithDefault,
    IGeolocator2.WithDefault, IWinRTObject {
  private val __559978268_Interface: IGeolocator.WithDefault by lazy {
    as_559978268()
  }


  private val __1615294319_Interface: IGeolocatorWithScalarAccuracy.WithDefault by lazy {
    as_1615294319()
  }


  private val __179457074_Interface: IGeolocator2.WithDefault by lazy {
    as_179457074()
  }


  public override val __559978268_Ptr: JNAPointer? by lazy {
    __559978268_Interface.__559978268_Ptr
  }


  public override val __1615294319_Ptr: JNAPointer? by lazy {
    __1615294319_Interface.__1615294319_Ptr
  }


  public override val __179457074_Ptr: JNAPointer? by lazy {
    __179457074_Interface.__179457074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__559978268_Interface, __1615294319_Interface, __179457074_Interface)

  public constructor() : this(ABI.activate())

  private fun as_559978268(): IGeolocator.WithDefault {
    if(pointer == NULL) {
      return(IGeolocator.ABI.makeIGeolocator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeolocator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeolocator.ABI.makeIGeolocator(ref.value))
  }

  private fun as_1615294319(): IGeolocatorWithScalarAccuracy.WithDefault {
    if(pointer == NULL) {
      return(IGeolocatorWithScalarAccuracy.ABI.makeIGeolocatorWithScalarAccuracy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeolocatorWithScalarAccuracy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeolocatorWithScalarAccuracy.ABI.makeIGeolocatorWithScalarAccuracy(ref.value))
  }

  private fun as_179457074(): IGeolocator2.WithDefault {
    if(pointer == NULL) {
      return(IGeolocator2.ABI.makeIGeolocator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeolocator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeolocator2.ABI.makeIGeolocator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geolocator> {
    public override fun getValue() = Geolocator(pointer.getPointer(0))

    public fun setValue(value: Geolocator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geolocator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGeolocatorStatics_Instance: IGeolocatorStatics by lazy {
      createIGeolocatorStatics()
    }


    public val IGeolocatorStatics2_Instance: IGeolocatorStatics2 by lazy {
      createIGeolocatorStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geolocator".toHandle(),
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

    public fun createIGeolocatorStatics(): IGeolocatorStatics {
      val refiid = Guid.REFIID(IGeolocatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geolocator".toHandle(),refiid,interfacePtr)
      val result = IGeolocatorStatics.ABI.makeIGeolocatorStatics(interfacePtr.value)
      return result
    }

    public fun createIGeolocatorStatics2(): IGeolocatorStatics2 {
      val refiid = Guid.REFIID(IGeolocatorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geolocator".toHandle(),refiid,interfacePtr)
      val result = IGeolocatorStatics2.ABI.makeIGeolocatorStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Geolocator {
      val address = segment.toRawLongValue()
      return Geolocator(Pointer(address))
    }

    public override fun toNative(obj: Geolocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestAccessAsync() = ABI.IGeolocatorStatics_Instance.RequestAccessAsync()

    public fun GetGeopositionHistoryAsync(startTime: DateTime) =
        ABI.IGeolocatorStatics_Instance.GetGeopositionHistoryAsync(startTime)

    public fun GetGeopositionHistoryAsync(startTime: DateTime, duration: TimeSpan) =
        ABI.IGeolocatorStatics_Instance.GetGeopositionHistoryAsync(startTime, duration)

    public fun get_IsDefaultGeopositionRecommended() =
        ABI.IGeolocatorStatics2_Instance.get_IsDefaultGeopositionRecommended()

    public fun put_DefaultGeoposition(value: IReference<BasicGeoposition?>) =
        ABI.IGeolocatorStatics2_Instance.put_DefaultGeoposition(value)

    public fun get_DefaultGeoposition() = ABI.IGeolocatorStatics2_Instance.get_DefaultGeoposition()
  }
}
