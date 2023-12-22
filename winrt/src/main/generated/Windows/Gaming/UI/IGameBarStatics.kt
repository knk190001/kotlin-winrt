package Windows.Gaming.UI

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameBarStatics.ABI::class)
@Signature("{1db9a292-cc78-4173-be45-b61e67283ea7}")
@Guid("1db9a292cc784173be45b61e67283ea7")
@WinRTInterface("1db9a292cc784173be45b61e67283ea7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarStatics.ByReference::class)
public interface IGameBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_VisibilityChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_IsInputRedirectedChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_IsInputRedirectedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_Visible(): Boolean

  @InterfaceMethod(5)
  public fun get_IsInputRedirected(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarStatics> {
    public override fun getValue() = ABI.makeIGameBarStatics(pointer.getPointer(0))

    public fun setValue(value: IGameBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarStatics {
    public val __452547237_Ptr: Pointer?

    public val _452547237_VtblPtr: Pointer?
      get() = __452547237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_VisibilityChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _452547237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _452547237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_IsInputRedirectedChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _452547237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_IsInputRedirectedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _452547237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Visible(): Boolean {
      val fnPtr = _452547237_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsInputRedirected(): Boolean {
      val fnPtr = _452547237_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__452547237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGameBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452547237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1db9a292cc784173be45b61e67283ea7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarStatics(ptr: Pointer?): WithDefault = IGameBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarStatics {
      val address = segment.toRawLongValue()
      return makeIGameBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452547237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarStatics): Array<IGameBarStatics?> = (elements as
        Array<IGameBarStatics?>).castToImpl<IGameBarStatics,IGameBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarStatics?> =
        arrayOfNulls<IGameBarStatics_Impl>(size) as Array<IGameBarStatics?>
  }
}
