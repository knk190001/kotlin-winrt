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

@ABIMarker(MapPolygon.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapPolygon;{abda2285-4926-4c3a-a5f9-19df7f69db3d})")
@WinRTByReference(brClass = MapPolygon.ByReference::class)
public class MapPolygon(
  ptr: JNAPointer? = NULL
) : MapElement(ptr), IMapPolygon.WithDefault, IMapPolygon2.WithDefault, IWinRTObject {
  private val __1894540367_Interface: IMapPolygon.WithDefault by lazy {
    as_1894540367()
  }


  private val __1398790717_Interface: IMapPolygon2.WithDefault by lazy {
    as_1398790717()
  }


  public override val __1894540367_Ptr: JNAPointer? by lazy {
    __1894540367_Interface.__1894540367_Ptr
  }


  public override val __1398790717_Ptr: JNAPointer? by lazy {
    __1398790717_Interface.__1398790717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1894540367_Interface, __1398790717_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1894540367(): IMapPolygon.WithDefault {
    if(pointer == NULL) {
      return(IMapPolygon.ABI.makeIMapPolygon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapPolygon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapPolygon.ABI.makeIMapPolygon(ref.value))
  }

  private fun as_1398790717(): IMapPolygon2.WithDefault {
    if(pointer == NULL) {
      return(IMapPolygon2.ABI.makeIMapPolygon2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapPolygon2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapPolygon2.ABI.makeIMapPolygon2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapPolygon> {
    public override fun getValue() = MapPolygon(pointer.getPointer(0))

    public fun setValue(value: MapPolygon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapPolygon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapPolygonStatics_Instance: IMapPolygonStatics by lazy {
      createIMapPolygonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapPolygon".toHandle(),
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

    public fun createIMapPolygonStatics(): IMapPolygonStatics {
      val refiid = Guid.REFIID(IMapPolygonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapPolygon".toHandle(),refiid,interfacePtr)
      val result = IMapPolygonStatics.ABI.makeIMapPolygonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapPolygon {
      val address = segment.toRawLongValue()
      return MapPolygon(Pointer(address))
    }

    public override fun toNative(obj: MapPolygon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PathProperty() = ABI.IMapPolygonStatics_Instance.get_PathProperty()

    public fun get_StrokeThicknessProperty() =
        ABI.IMapPolygonStatics_Instance.get_StrokeThicknessProperty()

    public fun get_StrokeDashedProperty() =
        ABI.IMapPolygonStatics_Instance.get_StrokeDashedProperty()
  }
}
