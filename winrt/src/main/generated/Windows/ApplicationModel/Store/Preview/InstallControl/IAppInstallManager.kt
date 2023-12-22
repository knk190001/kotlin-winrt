package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IAppInstallManager.ABI::class)
@Signature("{9353e170-8441-4b45-bd72-7c2fa925beee}")
@Guid("9353e17084414b45bd727c2fa925beee")
@WinRTInterface("9353e17084414b45bd727c2fa925beee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager.ByReference::class)
public interface IAppInstallManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppInstallItems(): IVectorView<AppInstallItem?>?

  @InterfaceMethod(1)
  public fun Cancel(productId: String?): Unit

  @InterfaceMethod(2)
  public fun Pause(productId: String?): Unit

  @InterfaceMethod(3)
  public fun Restart(productId: String?): Unit

  @InterfaceMethod(4)
  public fun add_ItemCompleted(handler: TypedEventHandler<AppInstallManager?,
      AppInstallManagerItemEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ItemCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_ItemStatusChanged(handler: TypedEventHandler<AppInstallManager?,
      AppInstallManagerItemEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ItemStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_AutoUpdateSetting(): AutoUpdateSetting?

  @InterfaceMethod(9)
  public fun put_AutoUpdateSetting(value: AutoUpdateSetting?): Unit

  @InterfaceMethod(10)
  public fun get_AcquisitionIdentity(): String?

  @InterfaceMethod(11)
  public fun put_AcquisitionIdentity(value: String?): Unit

  @InterfaceMethod(12)
  public fun GetIsApplicableAsync(productId: String?, skuId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun StartAppInstallAsync(
    productId: String?,
    skuId: String?,
    repair: Boolean,
    forceUseOfNonRemovableStorage: Boolean
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(14)
  public fun UpdateAppByPackageFamilyNameAsync(packageFamilyName: String?):
      IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(15)
  public fun SearchForUpdatesAsync(productId: String?, skuId: String?):
      IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(16)
  public fun SearchForAllUpdatesAsync(): IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(17)
  public fun IsStoreBlockedByPolicyAsync(storeClientName: String?, storeClientPublisher: String?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(18)
  public fun GetIsAppAllowedToInstallAsync(productId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager> {
    public override fun getValue() = ABI.makeIAppInstallManager(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager {
    public val __808790761_Ptr: Pointer?

    public val _808790761_VtblPtr: Pointer?
      get() = __808790761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppInstallItems(): IVectorView<AppInstallItem?>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Cancel(productId: String?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Pause(productId: String?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Restart(productId: String?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ItemCompleted(handler: TypedEventHandler<AppInstallManager?,
        AppInstallManagerItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ItemCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ItemStatusChanged(handler: TypedEventHandler<AppInstallManager?,
        AppInstallManagerItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ItemStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AutoUpdateSetting(): AutoUpdateSetting? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoUpdateSetting>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoUpdateSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_AutoUpdateSetting(value: AutoUpdateSetting?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AcquisitionIdentity(): String? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_AcquisitionIdentity(value: String?): Unit {
      val fnPtr = _808790761_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GetIsApplicableAsync(productId: String?, skuId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),
          marshalToNative(skuId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun StartAppInstallAsync(
      productId: String?,
      skuId: String?,
      repair: Boolean,
      forceUseOfNonRemovableStorage: Boolean
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),
          marshalToNative(skuId), repair, forceUseOfNonRemovableStorage, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun UpdateAppByPackageFamilyNameAsync(packageFamilyName: String?):
        IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun SearchForUpdatesAsync(productId: String?, skuId: String?):
        IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId),
          marshalToNative(skuId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun SearchForAllUpdatesAsync():
        IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun IsStoreBlockedByPolicyAsync(storeClientName: String?,
        storeClientPublisher: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(storeClientName),
          marshalToNative(storeClientPublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetIsAppAllowedToInstallAsync(productId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _808790761_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__808790761_Ptr, marshalToNative(productId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __808790761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9353e17084414b45bd727c2fa925beee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager(ptr: Pointer?): WithDefault = IAppInstallManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__808790761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager): Array<IAppInstallManager?> =
        (elements as
        Array<IAppInstallManager?>).castToImpl<IAppInstallManager,IAppInstallManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager?> =
        arrayOfNulls<IAppInstallManager_Impl>(size) as Array<IAppInstallManager?>
  }
}
