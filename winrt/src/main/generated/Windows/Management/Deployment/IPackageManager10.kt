package Windows.Management.Deployment

import Windows.Foundation.IAsyncOperationWithProgress
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

@ABIMarker(IPackageManager10.ABI::class)
@Signature("{a7d7d07e-2e66-4093-aed5-e093ed87b3bb}")
@Guid("a7d7d07e2e664093aed5e093ed87b3bb")
@WinRTInterface("a7d7d07e2e664093aed5e093ed87b3bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager10.ByReference::class)
public interface IPackageManager10 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProvisionPackageForAllUsersAsync(mainPackageFamilyName: String?,
      options: PackageAllUserProvisioningOptions?): IAsyncOperationWithProgress<DeploymentResult?,
      DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager10> {
    public override fun getValue() = ABI.makeIPackageManager10(pointer.getPointer(0))

    public fun setValue(value: IPackageManager10_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager10 {
    public val __719870442_Ptr: Pointer?

    public val _719870442_VtblPtr: Pointer?
      get() = __719870442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProvisionPackageForAllUsersAsync(mainPackageFamilyName: String?,
        options: PackageAllUserProvisioningOptions?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _719870442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__719870442_Ptr, marshalToNative(mainPackageFamilyName),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager10_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __719870442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager10, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7d7d07e2e664093aed5e093ed87b3bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager10(ptr: Pointer?): WithDefault = IPackageManager10_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager10 {
      val address = segment.toRawLongValue()
      return makeIPackageManager10(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager10): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__719870442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager10): Array<IPackageManager10?> = (elements
        as Array<IPackageManager10?>).castToImpl<IPackageManager10,IPackageManager10_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager10?> =
        arrayOfNulls<IPackageManager10_Impl>(size) as Array<IPackageManager10?>
  }
}
