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

@ABIMarker(MapElementsLayerPointerExitedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapElementsLayerPointerExitedEventArgs;{92f3c6ad-03ed-4c39-af20-2a07ee1ccea6})")
@WinRTByReference(brClass = MapElementsLayerPointerExitedEventArgs.ByReference::class)
public class MapElementsLayerPointerExitedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapElementsLayerPointerExitedEventArgs.WithDefault, IWinRTObject {
  private val __7855700_Interface: IMapElementsLayerPointerExitedEventArgs.WithDefault by lazy {
    as_7855700()
  }


  public override val __7855700_Ptr: JNAPointer? by lazy {
    __7855700_Interface.__7855700_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__7855700_Interface)

  public constructor() : this(ABI.activate())

  private fun as_7855700(): IMapElementsLayerPointerExitedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapElementsLayerPointerExitedEventArgs.ABI.makeIMapElementsLayerPointerExitedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElementsLayerPointerExitedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElementsLayerPointerExitedEventArgs.ABI.makeIMapElementsLayerPointerExitedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapElementsLayerPointerExitedEventArgs> {
    public override fun getValue() = MapElementsLayerPointerExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapElementsLayerPointerExitedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapElementsLayerPointerExitedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElementsLayerPointerExitedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapElementsLayerPointerExitedEventArgs {
      val address = segment.toRawLongValue()
      return MapElementsLayerPointerExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapElementsLayerPointerExitedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
