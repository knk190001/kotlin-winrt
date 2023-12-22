package Microsoft.UI.Xaml.Shapes

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

@ABIMarker(Polyline.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Shapes.Polyline;{c7f0bec6-184c-5d96-8102-04dd211e100c})")
@WinRTByReference(brClass = Polyline.ByReference::class)
public class Polyline(
  ptr: JNAPointer? = NULL
) : Shape(ptr), IPolyline.WithDefault, IWinRTObject {
  private val __1879194933_Interface: IPolyline.WithDefault by lazy {
    as_1879194933()
  }


  public override val __1879194933_Ptr: JNAPointer? by lazy {
    __1879194933_Interface.__1879194933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1879194933_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1879194933(): IPolyline.WithDefault {
    if(pointer == NULL) {
      return(IPolyline.ABI.makeIPolyline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPolyline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPolyline.ABI.makeIPolyline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Polyline> {
    public override fun getValue() = Polyline(pointer.getPointer(0))

    public fun setValue(value: Polyline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Polyline, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPolylineStatics_Instance: IPolylineStatics by lazy {
      createIPolylineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Polyline".toHandle(),
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

    public fun createIPolylineStatics(): IPolylineStatics {
      val refiid = Guid.REFIID(IPolylineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Polyline".toHandle(),refiid,interfacePtr)
      val result = IPolylineStatics.ABI.makeIPolylineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Polyline {
      val address = segment.toRawLongValue()
      return Polyline(Pointer(address))
    }

    public override fun toNative(obj: Polyline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillRuleProperty() = ABI.IPolylineStatics_Instance.get_FillRuleProperty()

    public fun get_PointsProperty() = ABI.IPolylineStatics_Instance.get_PointsProperty()
  }
}
