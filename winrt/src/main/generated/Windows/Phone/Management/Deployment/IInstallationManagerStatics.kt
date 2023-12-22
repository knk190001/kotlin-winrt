package Windows.Phone.Management.Deployment

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

@ABIMarker(IInstallationManagerStatics.ABI::class)
@Signature("{929aa738-8d49-42ac-80c9-b4ad793c43f2}")
@Guid("929aa7388d4942ac80c9b4ad793c43f2")
@WinRTInterface("929aa7388d4942ac80c9b4ad793c43f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInstallationManagerStatics.ByReference::class)
public interface IInstallationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddPackageAsync(title: String?, sourceLocation: Uri?):
      IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?

  @InterfaceMethod(1)
  public fun AddPackageAsync(
    title: String?,
    sourceLocation: Uri?,
    instanceId: String?,
    offerId: String?,
    license: Uri?
  ): IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?

  @InterfaceMethod(2)
  public fun GetPendingPackageInstalls():
      IIterable<IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?>?

  @InterfaceMethod(3)
  public fun FindPackagesForCurrentPublisher(): IIterable<Package?>?

  @InterfaceMethod(4)
  public fun FindPackages(): IIterable<Package?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInstallationManagerStatics> {
    public override fun getValue() = ABI.makeIInstallationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IInstallationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInstallationManagerStatics {
    public val __1057164138_Ptr: Pointer?

    public val _1057164138_VtblPtr: Pointer?
      get() = __1057164138_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddPackageAsync(title: String?, sourceLocation: Uri?):
        IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>? {
      val fnPtr = _1057164138_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1057164138_Ptr, marshalToNative(title),
          marshalToNative(sourceLocation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddPackageAsync(
      title: String?,
      sourceLocation: Uri?,
      instanceId: String?,
      offerId: String?,
      license: Uri?
    ): IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>? {
      val fnPtr = _1057164138_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1057164138_Ptr, marshalToNative(title),
          marshalToNative(sourceLocation), marshalToNative(instanceId), marshalToNative(offerId),
          marshalToNative(license), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPendingPackageInstalls():
        IIterable<IAsyncOperationWithProgress<PackageInstallResult?, WinDef.UINT>?>? {
      val fnPtr = _1057164138_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>?>>()
      val hr = fn.invokeHR(arrayOf(__1057164138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IIterable<IAsyncOperationWithProgress<PackageInstallResult?,
          WinDef.UINT>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindPackagesForCurrentPublisher(): IIterable<Package?>? {
      val fnPtr = _1057164138_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1057164138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindPackages(): IIterable<Package?>? {
      val fnPtr = _1057164138_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Package?>>()
      val hr = fn.invokeHR(arrayOf(__1057164138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Package?>>(result.getValue())
      return resultValue
    }
  }

  public class IInstallationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1057164138_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInstallationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("929aa7388d4942ac80c9b4ad793c43f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInstallationManagerStatics(ptr: Pointer?): WithDefault =
        IInstallationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInstallationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIInstallationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInstallationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1057164138_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInstallationManagerStatics):
        Array<IInstallationManagerStatics?> = (elements as
        Array<IInstallationManagerStatics?>).castToImpl<IInstallationManagerStatics,IInstallationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInstallationManagerStatics?> =
        arrayOfNulls<IInstallationManagerStatics_Impl>(size) as Array<IInstallationManagerStatics?>
  }
}
