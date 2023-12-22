package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Matrix3x2
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkStrokeBuilder3.ABI::class)
@Signature("{b2c71fcd-5472-46b1-a81d-c37a3d169441}")
@Guid("b2c71fcd547246b1a81dc37a3d169441")
@WinRTInterface("b2c71fcd547246b1a81dc37a3d169441")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeBuilder3.ByReference::class)
public interface IInkStrokeBuilder3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateStrokeFromInkPoints(
    inkPoints: IIterable<InkPoint?>?,
    transform: Matrix3x2?,
    strokeStartedTime: IReference<DateTime?>?,
    strokeDuration: IReference<TimeSpan?>?
  ): InkStroke?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeBuilder3> {
    public override fun getValue() = ABI.makeIInkStrokeBuilder3(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeBuilder3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeBuilder3 {
    public val __1563724420_Ptr: Pointer?

    public val _1563724420_VtblPtr: Pointer?
      get() = __1563724420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateStrokeFromInkPoints(
      inkPoints: IIterable<InkPoint?>?,
      transform: Matrix3x2?,
      strokeStartedTime: IReference<DateTime?>?,
      strokeDuration: IReference<TimeSpan?>?
    ): InkStroke? {
      val fnPtr = _1563724420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__1563724420_Ptr, marshalToNative(inkPoints),
          marshalToNative(transform), marshalToNative(strokeStartedTime),
          marshalToNative(strokeDuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokeBuilder3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563724420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeBuilder3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2c71fcd547246b1a81dc37a3d169441")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeBuilder3(ptr: Pointer?): WithDefault = IInkStrokeBuilder3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeBuilder3 {
      val address = segment.toRawLongValue()
      return makeIInkStrokeBuilder3(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeBuilder3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563724420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeBuilder3): Array<IInkStrokeBuilder3?> =
        (elements as
        Array<IInkStrokeBuilder3?>).castToImpl<IInkStrokeBuilder3,IInkStrokeBuilder3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeBuilder3?> =
        arrayOfNulls<IInkStrokeBuilder3_Impl>(size) as Array<IInkStrokeBuilder3?>
  }
}
