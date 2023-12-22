package Windows.Management.Deployment

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPackageManager3.ABI::class)
@Signature("{daad9948-36f1-41a7-9188-bc263e0dcb72}")
@Guid("daad994836f141a79188bc263e0dcb72")
@WinRTInterface("daad994836f141a79188bc263e0dcb72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager3.ByReference::class)
public interface IPackageManager3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddPackageVolumeAsync(packageStorePath: String?): IAsyncOperation<PackageVolume?>?

  @InterfaceMethod(1)
  public fun AddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun ClearPackageStatus(packageFullName: String?, status: PackageStatus?): Unit

  @InterfaceMethod(3)
  public fun RegisterPackageAsync(
    manifestUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    appDataVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(4)
  public fun FindPackageVolume(volumeName: String?): PackageVolume?

  @InterfaceMethod(5)
  public fun FindPackageVolumes(): IIterable<PackageVolume?>?

  @InterfaceMethod(6)
  public fun GetDefaultPackageVolume(): PackageVolume?

  @InterfaceMethod(7)
  public fun MovePackageToVolumeAsync(
    packageFullName: String?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(8)
  public fun RemovePackageVolumeAsync(volume: PackageVolume?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(9)
  public fun SetDefaultPackageVolume(volume: PackageVolume?): Unit

  @InterfaceMethod(10)
  public fun SetPackageStatus(packageFullName: String?, status: PackageStatus?): Unit

  @InterfaceMethod(11)
  public fun SetPackageVolumeOfflineAsync(packageVolume: PackageVolume?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(12)
  public fun SetPackageVolumeOnlineAsync(packageVolume: PackageVolume?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(13)
  public fun StagePackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(14)
  public fun StageUserDataAsync(packageFullName: String?, deploymentOptions: DeploymentOptions?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager3> {
    public override fun getValue() = ABI.makeIPackageManager3(pointer.getPointer(0))

    public fun setValue(value: IPackageManager3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager3 {
    public val __438863624_Ptr: Pointer?

    public val _438863624_VtblPtr: Pointer?
      get() = __438863624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddPackageVolumeAsync(packageStorePath: String?):
        IAsyncOperation<PackageVolume?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PackageVolume?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageStorePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PackageVolume?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearPackageStatus(packageFullName: String?, status: PackageStatus?): Unit {
      val fnPtr = _438863624_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageFullName),
          marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RegisterPackageAsync(
      manifestUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      appDataVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(manifestUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(appDataVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindPackageVolume(volumeName: String?): PackageVolume? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageVolume>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(volumeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindPackageVolumes(): IIterable<PackageVolume?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<PackageVolume?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<PackageVolume?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetDefaultPackageVolume(): PackageVolume? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageVolume>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun MovePackageToVolumeAsync(
      packageFullName: String?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageFullName),
          marshalToNative(deploymentOptions), marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RemovePackageVolumeAsync(volume: PackageVolume?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(volume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SetDefaultPackageVolume(volume: PackageVolume?): Unit {
      val fnPtr = _438863624_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(volume),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetPackageStatus(packageFullName: String?, status: PackageStatus?): Unit {
      val fnPtr = _438863624_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageFullName),
          marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SetPackageVolumeOfflineAsync(packageVolume: PackageVolume?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SetPackageVolumeOnlineAsync(packageVolume: PackageVolume?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun StagePackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun StageUserDataAsync(packageFullName: String?,
        deploymentOptions: DeploymentOptions?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _438863624_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863624_Ptr, marshalToNative(packageFullName),
          marshalToNative(deploymentOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daad994836f141a79188bc263e0dcb72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager3(ptr: Pointer?): WithDefault = IPackageManager3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager3 {
      val address = segment.toRawLongValue()
      return makeIPackageManager3(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager3): Array<IPackageManager3?> = (elements as
        Array<IPackageManager3?>).castToImpl<IPackageManager3,IPackageManager3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager3?> =
        arrayOfNulls<IPackageManager3_Impl>(size) as Array<IPackageManager3?>
  }
}
