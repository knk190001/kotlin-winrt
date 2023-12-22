package Windows.Services.Maps

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

@ABIMarker(MapRouteDrivingOptions.ABI::class)
@Signature("rc(Windows.Services.Maps.MapRouteDrivingOptions;{6815364d-c6dc-4697-a452-b18f8f0b67a1})")
@WinRTByReference(brClass = MapRouteDrivingOptions.ByReference::class)
public class MapRouteDrivingOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapRouteDrivingOptions.WithDefault, IMapRouteDrivingOptions2.WithDefault,
    IWinRTObject {
  private val __2094851375_Interface: IMapRouteDrivingOptions.WithDefault by lazy {
    as_2094851375()
  }


  private val __515883135_Interface: IMapRouteDrivingOptions2.WithDefault by lazy {
    as_515883135()
  }


  public override val __2094851375_Ptr: JNAPointer? by lazy {
    __2094851375_Interface.__2094851375_Ptr
  }


  public override val __515883135_Ptr: JNAPointer? by lazy {
    __515883135_Interface.__515883135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2094851375_Interface, __515883135_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2094851375(): IMapRouteDrivingOptions.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteDrivingOptions.ABI.makeIMapRouteDrivingOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteDrivingOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteDrivingOptions.ABI.makeIMapRouteDrivingOptions(ref.value))
  }

  private fun as_515883135(): IMapRouteDrivingOptions2.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteDrivingOptions2.ABI.makeIMapRouteDrivingOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteDrivingOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteDrivingOptions2.ABI.makeIMapRouteDrivingOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapRouteDrivingOptions> {
    public override fun getValue() = MapRouteDrivingOptions(pointer.getPointer(0))

    public fun setValue(value: MapRouteDrivingOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteDrivingOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapRouteDrivingOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapRouteDrivingOptions {
      val address = segment.toRawLongValue()
      return MapRouteDrivingOptions(Pointer(address))
    }

    public override fun toNative(obj: MapRouteDrivingOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
