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

@ABIMarker(IExponentialEasingFunction.ABI::class)
@Signature("{6f7d1a51-98d2-5638-a34a-00486554c750}")
@Guid("6f7d1a5198d25638a34a00486554c750")
@WinRTInterface("6f7d1a5198d25638a34a00486554c750")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExponentialEasingFunction.ByReference::class)
public interface IExponentialEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  @InterfaceMethod(1)
  public fun get_Exponent(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExponentialEasingFunction> {
    public override fun getValue() = ABI.makeIExponentialEasingFunction(pointer.getPointer(0))

    public fun setValue(value: IExponentialEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExponentialEasingFunction {
    public val __2011051302_Ptr: Pointer?

    public val _2011051302_VtblPtr: Pointer?
      get() = __2011051302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _2011051302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__2011051302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Exponent(): Float {
      val fnPtr = _2011051302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2011051302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IExponentialEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2011051302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExponentialEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f7d1a5198d25638a34a00486554c750")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExponentialEasingFunction(ptr: Pointer?): WithDefault =
        IExponentialEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExponentialEasingFunction {
      val address = segment.toRawLongValue()
      return makeIExponentialEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: IExponentialEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2011051302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExponentialEasingFunction):
        Array<IExponentialEasingFunction?> = (elements as
        Array<IExponentialEasingFunction?>).castToImpl<IExponentialEasingFunction,IExponentialEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExponentialEasingFunction?> =
        arrayOfNulls<IExponentialEasingFunction_Impl>(size) as Array<IExponentialEasingFunction?>
  }
}
