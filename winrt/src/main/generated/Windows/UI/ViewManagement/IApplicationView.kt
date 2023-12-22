package Windows.UI.ViewManagement

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationView.ABI::class)
@Signature("{d222d519-4361-451e-96c4-60f4f9742db0}")
@Guid("d222d5194361451e96c460f4f9742db0")
@WinRTInterface("d222d5194361451e96c460f4f9742db0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationView.ByReference::class)
public interface IApplicationView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): ApplicationViewOrientation?

  @InterfaceMethod(1)
  public fun get_AdjacentToLeftDisplayEdge(): Boolean

  @InterfaceMethod(2)
  public fun get_AdjacentToRightDisplayEdge(): Boolean

  @InterfaceMethod(3)
  public fun get_IsFullScreen(): Boolean

  @InterfaceMethod(4)
  public fun get_IsOnLockScreen(): Boolean

  @InterfaceMethod(5)
  public fun get_IsScreenCaptureEnabled(): Boolean

  @InterfaceMethod(6)
  public fun put_IsScreenCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Title(): String?

  @InterfaceMethod(9)
  public fun get_Id(): Int

  @InterfaceMethod(10)
  public fun add_Consolidated(handler: TypedEventHandler<ApplicationView?,
      ApplicationViewConsolidatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_Consolidated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationView> {
    public override fun getValue() = ABI.makeIApplicationView(pointer.getPointer(0))

    public fun setValue(value: IApplicationView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationView {
    public val __1867806909_Ptr: Pointer?

    public val _1867806909_VtblPtr: Pointer?
      get() = __1867806909_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): ApplicationViewOrientation? {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewOrientation>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AdjacentToLeftDisplayEdge(): Boolean {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AdjacentToRightDisplayEdge(): Boolean {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsFullScreen(): Boolean {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsOnLockScreen(): Boolean {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsScreenCaptureEnabled(): Boolean {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_IsScreenCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Title(): String? {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Id(): Int {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun add_Consolidated(handler: TypedEventHandler<ApplicationView?,
        ApplicationViewConsolidatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_Consolidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1867806909_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867806909_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1867806909_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d222d5194361451e96c460f4f9742db0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationView(ptr: Pointer?): WithDefault = IApplicationView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationView {
      val address = segment.toRawLongValue()
      return makeIApplicationView(Pointer(address))
    }

    public override fun toNative(obj: IApplicationView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1867806909_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationView): Array<IApplicationView?> = (elements as
        Array<IApplicationView?>).castToImpl<IApplicationView,IApplicationView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationView?> =
        arrayOfNulls<IApplicationView_Impl>(size) as Array<IApplicationView?>
  }
}
