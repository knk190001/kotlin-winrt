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

@ABIMarker(IEmailRecipientFactory.ABI::class)
@Signature("{5500b84d-c79a-4ef8-b909-722e18e3935d}")
@Guid("5500b84dc79a4ef8b909722e18e3935d")
@WinRTInterface("5500b84dc79a4ef8b909722e18e3935d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailRecipientFactory.ByReference::class)
public interface IEmailRecipientFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(address: String?): EmailRecipient?

  @InterfaceMethod(1)
  public fun CreateWithName(address: String?, name: String?): EmailRecipient?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailRecipientFactory> {
    public override fun getValue() = ABI.makeIEmailRecipientFactory(pointer.getPointer(0))

    public fun setValue(value: IEmailRecipientFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailRecipientFactory {
    public val __1865452342_Ptr: Pointer?

    public val _1865452342_VtblPtr: Pointer?
      get() = __1865452342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(address: String?): EmailRecipient? {
      val fnPtr = _1865452342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipient>()
      val hr = fn.invokeHR(arrayOf(__1865452342_Ptr, marshalToNative(address), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithName(address: String?, name: String?): EmailRecipient? {
      val fnPtr = _1865452342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipient>()
      val hr = fn.invokeHR(arrayOf(__1865452342_Ptr, marshalToNative(address),
          marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipient>(result.getValue())
      return resultValue
    }
  }

  public class IEmailRecipientFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1865452342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailRecipientFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5500b84dc79a4ef8b909722e18e3935d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailRecipientFactory(ptr: Pointer?): WithDefault =
        IEmailRecipientFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailRecipientFactory {
      val address = segment.toRawLongValue()
      return makeIEmailRecipientFactory(Pointer(address))
    }

    public override fun toNative(obj: IEmailRecipientFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1865452342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailRecipientFactory): Array<IEmailRecipientFactory?> =
        (elements as
        Array<IEmailRecipientFactory?>).castToImpl<IEmailRecipientFactory,IEmailRecipientFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailRecipientFactory?> =
        arrayOfNulls<IEmailRecipientFactory_Impl>(size) as Array<IEmailRecipientFactory?>
  }
}
