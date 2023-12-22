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

@ABIMarker(BezierSegment.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.BezierSegment;{af4bb9ee-8984-49b7-81df-3f35994b95eb})")
@WinRTByReference(brClass = BezierSegment.ByReference::class)
public class BezierSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IBezierSegment.WithDefault, IWinRTObject {
  private val __238070056_Interface: IBezierSegment.WithDefault by lazy {
    as_238070056()
  }


  public override val __238070056_Ptr: JNAPointer? by lazy {
    __238070056_Interface.__238070056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__238070056_Interface)

  public constructor() : this(ABI.activate())

  private fun as_238070056(): IBezierSegment.WithDefault {
    if(pointer == NULL) {
      return(IBezierSegment.ABI.makeIBezierSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBezierSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBezierSegment.ABI.makeIBezierSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BezierSegment>
      {
    public override fun getValue() = BezierSegment(pointer.getPointer(0))

    public fun setValue(value: BezierSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BezierSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBezierSegmentStatics_Instance: IBezierSegmentStatics by lazy {
      createIBezierSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.BezierSegment".toHandle(),
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

    public fun createIBezierSegmentStatics(): IBezierSegmentStatics {
      val refiid = Guid.REFIID(IBezierSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.BezierSegment".toHandle(),refiid,interfacePtr)
      val result = IBezierSegmentStatics.ABI.makeIBezierSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BezierSegment {
      val address = segment.toRawLongValue()
      return BezierSegment(Pointer(address))
    }

    public override fun toNative(obj: BezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Point1Property() = ABI.IBezierSegmentStatics_Instance.get_Point1Property()

    public fun get_Point2Property() = ABI.IBezierSegmentStatics_Instance.get_Point2Property()

    public fun get_Point3Property() = ABI.IBezierSegmentStatics_Instance.get_Point3Property()
  }
}
