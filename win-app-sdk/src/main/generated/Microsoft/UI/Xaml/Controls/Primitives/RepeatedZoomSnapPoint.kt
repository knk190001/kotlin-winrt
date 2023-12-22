package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IRepeatedZoomSnapPointFactory.ABI.IID
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

@ABIMarker(RepeatedZoomSnapPoint.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.RepeatedZoomSnapPoint;{1fa6dbbe-5e11-5d32-873b-c92b1d171538})")
@WinRTByReference(brClass = RepeatedZoomSnapPoint.ByReference::class)
public open class RepeatedZoomSnapPoint(
  ptr: JNAPointer? = NULL
) : ZoomSnapPointBase(ptr), IRepeatedZoomSnapPoint.WithDefault, IWinRTObject {
  private val __2024824760_Interface: IRepeatedZoomSnapPoint.WithDefault by lazy {
    as_2024824760()
  }


  public override val __2024824760_Ptr: JNAPointer? by lazy {
    __2024824760_Interface.__2024824760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2024824760_Interface)

  public constructor(
    offset: Double,
    interval: Double,
    start: Double,
    end: Double
  ) : this(ABI.activate(offset, interval, start, end))

  private fun as_2024824760(): IRepeatedZoomSnapPoint.WithDefault {
    if(pointer == NULL) {
      return(IRepeatedZoomSnapPoint.ABI.makeIRepeatedZoomSnapPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeatedZoomSnapPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeatedZoomSnapPoint.ABI.makeIRepeatedZoomSnapPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepeatedZoomSnapPoint> {
    public override fun getValue() = RepeatedZoomSnapPoint(pointer.getPointer(0))

    public fun setValue(value: RepeatedZoomSnapPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeatedZoomSnapPoint, MemoryAddress> {
    public val IRepeatedZoomSnapPointFactory_Instance: IRepeatedZoomSnapPointFactory by lazy {
      createIRepeatedZoomSnapPointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRepeatedZoomSnapPointFactory(): IRepeatedZoomSnapPointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.RepeatedZoomSnapPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRepeatedZoomSnapPointFactory.ABI.makeIRepeatedZoomSnapPointFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      offset: Double,
      interval: Double,
      start: Double,
      end: Double
    ): JNAPointer? = IRepeatedZoomSnapPointFactory_Instance.CreateInstance(offset, interval, start,
        end, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RepeatedZoomSnapPoint {
      val address = segment.toRawLongValue()
      return RepeatedZoomSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: RepeatedZoomSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
