package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichTextBlockOverflow3.ABI::class)
@Signature("{7f69587b-5c7f-4b5f-bdbc-fb95c90e10de}")
@Guid("7f69587b5c7f4b5fbdbcfb95c90e10de")
@WinRTInterface("7f69587b5c7f4b5fbdbcfb95c90e10de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflow3.ByReference::class)
public interface IRichTextBlockOverflow3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextTrimmed(): Boolean

  @InterfaceMethod(1)
  public fun add_IsTextTrimmedChanged(handler: TypedEventHandler<RichTextBlockOverflow?,
      IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflow3> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflow3(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflow3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflow3 {
    public val __855259657_Ptr: Pointer?

    public val _855259657_VtblPtr: Pointer?
      get() = __855259657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextTrimmed(): Boolean {
      val fnPtr = _855259657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__855259657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_IsTextTrimmedChanged(handler: TypedEventHandler<RichTextBlockOverflow?,
        IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _855259657_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__855259657_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _855259657_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__855259657_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlockOverflow3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855259657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflow3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f69587b5c7f4b5fbdbcfb95c90e10de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflow3(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflow3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflow3 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflow3(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflow3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855259657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflow3): Array<IRichTextBlockOverflow3?>
        = (elements as
        Array<IRichTextBlockOverflow3?>).castToImpl<IRichTextBlockOverflow3,IRichTextBlockOverflow3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflow3?> =
        arrayOfNulls<IRichTextBlockOverflow3_Impl>(size) as Array<IRichTextBlockOverflow3?>
  }
}
