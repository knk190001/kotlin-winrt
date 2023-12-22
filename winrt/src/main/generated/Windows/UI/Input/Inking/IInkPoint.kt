package Windows.UI.Input.Inking

import Windows.Foundation.Point
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPoint.ABI::class)
@Signature("{9f87272b-858c-46a5-9b41-d195970459fd}")
@Guid("9f87272b858c46a59b41d195970459fd")
@WinRTInterface("9f87272b858c46a59b41d195970459fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPoint.ByReference::class)
public interface IInkPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Pressure(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkPoint> {
    public override fun getValue() = ABI.makeIInkPoint(pointer.getPointer(0))

    public fun setValue(value: IInkPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPoint {
    public val __441255140_Ptr: Pointer?

    public val _441255140_VtblPtr: Pointer?
      get() = __441255140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _441255140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__441255140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Pressure(): Float {
      val fnPtr = _441255140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__441255140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IInkPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __441255140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f87272b858c46a59b41d195970459fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPoint(ptr: Pointer?): WithDefault = IInkPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPoint {
      val address = segment.toRawLongValue()
      return makeIInkPoint(Pointer(address))
    }

    public override fun toNative(obj: IInkPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__441255140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPoint): Array<IInkPoint?> = (elements as
        Array<IInkPoint?>).castToImpl<IInkPoint,IInkPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPoint?> = arrayOfNulls<IInkPoint_Impl>(size)
        as Array<IInkPoint?>
  }
}
