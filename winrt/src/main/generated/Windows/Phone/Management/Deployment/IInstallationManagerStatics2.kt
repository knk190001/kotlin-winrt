package Windows.Phone.Management.Deployment

import Windows.ApplicationModel.Package
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
import Windows.Management.Deployment.DeploymentOptions
import Windows.Management.Deployment.RemovalOptions
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IInstallationManagerStatics2.ABI::class)
@Signature("{7c6c2cbd-fa4a-4c8e-ab97-d959452f19e5}")
@Guid("7c6c2cbdfa4a4c8eab97d959452f19e5")
@WinRTInterface("7c6c2cbdfa4a4c8eab97d959452f19e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInstallationManagerStatics2.ByReference::class)
public interface IInstallationManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RemovePackageAsync(packageFullName: String?, removalOptions: RemovalOptions?):
      IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?

  @InterfaceMethod(1)
  public fun RegisterPackageAsync(
    manifestUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?

  @InterfaceMethod(2)
  public fun FindPackages(packageName: String?, packagePublisher: String?): IIterable<Package?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInstallationManagerStatics2> {
    public override fun getValue() = ABI.makeIInstallationManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IInstallationManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInstallationManagerStatics2 {
    public val __1587650140_Ptr: Pointer?

    public val _1587650140_VtblPtr: Pointer?
      get() = __1587650140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RemovePackageAsync(packageFullName: String?,
        removalOptions: RemovalOptions?): IAsyncOperationWithProgress<PackageInstallResult?,
        WinDef.UINT>? {
      val fnPtr = _1587650140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1587650140_Ptr, marshalToNative(packageFullName),
          marshalToNative(removalOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RegisterPackageAsync(
      manifestUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>? {
      val fnPtr = _1587650140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1587650140_Ptr, marshalToNative(manifestUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindPackages(packageName: String?, packagePublisher: String?):
        IIterable<Package?>? {
      val fnPtr = _1587650140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1587650140_Ptr, marshalToNative(packageName),
          marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }
  }

  public class IInstallationManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1587650140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInstallationManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c6c2cbdfa4a4c8eab97d959452f19e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInstallationManagerStatics2(ptr: Pointer?): WithDefault =
        IInstallationManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInstallationManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIInstallationManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInstallationManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1587650140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInstallationManagerStatics2):
        Array<IInstallationManagerStatics2?> = (elements as
        Array<IInstallationManagerStatics2?>).castToImpl<IInstallationManagerStatics2,IInstallationManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInstallationManagerStatics2?> =
        arrayOfNulls<IInstallationManagerStatics2_Impl>(size) as
        Array<IInstallationManagerStatics2?>
  }
}
