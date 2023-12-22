package Windows.ApplicationModel

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPackageCatalog4.ABI::class)
@Signature("{c37c399b-44cc-4b7b-8baf-796c04ead3b9}")
@Guid("c37c399b44cc4b7b8baf796c04ead3b9")
@WinRTInterface("c37c399b44cc4b7b8baf796c04ead3b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalog4.ByReference::class)
public interface IPackageCatalog4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddResourcePackageAsync(
    resourcePackageFamilyName: String?,
    resourceID: String?,
    options: AddResourcePackageOptions?
  ): IAsyncOperationWithProgress<PackageCatalogAddResourcePackageResult?, PackageInstallProgress?>?

  @InterfaceMethod(1)
  public fun RemoveResourcePackagesAsync(resourcePackages: IIterable<Package?>?):
      IAsyncOperation<PackageCatalogRemoveResourcePackagesResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalog4> {
    public override fun getValue() = ABI.makeIPackageCatalog4(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalog4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalog4 {
    public val __184253924_Ptr: Pointer?

    public val _184253924_VtblPtr: Pointer?
      get() = __184253924_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddResourcePackageAsync(
      resourcePackageFamilyName: String?,
      resourceID: String?,
      options: AddResourcePackageOptions?
    ): IAsyncOperationWithProgress<PackageCatalogAddResourcePackageResult?,
        PackageInstallProgress?>? {
      val fnPtr = _184253924_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<PackageCatalogAddResourcePackageResult?,
          PackageInstallProgress?>>()
      val hr = fn.invokeHR(arrayOf(__184253924_Ptr, marshalToNative(resourcePackageFamilyName),
          marshalToNative(resourceID), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<PackageCatalogAddResourcePackageResult?,
          PackageInstallProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RemoveResourcePackagesAsync(resourcePackages: IIterable<Package?>?):
        IAsyncOperation<PackageCatalogRemoveResourcePackagesResult?>? {
      val fnPtr = _184253924_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PackageCatalogRemoveResourcePackagesResult?>>()
      val hr = fn.invokeHR(arrayOf(__184253924_Ptr, marshalToNative(resourcePackages), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PackageCatalogRemoveResourcePackagesResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalog4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184253924_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalog4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c37c399b44cc4b7b8baf796c04ead3b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalog4(ptr: Pointer?): WithDefault = IPackageCatalog4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageCatalog4 {
      val address = segment.toRawLongValue()
      return makeIPackageCatalog4(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalog4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__184253924_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalog4): Array<IPackageCatalog4?> = (elements as
        Array<IPackageCatalog4?>).castToImpl<IPackageCatalog4,IPackageCatalog4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalog4?> =
        arrayOfNulls<IPackageCatalog4_Impl>(size) as Array<IPackageCatalog4?>
  }
}
