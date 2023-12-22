package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IRepeatedScrollSnapPointFactory.ABI.IID
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RepeatedScrollSnapPoint.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.RepeatedScrollSnapPoint;{5828fb51-8ebb-596d-a871-50063479362d})")
@WinRTByReference(brClass = RepeatedScrollSnapPoint.ByReference::class)
public open class RepeatedScrollSnapPoint(
  ptr: JNAPointer? = NULL
) : ScrollSnapPointBase(ptr), IRepeatedScrollSnapPoint.WithDefault, IWinRTObject {
  private val __78598834_Interface: IRepeatedScrollSnapPoint.WithDefault by lazy {
    as_78598834()
  }


  public override val __78598834_Ptr: JNAPointer? by lazy {
    __78598834_Interface.__78598834_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__78598834_Interface)

  public constructor(
    offset: Double,
    interval: Double,
    start: Double,
    end: Double,
    alignment: ScrollSnapPointsAlignment
  ) : this(ABI.activate(offset, interval, start, end, alignment))

  private fun as_78598834(): IRepeatedScrollSnapPoint.WithDefault {
    if(pointer == NULL) {
      return(IRepeatedScrollSnapPoint.ABI.makeIRepeatedScrollSnapPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeatedScrollSnapPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeatedScrollSnapPoint.ABI.makeIRepeatedScrollSnapPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepeatedScrollSnapPoint> {
    public override fun getValue() = RepeatedScrollSnapPoint(pointer.getPointer(0))

    public fun setValue(value: RepeatedScrollSnapPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeatedScrollSnapPoint, MemoryAddress> {
    public val IRepeatedScrollSnapPointFactory_Instance: IRepeatedScrollSnapPointFactory by lazy {
      createIRepeatedScrollSnapPointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRepeatedScrollSnapPointFactory(): IRepeatedScrollSnapPointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.RepeatedScrollSnapPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRepeatedScrollSnapPointFactory.ABI.makeIRepeatedScrollSnapPointFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      offset: Double,
      interval: Double,
      start: Double,
      end: Double,
      alignment: ScrollSnapPointsAlignment
    ): JNAPointer? = IRepeatedScrollSnapPointFactory_Instance.CreateInstance(offset, interval,
        start, end, alignment, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RepeatedScrollSnapPoint {
      val address = segment.toRawLongValue()
      return RepeatedScrollSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: RepeatedScrollSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
