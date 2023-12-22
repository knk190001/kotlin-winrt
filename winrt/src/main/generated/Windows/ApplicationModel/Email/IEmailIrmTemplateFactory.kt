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

@ABIMarker(IEmailIrmTemplateFactory.ABI::class)
@Signature("{3da31876-8738-4418-b9cb-471b936fe71e}")
@Guid("3da3187687384418b9cb471b936fe71e")
@WinRTInterface("3da3187687384418b9cb471b936fe71e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailIrmTemplateFactory.ByReference::class)
public interface IEmailIrmTemplateFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    id: String?,
    name: String?,
    description: String?
  ): EmailIrmTemplate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailIrmTemplateFactory> {
    public override fun getValue() = ABI.makeIEmailIrmTemplateFactory(pointer.getPointer(0))

    public fun setValue(value: IEmailIrmTemplateFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailIrmTemplateFactory {
    public val __956182385_Ptr: Pointer?

    public val _956182385_VtblPtr: Pointer?
      get() = __956182385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      id: String?,
      name: String?,
      description: String?
    ): EmailIrmTemplate? {
      val fnPtr = _956182385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailIrmTemplate>()
      val hr = fn.invokeHR(arrayOf(__956182385_Ptr, marshalToNative(id), marshalToNative(name),
          marshalToNative(description), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailIrmTemplate>(result.getValue())
      return resultValue
    }
  }

  public class IEmailIrmTemplateFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __956182385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailIrmTemplateFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3da3187687384418b9cb471b936fe71e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailIrmTemplateFactory(ptr: Pointer?): WithDefault =
        IEmailIrmTemplateFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailIrmTemplateFactory {
      val address = segment.toRawLongValue()
      return makeIEmailIrmTemplateFactory(Pointer(address))
    }

    public override fun toNative(obj: IEmailIrmTemplateFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__956182385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailIrmTemplateFactory):
        Array<IEmailIrmTemplateFactory?> = (elements as
        Array<IEmailIrmTemplateFactory?>).castToImpl<IEmailIrmTemplateFactory,IEmailIrmTemplateFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailIrmTemplateFactory?> =
        arrayOfNulls<IEmailIrmTemplateFactory_Impl>(size) as Array<IEmailIrmTemplateFactory?>
  }
}
