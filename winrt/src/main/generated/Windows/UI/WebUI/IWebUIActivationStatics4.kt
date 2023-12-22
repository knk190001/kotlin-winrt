package Windows.UI.WebUI

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IWebUIActivationStatics4.ABI::class)
@Signature("{5e391429-183f-478d-8a25-67f80d03935b}")
@Guid("5e391429183f478d8a2567f80d03935b")
@WinRTInterface("5e391429183f478d8a2567f80d03935b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIActivationStatics4.ByReference::class)
public interface IWebUIActivationStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_NewWebUIViewCreated(handler: EventHandler<NewWebUIViewCreatedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_NewWebUIViewCreated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_BackgroundActivated(handler: BackgroundActivatedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIActivationStatics4> {
    public override fun getValue() = ABI.makeIWebUIActivationStatics4(pointer.getPointer(0))

    public fun setValue(value: IWebUIActivationStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIActivationStatics4 {
    public val __510850525_Ptr: Pointer?

    public val _510850525_VtblPtr: Pointer?
      get() = __510850525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_NewWebUIViewCreated(handler: EventHandler<NewWebUIViewCreatedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _510850525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__510850525_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_NewWebUIViewCreated(token: EventRegistrationToken?): Unit {
      val fnPtr = _510850525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510850525_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_BackgroundActivated(handler: BackgroundActivatedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _510850525_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__510850525_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit {
      val fnPtr = _510850525_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510850525_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUIActivationStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __510850525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIActivationStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e391429183f478d8a2567f80d03935b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIActivationStatics4(ptr: Pointer?): WithDefault =
        IWebUIActivationStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIActivationStatics4 {
      val address = segment.toRawLongValue()
      return makeIWebUIActivationStatics4(Pointer(address))
    }

    public override fun toNative(obj: IWebUIActivationStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510850525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIActivationStatics4):
        Array<IWebUIActivationStatics4?> = (elements as
        Array<IWebUIActivationStatics4?>).castToImpl<IWebUIActivationStatics4,IWebUIActivationStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIActivationStatics4?> =
        arrayOfNulls<IWebUIActivationStatics4_Impl>(size) as Array<IWebUIActivationStatics4?>
  }
}
