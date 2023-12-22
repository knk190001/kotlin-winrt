package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IScrollSnapPointFactory.ABI.IID
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

@ABIMarker(ScrollSnapPoint.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollSnapPoint;{73d918ff-d16c-52cd-9657-e392ee08868a})")
@WinRTByReference(brClass = ScrollSnapPoint.ByReference::class)
public open class ScrollSnapPoint(
  ptr: JNAPointer? = NULL
) : ScrollSnapPointBase(ptr), IScrollSnapPoint.WithDefault, IWinRTObject {
  private val __1089492776_Interface: IScrollSnapPoint.WithDefault by lazy {
    as_1089492776()
  }


  public override val __1089492776_Ptr: JNAPointer? by lazy {
    __1089492776_Interface.__1089492776_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1089492776_Interface)

  public constructor(snapPointValue: Double, alignment: ScrollSnapPointsAlignment) :
      this(ABI.activate(snapPointValue, alignment))

  private fun as_1089492776(): IScrollSnapPoint.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPoint.ABI.makeIScrollSnapPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPoint.ABI.makeIScrollSnapPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollSnapPoint> {
    public override fun getValue() = ScrollSnapPoint(pointer.getPointer(0))

    public fun setValue(value: ScrollSnapPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollSnapPoint, MemoryAddress> {
    public val IScrollSnapPointFactory_Instance: IScrollSnapPointFactory by lazy {
      createIScrollSnapPointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollSnapPointFactory(): IScrollSnapPointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollSnapPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollSnapPointFactory.ABI.makeIScrollSnapPointFactory(factoryActivatorPtr.value))
    }

    public fun activate(snapPointValue: Double, alignment: ScrollSnapPointsAlignment): JNAPointer? =
        IScrollSnapPointFactory_Instance.CreateInstance(snapPointValue, alignment, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollSnapPoint {
      val address = segment.toRawLongValue()
      return ScrollSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: ScrollSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
