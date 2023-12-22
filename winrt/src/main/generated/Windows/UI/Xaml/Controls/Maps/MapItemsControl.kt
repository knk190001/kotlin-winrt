package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(MapItemsControl.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapItemsControl;{94c2c4d3-b335-42c5-b660-e6a07ec3bddc})")
@WinRTByReference(brClass = MapItemsControl.ByReference::class)
public class MapItemsControl(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapItemsControl.WithDefault, IWinRTObject {
  private val __1314583432_Interface: IMapItemsControl.WithDefault by lazy {
    as_1314583432()
  }


  public override val __1314583432_Ptr: JNAPointer? by lazy {
    __1314583432_Interface.__1314583432_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1314583432_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1314583432(): IMapItemsControl.WithDefault {
    if(pointer == NULL) {
      return(IMapItemsControl.ABI.makeIMapItemsControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapItemsControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapItemsControl.ABI.makeIMapItemsControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapItemsControl> {
    public override fun getValue() = MapItemsControl(pointer.getPointer(0))

    public fun setValue(value: MapItemsControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapItemsControl, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapItemsControlStatics_Instance: IMapItemsControlStatics by lazy {
      createIMapItemsControlStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapItemsControl".toHandle(),
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

    public fun createIMapItemsControlStatics(): IMapItemsControlStatics {
      val refiid = Guid.REFIID(IMapItemsControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapItemsControl".toHandle(),refiid,interfacePtr)
      val result = IMapItemsControlStatics.ABI.makeIMapItemsControlStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapItemsControl {
      val address = segment.toRawLongValue()
      return MapItemsControl(Pointer(address))
    }

    public override fun toNative(obj: MapItemsControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsSourceProperty() =
        ABI.IMapItemsControlStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemsProperty() = ABI.IMapItemsControlStatics_Instance.get_ItemsProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IMapItemsControlStatics_Instance.get_ItemTemplateProperty()
  }
}
