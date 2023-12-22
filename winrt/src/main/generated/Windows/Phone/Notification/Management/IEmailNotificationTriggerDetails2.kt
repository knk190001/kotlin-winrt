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

@ABIMarker(IEmailNotificationTriggerDetails2.ABI::class)
@Signature("{168067e3-c56f-4ec7-bed1-f734e08de5b2}")
@Guid("168067e3c56f4ec7bed1f734e08de5b2")
@WinRTInterface("168067e3c56f4ec7bed1f734e08de5b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailNotificationTriggerDetails2.ByReference::class)
public interface IEmailNotificationTriggerDetails2 : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_MessageEntryId(): BinaryId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIEmailNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IEmailNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailNotificationTriggerDetails2,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __446431249_Ptr: Pointer?

    public val _446431249_VtblPtr: Pointer?
      get() = __446431249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageEntryId(): BinaryId? {
      val fnPtr = _446431249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BinaryId>()
      val hr = fn.invokeHR(arrayOf(__446431249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BinaryId>(result.getValue())
      return resultValue
    }
  }

  public class IEmailNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_446431249_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __446431249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("168067e3c56f4ec7bed1f734e08de5b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IEmailNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIEmailNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IEmailNotificationTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__446431249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailNotificationTriggerDetails2):
        Array<IEmailNotificationTriggerDetails2?> = (elements as
        Array<IEmailNotificationTriggerDetails2?>).castToImpl<IEmailNotificationTriggerDetails2,IEmailNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailNotificationTriggerDetails2?> =
        arrayOfNulls<IEmailNotificationTriggerDetails2_Impl>(size) as
        Array<IEmailNotificationTriggerDetails2?>
  }
}
