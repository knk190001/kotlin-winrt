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

@ABIMarker(MapIcon.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapIcon;{d2096872-23d9-4a2b-8be0-69f3a85482ab})")
@WinRTByReference(brClass = MapIcon.ByReference::class)
public class MapIcon(
  ptr: JNAPointer? = NULL
) : MapElement(ptr), IMapIcon.WithDefault, IMapIcon2.WithDefault, IWinRTObject {
  private val __1983214204_Interface: IMapIcon.WithDefault by lazy {
    as_1983214204()
  }


  private val __1350098130_Interface: IMapIcon2.WithDefault by lazy {
    as_1350098130()
  }


  public override val __1983214204_Ptr: JNAPointer? by lazy {
    __1983214204_Interface.__1983214204_Ptr
  }


  public override val __1350098130_Ptr: JNAPointer? by lazy {
    __1350098130_Interface.__1350098130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1983214204_Interface, __1350098130_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1983214204(): IMapIcon.WithDefault {
    if(pointer == NULL) {
      return(IMapIcon.ABI.makeIMapIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapIcon.ABI.makeIMapIcon(ref.value))
  }

  private fun as_1350098130(): IMapIcon2.WithDefault {
    if(pointer == NULL) {
      return(IMapIcon2.ABI.makeIMapIcon2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapIcon2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapIcon2.ABI.makeIMapIcon2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapIcon> {
    public override fun getValue() = MapIcon(pointer.getPointer(0))

    public fun setValue(value: MapIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapIcon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapIconStatics2_Instance: IMapIconStatics2 by lazy {
      createIMapIconStatics2()
    }


    public val IMapIconStatics_Instance: IMapIconStatics by lazy {
      createIMapIconStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapIcon".toHandle(),
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

    public fun createIMapIconStatics2(): IMapIconStatics2 {
      val refiid = Guid.REFIID(IMapIconStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapIcon".toHandle(),refiid,interfacePtr)
      val result = IMapIconStatics2.ABI.makeIMapIconStatics2(interfacePtr.value)
      return result
    }

    public fun createIMapIconStatics(): IMapIconStatics {
      val refiid = Guid.REFIID(IMapIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapIcon".toHandle(),refiid,interfacePtr)
      val result = IMapIconStatics.ABI.makeIMapIconStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapIcon {
      val address = segment.toRawLongValue()
      return MapIcon(Pointer(address))
    }

    public override fun toNative(obj: MapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CollisionBehaviorDesiredProperty() =
        ABI.IMapIconStatics2_Instance.get_CollisionBehaviorDesiredProperty()

    public fun get_LocationProperty() = ABI.IMapIconStatics_Instance.get_LocationProperty()

    public fun get_TitleProperty() = ABI.IMapIconStatics_Instance.get_TitleProperty()

    public fun get_NormalizedAnchorPointProperty() =
        ABI.IMapIconStatics_Instance.get_NormalizedAnchorPointProperty()
  }
}
