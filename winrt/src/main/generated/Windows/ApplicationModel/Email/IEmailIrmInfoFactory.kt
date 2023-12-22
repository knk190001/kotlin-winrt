package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
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

@ABIMarker(IEmailIrmInfoFactory.ABI::class)
@Signature("{314bb18c-e3e6-4d7b-be8d-91a96311b01b}")
@Guid("314bb18ce3e64d7bbe8d91a96311b01b")
@WinRTInterface("314bb18ce3e64d7bbe8d91a96311b01b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailIrmInfoFactory.ByReference::class)
public interface IEmailIrmInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(expiration: DateTime?, irmTemplate: EmailIrmTemplate?): EmailIrmInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailIrmInfoFactory> {
    public override fun getValue() = ABI.makeIEmailIrmInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IEmailIrmInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailIrmInfoFactory {
    public val __594150083_Ptr: Pointer?

    public val _594150083_VtblPtr: Pointer?
      get() = __594150083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(expiration: DateTime?, irmTemplate: EmailIrmTemplate?):
        EmailIrmInfo? {
      val fnPtr = _594150083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailIrmInfo>()
      val hr = fn.invokeHR(arrayOf(__594150083_Ptr, marshalToNative(expiration),
          marshalToNative(irmTemplate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailIrmInfo>(result.getValue())
      return resultValue
    }
  }

  public class IEmailIrmInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __594150083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailIrmInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("314bb18ce3e64d7bbe8d91a96311b01b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailIrmInfoFactory(ptr: Pointer?): WithDefault = IEmailIrmInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailIrmInfoFactory {
      val address = segment.toRawLongValue()
      return makeIEmailIrmInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IEmailIrmInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__594150083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailIrmInfoFactory): Array<IEmailIrmInfoFactory?> =
        (elements as
        Array<IEmailIrmInfoFactory?>).castToImpl<IEmailIrmInfoFactory,IEmailIrmInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailIrmInfoFactory?> =
        arrayOfNulls<IEmailIrmInfoFactory_Impl>(size) as Array<IEmailIrmInfoFactory?>
  }
}
