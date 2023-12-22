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

@ABIMarker(MapTargetCameraChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTargetCameraChangedEventArgs;{dbf00472-e953-4fa8-97d0-ea86359057cf})")
@WinRTByReference(brClass = MapTargetCameraChangedEventArgs.ByReference::class)
public class MapTargetCameraChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapTargetCameraChangedEventArgs.WithDefault,
    IMapTargetCameraChangedEventArgs2.WithDefault, IWinRTObject {
  private val __1719514492_Interface: IMapTargetCameraChangedEventArgs.WithDefault by lazy {
    as_1719514492()
  }


  private val __1765341650_Interface: IMapTargetCameraChangedEventArgs2.WithDefault by lazy {
    as_1765341650()
  }


  public override val __1719514492_Ptr: JNAPointer? by lazy {
    __1719514492_Interface.__1719514492_Ptr
  }


  public override val __1765341650_Ptr: JNAPointer? by lazy {
    __1765341650_Interface.__1765341650_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1719514492_Interface, __1765341650_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1719514492(): IMapTargetCameraChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapTargetCameraChangedEventArgs.ABI.makeIMapTargetCameraChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTargetCameraChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTargetCameraChangedEventArgs.ABI.makeIMapTargetCameraChangedEventArgs(ref.value))
  }

  private fun as_1765341650(): IMapTargetCameraChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMapTargetCameraChangedEventArgs2.ABI.makeIMapTargetCameraChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTargetCameraChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTargetCameraChangedEventArgs2.ABI.makeIMapTargetCameraChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapTargetCameraChangedEventArgs> {
    public override fun getValue() = MapTargetCameraChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapTargetCameraChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTargetCameraChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTargetCameraChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapTargetCameraChangedEventArgs {
      val address = segment.toRawLongValue()
      return MapTargetCameraChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapTargetCameraChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
