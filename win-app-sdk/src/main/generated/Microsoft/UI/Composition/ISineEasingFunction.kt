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

@ABIMarker(ISineEasingFunction.ABI::class)
@Signature("{7fccb5f8-cb0e-5a01-a26b-98880ff49dc6}")
@Guid("7fccb5f8cb0e5a01a26b98880ff49dc6")
@WinRTInterface("7fccb5f8cb0e5a01a26b98880ff49dc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISineEasingFunction.ByReference::class)
public interface ISineEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CompositionEasingFunctionMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISineEasingFunction> {
    public override fun getValue() = ABI.makeISineEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ISineEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISineEasingFunction {
    public val __1916386793_Ptr: Pointer?

    public val _1916386793_VtblPtr: Pointer?
      get() = __1916386793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CompositionEasingFunctionMode? {
      val fnPtr = _1916386793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEasingFunctionMode>()
      val hr = fn.invokeHR(arrayOf(__1916386793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEasingFunctionMode>(result.getValue())
      return resultValue
    }
  }

  public class ISineEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1916386793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISineEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fccb5f8cb0e5a01a26b98880ff49dc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISineEasingFunction(ptr: Pointer?): WithDefault = ISineEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISineEasingFunction {
      val address = segment.toRawLongValue()
      return makeISineEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ISineEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1916386793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISineEasingFunction): Array<ISineEasingFunction?> =
        (elements as
        Array<ISineEasingFunction?>).castToImpl<ISineEasingFunction,ISineEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISineEasingFunction?> =
        arrayOfNulls<ISineEasingFunction_Impl>(size) as Array<ISineEasingFunction?>
  }
}
