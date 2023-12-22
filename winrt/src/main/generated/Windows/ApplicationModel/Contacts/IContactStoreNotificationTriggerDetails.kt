package Windows.ApplicationModel.Contacts

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactStoreNotificationTriggerDetails.ABI::class)
@Signature("{abb298d6-878a-4f8b-a9ce-46bb7d1c84ce}")
@Guid("abb298d6878a4f8ba9ce46bb7d1c84ce")
@WinRTInterface("abb298d6878a4f8ba9ce46bb7d1c84ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStoreNotificationTriggerDetails.ByReference::class)
public interface IContactStoreNotificationTriggerDetails : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactStoreNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIContactStoreNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IContactStoreNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStoreNotificationTriggerDetails {
    public val __2056969054_Ptr: Pointer?

    public val _2056969054_VtblPtr: Pointer?
      get() = __2056969054_Ptr?.getPointer(0)
  }

  public class IContactStoreNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2056969054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStoreNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abb298d6878a4f8ba9ce46bb7d1c84ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStoreNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IContactStoreNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactStoreNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIContactStoreNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IContactStoreNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2056969054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStoreNotificationTriggerDetails):
        Array<IContactStoreNotificationTriggerDetails?> = (elements as
        Array<IContactStoreNotificationTriggerDetails?>).castToImpl<IContactStoreNotificationTriggerDetails,IContactStoreNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStoreNotificationTriggerDetails?> =
        arrayOfNulls<IContactStoreNotificationTriggerDetails_Impl>(size) as
        Array<IContactStoreNotificationTriggerDetails?>
  }
}
