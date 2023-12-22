package Windows.UI.Input

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerMenuItem.ABI::class)
@Signature("{c80fc98d-ad0b-4c9c-8f2f-136a2373a6ba}")
@Guid("c80fc98dad0b4c9c8f2f136a2373a6ba")
@WinRTInterface("c80fc98dad0b4c9c8f2f136a2373a6ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerMenuItem.ByReference::class)
public interface IRadialControllerMenuItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayText(): String?

  @InterfaceMethod(1)
  public fun get_Tag(): IUnknown?

  @InterfaceMethod(2)
  public fun put_Tag(value: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun add_Invoked(handler: TypedEventHandler<RadialControllerMenuItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Invoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerMenuItem> {
    public override fun getValue() = ABI.makeIRadialControllerMenuItem(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerMenuItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerMenuItem {
    public val __1998804965_Ptr: Pointer?

    public val _1998804965_VtblPtr: Pointer?
      get() = __1998804965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayText(): String? {
      val fnPtr = _1998804965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1998804965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Tag(): IUnknown? {
      val fnPtr = _1998804965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1998804965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Tag(value: IUnknown?): Unit {
      val fnPtr = _1998804965_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1998804965_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Invoked(handler: TypedEventHandler<RadialControllerMenuItem?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1998804965_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1998804965_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Invoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1998804965_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1998804965_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRadialControllerMenuItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998804965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerMenuItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c80fc98dad0b4c9c8f2f136a2373a6ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerMenuItem(ptr: Pointer?): WithDefault =
        IRadialControllerMenuItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerMenuItem {
      val address = segment.toRawLongValue()
      return makeIRadialControllerMenuItem(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerMenuItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998804965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerMenuItem):
        Array<IRadialControllerMenuItem?> = (elements as
        Array<IRadialControllerMenuItem?>).castToImpl<IRadialControllerMenuItem,IRadialControllerMenuItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerMenuItem?> =
        arrayOfNulls<IRadialControllerMenuItem_Impl>(size) as Array<IRadialControllerMenuItem?>
  }
}
