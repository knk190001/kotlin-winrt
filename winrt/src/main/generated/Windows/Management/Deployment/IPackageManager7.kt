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

@ABIMarker(IPackageManager7.ABI::class)
@Signature("{f28654f4-2ba7-4b80-88d6-be15f9a23fba}")
@Guid("f28654f42ba74b8088d6be15f9a23fba")
@WinRTInterface("f28654f42ba74b8088d6be15f9a23fba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager7.ByReference::class)
public interface IPackageManager7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAddPackageAsync(
    packageUri: Uri?,
    dependencyPackageUris: IIterable<Uri?>?,
    deploymentOptions: DeploymentOptions?,
    targetVolume: PackageVolume?,
    optionalPackageFamilyNames: IIterable<String?>?,
    relatedPackageUris: IIterable<Uri?>?,
    packageUrisToInstall: IIterable<Uri?>?
  ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager7> {
    public override fun getValue() = ABI.makeIPackageManager7(pointer.getPointer(0))

    public fun setValue(value: IPackageManager7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager7 {
    public val __438863628_Ptr: Pointer?

    public val _438863628_VtblPtr: Pointer?
      get() = __438863628_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAddPackageAsync(
      packageUri: Uri?,
      dependencyPackageUris: IIterable<Uri?>?,
      deploymentOptions: DeploymentOptions?,
      targetVolume: PackageVolume?,
      optionalPackageFamilyNames: IIterable<String?>?,
      relatedPackageUris: IIterable<Uri?>?,
      packageUrisToInstall: IIterable<Uri?>?
    ): IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863628_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863628_Ptr, marshalToNative(packageUri),
          marshalToNative(dependencyPackageUris), marshalToNative(deploymentOptions),
          marshalToNative(targetVolume), marshalToNative(optionalPackageFamilyNames),
          marshalToNative(relatedPackageUris), marshalToNative(packageUrisToInstall), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863628_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f28654f42ba74b8088d6be15f9a23fba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager7(ptr: Pointer?): WithDefault = IPackageManager7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager7 {
      val address = segment.toRawLongValue()
      return makeIPackageManager7(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863628_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager7): Array<IPackageManager7?> = (elements as
        Array<IPackageManager7?>).castToImpl<IPackageManager7,IPackageManager7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager7?> =
        arrayOfNulls<IPackageManager7_Impl>(size) as Array<IPackageManager7?>
  }
}
