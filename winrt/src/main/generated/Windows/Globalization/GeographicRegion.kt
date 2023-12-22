package Windows.Globalization

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GeographicRegion.ABI::class)
@Signature("rc(Windows.Globalization.GeographicRegion;{01e9a621-4a64-4ed9-954f-9edeb07bd903})")
@WinRTByReference(brClass = GeographicRegion.ByReference::class)
public class GeographicRegion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeographicRegion.WithDefault, IWinRTObject {
  private val __764805758_Interface: IGeographicRegion.WithDefault by lazy {
    as_764805758()
  }


  public override val __764805758_Ptr: JNAPointer? by lazy {
    __764805758_Interface.__764805758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__764805758_Interface)

  public constructor() : this(ABI.activate())

  public constructor(geographicRegionCode: String) : this(ABI.activate(geographicRegionCode))

  private fun as_764805758(): IGeographicRegion.WithDefault {
    if(pointer == NULL) {
      return(IGeographicRegion.ABI.makeIGeographicRegion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeographicRegion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeographicRegion.ABI.makeIGeographicRegion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeographicRegion> {
    public override fun getValue() = GeographicRegion(pointer.getPointer(0))

    public fun setValue(value: GeographicRegion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeographicRegion, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGeographicRegionStatics_Instance: IGeographicRegionStatics by lazy {
      createIGeographicRegionStatics()
    }


    public val IGeographicRegionFactory_Instance: IGeographicRegionFactory by lazy {
      createIGeographicRegionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Globalization.GeographicRegion".toHandle(),
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

    public fun createIGeographicRegionStatics(): IGeographicRegionStatics {
      val refiid = Guid.REFIID(IGeographicRegionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.GeographicRegion".toHandle(),refiid,interfacePtr)
      val result = IGeographicRegionStatics.ABI.makeIGeographicRegionStatics(interfacePtr.value)
      return result
    }

    public fun createIGeographicRegionFactory(): IGeographicRegionFactory {
      val refiid = Guid.REFIID(IGeographicRegionFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.GeographicRegion".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeographicRegionFactory.ABI.makeIGeographicRegionFactory(factoryActivatorPtr.value))
    }

    public fun activate(geographicRegionCode: String): JNAPointer? =
        IGeographicRegionFactory_Instance.CreateGeographicRegion(geographicRegionCode)?.pointer

    public override fun fromNative(segment: MemoryAddress): GeographicRegion {
      val address = segment.toRawLongValue()
      return GeographicRegion(Pointer(address))
    }

    public override fun toNative(obj: GeographicRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported(geographicRegionCode: String) =
        ABI.IGeographicRegionStatics_Instance.IsSupported(geographicRegionCode)
  }
}
