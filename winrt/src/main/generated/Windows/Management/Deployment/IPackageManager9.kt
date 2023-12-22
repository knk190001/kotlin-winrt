package Windows.Management.Deployment

import Windows.ApplicationModel.Package
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IPackageManager9.ABI::class)
@Signature("{1aa79035-cc71-4b2e-80a6-c7041d8579a7}")
@Guid("1aa79035cc714b2e80a6c7041d8579a7")
@WinRTInterface("1aa79035cc714b2e80a6c7041d8579a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager9.ByReference::class)
public interface IPackageManager9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindProvisionedPackages(): IVector<Package?>?

  @InterfaceMethod(1)
  public fun AddPackageByUriAsync(packageUri: Uri?, options: AddPackageOptions?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(2)
  public fun StagePackageByUriAsync(packageUri: Uri?, options: StagePackageOptions?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(3)
  public fun RegisterPackageByUriAsync(manifestUri: Uri?, options: RegisterPackageOptions?):
      IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>?

  @InterfaceMethod(4)
  public fun RegisterPackagesByFullNameAsync(packageFullNames: IIterable<String?>?,
      options: RegisterPackageOptions?): IAsyncOperationWithProgress<DeploymentResult?,
      DeploymentProgress?>?

  @InterfaceMethod(5)
  public fun SetPackageStubPreference(packageFamilyName: String?, useStub: PackageStubPreference?):
      Unit

  @InterfaceMethod(6)
  public fun GetPackageStubPreference(packageFamilyName: String?): PackageStubPreference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager9> {
    public override fun getValue() = ABI.makeIPackageManager9(pointer.getPointer(0))

    public fun setValue(value: IPackageManager9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager9 {
    public val __438863630_Ptr: Pointer?

    public val _438863630_VtblPtr: Pointer?
      get() = __438863630_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindProvisionedPackages(): IVector<Package?>? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddPackageByUriAsync(packageUri: Uri?, options: AddPackageOptions?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(packageUri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StagePackageByUriAsync(packageUri: Uri?, options: StagePackageOptions?):
        IAsyncOperationWithProgress<DeploymentResult?, DeploymentProgress?>? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(packageUri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RegisterPackageByUriAsync(manifestUri: Uri?,
        options: RegisterPackageOptions?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(manifestUri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RegisterPackagesByFullNameAsync(packageFullNames: IIterable<String?>?,
        options: RegisterPackageOptions?): IAsyncOperationWithProgress<DeploymentResult?,
        DeploymentProgress?>? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(packageFullNames),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DeploymentResult?,
          DeploymentProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetPackageStubPreference(packageFamilyName: String?,
        useStub: PackageStubPreference?): Unit {
      val fnPtr = _438863630_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(useStub),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetPackageStubPreference(packageFamilyName: String?):
        PackageStubPreference? {
      val fnPtr = _438863630_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageStubPreference>()
      val hr = fn.invokeHR(arrayOf(__438863630_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageStubPreference>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863630_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1aa79035cc714b2e80a6c7041d8579a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager9(ptr: Pointer?): WithDefault = IPackageManager9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager9 {
      val address = segment.toRawLongValue()
      return makeIPackageManager9(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863630_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager9): Array<IPackageManager9?> = (elements as
        Array<IPackageManager9?>).castToImpl<IPackageManager9,IPackageManager9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager9?> =
        arrayOfNulls<IPackageManager9_Impl>(size) as Array<IPackageManager9?>
  }
}
