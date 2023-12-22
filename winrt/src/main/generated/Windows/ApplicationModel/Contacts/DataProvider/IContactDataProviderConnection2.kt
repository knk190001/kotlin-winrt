package Windows.ApplicationModel.Contacts.DataProvider

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IContactDataProviderConnection2.ABI::class)
@Signature("{a1d327b0-196c-4bfd-8f0f-c68d67f249d3}")
@Guid("a1d327b0196c4bfd8f0fc68d67f249d3")
@WinRTInterface("a1d327b0196c4bfd8f0fc68d67f249d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactDataProviderConnection2.ByReference::class)
public interface IContactDataProviderConnection2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_CreateOrUpdateContactRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
      ContactListCreateOrUpdateContactRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CreateOrUpdateContactRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_DeleteContactRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
      ContactListDeleteContactRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DeleteContactRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactDataProviderConnection2> {
    public override fun getValue() = ABI.makeIContactDataProviderConnection2(pointer.getPointer(0))

    public fun setValue(value: IContactDataProviderConnection2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactDataProviderConnection2 {
    public val __1387760586_Ptr: Pointer?

    public val _1387760586_VtblPtr: Pointer?
      get() = __1387760586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_CreateOrUpdateContactRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
        ContactListCreateOrUpdateContactRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1387760586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1387760586_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CreateOrUpdateContactRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1387760586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1387760586_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_DeleteContactRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
        ContactListDeleteContactRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1387760586_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1387760586_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DeleteContactRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1387760586_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1387760586_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactDataProviderConnection2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1387760586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactDataProviderConnection2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1d327b0196c4bfd8f0fc68d67f249d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactDataProviderConnection2(ptr: Pointer?): WithDefault =
        IContactDataProviderConnection2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactDataProviderConnection2 {
      val address = segment.toRawLongValue()
      return makeIContactDataProviderConnection2(Pointer(address))
    }

    public override fun toNative(obj: IContactDataProviderConnection2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1387760586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactDataProviderConnection2):
        Array<IContactDataProviderConnection2?> = (elements as
        Array<IContactDataProviderConnection2?>).castToImpl<IContactDataProviderConnection2,IContactDataProviderConnection2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactDataProviderConnection2?> =
        arrayOfNulls<IContactDataProviderConnection2_Impl>(size) as
        Array<IContactDataProviderConnection2?>
  }
}
