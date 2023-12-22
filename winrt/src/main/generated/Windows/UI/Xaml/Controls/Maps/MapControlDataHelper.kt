package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapControlDataHelperFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapControlDataHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControlDataHelper;{8bb0f09c-14ab-486c-9de5-5a5def0205a2})")
@WinRTByReference(brClass = MapControlDataHelper.ByReference::class)
public class MapControlDataHelper(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapControlDataHelper.WithDefault, IMapControlDataHelper2.WithDefault,
    IWinRTObject {
  private val __2034232842_Interface: IMapControlDataHelper.WithDefault by lazy {
    as_2034232842()
  }


  private val __1363291288_Interface: IMapControlDataHelper2.WithDefault by lazy {
    as_1363291288()
  }


  public override val __2034232842_Ptr: JNAPointer? by lazy {
    __2034232842_Interface.__2034232842_Ptr
  }


  public override val __1363291288_Ptr: JNAPointer? by lazy {
    __1363291288_Interface.__1363291288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2034232842_Interface, __1363291288_Interface)

  public constructor(map: MapControl) : this(ABI.activate(map))

  private fun as_2034232842(): IMapControlDataHelper.WithDefault {
    if(pointer == NULL) {
      return(IMapControlDataHelper.ABI.makeIMapControlDataHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlDataHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlDataHelper.ABI.makeIMapControlDataHelper(ref.value))
  }

  private fun as_1363291288(): IMapControlDataHelper2.WithDefault {
    if(pointer == NULL) {
      return(IMapControlDataHelper2.ABI.makeIMapControlDataHelper2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlDataHelper2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlDataHelper2.ABI.makeIMapControlDataHelper2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlDataHelper> {
    public override fun getValue() = MapControlDataHelper(pointer.getPointer(0))

    public fun setValue(value: MapControlDataHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlDataHelper, MemoryAddress> {
    public val IMapControlDataHelperStatics_Instance: IMapControlDataHelperStatics by lazy {
      createIMapControlDataHelperStatics()
    }


    public val IMapControlDataHelperFactory_Instance: IMapControlDataHelperFactory by lazy {
      createIMapControlDataHelperFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapControlDataHelperStatics(): IMapControlDataHelperStatics {
      val refiid = Guid.REFIID(IMapControlDataHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlDataHelper".toHandle(),refiid,interfacePtr)
      val result =
          IMapControlDataHelperStatics.ABI.makeIMapControlDataHelperStatics(interfacePtr.value)
      return result
    }

    public fun createIMapControlDataHelperFactory(): IMapControlDataHelperFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlDataHelper".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapControlDataHelperFactory.ABI.makeIMapControlDataHelperFactory(factoryActivatorPtr.value))
    }

    public fun activate(map: MapControl): JNAPointer? =
        IMapControlDataHelperFactory_Instance.CreateInstance(map)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapControlDataHelper {
      val address = segment.toRawLongValue()
      return MapControlDataHelper(Pointer(address))
    }

    public override fun toNative(obj: MapControlDataHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateMapControl(rasterRenderMode: Boolean) =
        ABI.IMapControlDataHelperStatics_Instance.CreateMapControl(rasterRenderMode)
  }
}
