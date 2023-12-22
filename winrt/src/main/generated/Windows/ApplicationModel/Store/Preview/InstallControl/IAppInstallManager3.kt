package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Management.Deployment.PackageVolume
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

@ABIMarker(IAppInstallManager3.ABI::class)
@Signature("{95b24b17-e96a-4d0e-84e1-c8cb417a0178}")
@Guid("95b24b17e96a4d0e84e1c8cb417a0178")
@WinRTInterface("95b24b17e96a4d0e84e1c8cb417a0178")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager3.ByReference::class)
public interface IAppInstallManager3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartProductInstallAsync(
    productId: String?,
    catalogId: String?,
    flightId: String?,
    clientId: String?,
    repair: Boolean,
    forceUseOfNonRemovableStorage: Boolean,
    correlationVector: String?,
    targetVolume: PackageVolume?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(1)
  public fun StartProductInstallForUserAsync(
    user: User?,
    productId: String?,
    catalogId: String?,
    flightId: String?,
    clientId: String?,
    repair: Boolean,
    forceUseOfNonRemovableStorage: Boolean,
    correlationVector: String?,
    targetVolume: PackageVolume?
  ): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(2)
  public fun UpdateAppByPackageFamilyNameForUserAsync(
    user: User?,
    packageFamilyName: String?,
    correlationVector: String?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(3)
  public fun SearchForUpdatesForUserAsync(
    user: User?,
    productId: String?,
    skuId: String?,
    catalogId: String?,
    correlationVector: String?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(4)
  public fun SearchForAllUpdatesForUserAsync(user: User?, correlationVector: String?):
      IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(5)
  public fun GetIsAppAllowedToInstallForUserAsync(
    user: User?,
    productId: String?,
    skuId: String?,
    catalogId: String?,
    correlationVector: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun GetIsApplicableForUserAsync(
    user: User?,
    productId: String?,
    skuId: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun MoveToFrontOfDownloadQueue(productId: String?, correlationVector: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager3> {
    public override fun getValue() = ABI.makeIAppInstallManager3(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager3 {
    public val __697290134_Ptr: Pointer?

    public val _697290134_VtblPtr: Pointer?
      get() = __697290134_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartProductInstallAsync(
      productId: String?,
      catalogId: String?,
      flightId: String?,
      clientId: String?,
      repair: Boolean,
      forceUseOfNonRemovableStorage: Boolean,
      correlationVector: String?,
      targetVolume: PackageVolume?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(productId),
          marshalToNative(catalogId), marshalToNative(flightId), marshalToNative(clientId), repair,
          forceUseOfNonRemovableStorage, marshalToNative(correlationVector),
          marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartProductInstallForUserAsync(
      user: User?,
      productId: String?,
      catalogId: String?,
      flightId: String?,
      clientId: String?,
      repair: Boolean,
      forceUseOfNonRemovableStorage: Boolean,
      correlationVector: String?,
      targetVolume: PackageVolume?
    ): IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(catalogId), marshalToNative(flightId),
          marshalToNative(clientId), repair, forceUseOfNonRemovableStorage,
          marshalToNative(correlationVector), marshalToNative(targetVolume), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UpdateAppByPackageFamilyNameForUserAsync(
      user: User?,
      packageFamilyName: String?,
      correlationVector: String?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(packageFamilyName), marshalToNative(correlationVector), result))
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
      catalogId: String?,
      correlationVector: String?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(skuId), marshalToNative(catalogId),
          marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SearchForAllUpdatesForUserAsync(user: User?, correlationVector: String?):
        IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetIsAppAllowedToInstallForUserAsync(
      user: User?,
      productId: String?,
      skuId: String?,
      catalogId: String?,
      correlationVector: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(skuId), marshalToNative(catalogId),
          marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetIsApplicableForUserAsync(
      user: User?,
      productId: String?,
      skuId: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _697290134_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(user),
          marshalToNative(productId), marshalToNative(skuId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun MoveToFrontOfDownloadQueue(productId: String?, correlationVector: String?):
        Unit {
      val fnPtr = _697290134_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697290134_Ptr, marshalToNative(productId),
          marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallManager3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290134_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95b24b17e96a4d0e84e1c8cb417a0178")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager3(ptr: Pointer?): WithDefault = IAppInstallManager3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager3 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager3(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290134_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager3): Array<IAppInstallManager3?> =
        (elements as
        Array<IAppInstallManager3?>).castToImpl<IAppInstallManager3,IAppInstallManager3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager3?> =
        arrayOfNulls<IAppInstallManager3_Impl>(size) as Array<IAppInstallManager3?>
  }
}
