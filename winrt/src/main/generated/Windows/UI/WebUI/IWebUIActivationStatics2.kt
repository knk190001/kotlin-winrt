package Windows.UI.WebUI

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUIActivationStatics2.ABI::class)
@Signature("{c8e88696-4d78-4aa4-8f06-2a9eadc6c40a}")
@Guid("c8e886964d784aa48f062a9eadc6c40a")
@WinRTInterface("c8e886964d784aa48f062a9eadc6c40a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIActivationStatics2.ByReference::class)
public interface IWebUIActivationStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_LeavingBackground(handler: LeavingBackgroundEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_LeavingBackground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_EnteredBackground(handler: EnteredBackgroundEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_EnteredBackground(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun EnablePrelaunch(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIActivationStatics2> {
    public override fun getValue() = ABI.makeIWebUIActivationStatics2(pointer.getPointer(0))

    public fun setValue(value: IWebUIActivationStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIActivationStatics2 {
    public val __510850523_Ptr: Pointer?

    public val _510850523_VtblPtr: Pointer?
      get() = __510850523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_LeavingBackground(handler: LeavingBackgroundEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _510850523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__510850523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_LeavingBackground(token: EventRegistrationToken?): Unit {
      val fnPtr = _510850523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510850523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_EnteredBackground(handler: EnteredBackgroundEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _510850523_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__510850523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_EnteredBackground(token: EventRegistrationToken?): Unit {
      val fnPtr = _510850523_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510850523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun EnablePrelaunch(value: Boolean): Unit {
      val fnPtr = _510850523_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510850523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUIActivationStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __510850523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIActivationStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8e886964d784aa48f062a9eadc6c40a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIActivationStatics2(ptr: Pointer?): WithDefault =
        IWebUIActivationStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIActivationStatics2 {
      val address = segment.toRawLongValue()
      return makeIWebUIActivationStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWebUIActivationStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510850523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIActivationStatics2):
        Array<IWebUIActivationStatics2?> = (elements as
        Array<IWebUIActivationStatics2?>).castToImpl<IWebUIActivationStatics2,IWebUIActivationStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIActivationStatics2?> =
        arrayOfNulls<IWebUIActivationStatics2_Impl>(size) as Array<IWebUIActivationStatics2?>
  }
}
