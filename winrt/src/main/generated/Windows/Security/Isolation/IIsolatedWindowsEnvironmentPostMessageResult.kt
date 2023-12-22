package Windows.Security.Isolation

import Windows.Foundation.HResult
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

@ABIMarker(IIsolatedWindowsEnvironmentPostMessageResult.ABI::class)
@Signature("{0dfa28fa-2ef0-4d8f-b341-3171b2df93b1}")
@Guid("0dfa28fa2ef04d8fb3413171b2df93b1")
@WinRTInterface("0dfa28fa2ef04d8fb3413171b2df93b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentPostMessageResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentPostMessageResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentPostMessageStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentPostMessageResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentPostMessageResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentPostMessageResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentPostMessageResult {
    public val __121176259_Ptr: Pointer?

    public val _121176259_VtblPtr: Pointer?
      get() = __121176259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentPostMessageStatus? {
      val fnPtr = _121176259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentPostMessageStatus>()
      val hr = fn.invokeHR(arrayOf(__121176259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentPostMessageStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _121176259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__121176259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentPostMessageResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __121176259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentPostMessageResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0dfa28fa2ef04d8fb3413171b2df93b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentPostMessageResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentPostMessageResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentPostMessageResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentPostMessageResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentPostMessageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__121176259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentPostMessageResult):
        Array<IIsolatedWindowsEnvironmentPostMessageResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentPostMessageResult?>).castToImpl<IIsolatedWindowsEnvironmentPostMessageResult,IIsolatedWindowsEnvironmentPostMessageResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentPostMessageResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentPostMessageResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentPostMessageResult?>
  }
}
