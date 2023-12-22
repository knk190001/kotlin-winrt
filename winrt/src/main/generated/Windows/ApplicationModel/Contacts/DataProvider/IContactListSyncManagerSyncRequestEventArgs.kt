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

@ABIMarker(IContactListSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("{158e4dac-446d-4f10-afc2-02683ec533a6}")
@Guid("158e4dac446d4f10afc202683ec533a6")
@WinRTInterface("158e4dac446d4f10afc202683ec533a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListSyncManagerSyncRequestEventArgs.ByReference::class)
public interface IContactListSyncManagerSyncRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): ContactListSyncManagerSyncRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIContactListSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactListSyncManagerSyncRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListSyncManagerSyncRequestEventArgs {
    public val __1020931308_Ptr: Pointer?

    public val _1020931308_VtblPtr: Pointer?
      get() = __1020931308_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): ContactListSyncManagerSyncRequest? {
      val fnPtr = _1020931308_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListSyncManagerSyncRequest>()
      val hr = fn.invokeHR(arrayOf(__1020931308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListSyncManagerSyncRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1020931308_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1020931308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactListSyncManagerSyncRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1020931308_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("158e4dac446d4f10afc202683ec533a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListSyncManagerSyncRequestEventArgs(ptr: Pointer?): WithDefault =
        IContactListSyncManagerSyncRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactListSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactListSyncManagerSyncRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1020931308_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListSyncManagerSyncRequestEventArgs):
        Array<IContactListSyncManagerSyncRequestEventArgs?> = (elements as
        Array<IContactListSyncManagerSyncRequestEventArgs?>).castToImpl<IContactListSyncManagerSyncRequestEventArgs,IContactListSyncManagerSyncRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListSyncManagerSyncRequestEventArgs?> =
        arrayOfNulls<IContactListSyncManagerSyncRequestEventArgs_Impl>(size) as
        Array<IContactListSyncManagerSyncRequestEventArgs?>
  }
}
