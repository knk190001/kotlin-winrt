package Windows.ApplicationModel

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageCatalog.ABI::class)
@Signature("{230a3751-9de3-4445-be74-91fb325abefe}")
@Guid("230a37519de34445be7491fb325abefe")
@WinRTInterface("230a37519de34445be7491fb325abefe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalog.ByReference::class)
public interface IPackageCatalog : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PackageStaging(handler: TypedEventHandler<PackageCatalog?,
      PackageStagingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PackageStaging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PackageInstalling(handler: TypedEventHandler<PackageCatalog?,
      PackageInstallingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PackageInstalling(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PackageUpdating(handler: TypedEventHandler<PackageCatalog?,
      PackageUpdatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PackageUpdating(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PackageUninstalling(handler: TypedEventHandler<PackageCatalog?,
      PackageUninstallingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PackageUninstalling(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PackageStatusChanged(handler: TypedEventHandler<PackageCatalog?,
      PackageStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PackageStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalog> {
    public override fun getValue() = ABI.makeIPackageCatalog(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalog {
    public val __686792984_Ptr: Pointer?

    public val _686792984_VtblPtr: Pointer?
      get() = __686792984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PackageStaging(handler: TypedEventHandler<PackageCatalog?,
        PackageStagingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _686792984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PackageStaging(token: EventRegistrationToken?): Unit {
      val fnPtr = _686792984_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PackageInstalling(handler: TypedEventHandler<PackageCatalog?,
        PackageInstallingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _686792984_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PackageInstalling(token: EventRegistrationToken?): Unit {
      val fnPtr = _686792984_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_PackageUpdating(handler: TypedEventHandler<PackageCatalog?,
        PackageUpdatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _686792984_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PackageUpdating(token: EventRegistrationToken?): Unit {
      val fnPtr = _686792984_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PackageUninstalling(handler: TypedEventHandler<PackageCatalog?,
        PackageUninstallingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _686792984_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PackageUninstalling(token: EventRegistrationToken?): Unit {
      val fnPtr = _686792984_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PackageStatusChanged(handler: TypedEventHandler<PackageCatalog?,
        PackageStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _686792984_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PackageStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _686792984_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__686792984_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPackageCatalog_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __686792984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("230a37519de34445be7491fb325abefe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalog(ptr: Pointer?): WithDefault = IPackageCatalog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageCatalog {
      val address = segment.toRawLongValue()
      return makeIPackageCatalog(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__686792984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalog): Array<IPackageCatalog?> = (elements as
        Array<IPackageCatalog?>).castToImpl<IPackageCatalog,IPackageCatalog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalog?> =
        arrayOfNulls<IPackageCatalog_Impl>(size) as Array<IPackageCatalog?>
  }
}
