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

@ABIMarker(IMediaTransportControls3.ABI::class)
@Signature("{5086430e-0940-11e7-93ae-92361f002671}")
@Guid("5086430e094011e793ae92361f002671")
@WinRTInterface("5086430e094011e793ae92361f002671")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControls3.ByReference::class)
public interface IMediaTransportControls3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowAndHideAutomatically(): Boolean

  @InterfaceMethod(1)
  public fun put_ShowAndHideAutomatically(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsRepeatEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsRepeatEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsRepeatButtonVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsRepeatButtonVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun Show(): Unit

  @InterfaceMethod(7)
  public fun Hide(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControls3> {
    public override fun getValue() = ABI.makeIMediaTransportControls3(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControls3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControls3 {
    public val __1776678524_Ptr: Pointer?

    public val _1776678524_VtblPtr: Pointer?
      get() = __1776678524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowAndHideAutomatically(): Boolean {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShowAndHideAutomatically(value: Boolean): Unit {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsRepeatEnabled(): Boolean {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsRepeatEnabled(value: Boolean): Unit {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsRepeatButtonVisible(): Boolean {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsRepeatButtonVisible(value: Boolean): Unit {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Show(): Unit {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Hide(): Unit {
      val fnPtr = _1776678524_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1776678524_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTransportControls3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1776678524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControls3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5086430e094011e793ae92361f002671")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControls3(ptr: Pointer?): WithDefault =
        IMediaTransportControls3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControls3 {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControls3(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControls3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1776678524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControls3):
        Array<IMediaTransportControls3?> = (elements as
        Array<IMediaTransportControls3?>).castToImpl<IMediaTransportControls3,IMediaTransportControls3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControls3?> =
        arrayOfNulls<IMediaTransportControls3_Impl>(size) as Array<IMediaTransportControls3?>
  }
}
