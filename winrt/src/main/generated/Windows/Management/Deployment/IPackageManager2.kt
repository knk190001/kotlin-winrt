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

@ABIMarker(IPackageManager2.ABI::class)
@Signature("{f7aad08d-0840-46f2-b5d8-cad47693a095}")
@Guid("f7aad08d084046f2b5d8cad47693a095")
@WinRTInterface("f7aad08d084046f2b5d8cad47693a095")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager2.ByReference::class)
public interface IPackageManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RemovePackageAsync(packageFullName: String?, removalOptions: RemovalOptions?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(1)
  public fun StagePackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun RegisterPackageByFullNameAsync(
    mainPackageFullName: String?,
    dependencyPackageFullNames: IIterable<String?>?,
    deploymentOptions: DeploymentOptions?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(3)
  public fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?): IIterable<Package?>?

  @InterfaceMethod(4)
  public fun FindPackagesForUserWithPackageTypes(userSecurityId: String?,
      packageTypes: PackageTypes?): IIterable<Package?>?

  @InterfaceMethod(5)
  public fun FindPackagesWithPackageTypes(
    packageName: String?,
    packagePublisher: String?,
    packageTypes: PackageTypes?
  ): IIterable<Package?>?

  @InterfaceMethod(6)
  public fun FindPackagesForUserWithPackageTypes(
    userSecurityId: String?,
    packageName: String?,
    packagePublisher: String?,
    packageTypes: PackageTypes?
  ): IIterable<Package?>?

  @InterfaceMethod(7)
  public fun FindPackagesWithPackageTypes(packageFamilyName: String?, packageTypes: PackageTypes?):
      IIterable<Package?>?

  @InterfaceMethod(8)
  public fun FindPackagesForUserWithPackageTypes(
    userSecurityId: String?,
    packageFamilyName: String?,
    packageTypes: PackageTypes?
  ): IIterable<Package?>?

  @InterfaceMethod(9)
  public fun StageUserDataAsync(packageFullName: String?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager2> {
    public override fun getValue() = ABI.makeIPackageManager2(pointer.getPointer(0))

    public fun setValue(value: IPackageManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager2 {
    public val __438863623_Ptr: Pointer?

    public val _438863623_VtblPtr: Pointer?
      get() = __438863623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RemovePackageAsync(packageFullName: String?,
        removalOptions: RemovalOptions?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageFullName),
          marshalToNative(removalOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StagePackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RegisterPackageByFullNameAsync(
      mainPackageFullName: String?,
      dependencyPackageFullNames: IIterable<String?>?,
      deploymentOptions: DeploymentOptions?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(mainPackageFullName),
          marshalToNative(dependencyPackageFullNames), marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?):
        IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindPackagesForUserWithPackageTypes(userSecurityId: String?,
        packageTypes: PackageTypes?): IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindPackagesWithPackageTypes(
      packageName: String?,
      packagePublisher: String?,
      packageTypes: PackageTypes?
    ): IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageName),
          marshalToNative(packagePublisher), marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FindPackagesForUserWithPackageTypes(
      userSecurityId: String?,
      packageName: String?,
      packagePublisher: String?,
      packageTypes: PackageTypes?
    ): IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageName), marshalToNative(packagePublisher),
          marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindPackagesWithPackageTypes(packageFamilyName: String?,
        packageTypes: PackageTypes?): IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun FindPackagesForUserWithPackageTypes(
      userSecurityId: String?,
      packageFamilyName: String?,
      packageTypes: PackageTypes?
    ): IIterable<Package?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageFamilyName), marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun StageUserDataAsync(packageFullName: String?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863623_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863623_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7aad08d084046f2b5d8cad47693a095")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager2(ptr: Pointer?): WithDefault = IPackageManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager2 {
      val address = segment.toRawLongValue()
      return makeIPackageManager2(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager2): Array<IPackageManager2?> = (elements as
        Array<IPackageManager2?>).castToImpl<IPackageManager2,IPackageManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager2?> =
        arrayOfNulls<IPackageManager2_Impl>(size) as Array<IPackageManager2?>
  }
}
