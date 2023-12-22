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

@ABIMarker(IContactListServerSearchReadBatchRequestEventArgs.ABI::class)
@Signature("{1a27e87b-69d7-4e4e-8042-861cba61471e}")
@Guid("1a27e87b69d74e4e8042861cba61471e")
@WinRTInterface("1a27e87b69d74e4e8042861cba61471e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListServerSearchReadBatchRequestEventArgs.ByReference::class)
public interface IContactListServerSearchReadBatchRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): ContactListServerSearchReadBatchRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListServerSearchReadBatchRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIContactListServerSearchReadBatchRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactListServerSearchReadBatchRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListServerSearchReadBatchRequestEventArgs {
    public val __353719872_Ptr: Pointer?

    public val _353719872_VtblPtr: Pointer?
      get() = __353719872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): ContactListServerSearchReadBatchRequest? {
      val fnPtr = _353719872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListServerSearchReadBatchRequest>()
      val hr = fn.invokeHR(arrayOf(__353719872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ContactListServerSearchReadBatchRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _353719872_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__353719872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactListServerSearchReadBatchRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353719872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListServerSearchReadBatchRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a27e87b69d74e4e8042861cba61471e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListServerSearchReadBatchRequestEventArgs(ptr: Pointer?): WithDefault =
        IContactListServerSearchReadBatchRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListServerSearchReadBatchRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactListServerSearchReadBatchRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactListServerSearchReadBatchRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__353719872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListServerSearchReadBatchRequestEventArgs):
        Array<IContactListServerSearchReadBatchRequestEventArgs?> = (elements as
        Array<IContactListServerSearchReadBatchRequestEventArgs?>).castToImpl<IContactListServerSearchReadBatchRequestEventArgs,IContactListServerSearchReadBatchRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IContactListServerSearchReadBatchRequestEventArgs?> =
        arrayOfNulls<IContactListServerSearchReadBatchRequestEventArgs_Impl>(size) as
        Array<IContactListServerSearchReadBatchRequestEventArgs?>
  }
}
