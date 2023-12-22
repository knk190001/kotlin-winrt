package Windows.ApplicationModel.Store

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.StorageFile
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

@ABIMarker(ICurrentAppSimulator.ABI::class)
@Signature("{f17f9db1-74cd-4787-9787-19866e9a5559}")
@Guid("f17f9db174cd4787978719866e9a5559")
@WinRTInterface("f17f9db174cd4787978719866e9a5559")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppSimulator.ByReference::class)
public interface ICurrentAppSimulator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LicenseInformation(): LicenseInformation?

  @InterfaceMethod(1)
  public fun get_LinkUri(): Uri?

  @InterfaceMethod(2)
  public fun get_AppId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun RequestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation<String?>?

  @InterfaceMethod(4)
  public fun RequestProductPurchaseAsync(productId: String?, includeReceipt: Boolean):
      IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun LoadListingInformationAsync(): IAsyncOperation<ListingInformation?>?

  @InterfaceMethod(6)
  public fun GetAppReceiptAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(7)
  public fun GetProductReceiptAsync(productId: String?): IAsyncOperation<String?>?

  @InterfaceMethod(8)
  public fun ReloadSimulatorAsync(simulatorSettingsFile: StorageFile?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentAppSimulator> {
    public override fun getValue() = ABI.makeICurrentAppSimulator(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppSimulator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppSimulator {
    public val __1382552778_Ptr: Pointer?

    public val _1382552778_VtblPtr: Pointer?
      get() = __1382552778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LicenseInformation(): LicenseInformation? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LicenseInformation>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LicenseInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LinkUri(): Uri? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAppPurchaseAsync(includeReceipt: Boolean):
        IAsyncOperation<String?>? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr, includeReceipt, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestProductPurchaseAsync(productId: String?, includeReceipt: Boolean):
        IAsyncOperation<String?>? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr, marshalToNative(productId), includeReceipt,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LoadListingInformationAsync(): IAsyncOperation<ListingInformation?>? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ListingInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ListingInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetAppReceiptAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetProductReceiptAsync(productId: String?): IAsyncOperation<String?>? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr, marshalToNative(productId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ReloadSimulatorAsync(simulatorSettingsFile: StorageFile?): IAsyncAction? {
      val fnPtr = _1382552778_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1382552778_Ptr, marshalToNative(simulatorSettingsFile),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentAppSimulator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1382552778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppSimulator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f17f9db174cd4787978719866e9a5559")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppSimulator(ptr: Pointer?): WithDefault = ICurrentAppSimulator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentAppSimulator {
      val address = segment.toRawLongValue()
      return makeICurrentAppSimulator(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppSimulator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1382552778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppSimulator): Array<ICurrentAppSimulator?> =
        (elements as
        Array<ICurrentAppSimulator?>).castToImpl<ICurrentAppSimulator,ICurrentAppSimulator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppSimulator?> =
        arrayOfNulls<ICurrentAppSimulator_Impl>(size) as Array<ICurrentAppSimulator?>
  }
}
