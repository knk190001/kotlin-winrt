package Windows.ApplicationModel.Email.DataProvider

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

@ABIMarker(IEmailDataProviderTriggerDetails.ABI::class)
@Signature("{8f3e4e50-341e-45f3-bba0-84a005e1319a}")
@Guid("8f3e4e50341e45f3bba084a005e1319a")
@WinRTInterface("8f3e4e50341e45f3bba084a005e1319a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailDataProviderTriggerDetails.ByReference::class)
public interface IEmailDataProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): EmailDataProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailDataProviderTriggerDetails> {
    public override fun getValue() = ABI.makeIEmailDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IEmailDataProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailDataProviderTriggerDetails {
    public val __135277679_Ptr: Pointer?

    public val _135277679_VtblPtr: Pointer?
      get() = __135277679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): EmailDataProviderConnection? {
      val fnPtr = _135277679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailDataProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__135277679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailDataProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IEmailDataProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __135277679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailDataProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f3e4e50341e45f3bba084a005e1319a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailDataProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IEmailDataProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIEmailDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IEmailDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135277679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailDataProviderTriggerDetails):
        Array<IEmailDataProviderTriggerDetails?> = (elements as
        Array<IEmailDataProviderTriggerDetails?>).castToImpl<IEmailDataProviderTriggerDetails,IEmailDataProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailDataProviderTriggerDetails?> =
        arrayOfNulls<IEmailDataProviderTriggerDetails_Impl>(size) as
        Array<IEmailDataProviderTriggerDetails?>
  }
}
