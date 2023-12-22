package Windows.Management.Deployment

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
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

@ABIMarker(IPackageManager6.ABI::class)
@Signature("{0847e909-53cd-4e4f-832e-57d180f6e447}")
@Guid("0847e90953cd4e4f832e57d180f6e447")
@WinRTInterface("0847e90953cd4e4f832e57d180f6e447")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager6.ByReference::class)
public interface IPackageManager6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProvisionPackageForAllUsersAsync(packageFamilyName: String?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(1)
  public fun AddPackageByAppInstallerFileAsync(
    appInstallerFileUri: Uri?,
    options: AddPackageByAppInstallerOptions?,
    targetVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun RequestAddPackageByAppInstallerFileAsync(
    appInstallerFileUri: Uri?,
    options: AddPackageByAppInstallerOptions?,
    targetVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(3)
  public fun AddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    options: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    packageUrisToInstall: IIterable<Uri?>?,
    relatedPackageUris: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(4)
  public fun StagePackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    options: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    packageUrisToInstall: IIterable<Uri?>?,
    relatedPackageUris: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(5)
  public fun RequestAddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    relatedPackageUris: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager6> {
    public override fun getValue() = ABI.makeIPackageManager6(pointer.getPointer(0))

    public fun setValue(value: IPackageManager6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager6 {
    public val __438863627_Ptr: Pointer?

    public val _438863627_VtblPtr: Pointer?
      get() = __438863627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProvisionPackageForAllUsersAsync(packageFamilyName: String?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddPackageByAppInstallerFileAsync(
      appInstallerFileUri: Uri?,
      options: AddPackageByAppInstallerOptions?,
      targetVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(appInstallerFileUri),
          marshalToNative(options), marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAddPackageByAppInstallerFileAsync(
      appInstallerFileUri: Uri?,
      options: AddPackageByAppInstallerOptions?,
      targetVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(appInstallerFileUri),
          marshalToNative(options), marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      options: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      packageUrisToInstall: IIterable<Uri?>?,
      relatedPackageUris: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(options),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(packageUrisToInstall), marshalToNative(relatedPackageUris), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun StagePackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      options: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      packageUrisToInstall: IIterable<Uri?>?,
      relatedPackageUris: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(options),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(packageUrisToInstall), marshalToNative(relatedPackageUris), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestAddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      relatedPackageUris: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863627_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863627_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(relatedPackageUris), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0847e90953cd4e4f832e57d180f6e447")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager6(ptr: Pointer?): WithDefault = IPackageManager6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager6 {
      val address = segment.toRawLongValue()
      return makeIPackageManager6(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager6): Array<IPackageManager6?> = (elements as
        Array<IPackageManager6?>).castToImpl<IPackageManager6,IPackageManager6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager6?> =
        arrayOfNulls<IPackageManager6_Impl>(size) as Array<IPackageManager6?>
  }
}
