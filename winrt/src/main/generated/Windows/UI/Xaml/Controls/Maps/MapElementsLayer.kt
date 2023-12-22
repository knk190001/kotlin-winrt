package Windows.UI.Xaml.Controls.Maps

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapElementsLayer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapElementsLayer;{de79689a-01ef-46f4-ac60-7c200b552610})")
@WinRTByReference(brClass = MapElementsLayer.ByReference::class)
public class MapElementsLayer(
  ptr: JNAPointer? = NULL
) : MapLayer(ptr), IMapElementsLayer.WithDefault, IWinRTObject {
  private val __347418129_Interface: IMapElementsLayer.WithDefault by lazy {
    as_347418129()
  }


  public override val __347418129_Ptr: JNAPointer? by lazy {
    __347418129_Interface.__347418129_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__347418129_Interface)

  public constructor() : this(ABI.activate())

  private fun as_347418129(): IMapElementsLayer.WithDefault {
    if(pointer == NULL) {
      return(IMapElementsLayer.ABI.makeIMapElementsLayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElementsLayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElementsLayer.ABI.makeIMapElementsLayer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapElementsLayer> {
    public override fun getValue() = MapElementsLayer(pointer.getPointer(0))

    public fun setValue(value: MapElementsLayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapElementsLayer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapElementsLayerStatics_Instance: IMapElementsLayerStatics by lazy {
      createIMapElementsLayerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElementsLayer".toHandle(),
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

    public fun createIMapElementsLayerStatics(): IMapElementsLayerStatics {
      val refiid = Guid.REFIID(IMapElementsLayerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElementsLayer".toHandle(),refiid,interfacePtr)
      val result = IMapElementsLayerStatics.ABI.makeIMapElementsLayerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapElementsLayer {
      val address = segment.toRawLongValue()
      return MapElementsLayer(Pointer(address))
    }

    public override fun toNative(obj: MapElementsLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MapElementsProperty() =
        ABI.IMapElementsLayerStatics_Instance.get_MapElementsProperty()
  }
}
