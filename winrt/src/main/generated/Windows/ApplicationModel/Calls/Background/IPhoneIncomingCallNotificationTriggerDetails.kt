package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(IPhoneIncomingCallNotificationTriggerDetails.ABI::class)
@Signature("{2b0e6044-9b32-5d42-8222-d2812e39fb21}")
@Guid("2b0e60449b325d428222d2812e39fb21")
@WinRTInterface("2b0e60449b325d428222d2812e39fb21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneIncomingCallNotificationTriggerDetails.ByReference::class)
public interface IPhoneIncomingCallNotificationTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_CallId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneIncomingCallNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIPhoneIncomingCallNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneIncomingCallNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneIncomingCallNotificationTriggerDetails {
    public val __1025114959_Ptr: Pointer?

    public val _1025114959_VtblPtr: Pointer?
      get() = __1025114959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1025114959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1025114959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CallId(): String? {
      val fnPtr = _1025114959_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1025114959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneIncomingCallNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1025114959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneIncomingCallNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b0e60449b325d428222d2812e39fb21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneIncomingCallNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IPhoneIncomingCallNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPhoneIncomingCallNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneIncomingCallNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneIncomingCallNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025114959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneIncomingCallNotificationTriggerDetails):
        Array<IPhoneIncomingCallNotificationTriggerDetails?> = (elements as
        Array<IPhoneIncomingCallNotificationTriggerDetails?>).castToImpl<IPhoneIncomingCallNotificationTriggerDetails,IPhoneIncomingCallNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneIncomingCallNotificationTriggerDetails?> =
        arrayOfNulls<IPhoneIncomingCallNotificationTriggerDetails_Impl>(size) as
        Array<IPhoneIncomingCallNotificationTriggerDetails?>
  }
}
