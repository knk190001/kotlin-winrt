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

@ABIMarker(IDeploymentManagerStatics2.ABI::class)
@Signature("{f49c16ee-6ebc-5f15-bebb-2ba49f8c0b30}")
@Guid("f49c16ee6ebc5f15bebb2ba49f8c0b30")
@WinRTInterface("f49c16ee6ebc5f15bebb2ba49f8c0b30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentManagerStatics2.ByReference::class)
public interface IDeploymentManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Initialize(deploymentInitializeOptions: DeploymentInitializeOptions?):
      DeploymentResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentManagerStatics2> {
    public override fun getValue() = ABI.makeIDeploymentManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IDeploymentManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentManagerStatics2 {
    public val __1720738044_Ptr: Pointer?

    public val _1720738044_VtblPtr: Pointer?
      get() = __1720738044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Initialize(deploymentInitializeOptions: DeploymentInitializeOptions?):
        DeploymentResult? {
      val fnPtr = _1720738044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeploymentResult>()
      val hr = fn.invokeHR(arrayOf(__1720738044_Ptr, marshalToNative(deploymentInitializeOptions),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeploymentResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeploymentManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1720738044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f49c16ee6ebc5f15bebb2ba49f8c0b30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentManagerStatics2(ptr: Pointer?): WithDefault =
        IDeploymentManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIDeploymentManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1720738044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentManagerStatics2):
        Array<IDeploymentManagerStatics2?> = (elements as
        Array<IDeploymentManagerStatics2?>).castToImpl<IDeploymentManagerStatics2,IDeploymentManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentManagerStatics2?> =
        arrayOfNulls<IDeploymentManagerStatics2_Impl>(size) as Array<IDeploymentManagerStatics2?>
  }
}
