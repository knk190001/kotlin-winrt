package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Numerics.Matrix3x2
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

@ABIMarker(IInkStrokeBuilder2.ABI::class)
@Signature("{bd82bc27-731f-4cbc-bbbf-6d468044f1e5}")
@Guid("bd82bc27731f4cbcbbbf6d468044f1e5")
@WinRTInterface("bd82bc27731f4cbcbbbf6d468044f1e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeBuilder2.ByReference::class)
public interface IInkStrokeBuilder2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateStrokeFromInkPoints(inkPoints: IIterable<InkPoint?>?, transform: Matrix3x2?):
      InkStroke?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeBuilder2> {
    public override fun getValue() = ABI.makeIInkStrokeBuilder2(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeBuilder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeBuilder2 {
    public val __1563724421_Ptr: Pointer?

    public val _1563724421_VtblPtr: Pointer?
      get() = __1563724421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateStrokeFromInkPoints(inkPoints: IIterable<InkPoint?>?,
        transform: Matrix3x2?): InkStroke? {
      val fnPtr = _1563724421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__1563724421_Ptr, marshalToNative(inkPoints),
          marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokeBuilder2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563724421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeBuilder2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd82bc27731f4cbcbbbf6d468044f1e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeBuilder2(ptr: Pointer?): WithDefault = IInkStrokeBuilder2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeBuilder2 {
      val address = segment.toRawLongValue()
      return makeIInkStrokeBuilder2(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeBuilder2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563724421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeBuilder2): Array<IInkStrokeBuilder2?> =
        (elements as
        Array<IInkStrokeBuilder2?>).castToImpl<IInkStrokeBuilder2,IInkStrokeBuilder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeBuilder2?> =
        arrayOfNulls<IInkStrokeBuilder2_Impl>(size) as Array<IInkStrokeBuilder2?>
  }
}
