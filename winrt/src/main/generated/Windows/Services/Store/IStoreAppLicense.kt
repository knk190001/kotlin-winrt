package Windows.Services.Store

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(IStoreAppLicense.ABI::class)
@Signature("{f389f9de-73c0-45ce-9bab-b2fe3e5eafd3}")
@Guid("f389f9de73c045ce9babb2fe3e5eafd3")
@WinRTInterface("f389f9de73c045ce9babb2fe3e5eafd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreAppLicense.ByReference::class)
public interface IStoreAppLicense : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SkuStoreId(): String?

  @InterfaceMethod(1)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(2)
  public fun get_IsTrial(): Boolean

  @InterfaceMethod(3)
  public fun get_ExpirationDate(): DateTime?

  @InterfaceMethod(4)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(5)
  public fun get_AddOnLicenses(): IMapView<String?, StoreLicense?>?

  @InterfaceMethod(6)
  public fun get_TrialTimeRemaining(): TimeSpan?

  @InterfaceMethod(7)
  public fun get_IsTrialOwnedByThisUser(): Boolean

  @InterfaceMethod(8)
  public fun get_TrialUniqueId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreAppLicense> {
    public override fun getValue() = ABI.makeIStoreAppLicense(pointer.getPointer(0))

    public fun setValue(value: IStoreAppLicense_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreAppLicense {
    public val __395633324_Ptr: Pointer?

    public val _395633324_VtblPtr: Pointer?
      get() = __395633324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SkuStoreId(): String? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _395633324_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsTrial(): Boolean {
      val fnPtr = _395633324_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AddOnLicenses(): IMapView<String?, StoreLicense?>? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, StoreLicense?>>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, StoreLicense?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TrialTimeRemaining(): TimeSpan? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsTrialOwnedByThisUser(): Boolean {
      val fnPtr = _395633324_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_TrialUniqueId(): String? {
      val fnPtr = _395633324_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__395633324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStoreAppLicense_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __395633324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreAppLicense, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f389f9de73c045ce9babb2fe3e5eafd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreAppLicense(ptr: Pointer?): WithDefault = IStoreAppLicense_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreAppLicense {
      val address = segment.toRawLongValue()
      return makeIStoreAppLicense(Pointer(address))
    }

    public override fun toNative(obj: IStoreAppLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__395633324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreAppLicense): Array<IStoreAppLicense?> = (elements as
        Array<IStoreAppLicense?>).castToImpl<IStoreAppLicense,IStoreAppLicense_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreAppLicense?> =
        arrayOfNulls<IStoreAppLicense_Impl>(size) as Array<IStoreAppLicense?>
  }
}
