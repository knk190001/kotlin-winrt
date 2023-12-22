package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IIterable
import Windows.Security.Cryptography.Certificates.Certificate
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

@ABIMarker(IEmailRecipientResolutionResult2.ABI::class)
@Signature("{5e420bb6-ce5b-4bde-b9d4-e16da0b09fca}")
@Guid("5e420bb6ce5b4bdeb9d4e16da0b09fca")
@WinRTInterface("5e420bb6ce5b4bdeb9d4e16da0b09fca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailRecipientResolutionResult2.ByReference::class)
public interface IEmailRecipientResolutionResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Status(value: EmailRecipientResolutionStatus?): Unit

  @InterfaceMethod(1)
  public fun SetPublicKeys(value: IIterable<Certificate?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailRecipientResolutionResult2> {
    public override fun getValue() = ABI.makeIEmailRecipientResolutionResult2(pointer.getPointer(0))

    public fun setValue(value: IEmailRecipientResolutionResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailRecipientResolutionResult2 {
    public val __1902187669_Ptr: Pointer?

    public val _1902187669_VtblPtr: Pointer?
      get() = __1902187669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Status(value: EmailRecipientResolutionStatus?): Unit {
      val fnPtr = _1902187669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902187669_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetPublicKeys(value: IIterable<Certificate?>?): Unit {
      val fnPtr = _1902187669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902187669_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailRecipientResolutionResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1902187669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailRecipientResolutionResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e420bb6ce5b4bdeb9d4e16da0b09fca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailRecipientResolutionResult2(ptr: Pointer?): WithDefault =
        IEmailRecipientResolutionResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailRecipientResolutionResult2 {
      val address = segment.toRawLongValue()
      return makeIEmailRecipientResolutionResult2(Pointer(address))
    }

    public override fun toNative(obj: IEmailRecipientResolutionResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1902187669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailRecipientResolutionResult2):
        Array<IEmailRecipientResolutionResult2?> = (elements as
        Array<IEmailRecipientResolutionResult2?>).castToImpl<IEmailRecipientResolutionResult2,IEmailRecipientResolutionResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailRecipientResolutionResult2?> =
        arrayOfNulls<IEmailRecipientResolutionResult2_Impl>(size) as
        Array<IEmailRecipientResolutionResult2?>
  }
}
