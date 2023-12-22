package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapBillboardFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapBillboard.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapBillboard;{1694259d-0ae2-4f42-a02e-292ca835d39d})")
@WinRTByReference(brClass = MapBillboard.ByReference::class)
public class MapBillboard(
  ptr: JNAPointer? = NULL
) : MapElement(ptr), IMapBillboard.WithDefault, IWinRTObject {
  private val __1172952340_Interface: IMapBillboard.WithDefault by lazy {
    as_1172952340()
  }


  public override val __1172952340_Ptr: JNAPointer? by lazy {
    __1172952340_Interface.__1172952340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1172952340_Interface)

  public constructor(camera: MapCamera) : this(ABI.activate(camera))

  private fun as_1172952340(): IMapBillboard.WithDefault {
    if(pointer == NULL) {
      return(IMapBillboard.ABI.makeIMapBillboard(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapBillboard>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapBillboard.ABI.makeIMapBillboard(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapBillboard> {
    public override fun getValue() = MapBillboard(pointer.getPointer(0))

    public fun setValue(value: MapBillboard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapBillboard, MemoryAddress> {
    public val IMapBillboardStatics_Instance: IMapBillboardStatics by lazy {
      createIMapBillboardStatics()
    }


    public val IMapBillboardFactory_Instance: IMapBillboardFactory by lazy {
      createIMapBillboardFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapBillboardStatics(): IMapBillboardStatics {
      val refiid = Guid.REFIID(IMapBillboardStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapBillboard".toHandle(),refiid,interfacePtr)
      val result = IMapBillboardStatics.ABI.makeIMapBillboardStatics(interfacePtr.value)
      return result
    }

    public fun createIMapBillboardFactory(): IMapBillboardFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapBillboard".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapBillboardFactory.ABI.makeIMapBillboardFactory(factoryActivatorPtr.value))
    }

    public fun activate(camera: MapCamera): JNAPointer? =
        IMapBillboardFactory_Instance.CreateInstanceFromCamera(camera)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapBillboard {
      val address = segment.toRawLongValue()
      return MapBillboard(Pointer(address))
    }

    public override fun toNative(obj: MapBillboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LocationProperty() = ABI.IMapBillboardStatics_Instance.get_LocationProperty()

    public fun get_NormalizedAnchorPointProperty() =
        ABI.IMapBillboardStatics_Instance.get_NormalizedAnchorPointProperty()

    public fun get_CollisionBehaviorDesiredProperty() =
        ABI.IMapBillboardStatics_Instance.get_CollisionBehaviorDesiredProperty()
  }
}
