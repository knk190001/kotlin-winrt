package Windows.UI.Xaml

import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RectHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.RectHelper;{a38781e2-4bfb-4ee2-afe5-89f31b37478d})")
@WinRTByReference(brClass = RectHelper.ByReference::class)
public class RectHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRectHelper.WithDefault, IWinRTObject {
  private val __958915204_Interface: IRectHelper.WithDefault by lazy {
    as_958915204()
  }


  public override val __958915204_Ptr: JNAPointer? by lazy {
    __958915204_Interface.__958915204_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__958915204_Interface)

  private fun as_958915204(): IRectHelper.WithDefault {
    if(pointer == NULL) {
      return(IRectHelper.ABI.makeIRectHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRectHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRectHelper.ABI.makeIRectHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RectHelper> {
    public override fun getValue() = RectHelper(pointer.getPointer(0))

    public fun setValue(value: RectHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RectHelper, MemoryAddress> {
    public val IRectHelperStatics_Instance: IRectHelperStatics by lazy {
      createIRectHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRectHelperStatics(): IRectHelperStatics {
      val refiid = Guid.REFIID(IRectHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.RectHelper".toHandle(),refiid,interfacePtr)
      val result = IRectHelperStatics.ABI.makeIRectHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RectHelper {
      val address = segment.toRawLongValue()
      return RectHelper(Pointer(address))
    }

    public override fun toNative(obj: RectHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Empty() = ABI.IRectHelperStatics_Instance.get_Empty()

    public fun FromCoordinatesAndDimensions(
      x: Float,
      y: Float,
      width: Float,
      height: Float
    ) = ABI.IRectHelperStatics_Instance.FromCoordinatesAndDimensions(x, y, width, height)

    public fun FromPoints(point1: Point, point2: Point) =
        ABI.IRectHelperStatics_Instance.FromPoints(point1, point2)

    public fun FromLocationAndSize(location: Point, size: Size) =
        ABI.IRectHelperStatics_Instance.FromLocationAndSize(location, size)

    public fun GetIsEmpty(target: Rect) = ABI.IRectHelperStatics_Instance.GetIsEmpty(target)

    public fun GetBottom(target: Rect) = ABI.IRectHelperStatics_Instance.GetBottom(target)

    public fun GetLeft(target: Rect) = ABI.IRectHelperStatics_Instance.GetLeft(target)

    public fun GetRight(target: Rect) = ABI.IRectHelperStatics_Instance.GetRight(target)

    public fun GetTop(target: Rect) = ABI.IRectHelperStatics_Instance.GetTop(target)

    public fun Contains(target: Rect, point: Point) =
        ABI.IRectHelperStatics_Instance.Contains(target, point)

    public fun Equals(target: Rect, value: Rect) = ABI.IRectHelperStatics_Instance.Equals(target,
        value)

    public fun Intersect(target: Rect, rect: Rect) =
        ABI.IRectHelperStatics_Instance.Intersect(target, rect)

    public fun Union(target: Rect, point: Point) = ABI.IRectHelperStatics_Instance.Union(target,
        point)

    public fun Union(target: Rect, rect: Rect) = ABI.IRectHelperStatics_Instance.Union(target, rect)
  }
}
