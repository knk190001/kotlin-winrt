package Windows.ApplicationModel.Contacts.DataProvider

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

@ABIMarker(IContactDataProviderTriggerDetails.ABI::class)
@Signature("{527104be-3c62-43c8-9ae7-db531685cd99}")
@Guid("527104be3c6243c89ae7db531685cd99")
@WinRTInterface("527104be3c6243c89ae7db531685cd99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactDataProviderTriggerDetails.ByReference::class)
public interface IContactDataProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): ContactDataProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactDataProviderTriggerDetails> {
    public override fun getValue() =
        ABI.makeIContactDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IContactDataProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactDataProviderTriggerDetails {
    public val __1082381064_Ptr: Pointer?

    public val _1082381064_VtblPtr: Pointer?
      get() = __1082381064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): ContactDataProviderConnection? {
      val fnPtr = _1082381064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactDataProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__1082381064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactDataProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IContactDataProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1082381064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactDataProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("527104be3c6243c89ae7db531685cd99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactDataProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IContactDataProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIContactDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IContactDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1082381064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactDataProviderTriggerDetails):
        Array<IContactDataProviderTriggerDetails?> = (elements as
        Array<IContactDataProviderTriggerDetails?>).castToImpl<IContactDataProviderTriggerDetails,IContactDataProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactDataProviderTriggerDetails?> =
        arrayOfNulls<IContactDataProviderTriggerDetails_Impl>(size) as
        Array<IContactDataProviderTriggerDetails?>
  }
}
