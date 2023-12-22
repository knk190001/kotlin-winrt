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

@ABIMarker(MapActualCameraChangingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapActualCameraChangingEventArgs;{6b0dbed6-93f7-4682-8de5-a47a1cc7a945})")
@WinRTByReference(brClass = MapActualCameraChangingEventArgs.ByReference::class)
public class MapActualCameraChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapActualCameraChangingEventArgs.WithDefault,
    IMapActualCameraChangingEventArgs2.WithDefault, IWinRTObject {
  private val __99015660_Interface: IMapActualCameraChangingEventArgs.WithDefault by lazy {
    as_99015660()
  }


  private val __1225481786_Interface: IMapActualCameraChangingEventArgs2.WithDefault by lazy {
    as_1225481786()
  }


  public override val __99015660_Ptr: JNAPointer? by lazy {
    __99015660_Interface.__99015660_Ptr
  }


  public override val __1225481786_Ptr: JNAPointer? by lazy {
    __1225481786_Interface.__1225481786_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__99015660_Interface, __1225481786_Interface)

  public constructor() : this(ABI.activate())

  private fun as_99015660(): IMapActualCameraChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapActualCameraChangingEventArgs.ABI.makeIMapActualCameraChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapActualCameraChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapActualCameraChangingEventArgs.ABI.makeIMapActualCameraChangingEventArgs(ref.value))
  }

  private fun as_1225481786(): IMapActualCameraChangingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMapActualCameraChangingEventArgs2.ABI.makeIMapActualCameraChangingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapActualCameraChangingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapActualCameraChangingEventArgs2.ABI.makeIMapActualCameraChangingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapActualCameraChangingEventArgs> {
    public override fun getValue() = MapActualCameraChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapActualCameraChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapActualCameraChangingEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapActualCameraChangingEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapActualCameraChangingEventArgs {
      val address = segment.toRawLongValue()
      return MapActualCameraChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapActualCameraChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
