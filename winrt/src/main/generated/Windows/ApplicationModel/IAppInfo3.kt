package Windows.ApplicationModel

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

@ABIMarker(IAppInfo3.ABI::class)
@Signature("{09a78e46-93a4-46de-9397-0843b57115ea}")
@Guid("09a78e4693a446de93970843b57115ea")
@WinRTInterface("09a78e4693a446de93970843b57115ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInfo3.ByReference::class)
public interface IAppInfo3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExecutionContext(): AppExecutionContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppInfo3> {
    public override fun getValue() = ABI.makeIAppInfo3(pointer.getPointer(0))

    public fun setValue(value: IAppInfo3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInfo3 {
    public val __856011895_Ptr: Pointer?

    public val _856011895_VtblPtr: Pointer?
      get() = __856011895_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExecutionContext(): AppExecutionContext? {
      val fnPtr = _856011895_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppExecutionContext>()
      val hr = fn.invokeHR(arrayOf(__856011895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppExecutionContext>(result.getValue())
      return resultValue
    }
  }

  public class IAppInfo3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856011895_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInfo3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09a78e4693a446de93970843b57115ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInfo3(ptr: Pointer?): WithDefault = IAppInfo3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInfo3 {
      val address = segment.toRawLongValue()
      return makeIAppInfo3(Pointer(address))
    }

    public override fun toNative(obj: IAppInfo3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856011895_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo3): Array<IAppInfo3?> = (elements as
        Array<IAppInfo3?>).castToImpl<IAppInfo3,IAppInfo3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo3?> = arrayOfNulls<IAppInfo3_Impl>(size)
        as Array<IAppInfo3?>
  }
}
