package Windows.ApplicationModel

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

@ABIMarker(IFullTrustProcessLauncherStatics2.ABI::class)
@Signature("{8b8ed72f-b65c-56cf-a1a7-2bf77cbc6ea8}")
@Guid("8b8ed72fb65c56cfa1a72bf77cbc6ea8")
@WinRTInterface("8b8ed72fb65c56cfa1a72bf77cbc6ea8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFullTrustProcessLauncherStatics2.ByReference::class)
public interface IFullTrustProcessLauncherStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LaunchFullTrustProcessForCurrentAppWithArgumentsAsync(commandLine: String?):
      IAsyncOperation<FullTrustProcessLaunchResult?>?

  @InterfaceMethod(1)
  public fun LaunchFullTrustProcessForAppWithArgumentsAsync(fullTrustPackageRelativeAppId: String?,
      commandLine: String?): IAsyncOperation<FullTrustProcessLaunchResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFullTrustProcessLauncherStatics2> {
    public override fun getValue() =
        ABI.makeIFullTrustProcessLauncherStatics2(pointer.getPointer(0))

    public fun setValue(value: IFullTrustProcessLauncherStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFullTrustProcessLauncherStatics2 {
    public val __735544584_Ptr: Pointer?

    public val _735544584_VtblPtr: Pointer?
      get() = __735544584_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LaunchFullTrustProcessForCurrentAppWithArgumentsAsync(commandLine: String?):
        IAsyncOperation<FullTrustProcessLaunchResult?>? {
      val fnPtr = _735544584_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FullTrustProcessLaunchResult?>>()
      val hr = fn.invokeHR(arrayOf(__735544584_Ptr, marshalToNative(commandLine), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<FullTrustProcessLaunchResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun LaunchFullTrustProcessForAppWithArgumentsAsync(fullTrustPackageRelativeAppId: String?,
        commandLine: String?): IAsyncOperation<FullTrustProcessLaunchResult?>? {
      val fnPtr = _735544584_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FullTrustProcessLaunchResult?>>()
      val hr = fn.invokeHR(arrayOf(__735544584_Ptr, marshalToNative(fullTrustPackageRelativeAppId),
          marshalToNative(commandLine), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<FullTrustProcessLaunchResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IFullTrustProcessLauncherStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __735544584_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFullTrustProcessLauncherStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b8ed72fb65c56cfa1a72bf77cbc6ea8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFullTrustProcessLauncherStatics2(ptr: Pointer?): WithDefault =
        IFullTrustProcessLauncherStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFullTrustProcessLauncherStatics2 {
      val address = segment.toRawLongValue()
      return makeIFullTrustProcessLauncherStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFullTrustProcessLauncherStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__735544584_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFullTrustProcessLauncherStatics2):
        Array<IFullTrustProcessLauncherStatics2?> = (elements as
        Array<IFullTrustProcessLauncherStatics2?>).castToImpl<IFullTrustProcessLauncherStatics2,IFullTrustProcessLauncherStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFullTrustProcessLauncherStatics2?> =
        arrayOfNulls<IFullTrustProcessLauncherStatics2_Impl>(size) as
        Array<IFullTrustProcessLauncherStatics2?>
  }
}
