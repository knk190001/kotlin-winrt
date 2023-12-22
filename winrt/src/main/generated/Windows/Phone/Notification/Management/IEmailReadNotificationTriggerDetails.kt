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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailReadNotificationTriggerDetails.ABI::class)
@Signature("{f5b7a087-06f3-4e3e-8c42-325e67010413}")
@Guid("f5b7a08706f34e3e8c42325e67010413")
@WinRTInterface("f5b7a08706f34e3e8c42325e67010413")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailReadNotificationTriggerDetails.ByReference::class)
public interface IEmailReadNotificationTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_AccountName(): String?

  @InterfaceMethod(1)
  public fun get_ParentFolderName(): String?

  @InterfaceMethod(2)
  public fun get_MessageEntryId(): BinaryId?

  @InterfaceMethod(3)
  public fun get_IsRead(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailReadNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIEmailReadNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IEmailReadNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailReadNotificationTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __2134789159_Ptr: Pointer?

    public val _2134789159_VtblPtr: Pointer?
      get() = __2134789159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountName(): String? {
      val fnPtr = _2134789159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2134789159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParentFolderName(): String? {
      val fnPtr = _2134789159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2134789159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MessageEntryId(): BinaryId? {
      val fnPtr = _2134789159_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BinaryId>()
      val hr = fn.invokeHR(arrayOf(__2134789159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BinaryId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsRead(): Boolean {
      val fnPtr = _2134789159_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2134789159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailReadNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2134789159_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2134789159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailReadNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5b7a08706f34e3e8c42325e67010413")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailReadNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IEmailReadNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailReadNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIEmailReadNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IEmailReadNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2134789159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailReadNotificationTriggerDetails):
        Array<IEmailReadNotificationTriggerDetails?> = (elements as
        Array<IEmailReadNotificationTriggerDetails?>).castToImpl<IEmailReadNotificationTriggerDetails,IEmailReadNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailReadNotificationTriggerDetails?> =
        arrayOfNulls<IEmailReadNotificationTriggerDetails_Impl>(size) as
        Array<IEmailReadNotificationTriggerDetails?>
  }
}
