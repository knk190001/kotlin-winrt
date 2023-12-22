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

@ABIMarker(IPackageManager5.ABI::class)
@Signature("{711f3117-1afd-4313-978c-9bb6e1b864a7}")
@Guid("711f31171afd4313978c9bb6e1b864a7")
@WinRTInterface("711f31171afd4313978c9bb6e1b864a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager5.ByReference::class)
public interface IPackageManager5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    externalPackageUris: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(1)
  public fun StagePackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    externalPackageUris: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun RegisterPackageByFamilyNameAsync(
    mainPackageFamilyName: String?,
    dependencyPackageFamilyNames: IIterable<String?>?,
    deploymentOptions: DeploymentOptions?,
    appDataVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(3)
  public fun get_DebugSettings(): PackageManagerDebugSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager5> {
    public override fun getValue() = ABI.makeIPackageManager5(pointer.getPointer(0))

    public fun setValue(value: IPackageManager5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager5 {
    public val __438863626_Ptr: Pointer?

    public val _438863626_VtblPtr: Pointer?
      get() = __438863626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      externalPackageUris: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863626_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(externalPackageUris), result))
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
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      externalPackageUris: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863626_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863626_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(externalPackageUris), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RegisterPackageByFamilyNameAsync(
      mainPackageFamilyName: String?,
      dependencyPackageFamilyNames: IIterable<String?>?,
      deploymentOptions: DeploymentOptions?,
      appDataVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863626_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863626_Ptr, marshalToNative(mainPackageFamilyName),
          marshalToNative(dependencyPackageFamilyNames), marshalToNative(deploymentOptions),
          marshalToNative(appDataVolume), marshalToNative(optionalPackageFamilyNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DebugSettings(): PackageManagerDebugSettings? {
      val fnPtr = _438863626_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageManagerDebugSettings>()
      val hr = fn.invokeHR(arrayOf(__438863626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageManagerDebugSettings>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("711f31171afd4313978c9bb6e1b864a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager5(ptr: Pointer?): WithDefault = IPackageManager5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager5 {
      val address = segment.toRawLongValue()
      return makeIPackageManager5(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager5): Array<IPackageManager5?> = (elements as
        Array<IPackageManager5?>).castToImpl<IPackageManager5,IPackageManager5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager5?> =
        arrayOfNulls<IPackageManager5_Impl>(size) as Array<IPackageManager5?>
  }
}
