package Windows.Management.Deployment

import Windows.ApplicationModel.Package
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

@ABIMarker(IPackageManager.ABI::class)
@Signature("{9a7d4b65-5e8f-4fc7-a2e5-7f6925cb8b53}")
@Guid("9a7d4b655e8f4fc7a2e57f6925cb8b53")
@WinRTInterface("9a7d4b655e8f4fc7a2e57f6925cb8b53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager.ByReference::class)
public interface IPackageManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(1)
  public fun UpdatePackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun RemovePackageAsync(packageFullName: String?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(3)
  public fun StagePackageAsync(packageUri: Uri?, dependencyPackageUris: IIterable<Uri?>?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(4)
  public fun RegisterPackageAsync(
    manifestUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(5)
  public fun FindPackages(): IIterable<Package?>?

  @InterfaceMethod(6)
  public fun FindPackagesForUser(userSecurityId: String?): IIterable<Package?>?

  @InterfaceMethod(7)
  public fun FindPackages(packageName: String?, packagePublisher: String?): IIterable<Package?>?

  @InterfaceMethod(8)
  public fun FindPackagesForUser(
    userSecurityId: String?,
    packageName: String?,
    packagePublisher: String?
  ): IIterable<Package?>?

  @InterfaceMethod(9)
  public fun FindUsers(packageFullName: String?): IIterable<PackageUserInformation?>?

  @InterfaceMethod(10)
  public fun SetPackageState(packageFullName: String?, packageState: PackageState?): Unit

  @InterfaceMethod(11)
  public fun FindPackage(packageFullName: String?): Package?

  @InterfaceMethod(12)
  public fun CleanupPackageForUserAsync(packageName: String?, userSecurityId: String?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(13)
  public fun FindPackages(packageFamilyName: String?): IIterable<Package?>?

  @InterfaceMethod(14)
  public fun FindPackagesForUser(userSecurityId: String?, packageFamilyName: String?):
      IIterable<Package?>?

  @InterfaceMethod(15)
  public fun FindPackageForUser(userSecurityId: String?, packageFullName: String?): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager> {
    public override fun getValue() = ABI.makeIPackageManager(pointer.getPointer(0))

    public fun setValue(value: IPackageManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager {
    public val __1676724875_Ptr: Pointer?

    public val _1676724875_VtblPtr: Pointer?
      get() = __1676724875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdatePackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemovePackageAsync(packageFullName: String?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StagePackageAsync(packageUri: Uri?,
        dependencyPackageUris: IIterable<Uri?>?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RegisterPackageAsync(
      manifestUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(manifestUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindPackages(): IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FindPackagesForUser(userSecurityId: String?): IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(userSecurityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindPackages(packageName: String?, packagePublisher: String?):
        IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageName),
          marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun FindPackagesForUser(
      userSecurityId: String?,
      packageName: String?,
      packagePublisher: String?
    ): IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageName), marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun FindUsers(packageFullName: String?): IIterable<PackageUserInformation?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<PackageUserInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<PackageUserInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SetPackageState(packageFullName: String?, packageState: PackageState?):
        Unit {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageFullName),
          marshalToNative(packageState),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun FindPackage(packageFullName: String?): Package? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CleanupPackageForUserAsync(packageName: String?, userSecurityId: String?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageName),
          marshalToNative(userSecurityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FindPackages(packageFamilyName: String?): IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindPackagesForUser(userSecurityId: String?, packageFamilyName: String?):
        IIterable<Package?>? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun FindPackageForUser(userSecurityId: String?, packageFullName: String?):
        Package? {
      val fnPtr = _1676724875_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__1676724875_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1676724875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a7d4b655e8f4fc7a2e57f6925cb8b53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager(ptr: Pointer?): WithDefault = IPackageManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager {
      val address = segment.toRawLongValue()
      return makeIPackageManager(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1676724875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager): Array<IPackageManager?> = (elements as
        Array<IPackageManager?>).castToImpl<IPackageManager,IPackageManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager?> =
        arrayOfNulls<IPackageManager_Impl>(size) as Array<IPackageManager?>
  }
}
