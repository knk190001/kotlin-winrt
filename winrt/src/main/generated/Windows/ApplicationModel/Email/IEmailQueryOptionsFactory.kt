package Windows.ApplicationModel.Email

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailQueryOptionsFactory.ABI::class)
@Signature("{88f1a1b8-78ab-4ee8-b4e3-046d6e2fe5e2}")
@Guid("88f1a1b878ab4ee8b4e3046d6e2fe5e2")
@WinRTInterface("88f1a1b878ab4ee8b4e3046d6e2fe5e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailQueryOptionsFactory.ByReference::class)
public interface IEmailQueryOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithText(text: String?): EmailQueryOptions?

  @InterfaceMethod(1)
  public fun CreateWithTextAndFields(text: String?, fields: EmailQuerySearchFields?):
      EmailQueryOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailQueryOptionsFactory> {
    public override fun getValue() = ABI.makeIEmailQueryOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IEmailQueryOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailQueryOptionsFactory {
    public val __409026255_Ptr: Pointer?

    public val _409026255_VtblPtr: Pointer?
      get() = __409026255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithText(text: String?): EmailQueryOptions? {
      val fnPtr = _409026255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__409026255_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailQueryOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTextAndFields(text: String?, fields: EmailQuerySearchFields?):
        EmailQueryOptions? {
      val fnPtr = _409026255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__409026255_Ptr, marshalToNative(text), marshalToNative(fields),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailQueryOptions>(result.getValue())
      return resultValue
    }
  }

  public class IEmailQueryOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409026255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailQueryOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88f1a1b878ab4ee8b4e3046d6e2fe5e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailQueryOptionsFactory(ptr: Pointer?): WithDefault =
        IEmailQueryOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailQueryOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIEmailQueryOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IEmailQueryOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409026255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailQueryOptionsFactory):
        Array<IEmailQueryOptionsFactory?> = (elements as
        Array<IEmailQueryOptionsFactory?>).castToImpl<IEmailQueryOptionsFactory,IEmailQueryOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailQueryOptionsFactory?> =
        arrayOfNulls<IEmailQueryOptionsFactory_Impl>(size) as Array<IEmailQueryOptionsFactory?>
  }
}
