package Windows.ApplicationModel.Store

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ILicenseInformation.ABI::class)
@Signature("{8eb7dc30-f170-4ed5-8e21-1516da3fd367}")
@Guid("8eb7dc30f1704ed58e211516da3fd367")
@WinRTInterface("8eb7dc30f1704ed58e211516da3fd367")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILicenseInformation.ByReference::class)
public interface ILicenseInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductLicenses(): IMapView<String?, ProductLicense?>?

  @InterfaceMethod(1)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(2)
  public fun get_IsTrial(): Boolean

  @InterfaceMethod(3)
  public fun get_ExpirationDate(): DateTime?

  @InterfaceMethod(4)
  public fun add_LicenseChanged(handler: LicenseChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_LicenseChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILicenseInformation> {
    public override fun getValue() = ABI.makeILicenseInformation(pointer.getPointer(0))

    public fun setValue(value: ILicenseInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILicenseInformation {
    public val __1804464797_Ptr: Pointer?

    public val _1804464797_VtblPtr: Pointer?
      get() = __1804464797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductLicenses(): IMapView<String?, ProductLicense?>? {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, ProductLicense?>>()
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, ProductLicense?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsTrial(): Boolean {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_LicenseChanged(handler: LicenseChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_LicenseChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1804464797_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1804464797_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILicenseInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1804464797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILicenseInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8eb7dc30f1704ed58e211516da3fd367")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILicenseInformation(ptr: Pointer?): WithDefault = ILicenseInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILicenseInformation {
      val address = segment.toRawLongValue()
      return makeILicenseInformation(Pointer(address))
    }

    public override fun toNative(obj: ILicenseInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1804464797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILicenseInformation): Array<ILicenseInformation?> =
        (elements as
        Array<ILicenseInformation?>).castToImpl<ILicenseInformation,ILicenseInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILicenseInformation?> =
        arrayOfNulls<ILicenseInformation_Impl>(size) as Array<ILicenseInformation?>
  }
}
