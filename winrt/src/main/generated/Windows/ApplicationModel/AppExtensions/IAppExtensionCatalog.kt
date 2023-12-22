package Windows.ApplicationModel.AppExtensions

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

@ABIMarker(IAppExtensionCatalog.ABI::class)
@Signature("{97872032-8426-4ad1-9084-92e88c2da200}")
@Guid("9787203284264ad1908492e88c2da200")
@WinRTInterface("9787203284264ad1908492e88c2da200")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionCatalog.ByReference::class)
public interface IAppExtensionCatalog : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<AppExtension?>?>?

  @InterfaceMethod(1)
  public fun RequestRemovePackageAsync(packageFullName: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun add_PackageInstalled(handler: TypedEventHandler<AppExtensionCatalog?,
      AppExtensionPackageInstalledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PackageInstalled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PackageUpdating(handler: TypedEventHandler<AppExtensionCatalog?,
      AppExtensionPackageUpdatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PackageUpdating(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PackageUpdated(handler: TypedEventHandler<AppExtensionCatalog?,
      AppExtensionPackageUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PackageUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PackageUninstalling(handler: TypedEventHandler<AppExtensionCatalog?,
      AppExtensionPackageUninstallingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PackageUninstalling(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PackageStatusChanged(handler: TypedEventHandler<AppExtensionCatalog?,
      AppExtensionPackageStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PackageStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionCatalog> {
    public override fun getValue() = ABI.makeIAppExtensionCatalog(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionCatalog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionCatalog {
    public val __758960413_Ptr: Pointer?

    public val _758960413_VtblPtr: Pointer?
      get() = __758960413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<AppExtension?>?>? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppExtension?>?>>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppExtension?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestRemovePackageAsync(packageFullName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_PackageInstalled(handler: TypedEventHandler<AppExtensionCatalog?,
        AppExtensionPackageInstalledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PackageInstalled(token: EventRegistrationToken?): Unit {
      val fnPtr = _758960413_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_PackageUpdating(handler: TypedEventHandler<AppExtensionCatalog?,
        AppExtensionPackageUpdatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PackageUpdating(token: EventRegistrationToken?): Unit {
      val fnPtr = _758960413_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PackageUpdated(handler: TypedEventHandler<AppExtensionCatalog?,
        AppExtensionPackageUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PackageUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _758960413_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PackageUninstalling(handler: TypedEventHandler<AppExtensionCatalog?,
        AppExtensionPackageUninstallingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PackageUninstalling(token: EventRegistrationToken?): Unit {
      val fnPtr = _758960413_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_PackageStatusChanged(handler: TypedEventHandler<AppExtensionCatalog?,
        AppExtensionPackageStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _758960413_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PackageStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _758960413_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758960413_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppExtensionCatalog_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __758960413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionCatalog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9787203284264ad1908492e88c2da200")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionCatalog(ptr: Pointer?): WithDefault = IAppExtensionCatalog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExtensionCatalog {
      val address = segment.toRawLongValue()
      return makeIAppExtensionCatalog(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionCatalog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__758960413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionCatalog): Array<IAppExtensionCatalog?> =
        (elements as
        Array<IAppExtensionCatalog?>).castToImpl<IAppExtensionCatalog,IAppExtensionCatalog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionCatalog?> =
        arrayOfNulls<IAppExtensionCatalog_Impl>(size) as Array<IAppExtensionCatalog?>
  }
}
