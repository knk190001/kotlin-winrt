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

@ABIMarker(IContactListCreateOrUpdateContactRequestEventArgs.ABI::class)
@Signature("{851c1690-1a51-4b0c-aeef-1240ac5bed75}")
@Guid("851c16901a514b0caeef1240ac5bed75")
@WinRTInterface("851c16901a514b0caeef1240ac5bed75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListCreateOrUpdateContactRequestEventArgs.ByReference::class)
public interface IContactListCreateOrUpdateContactRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): ContactListCreateOrUpdateContactRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListCreateOrUpdateContactRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIContactListCreateOrUpdateContactRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactListCreateOrUpdateContactRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListCreateOrUpdateContactRequestEventArgs {
    public val __1904601889_Ptr: Pointer?

    public val _1904601889_VtblPtr: Pointer?
      get() = __1904601889_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): ContactListCreateOrUpdateContactRequest? {
      val fnPtr = _1904601889_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListCreateOrUpdateContactRequest>()
      val hr = fn.invokeHR(arrayOf(__1904601889_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ContactListCreateOrUpdateContactRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1904601889_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1904601889_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactListCreateOrUpdateContactRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1904601889_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListCreateOrUpdateContactRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("851c16901a514b0caeef1240ac5bed75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListCreateOrUpdateContactRequestEventArgs(ptr: Pointer?): WithDefault =
        IContactListCreateOrUpdateContactRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListCreateOrUpdateContactRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactListCreateOrUpdateContactRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactListCreateOrUpdateContactRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1904601889_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListCreateOrUpdateContactRequestEventArgs):
        Array<IContactListCreateOrUpdateContactRequestEventArgs?> = (elements as
        Array<IContactListCreateOrUpdateContactRequestEventArgs?>).castToImpl<IContactListCreateOrUpdateContactRequestEventArgs,IContactListCreateOrUpdateContactRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IContactListCreateOrUpdateContactRequestEventArgs?> =
        arrayOfNulls<IContactListCreateOrUpdateContactRequestEventArgs_Impl>(size) as
        Array<IContactListCreateOrUpdateContactRequestEventArgs?>
  }
}
