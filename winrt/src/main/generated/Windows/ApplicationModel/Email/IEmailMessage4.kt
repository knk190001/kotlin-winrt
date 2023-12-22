package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IEmailMessage4.ABI::class)
@Signature("{317cf181-3e7f-4a05-8394-3e10336dd435}")
@Guid("317cf1813e7f4a0583943e10336dd435")
@WinRTInterface("317cf1813e7f4a0583943e10336dd435")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessage4.ByReference::class)
public interface IEmailMessage4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReplyTo(): IVector<EmailRecipient?>?

  @InterfaceMethod(1)
  public fun get_SentRepresenting(): EmailRecipient?

  @InterfaceMethod(2)
  public fun put_SentRepresenting(value: EmailRecipient?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMessage4>
      {
    public override fun getValue() = ABI.makeIEmailMessage4(pointer.getPointer(0))

    public fun setValue(value: IEmailMessage4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessage4 {
    public val __1269602158_Ptr: Pointer?

    public val _1269602158_VtblPtr: Pointer?
      get() = __1269602158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReplyTo(): IVector<EmailRecipient?>? {
      val fnPtr = _1269602158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<EmailRecipient?>>()
      val hr = fn.invokeHR(arrayOf(__1269602158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<EmailRecipient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SentRepresenting(): EmailRecipient? {
      val fnPtr = _1269602158_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipient>()
      val hr = fn.invokeHR(arrayOf(__1269602158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SentRepresenting(value: EmailRecipient?): Unit {
      val fnPtr = _1269602158_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602158_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMessage4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1269602158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessage4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("317cf1813e7f4a0583943e10336dd435")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessage4(ptr: Pointer?): WithDefault = IEmailMessage4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessage4 {
      val address = segment.toRawLongValue()
      return makeIEmailMessage4(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessage4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1269602158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessage4): Array<IEmailMessage4?> = (elements as
        Array<IEmailMessage4?>).castToImpl<IEmailMessage4,IEmailMessage4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessage4?> =
        arrayOfNulls<IEmailMessage4_Impl>(size) as Array<IEmailMessage4?>
  }
}
