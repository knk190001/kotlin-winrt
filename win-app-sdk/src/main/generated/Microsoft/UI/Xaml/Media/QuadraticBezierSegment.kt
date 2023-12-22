package Microsoft.UI.Xaml.Media

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

@ABIMarker(QuadraticBezierSegment.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.QuadraticBezierSegment;{6048abe4-7a12-5195-bd61-71dfd0361c38})")
@WinRTByReference(brClass = QuadraticBezierSegment.ByReference::class)
public class QuadraticBezierSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IQuadraticBezierSegment.WithDefault, IWinRTObject {
  private val __952913779_Interface: IQuadraticBezierSegment.WithDefault by lazy {
    as_952913779()
  }


  public override val __952913779_Ptr: JNAPointer? by lazy {
    __952913779_Interface.__952913779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__952913779_Interface)

  public constructor() : this(ABI.activate())

  private fun as_952913779(): IQuadraticBezierSegment.WithDefault {
    if(pointer == NULL) {
      return(IQuadraticBezierSegment.ABI.makeIQuadraticBezierSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQuadraticBezierSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQuadraticBezierSegment.ABI.makeIQuadraticBezierSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<QuadraticBezierSegment> {
    public override fun getValue() = QuadraticBezierSegment(pointer.getPointer(0))

    public fun setValue(value: QuadraticBezierSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<QuadraticBezierSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IQuadraticBezierSegmentStatics_Instance: IQuadraticBezierSegmentStatics by lazy {
      createIQuadraticBezierSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.QuadraticBezierSegment".toHandle(),
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

    public fun createIQuadraticBezierSegmentStatics(): IQuadraticBezierSegmentStatics {
      val refiid = Guid.REFIID(IQuadraticBezierSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.QuadraticBezierSegment".toHandle(),refiid,interfacePtr)
      val result =
          IQuadraticBezierSegmentStatics.ABI.makeIQuadraticBezierSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): QuadraticBezierSegment {
      val address = segment.toRawLongValue()
      return QuadraticBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: QuadraticBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Point1Property() =
        ABI.IQuadraticBezierSegmentStatics_Instance.get_Point1Property()

    public fun get_Point2Property() =
        ABI.IQuadraticBezierSegmentStatics_Instance.get_Point2Property()
  }
}
