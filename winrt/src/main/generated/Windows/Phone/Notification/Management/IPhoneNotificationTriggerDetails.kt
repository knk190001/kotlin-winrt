package Windows.Phone.Notification.Management

import Windows.Phone.Notification.Management.IAccessoryNotificationTriggerDetails.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPhoneNotificationTriggerDetails.ABI::class)
@Signature("{ccc2fdf7-09c3-4118-91bc-ca6323a8d383}")
@Guid("ccc2fdf709c3411891bcca6323a8d383")
@WinRTInterface("ccc2fdf709c3411891bcca6323a8d383")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneNotificationTriggerDetails.ByReference::class)
public interface IPhoneNotificationTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_PhoneNotificationType(): PhoneNotificationType?

  @InterfaceMethod(1)
  public fun get_CallDetails(): PhoneCallDetails?

  @InterfaceMethod(2)
  public fun get_PhoneLineChangedId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneNotificationTriggerDetails> {
    public override fun getValue() = ABI.makeIPhoneNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneNotificationTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __1884029941_Ptr: Pointer?

    public val _1884029941_VtblPtr: Pointer?
      get() = __1884029941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhoneNotificationType(): PhoneNotificationType? {
      val fnPtr = _1884029941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneNotificationType>()
      val hr = fn.invokeHR(arrayOf(__1884029941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneNotificationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CallDetails(): PhoneCallDetails? {
      val fnPtr = _1884029941_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallDetails>()
      val hr = fn.invokeHR(arrayOf(__1884029941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PhoneLineChangedId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1884029941_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1884029941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1884029941_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1884029941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccc2fdf709c3411891bcca6323a8d383")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IPhoneNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1884029941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneNotificationTriggerDetails):
        Array<IPhoneNotificationTriggerDetails?> = (elements as
        Array<IPhoneNotificationTriggerDetails?>).castToImpl<IPhoneNotificationTriggerDetails,IPhoneNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneNotificationTriggerDetails?> =
        arrayOfNulls<IPhoneNotificationTriggerDetails_Impl>(size) as
        Array<IPhoneNotificationTriggerDetails?>
  }
}
