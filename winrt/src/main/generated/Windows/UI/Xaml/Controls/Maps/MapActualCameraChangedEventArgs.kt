package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapActualCameraChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapActualCameraChangedEventArgs;{daa080da-b7f4-422c-a618-bbaa7c1d814c})")
@WinRTByReference(brClass = MapActualCameraChangedEventArgs.ByReference::class)
public class MapActualCameraChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapActualCameraChangedEventArgs.WithDefault,
    IMapActualCameraChangedEventArgs2.WithDefault, IWinRTObject {
  private val __694466241_Interface: IMapActualCameraChangedEventArgs.WithDefault by lazy {
    as_694466241()
  }


  private val __53617041_Interface: IMapActualCameraChangedEventArgs2.WithDefault by lazy {
    as_53617041()
  }


  public override val __694466241_Ptr: JNAPointer? by lazy {
    __694466241_Interface.__694466241_Ptr
  }


  public override val __53617041_Ptr: JNAPointer? by lazy {
    __53617041_Interface.__53617041_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__694466241_Interface, __53617041_Interface)

  public constructor() : this(ABI.activate())

  private fun as_694466241(): IMapActualCameraChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapActualCameraChangedEventArgs.ABI.makeIMapActualCameraChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapActualCameraChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapActualCameraChangedEventArgs.ABI.makeIMapActualCameraChangedEventArgs(ref.value))
  }

  private fun as_53617041(): IMapActualCameraChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMapActualCameraChangedEventArgs2.ABI.makeIMapActualCameraChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapActualCameraChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapActualCameraChangedEventArgs2.ABI.makeIMapActualCameraChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapActualCameraChangedEventArgs> {
    public override fun getValue() = MapActualCameraChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapActualCameraChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapActualCameraChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapActualCameraChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapActualCameraChangedEventArgs {
      val address = segment.toRawLongValue()
      return MapActualCameraChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapActualCameraChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
