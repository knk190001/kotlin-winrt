package Windows.UI.Xaml.Media

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

@ABIMarker(PolyQuadraticBezierSegment.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.PolyQuadraticBezierSegment;{dd5ced7d-e6db-4c96-b6a1-3fce96e987a6})")
@WinRTByReference(brClass = PolyQuadraticBezierSegment.ByReference::class)
public class PolyQuadraticBezierSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IPolyQuadraticBezierSegment.WithDefault, IWinRTObject {
  private val __743189244_Interface: IPolyQuadraticBezierSegment.WithDefault by lazy {
    as_743189244()
  }


  public override val __743189244_Ptr: JNAPointer? by lazy {
    __743189244_Interface.__743189244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743189244_Interface)

  public constructor() : this(ABI.activate())

  private fun as_743189244(): IPolyQuadraticBezierSegment.WithDefault {
    if(pointer == NULL) {
      return(IPolyQuadraticBezierSegment.ABI.makeIPolyQuadraticBezierSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPolyQuadraticBezierSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPolyQuadraticBezierSegment.ABI.makeIPolyQuadraticBezierSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PolyQuadraticBezierSegment> {
    public override fun getValue() = PolyQuadraticBezierSegment(pointer.getPointer(0))

    public fun setValue(value: PolyQuadraticBezierSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PolyQuadraticBezierSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPolyQuadraticBezierSegmentStatics_Instance: IPolyQuadraticBezierSegmentStatics by
        lazy {
      createIPolyQuadraticBezierSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.PolyQuadraticBezierSegment".toHandle(),
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

    public fun createIPolyQuadraticBezierSegmentStatics(): IPolyQuadraticBezierSegmentStatics {
      val refiid = Guid.REFIID(IPolyQuadraticBezierSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.PolyQuadraticBezierSegment".toHandle(),refiid,interfacePtr)
      val result =
          IPolyQuadraticBezierSegmentStatics.ABI.makeIPolyQuadraticBezierSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PolyQuadraticBezierSegment {
      val address = segment.toRawLongValue()
      return PolyQuadraticBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: PolyQuadraticBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PointsProperty() =
        ABI.IPolyQuadraticBezierSegmentStatics_Instance.get_PointsProperty()
  }
}
