package Windows.UI.Composition

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

@ABIMarker(IBackEasingFunction.ABI::class)
@Signature("{b8560da4-5e3c-545d-b263-7987a2bd27cb}")
@Guid("b8560da45e3c545db2637987a2bd27cb")
@WinRTInterface("b8560da45e3c545db2637987a2bd27cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackEasingFunction.ByReference::class)
public interface IBackEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  @InterfaceMethod(1)
  public fun get_Amplitude(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackEasingFunction> {
    public override fun getValue() = ABI.makeIBackEasingFunction(pointer.getPointer(0))

    public fun setValue(value: IBackEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackEasingFunction {
    public val __2027684632_Ptr: Pointer?

    public val _2027684632_VtblPtr: Pointer?
      get() = __2027684632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _2027684632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__2027684632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Amplitude(): Float {
      val fnPtr = _2027684632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2027684632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IBackEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2027684632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8560da45e3c545db2637987a2bd27cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackEasingFunction(ptr: Pointer?): WithDefault = IBackEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackEasingFunction {
      val address = segment.toRawLongValue()
      return makeIBackEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: IBackEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2027684632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackEasingFunction): Array<IBackEasingFunction?> =
        (elements as
        Array<IBackEasingFunction?>).castToImpl<IBackEasingFunction,IBackEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackEasingFunction?> =
        arrayOfNulls<IBackEasingFunction_Impl>(size) as Array<IBackEasingFunction?>
  }
}
