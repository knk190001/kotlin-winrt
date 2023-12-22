package Microsoft.UI.Composition

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

@ABIMarker(ICircleEasingFunction.ABI::class)
@Signature("{414b172c-bf27-5ead-93e0-35915322db2c}")
@Guid("414b172cbf275ead93e035915322db2c")
@WinRTInterface("414b172cbf275ead93e035915322db2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICircleEasingFunction.ByReference::class)
public interface ICircleEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICircleEasingFunction> {
    public override fun getValue() = ABI.makeICircleEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ICircleEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICircleEasingFunction {
    public val __1320900780_Ptr: Pointer?

    public val _1320900780_VtblPtr: Pointer?
      get() = __1320900780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _1320900780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__1320900780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }
  }

  public class ICircleEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1320900780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICircleEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("414b172cbf275ead93e035915322db2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICircleEasingFunction(ptr: Pointer?): WithDefault =
        ICircleEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICircleEasingFunction {
      val address = segment.toRawLongValue()
      return makeICircleEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ICircleEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1320900780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICircleEasingFunction): Array<ICircleEasingFunction?> =
        (elements as
        Array<ICircleEasingFunction?>).castToImpl<ICircleEasingFunction,ICircleEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICircleEasingFunction?> =
        arrayOfNulls<ICircleEasingFunction_Impl>(size) as Array<ICircleEasingFunction?>
  }
}
