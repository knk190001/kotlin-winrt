package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

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

@ABIMarker(IDeploymentResultFactory.ABI::class)
@Signature("{acd7bdae-4ae6-5cac-8205-1e8c305f953b}")
@Guid("acd7bdae4ae65cac82051e8c305f953b")
@WinRTInterface("acd7bdae4ae65cac82051e8c305f953b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentResultFactory.ByReference::class)
public interface IDeploymentResultFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(status: DeploymentStatus?, extendedError: HResult?): DeploymentResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentResultFactory> {
    public override fun getValue() = ABI.makeIDeploymentResultFactory(pointer.getPointer(0))

    public fun setValue(value: IDeploymentResultFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentResultFactory {
    public val __902686671_Ptr: Pointer?

    public val _902686671_VtblPtr: Pointer?
      get() = __902686671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(status: DeploymentStatus?, extendedError: HResult?):
        DeploymentResult? {
      val fnPtr = _902686671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeploymentResult>()
      val hr = fn.invokeHR(arrayOf(__902686671_Ptr, marshalToNative(status),
          marshalToNative(extendedError), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeploymentResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeploymentResultFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __902686671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentResultFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("acd7bdae4ae65cac82051e8c305f953b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentResultFactory(ptr: Pointer?): WithDefault =
        IDeploymentResultFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentResultFactory {
      val address = segment.toRawLongValue()
      return makeIDeploymentResultFactory(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentResultFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__902686671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentResultFactory):
        Array<IDeploymentResultFactory?> = (elements as
        Array<IDeploymentResultFactory?>).castToImpl<IDeploymentResultFactory,IDeploymentResultFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentResultFactory?> =
        arrayOfNulls<IDeploymentResultFactory_Impl>(size) as Array<IDeploymentResultFactory?>
  }
}
