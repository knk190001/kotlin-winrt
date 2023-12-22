package Windows.UI.Text.Core

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICoreTextEditContext2.ABI::class)
@Signature("{b1867dbb-083b-49e1-b281-2b35d62bf466}")
@Guid("b1867dbb083b49e1b2812b35d62bf466")
@WinRTInterface("b1867dbb083b49e1b2812b35d62bf466")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextEditContext2.ByReference::class)
public interface ICoreTextEditContext2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_NotifyFocusLeaveCompleted(handler: TypedEventHandler<CoreTextEditContext?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_NotifyFocusLeaveCompleted(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextEditContext2> {
    public override fun getValue() = ABI.makeICoreTextEditContext2(pointer.getPointer(0))

    public fun setValue(value: ICoreTextEditContext2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextEditContext2 {
    public val __1609505809_Ptr: Pointer?

    public val _1609505809_VtblPtr: Pointer?
      get() = __1609505809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_NotifyFocusLeaveCompleted(handler: TypedEventHandler<CoreTextEditContext?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1609505809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1609505809_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_NotifyFocusLeaveCompleted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1609505809_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1609505809_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreTextEditContext2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1609505809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextEditContext2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1867dbb083b49e1b2812b35d62bf466")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextEditContext2(ptr: Pointer?): WithDefault =
        ICoreTextEditContext2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextEditContext2 {
      val address = segment.toRawLongValue()
      return makeICoreTextEditContext2(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextEditContext2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1609505809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextEditContext2): Array<ICoreTextEditContext2?> =
        (elements as
        Array<ICoreTextEditContext2?>).castToImpl<ICoreTextEditContext2,ICoreTextEditContext2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextEditContext2?> =
        arrayOfNulls<ICoreTextEditContext2_Impl>(size) as Array<ICoreTextEditContext2?>
  }
}
