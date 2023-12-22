package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

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

@ABIMarker(IDeploymentManagerStatics.ABI::class)
@Signature("{6782a9d0-bfd0-50ea-81b0-32e9ed37cdf0}")
@Guid("6782a9d0bfd050ea81b032e9ed37cdf0")
@WinRTInterface("6782a9d0bfd050ea81b032e9ed37cdf0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentManagerStatics.ByReference::class)
public interface IDeploymentManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(): DeploymentResult?

  @InterfaceMethod(1)
  public fun Initialize(): DeploymentResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentManagerStatics> {
    public override fun getValue() = ABI.makeIDeploymentManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IDeploymentManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentManagerStatics {
    public val __886791670_Ptr: Pointer?

    public val _886791670_VtblPtr: Pointer?
      get() = __886791670_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(): DeploymentResult? {
      val fnPtr = _886791670_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeploymentResult>()
      val hr = fn.invokeHR(arrayOf(__886791670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeploymentResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Initialize(): DeploymentResult? {
      val fnPtr = _886791670_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeploymentResult>()
      val hr = fn.invokeHR(arrayOf(__886791670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeploymentResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeploymentManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __886791670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6782a9d0bfd050ea81b032e9ed37cdf0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentManagerStatics(ptr: Pointer?): WithDefault =
        IDeploymentManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentManagerStatics {
      val address = segment.toRawLongValue()
      return makeIDeploymentManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__886791670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentManagerStatics):
        Array<IDeploymentManagerStatics?> = (elements as
        Array<IDeploymentManagerStatics?>).castToImpl<IDeploymentManagerStatics,IDeploymentManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentManagerStatics?> =
        arrayOfNulls<IDeploymentManagerStatics_Impl>(size) as Array<IDeploymentManagerStatics?>
  }
}
