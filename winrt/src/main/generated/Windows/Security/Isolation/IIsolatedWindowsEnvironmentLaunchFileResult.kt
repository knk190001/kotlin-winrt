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

@ABIMarker(IIsolatedWindowsEnvironmentLaunchFileResult.ABI::class)
@Signature("{685d4176-f6e0-4569-b1aa-215c0ff5b257}")
@Guid("685d4176f6e04569b1aa215c0ff5b257")
@WinRTInterface("685d4176f6e04569b1aa215c0ff5b257")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentLaunchFileResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentLaunchFileResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentLaunchFileStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_File(): IsolatedWindowsEnvironmentFile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentLaunchFileResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentLaunchFileResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentLaunchFileResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentLaunchFileResult {
    public val __357612365_Ptr: Pointer?

    public val _357612365_VtblPtr: Pointer?
      get() = __357612365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentLaunchFileStatus? {
      val fnPtr = _357612365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentLaunchFileStatus>()
      val hr = fn.invokeHR(arrayOf(__357612365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentLaunchFileStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _357612365_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__357612365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_File(): IsolatedWindowsEnvironmentFile? {
      val fnPtr = _357612365_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentFile>()
      val hr = fn.invokeHR(arrayOf(__357612365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironmentFile>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentLaunchFileResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __357612365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentLaunchFileResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("685d4176f6e04569b1aa215c0ff5b257")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentLaunchFileResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentLaunchFileResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentLaunchFileResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentLaunchFileResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentLaunchFileResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__357612365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentLaunchFileResult):
        Array<IIsolatedWindowsEnvironmentLaunchFileResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentLaunchFileResult?>).castToImpl<IIsolatedWindowsEnvironmentLaunchFileResult,IIsolatedWindowsEnvironmentLaunchFileResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentLaunchFileResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentLaunchFileResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentLaunchFileResult?>
  }
}
