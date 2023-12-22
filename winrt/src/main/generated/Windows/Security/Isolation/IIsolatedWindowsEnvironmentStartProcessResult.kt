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

@ABIMarker(IIsolatedWindowsEnvironmentStartProcessResult.ABI::class)
@Signature("{8fa1dc2f-57da-4bb5-9c06-fa072d2032e2}")
@Guid("8fa1dc2f57da4bb59c06fa072d2032e2")
@WinRTInterface("8fa1dc2f57da4bb59c06fa072d2032e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentStartProcessResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentStartProcessResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentStartProcessStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_Process(): IsolatedWindowsEnvironmentProcess?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentStartProcessResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentStartProcessResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentStartProcessResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentStartProcessResult {
    public val __214117457_Ptr: Pointer?

    public val _214117457_VtblPtr: Pointer?
      get() = __214117457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentStartProcessStatus? {
      val fnPtr = _214117457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentStartProcessStatus>()
      val hr = fn.invokeHR(arrayOf(__214117457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentStartProcessStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _214117457_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__214117457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Process(): IsolatedWindowsEnvironmentProcess? {
      val fnPtr = _214117457_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentProcess>()
      val hr = fn.invokeHR(arrayOf(__214117457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironmentProcess>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentStartProcessResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214117457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentStartProcessResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8fa1dc2f57da4bb59c06fa072d2032e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentStartProcessResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentStartProcessResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentStartProcessResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentStartProcessResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentStartProcessResult): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214117457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentStartProcessResult):
        Array<IIsolatedWindowsEnvironmentStartProcessResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentStartProcessResult?>).castToImpl<IIsolatedWindowsEnvironmentStartProcessResult,IIsolatedWindowsEnvironmentStartProcessResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentStartProcessResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentStartProcessResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentStartProcessResult?>
  }
}
