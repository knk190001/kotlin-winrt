package Windows.UI.Core

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreAcceleratorKeys.ABI::class)
@Signature("{9ffdf7f5-b8c9-4ef0-b7d2-1de626561fc8}")
@Guid("9ffdf7f5b8c94ef0b7d21de626561fc8")
@WinRTInterface("9ffdf7f5b8c94ef0b7d21de626561fc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAcceleratorKeys.ByReference::class)
public interface ICoreAcceleratorKeys : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AcceleratorKeyActivated(handler: TypedEventHandler<CoreDispatcher?,
      AcceleratorKeyEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AcceleratorKeyActivated(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAcceleratorKeys> {
    public override fun getValue() = ABI.makeICoreAcceleratorKeys(pointer.getPointer(0))

    public fun setValue(value: ICoreAcceleratorKeys_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAcceleratorKeys {
    public val __1776875099_Ptr: Pointer?

    public val _1776875099_VtblPtr: Pointer?
      get() = __1776875099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AcceleratorKeyActivated(handler: TypedEventHandler<CoreDispatcher?,
        AcceleratorKeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1776875099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1776875099_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AcceleratorKeyActivated(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1776875099_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776875099_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreAcceleratorKeys_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1776875099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAcceleratorKeys, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ffdf7f5b8c94ef0b7d21de626561fc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAcceleratorKeys(ptr: Pointer?): WithDefault = ICoreAcceleratorKeys_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAcceleratorKeys {
      val address = segment.toRawLongValue()
      return makeICoreAcceleratorKeys(Pointer(address))
    }

    public override fun toNative(obj: ICoreAcceleratorKeys): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1776875099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAcceleratorKeys): Array<ICoreAcceleratorKeys?> =
        (elements as
        Array<ICoreAcceleratorKeys?>).castToImpl<ICoreAcceleratorKeys,ICoreAcceleratorKeys_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAcceleratorKeys?> =
        arrayOfNulls<ICoreAcceleratorKeys_Impl>(size) as Array<ICoreAcceleratorKeys?>
  }
}
