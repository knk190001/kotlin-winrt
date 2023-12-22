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

@ABIMarker(IIsolatedWindowsEnvironmentCreateResult.ABI::class)
@Signature("{ef9a5e58-dcd7-45c2-9c85-ab642a715e8e}")
@Guid("ef9a5e58dcd745c29c85ab642a715e8e")
@WinRTInterface("ef9a5e58dcd745c29c85ab642a715e8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentCreateResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentCreateResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentCreateStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_Environment(): IsolatedWindowsEnvironment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentCreateResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentCreateResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentCreateResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentCreateResult {
    public val __1040572512_Ptr: Pointer?

    public val _1040572512_VtblPtr: Pointer?
      get() = __1040572512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentCreateStatus? {
      val fnPtr = _1040572512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentCreateStatus>()
      val hr = fn.invokeHR(arrayOf(__1040572512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironmentCreateStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1040572512_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1040572512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Environment(): IsolatedWindowsEnvironment? {
      val fnPtr = _1040572512_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironment>()
      val hr = fn.invokeHR(arrayOf(__1040572512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironment>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentCreateResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1040572512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentCreateResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef9a5e58dcd745c29c85ab642a715e8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentCreateResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentCreateResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentCreateResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentCreateResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentCreateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1040572512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentCreateResult):
        Array<IIsolatedWindowsEnvironmentCreateResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentCreateResult?>).castToImpl<IIsolatedWindowsEnvironmentCreateResult,IIsolatedWindowsEnvironmentCreateResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentCreateResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentCreateResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentCreateResult?>
  }
}
