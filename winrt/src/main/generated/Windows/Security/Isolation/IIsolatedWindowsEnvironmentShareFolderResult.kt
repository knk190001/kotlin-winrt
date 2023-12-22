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

@ABIMarker(IIsolatedWindowsEnvironmentShareFolderResult.ABI::class)
@Signature("{556ba72e-ca9d-4211-b143-1cedc86eb2fe}")
@Guid("556ba72eca9d4211b1431cedc86eb2fe")
@WinRTInterface("556ba72eca9d4211b1431cedc86eb2fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentShareFolderResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentShareFolderResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentShareFolderStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentShareFolderResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentShareFolderResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentShareFolderResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentShareFolderResult {
    public val __1282726749_Ptr: Pointer?

    public val _1282726749_VtblPtr: Pointer?
      get() = __1282726749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentShareFolderStatus? {
      val fnPtr = _1282726749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentShareFolderStatus>()
      val hr = fn.invokeHR(arrayOf(__1282726749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentShareFolderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1282726749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1282726749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentShareFolderResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1282726749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentShareFolderResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("556ba72eca9d4211b1431cedc86eb2fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentShareFolderResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentShareFolderResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentShareFolderResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentShareFolderResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentShareFolderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1282726749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentShareFolderResult):
        Array<IIsolatedWindowsEnvironmentShareFolderResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentShareFolderResult?>).castToImpl<IIsolatedWindowsEnvironmentShareFolderResult,IIsolatedWindowsEnvironmentShareFolderResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentShareFolderResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentShareFolderResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentShareFolderResult?>
  }
}
