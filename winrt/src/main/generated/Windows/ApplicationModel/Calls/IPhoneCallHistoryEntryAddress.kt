package Windows.ApplicationModel.Calls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallHistoryEntryAddress.ABI::class)
@Signature("{30f159da-3955-4042-84e6-66eebf82e67f}")
@Guid("30f159da3955404284e666eebf82e67f")
@WinRTInterface("30f159da3955404284e666eebf82e67f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryEntryAddress.ByReference::class)
public interface IPhoneCallHistoryEntryAddress : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactId(): String?

  @InterfaceMethod(1)
  public fun put_ContactId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_RawAddress(): String?

  @InterfaceMethod(5)
  public fun put_RawAddress(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_RawAddressKind(): PhoneCallHistoryEntryRawAddressKind?

  @InterfaceMethod(7)
  public fun put_RawAddressKind(value: PhoneCallHistoryEntryRawAddressKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryEntryAddress> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryEntryAddress(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryEntryAddress_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryEntryAddress {
    public val __1016231624_Ptr: Pointer?

    public val _1016231624_VtblPtr: Pointer?
      get() = __1016231624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactId(): String? {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContactId(value: String?): Unit {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RawAddress(): String? {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RawAddress(value: String?): Unit {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RawAddressKind(): PhoneCallHistoryEntryRawAddressKind? {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryRawAddressKind>()
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryRawAddressKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RawAddressKind(value: PhoneCallHistoryEntryRawAddressKind?): Unit {
      val fnPtr = _1016231624_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016231624_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallHistoryEntryAddress_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016231624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryEntryAddress, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30f159da3955404284e666eebf82e67f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryEntryAddress(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryEntryAddress_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryEntryAddress {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryEntryAddress(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryEntryAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016231624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryEntryAddress):
        Array<IPhoneCallHistoryEntryAddress?> = (elements as
        Array<IPhoneCallHistoryEntryAddress?>).castToImpl<IPhoneCallHistoryEntryAddress,IPhoneCallHistoryEntryAddress_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryEntryAddress?> =
        arrayOfNulls<IPhoneCallHistoryEntryAddress_Impl>(size) as
        Array<IPhoneCallHistoryEntryAddress?>
  }
}
