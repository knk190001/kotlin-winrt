package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.System.User
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallManager6.ABI::class)
@Signature("{c9e7d408-f27a-4471-b2f4-e76efcbebcca}")
@Guid("c9e7d408f27a4471b2f4e76efcbebcca")
@WinRTInterface("c9e7d408f27a4471b2f4e76efcbebcca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager6.ByReference::class)
public interface IAppInstallManager6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SearchForAllUpdatesAsync(
    correlationVector: String?,
    clientId: String?,
    updateOptions: AppUpdateOptions?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(1)
  public fun SearchForAllUpdatesForUserAsync(
    user: User?,
    correlationVector: String?,
    clientId: String?,
    updateOptions: AppUpdateOptions?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(2)
  public fun SearchForUpdatesAsync(
    productId: String?,
    skuId: String?,
    correlationVector: String?,
    clientId: String?,
    updateOptions: AppUpdateOptions?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(3)
  public fun SearchForUpdatesForUserAsync(
    user: User?,
    productId: String?,
    skuId: String?,
    correlationVector: String?,
    clientId: String?,
    updateOptions: AppUpdateOptions?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(4)
  public fun StartProductInstallAsync(
    productId: String?,
    flightId: String?,
    clientId: String?,
    correlationVector: String?,
    installOptions: AppInstallOptions?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(5)
  public fun StartProductInstallForUserAsync(
    user: User?,
    productId: String?,
    flightId: String?,
    clientId: String?,
    correlationVector: String?,
    installOptions: AppInstallOptions?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(6)
  public fun GetIsPackageIdentityAllowedToInstallAsync(
    correlationVector: String?,
    packageIdentityName: String?,
    publisherCertificateName: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun GetIsPackageIdentityAllowedToInstallForUserAsync(
    user: User?,
    correlationVector: String?,
    packageIdentityName: String?,
    publisherCertificateName: String?
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager6> {
    public override fun getValue() = ABI.makeIAppInstallManager6(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager6 {
    public val __697290131_Ptr: Pointer?

    public val _697290131_VtblPtr: Pointer?
      get() = __697290131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SearchForAllUpdatesAsync(
      correlationVector: String?,
      clientId: String?,
      updateOptions: AppUpdateOptions?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(correlationVector),
          marshalToNative(clientId), marshalToNative(updateOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SearchForAllUpdatesForUserAsync(
      user: User?,
      correlationVector: String?,
      clientId: String?,
      updateOptions: AppUpdateOptions?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(user),
          marshalToNative(correlationVector), marshalToNative(clientId),
          marshalToNative(updateOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SearchForUpdatesAsync(
      productId: String?,
      skuId: String?,
      correlationVector: String?,
      clientId: String?,
      updateOptions: AppUpdateOptions?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(productId),
          marshalToNative(skuId), marshalToNative(correlationVector), marshalToNative(clientId),
          marshalToNative(updateOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SearchForUpdatesForUserAsync(
      user: User?,
      productId: String?,
      skuId: String?,
      correlationVector: String?,
      clientId: String?,
      updateOptions: AppUpdateOptions?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(skuId), marshalToNative(correlationVector),
          marshalToNative(clientId), marshalToNative(updateOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun StartProductInstallAsync(
      productId: String?,
      flightId: String?,
      clientId: String?,
      correlationVector: String?,
      installOptions: AppInstallOptions?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(productId),
          marshalToNative(flightId), marshalToNative(clientId), marshalToNative(correlationVector),
          marshalToNative(installOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun StartProductInstallForUserAsync(
      user: User?,
      productId: String?,
      flightId: String?,
      clientId: String?,
      correlationVector: String?,
      installOptions: AppInstallOptions?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(flightId), marshalToNative(clientId),
          marshalToNative(correlationVector), marshalToNative(installOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetIsPackageIdentityAllowedToInstallAsync(
      correlationVector: String?,
      packageIdentityName: String?,
      publisherCertificateName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(correlationVector),
          marshalToNative(packageIdentityName), marshalToNative(publisherCertificateName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetIsPackageIdentityAllowedToInstallForUserAsync(
      user: User?,
      correlationVector: String?,
      packageIdentityName: String?,
      publisherCertificateName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _697290131_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697290131_Ptr, marshalToNative(user),
          marshalToNative(correlationVector), marshalToNative(packageIdentityName),
          marshalToNative(publisherCertificateName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallManager6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9e7d408f27a4471b2f4e76efcbebcca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager6(ptr: Pointer?): WithDefault = IAppInstallManager6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager6 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager6(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager6): Array<IAppInstallManager6?> =
        (elements as
        Array<IAppInstallManager6?>).castToImpl<IAppInstallManager6,IAppInstallManager6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager6?> =
        arrayOfNulls<IAppInstallManager6_Impl>(size) as Array<IAppInstallManager6?>
  }
}
