package Windows.UI.Xaml.Media

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

@ABIMarker(Geometry.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Geometry;{fa123889-0acd-417b-b62d-5ca1bf4dfc0e})")
@WinRTByReference(brClass = Geometry.ByReference::class)
public open class Geometry(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IGeometry.WithDefault, IWinRTObject {
  private val __280404370_Interface: IGeometry.WithDefault by lazy {
    as_280404370()
  }


  public override val __280404370_Ptr: JNAPointer? by lazy {
    __280404370_Interface.__280404370_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__280404370_Interface)

  private fun as_280404370(): IGeometry.WithDefault {
    if(pointer == NULL) {
      return(IGeometry.ABI.makeIGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeometry.ABI.makeIGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geometry> {
    public override fun getValue() = Geometry(pointer.getPointer(0))

    public fun setValue(value: Geometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geometry, MemoryAddress> {
    public val IGeometryStatics_Instance: IGeometryStatics by lazy {
      createIGeometryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeometryStatics(): IGeometryStatics {
      val refiid = Guid.REFIID(IGeometryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Geometry".toHandle(),refiid,interfacePtr)
      val result = IGeometryStatics.ABI.makeIGeometryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Geometry {
      val address = segment.toRawLongValue()
      return Geometry(Pointer(address))
    }

    public override fun toNative(obj: Geometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Empty() = ABI.IGeometryStatics_Instance.get_Empty()

    public fun get_StandardFlatteningTolerance() =
        ABI.IGeometryStatics_Instance.get_StandardFlatteningTolerance()

    public fun get_TransformProperty() = ABI.IGeometryStatics_Instance.get_TransformProperty()
  }
}
