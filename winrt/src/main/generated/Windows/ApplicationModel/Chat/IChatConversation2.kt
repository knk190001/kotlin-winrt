package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatConversation2.ABI::class)
@Signature("{0a030cd1-983a-47aa-9a90-ee48ee997b59}")
@Guid("0a030cd1983a47aa9a90ee48ee997b59")
@WinRTInterface("0a030cd1983a47aa9a90ee48ee997b59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatConversation2.ByReference::class)
public interface IChatConversation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanModifyParticipants(): Boolean

  @InterfaceMethod(1)
  public fun put_CanModifyParticipants(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatConversation2> {
    public override fun getValue() = ABI.makeIChatConversation2(pointer.getPointer(0))

    public fun setValue(value: IChatConversation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatConversation2 {
    public val __638558448_Ptr: Pointer?

    public val _638558448_VtblPtr: Pointer?
      get() = __638558448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanModifyParticipants(): Boolean {
      val fnPtr = _638558448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__638558448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CanModifyParticipants(value: Boolean): Unit {
      val fnPtr = _638558448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__638558448_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatConversation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __638558448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatConversation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a030cd1983a47aa9a90ee48ee997b59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatConversation2(ptr: Pointer?): WithDefault = IChatConversation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatConversation2 {
      val address = segment.toRawLongValue()
      return makeIChatConversation2(Pointer(address))
    }

    public override fun toNative(obj: IChatConversation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__638558448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatConversation2): Array<IChatConversation2?> =
        (elements as
        Array<IChatConversation2?>).castToImpl<IChatConversation2,IChatConversation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatConversation2?> =
        arrayOfNulls<IChatConversation2_Impl>(size) as Array<IChatConversation2?>
  }
}
