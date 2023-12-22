package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapElementFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapElement;{d61fc4df-b245-47f2-9ac2-43c058b1c903})")
@WinRTByReference(brClass = MapElement.ByReference::class)
public open class MapElement(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapElement.WithDefault, IMapElement2.WithDefault,
    IMapElement3.WithDefault, IMapElement4.WithDefault, IWinRTObject {
  private val __629222929_Interface: IMapElement.WithDefault by lazy {
    as_629222929()
  }


  private val __1968925631_Interface: IMapElement2.WithDefault by lazy {
    as_1968925631()
  }


  private val __1968925630_Interface: IMapElement3.WithDefault by lazy {
    as_1968925630()
  }


  private val __1968925629_Interface: IMapElement4.WithDefault by lazy {
    as_1968925629()
  }


  public override val __629222929_Ptr: JNAPointer? by lazy {
    __629222929_Interface.__629222929_Ptr
  }


  public override val __1968925631_Ptr: JNAPointer? by lazy {
    __1968925631_Interface.__1968925631_Ptr
  }


  public override val __1968925630_Ptr: JNAPointer? by lazy {
    __1968925630_Interface.__1968925630_Ptr
  }


  public override val __1968925629_Ptr: JNAPointer? by lazy {
    __1968925629_Interface.__1968925629_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__629222929_Interface, __1968925631_Interface, __1968925630_Interface,
        __1968925629_Interface)

  public constructor() : this(ABI.activate())

  private fun as_629222929(): IMapElement.WithDefault {
    if(pointer == NULL) {
      return(IMapElement.ABI.makeIMapElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElement.ABI.makeIMapElement(ref.value))
  }

  private fun as_1968925631(): IMapElement2.WithDefault {
    if(pointer == NULL) {
      return(IMapElement2.ABI.makeIMapElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElement2.ABI.makeIMapElement2(ref.value))
  }

  private fun as_1968925630(): IMapElement3.WithDefault {
    if(pointer == NULL) {
      return(IMapElement3.ABI.makeIMapElement3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElement3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElement3.ABI.makeIMapElement3(ref.value))
  }

  private fun as_1968925629(): IMapElement4.WithDefault {
    if(pointer == NULL) {
      return(IMapElement4.ABI.makeIMapElement4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElement4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElement4.ABI.makeIMapElement4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapElement> {
    public override fun getValue() = MapElement(pointer.getPointer(0))

    public fun setValue(value: MapElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapElement, MemoryAddress> {
    public val IMapElementStatics_Instance: IMapElementStatics by lazy {
      createIMapElementStatics()
    }


    public val IMapElementStatics4_Instance: IMapElementStatics4 by lazy {
      createIMapElementStatics4()
    }


    public val IMapElementStatics2_Instance: IMapElementStatics2 by lazy {
      createIMapElementStatics2()
    }


    public val IMapElementStatics3_Instance: IMapElementStatics3 by lazy {
      createIMapElementStatics3()
    }


    public val IMapElementFactory_Instance: IMapElementFactory by lazy {
      createIMapElementFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapElementStatics(): IMapElementStatics {
      val refiid = Guid.REFIID(IMapElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement".toHandle(),refiid,interfacePtr)
      val result = IMapElementStatics.ABI.makeIMapElementStatics(interfacePtr.value)
      return result
    }

    public fun createIMapElementStatics4(): IMapElementStatics4 {
      val refiid = Guid.REFIID(IMapElementStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement".toHandle(),refiid,interfacePtr)
      val result = IMapElementStatics4.ABI.makeIMapElementStatics4(interfacePtr.value)
      return result
    }

    public fun createIMapElementStatics2(): IMapElementStatics2 {
      val refiid = Guid.REFIID(IMapElementStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement".toHandle(),refiid,interfacePtr)
      val result = IMapElementStatics2.ABI.makeIMapElementStatics2(interfacePtr.value)
      return result
    }

    public fun createIMapElementStatics3(): IMapElementStatics3 {
      val refiid = Guid.REFIID(IMapElementStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement".toHandle(),refiid,interfacePtr)
      val result = IMapElementStatics3.ABI.makeIMapElementStatics3(interfacePtr.value)
      return result
    }

    public fun createIMapElementFactory(): IMapElementFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapElementFactory.ABI.makeIMapElementFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapElementFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapElement {
      val address = segment.toRawLongValue()
      return MapElement(Pointer(address))
    }

    public override fun toNative(obj: MapElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ZIndexProperty() = ABI.IMapElementStatics_Instance.get_ZIndexProperty()

    public fun get_VisibleProperty() = ABI.IMapElementStatics_Instance.get_VisibleProperty()

    public fun get_IsEnabledProperty() = ABI.IMapElementStatics4_Instance.get_IsEnabledProperty()

    public fun get_MapTabIndexProperty() =
        ABI.IMapElementStatics2_Instance.get_MapTabIndexProperty()

    public fun get_MapStyleSheetEntryProperty() =
        ABI.IMapElementStatics3_Instance.get_MapStyleSheetEntryProperty()

    public fun get_MapStyleSheetEntryStateProperty() =
        ABI.IMapElementStatics3_Instance.get_MapStyleSheetEntryStateProperty()

    public fun get_TagProperty() = ABI.IMapElementStatics3_Instance.get_TagProperty()
  }
}
