package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailStoreNotificationTriggerDetails.ABI::class)
@Signature("{ce17563c-46e6-43c9-96f7-facf7dd710cb}")
@Guid("ce17563c46e643c996f7facf7dd710cb")
@WinRTInterface("ce17563c46e643c996f7facf7dd710cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailStoreNotificationTriggerDetails.ByReference::class)
public interface IEmailStoreNotificationTriggerDetails : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailStoreNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIEmailStoreNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IEmailStoreNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailStoreNotificationTriggerDetails {
    public val __1077808175_Ptr: Pointer?

    public val _1077808175_VtblPtr: Pointer?
      get() = __1077808175_Ptr?.getPointer(0)
  }

  public class IEmailStoreNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1077808175_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailStoreNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce17563c46e643c996f7facf7dd710cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailStoreNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IEmailStoreNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailStoreNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIEmailStoreNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IEmailStoreNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1077808175_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailStoreNotificationTriggerDetails):
        Array<IEmailStoreNotificationTriggerDetails?> = (elements as
        Array<IEmailStoreNotificationTriggerDetails?>).castToImpl<IEmailStoreNotificationTriggerDetails,IEmailStoreNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailStoreNotificationTriggerDetails?> =
        arrayOfNulls<IEmailStoreNotificationTriggerDetails_Impl>(size) as
        Array<IEmailStoreNotificationTriggerDetails?>
  }
}
