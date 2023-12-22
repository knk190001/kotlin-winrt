package Windows.Phone.UI.Input

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

@ABIMarker(IHardwareButtonsStatics2.ABI::class)
@Signature("{39c6c274-993f-40dd-854c-831a8934b92e}")
@Guid("39c6c274993f40dd854c831a8934b92e")
@WinRTInterface("39c6c274993f40dd854c831a8934b92e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHardwareButtonsStatics2.ByReference::class)
public interface IHardwareButtonsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_CameraHalfPressed(handler: EventHandler<CameraEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CameraHalfPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_CameraPressed(handler: EventHandler<CameraEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CameraPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_CameraReleased(handler: EventHandler<CameraEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CameraReleased(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHardwareButtonsStatics2> {
    public override fun getValue() = ABI.makeIHardwareButtonsStatics2(pointer.getPointer(0))

    public fun setValue(value: IHardwareButtonsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHardwareButtonsStatics2 {
    public val __487093128_Ptr: Pointer?

    public val _487093128_VtblPtr: Pointer?
      get() = __487093128_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_CameraHalfPressed(handler: EventHandler<CameraEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _487093128_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CameraHalfPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _487093128_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_CameraPressed(handler: EventHandler<CameraEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _487093128_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CameraPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _487093128_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_CameraReleased(handler: EventHandler<CameraEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _487093128_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CameraReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _487093128_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487093128_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHardwareButtonsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __487093128_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHardwareButtonsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39c6c274993f40dd854c831a8934b92e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHardwareButtonsStatics2(ptr: Pointer?): WithDefault =
        IHardwareButtonsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHardwareButtonsStatics2 {
      val address = segment.toRawLongValue()
      return makeIHardwareButtonsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IHardwareButtonsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__487093128_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHardwareButtonsStatics2):
        Array<IHardwareButtonsStatics2?> = (elements as
        Array<IHardwareButtonsStatics2?>).castToImpl<IHardwareButtonsStatics2,IHardwareButtonsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHardwareButtonsStatics2?> =
        arrayOfNulls<IHardwareButtonsStatics2_Impl>(size) as Array<IHardwareButtonsStatics2?>
  }
}
