package Windows.UI.Xaml.Controls

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

@ABIMarker(IMediaTransportControls4.ABI::class)
@Signature("{0fb17c58-9f23-11e7-abc4-cec278b6b50a}")
@Guid("0fb17c589f2311e7abc4cec278b6b50a")
@WinRTInterface("0fb17c589f2311e7abc4cec278b6b50a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControls4.ByReference::class)
public interface IMediaTransportControls4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCompactOverlayButtonVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCompactOverlayButtonVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsCompactOverlayEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCompactOverlayEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControls4> {
    public override fun getValue() = ABI.makeIMediaTransportControls4(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControls4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControls4 {
    public val __1776678525_Ptr: Pointer?

    public val _1776678525_VtblPtr: Pointer?
      get() = __1776678525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCompactOverlayButtonVisible(): Boolean {
      val fnPtr = _1776678525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCompactOverlayButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678525_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCompactOverlayEnabled(): Boolean {
      val fnPtr = _1776678525_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCompactOverlayEnabled(value: Boolean): Unit {
      val fnPtr = _1776678525_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678525_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTransportControls4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1776678525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControls4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fb17c589f2311e7abc4cec278b6b50a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControls4(ptr: Pointer?): WithDefault =
        IMediaTransportControls4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControls4 {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControls4(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControls4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1776678525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControls4):
        Array<IMediaTransportControls4?> = (elements as
        Array<IMediaTransportControls4?>).castToImpl<IMediaTransportControls4,IMediaTransportControls4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControls4?> =
        arrayOfNulls<IMediaTransportControls4_Impl>(size) as Array<IMediaTransportControls4?>
  }
}
