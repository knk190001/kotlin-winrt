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

@ABIMarker(MapPolyline.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapPolyline;{fbad24a2-24df-4a86-8ffa-0f8f4d9ec17d})")
@WinRTByReference(brClass = MapPolyline.ByReference::class)
public class MapPolyline(
  ptr: JNAPointer? = NULL
) : MapElement(ptr), IMapPolyline.WithDefault, IWinRTObject {
  private val __1398647477_Interface: IMapPolyline.WithDefault by lazy {
    as_1398647477()
  }


  public override val __1398647477_Ptr: JNAPointer? by lazy {
    __1398647477_Interface.__1398647477_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1398647477_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1398647477(): IMapPolyline.WithDefault {
    if(pointer == NULL) {
      return(IMapPolyline.ABI.makeIMapPolyline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapPolyline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapPolyline.ABI.makeIMapPolyline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapPolyline> {
    public override fun getValue() = MapPolyline(pointer.getPointer(0))

    public fun setValue(value: MapPolyline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapPolyline, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapPolylineStatics_Instance: IMapPolylineStatics by lazy {
      createIMapPolylineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapPolyline".toHandle(),
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

    public fun createIMapPolylineStatics(): IMapPolylineStatics {
      val refiid = Guid.REFIID(IMapPolylineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapPolyline".toHandle(),refiid,interfacePtr)
      val result = IMapPolylineStatics.ABI.makeIMapPolylineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapPolyline {
      val address = segment.toRawLongValue()
      return MapPolyline(Pointer(address))
    }

    public override fun toNative(obj: MapPolyline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PathProperty() = ABI.IMapPolylineStatics_Instance.get_PathProperty()

    public fun get_StrokeDashedProperty() =
        ABI.IMapPolylineStatics_Instance.get_StrokeDashedProperty()
  }
}
