package Windows.ApplicationModel.Contacts.DataProvider

import Windows.Foundation.Deferral
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

@ABIMarker(IContactListDeleteContactRequestEventArgs.ABI::class)
@Signature("{b22054a1-e8fa-4db5-9389-2d12ee7d15ee}")
@Guid("b22054a1e8fa4db593892d12ee7d15ee")
@WinRTInterface("b22054a1e8fa4db593892d12ee7d15ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListDeleteContactRequestEventArgs.ByReference::class)
public interface IContactListDeleteContactRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): ContactListDeleteContactRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListDeleteContactRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIContactListDeleteContactRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactListDeleteContactRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListDeleteContactRequestEventArgs {
    public val __1080586116_Ptr: Pointer?

    public val _1080586116_VtblPtr: Pointer?
      get() = __1080586116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): ContactListDeleteContactRequest? {
      val fnPtr = _1080586116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListDeleteContactRequest>()
      val hr = fn.invokeHR(arrayOf(__1080586116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListDeleteContactRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1080586116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1080586116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactListDeleteContactRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1080586116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListDeleteContactRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b22054a1e8fa4db593892d12ee7d15ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListDeleteContactRequestEventArgs(ptr: Pointer?): WithDefault =
        IContactListDeleteContactRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListDeleteContactRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactListDeleteContactRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactListDeleteContactRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1080586116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListDeleteContactRequestEventArgs):
        Array<IContactListDeleteContactRequestEventArgs?> = (elements as
        Array<IContactListDeleteContactRequestEventArgs?>).castToImpl<IContactListDeleteContactRequestEventArgs,IContactListDeleteContactRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListDeleteContactRequestEventArgs?> =
        arrayOfNulls<IContactListDeleteContactRequestEventArgs_Impl>(size) as
        Array<IContactListDeleteContactRequestEventArgs?>
  }
}
