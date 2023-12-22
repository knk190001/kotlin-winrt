package Windows.System

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProcessLauncherStatics.ABI::class)
@Signature("{33ab66e7-2d0e-448b-a6a0-c13c3836d09c}")
@Guid("33ab66e72d0e448ba6a0c13c3836d09c")
@WinRTInterface("33ab66e72d0e448ba6a0c13c3836d09c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessLauncherStatics.ByReference::class)
public interface IProcessLauncherStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RunToCompletionAsync(fileName: String?, args: String?):
      IAsyncOperation<ProcessLauncherResult?>?

  @InterfaceMethod(1)
  public fun RunToCompletionAsync(
    fileName: String?,
    args: String?,
    options: ProcessLauncherOptions?
  ): IAsyncOperation<ProcessLauncherResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessLauncherStatics> {
    public override fun getValue() = ABI.makeIProcessLauncherStatics(pointer.getPointer(0))

    public fun setValue(value: IProcessLauncherStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessLauncherStatics {
    public val __234363845_Ptr: Pointer?

    public val _234363845_VtblPtr: Pointer?
      get() = __234363845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RunToCompletionAsync(fileName: String?, args: String?):
        IAsyncOperation<ProcessLauncherResult?>? {
      val fnPtr = _234363845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProcessLauncherResult?>>()
      val hr = fn.invokeHR(arrayOf(__234363845_Ptr, marshalToNative(fileName),
          marshalToNative(args), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProcessLauncherResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RunToCompletionAsync(
      fileName: String?,
      args: String?,
      options: ProcessLauncherOptions?
    ): IAsyncOperation<ProcessLauncherResult?>? {
      val fnPtr = _234363845_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProcessLauncherResult?>>()
      val hr = fn.invokeHR(arrayOf(__234363845_Ptr, marshalToNative(fileName),
          marshalToNative(args), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProcessLauncherResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IProcessLauncherStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __234363845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessLauncherStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33ab66e72d0e448ba6a0c13c3836d09c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessLauncherStatics(ptr: Pointer?): WithDefault =
        IProcessLauncherStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessLauncherStatics {
      val address = segment.toRawLongValue()
      return makeIProcessLauncherStatics(Pointer(address))
    }

    public override fun toNative(obj: IProcessLauncherStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__234363845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessLauncherStatics): Array<IProcessLauncherStatics?>
        = (elements as
        Array<IProcessLauncherStatics?>).castToImpl<IProcessLauncherStatics,IProcessLauncherStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessLauncherStatics?> =
        arrayOfNulls<IProcessLauncherStatics_Impl>(size) as Array<IProcessLauncherStatics?>
  }
}
