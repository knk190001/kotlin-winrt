package Windows.UI.Xaml.Controls.Maps

import Windows.Services.Maps.MapRoute
import Windows.UI.Xaml.Controls.Maps.IMapRouteViewFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(MapRouteView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapRouteView;{740eaec5-bacc-41e1-a67e-dd6513832049})")
@WinRTByReference(brClass = MapRouteView.ByReference::class)
public open class MapRouteView(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapRouteView.WithDefault, IWinRTObject {
  private val __480923037_Interface: IMapRouteView.WithDefault by lazy {
    as_480923037()
  }


  public override val __480923037_Ptr: JNAPointer? by lazy {
    __480923037_Interface.__480923037_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__480923037_Interface)

  public constructor(route: MapRoute) : this(ABI.activate(route))

  private fun as_480923037(): IMapRouteView.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteView.ABI.makeIMapRouteView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteView.ABI.makeIMapRouteView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapRouteView> {
    public override fun getValue() = MapRouteView(pointer.getPointer(0))

    public fun setValue(value: MapRouteView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteView, MemoryAddress> {
    public val IMapRouteViewFactory_Instance: IMapRouteViewFactory by lazy {
      createIMapRouteViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapRouteViewFactory(): IMapRouteViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapRouteView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapRouteViewFactory.ABI.makeIMapRouteViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(route: MapRoute): JNAPointer? =
        IMapRouteViewFactory_Instance.CreateInstanceWithMapRoute(route, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapRouteView {
      val address = segment.toRawLongValue()
      return MapRouteView(Pointer(address))
    }

    public override fun toNative(obj: MapRouteView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
