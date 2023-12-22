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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPowerEasingFunction.ABI::class)
@Signature("{0268a272-ea06-5fb0-8def-49726bcee39b}")
@Guid("0268a272ea065fb08def49726bcee39b")
@WinRTInterface("0268a272ea065fb08def49726bcee39b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerEasingFunction.ByReference::class)
public interface IPowerEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  @InterfaceMethod(1)
  public fun get_Power(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPowerEasingFunction> {
    public override fun getValue() = ABI.makeIPowerEasingFunction(pointer.getPointer(0))

    public fun setValue(value: IPowerEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerEasingFunction {
    public val __795309617_Ptr: Pointer?

    public val _795309617_VtblPtr: Pointer?
      get() = __795309617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _795309617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__795309617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Power(): Float {
      val fnPtr = _795309617_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__795309617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IPowerEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __795309617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0268a272ea065fb08def49726bcee39b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerEasingFunction(ptr: Pointer?): WithDefault = IPowerEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerEasingFunction {
      val address = segment.toRawLongValue()
      return makeIPowerEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: IPowerEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__795309617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerEasingFunction): Array<IPowerEasingFunction?> =
        (elements as
        Array<IPowerEasingFunction?>).castToImpl<IPowerEasingFunction,IPowerEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerEasingFunction?> =
        arrayOfNulls<IPowerEasingFunction_Impl>(size) as Array<IPowerEasingFunction?>
  }
}
