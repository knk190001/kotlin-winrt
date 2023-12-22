package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAppInstallManager2.ABI::class)
@Signature("{16937851-ed37-480d-8314-52e27c03f04a}")
@Guid("16937851ed37480d831452e27c03f04a")
@WinRTInterface("16937851ed37480d831452e27c03f04a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager2.ByReference::class)
public interface IAppInstallManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAppInstallAsync(
    productId: String?,
    skuId: String?,
    repair: Boolean,
    forceUseOfNonRemovableStorage: Boolean,
    catalogId: String?,
    bundleId: String?,
    correlationVector: String?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(1)
  public fun UpdateAppByPackageFamilyNameAsync(packageFamilyName: String?,
      correlationVector: String?): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(2)
  public fun SearchForUpdatesAsync(
    productId: String?,
    skuId: String?,
    catalogId: String?,
    correlationVector: String?
  ): IAsyncOperation<AppInstallItem?>?

  @InterfaceMethod(3)
  public fun SearchForAllUpdatesAsync(correlationVector: String?):
      IAsyncOperation<IVectorView<AppInstallItem?>?>?

  @InterfaceMethod(4)
  public fun GetIsAppAllowedToInstallAsync(
    productId: String?,
    skuId: String?,
    catalogId: String?,
    correlationVector: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun Cancel(productId: String?, correlationVector: String?): Unit

  @InterfaceMethod(6)
  public fun Pause(productId: String?, correlationVector: String?): Unit

  @InterfaceMethod(7)
  public fun Restart(productId: String?, correlationVector: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager2> {
    public override fun getValue() = ABI.makeIAppInstallManager2(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager2 {
    public val __697290135_Ptr: Pointer?

    public val _697290135_VtblPtr: Pointer?
      get() = __697290135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAppInstallAsync(
      productId: String?,
      skuId: String?,
      repair: Boolean,
      forceUseOfNonRemovableStorage: Boolean,
      catalogId: String?,
      bundleId: String?,
      correlationVector: String?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(skuId), repair, forceUseOfNonRemovableStorage, marshalToNative(catalogId),
          marshalToNative(bundleId), marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdateAppByPackageFamilyNameAsync(packageFamilyName: String?,
        correlationVector: String?): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SearchForUpdatesAsync(
      productId: String?,
      skuId: String?,
      catalogId: String?,
      correlationVector: String?
    ): IAsyncOperation<AppInstallItem?>? {
      val fnPtr = _697290135_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(skuId), marshalToNative(catalogId), marshalToNative(correlationVector),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SearchForAllUpdatesAsync(correlationVector: String?):
        IAsyncOperation<IVectorView<AppInstallItem?>?>? {
      val fnPtr = _697290135_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInstallItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(correlationVector), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInstallItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetIsAppAllowedToInstallAsync(
      productId: String?,
      skuId: String?,
      catalogId: String?,
      correlationVector: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _697290135_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(skuId), marshalToNative(catalogId), marshalToNative(correlationVector),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Cancel(productId: String?, correlationVector: String?): Unit {
      val fnPtr = _697290135_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Pause(productId: String?, correlationVector: String?): Unit {
      val fnPtr = _697290135_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Restart(productId: String?, correlationVector: String?): Unit {
      val fnPtr = _697290135_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697290135_Ptr, marshalToNative(productId),
          marshalToNative(correlationVector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16937851ed37480d831452e27c03f04a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager2(ptr: Pointer?): WithDefault = IAppInstallManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager2 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager2(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager2): Array<IAppInstallManager2?> =
        (elements as
        Array<IAppInstallManager2?>).castToImpl<IAppInstallManager2,IAppInstallManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager2?> =
        arrayOfNulls<IAppInstallManager2_Impl>(size) as Array<IAppInstallManager2?>
  }
}
