package Windows.UI.Xaml.Shapes

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

@ABIMarker(Polygon.ABI::class)
@Signature("rc(Windows.UI.Xaml.Shapes.Polygon;{e3755c19-2e4d-4bcc-8d34-86871957fa01})")
@WinRTByReference(brClass = Polygon.ByReference::class)
public class Polygon(
  ptr: JNAPointer? = NULL
) : Shape(ptr), IPolygon.WithDefault, IWinRTObject {
  private val __1637128806_Interface: IPolygon.WithDefault by lazy {
    as_1637128806()
  }


  public override val __1637128806_Ptr: JNAPointer? by lazy {
    __1637128806_Interface.__1637128806_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1637128806_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1637128806(): IPolygon.WithDefault {
    if(pointer == NULL) {
      return(IPolygon.ABI.makeIPolygon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPolygon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPolygon.ABI.makeIPolygon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Polygon> {
    public override fun getValue() = Polygon(pointer.getPointer(0))

    public fun setValue(value: Polygon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Polygon, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPolygonStatics_Instance: IPolygonStatics by lazy {
      createIPolygonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Polygon".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIPolygonStatics(): IPolygonStatics {
      val refiid = Guid.REFIID(IPolygonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Polygon".toHandle(),refiid,interfacePtr)
      val result = IPolygonStatics.ABI.makeIPolygonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Polygon {
      val address = segment.toRawLongValue()
      return Polygon(Pointer(address))
    }

    public override fun toNative(obj: Polygon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillRuleProperty() = ABI.IPolygonStatics_Instance.get_FillRuleProperty()

    public fun get_PointsProperty() = ABI.IPolygonStatics_Instance.get_PointsProperty()
  }
}
