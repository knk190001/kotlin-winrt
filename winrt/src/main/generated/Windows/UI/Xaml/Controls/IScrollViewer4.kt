package Windows.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewer4.ABI::class)
@Signature("{786fb0c4-50a9-5a45-8a92-7bf372e19098}")
@Guid("786fb0c450a95a458a927bf372e19098")
@WinRTInterface("786fb0c450a95a458a927bf372e19098")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewer4.ByReference::class)
public interface IScrollViewer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReduceViewportForCoreInputViewOcclusions(): Boolean

  @InterfaceMethod(1)
  public fun put_ReduceViewportForCoreInputViewOcclusions(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_HorizontalAnchorRatio(): Double

  @InterfaceMethod(3)
  public fun put_HorizontalAnchorRatio(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_VerticalAnchorRatio(): Double

  @InterfaceMethod(5)
  public fun put_VerticalAnchorRatio(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_CanContentRenderOutsideBounds(): Boolean

  @InterfaceMethod(7)
  public fun put_CanContentRenderOutsideBounds(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun add_AnchorRequested(handler: TypedEventHandler<ScrollViewer?,
      AnchorRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_AnchorRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScrollViewer4>
      {
    public override fun getValue() = ABI.makeIScrollViewer4(pointer.getPointer(0))

    public fun setValue(value: IScrollViewer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewer4 {
    public val __174137913_Ptr: Pointer?

    public val _174137913_VtblPtr: Pointer?
      get() = __174137913_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReduceViewportForCoreInputViewOcclusions(): Boolean {
      val fnPtr = _174137913_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ReduceViewportForCoreInputViewOcclusions(value: Boolean): Unit {
      val fnPtr = _174137913_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalAnchorRatio(): Double {
      val fnPtr = _174137913_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_HorizontalAnchorRatio(value: Double): Unit {
      val fnPtr = _174137913_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_VerticalAnchorRatio(): Double {
      val fnPtr = _174137913_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_VerticalAnchorRatio(value: Double): Unit {
      val fnPtr = _174137913_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CanContentRenderOutsideBounds(): Boolean {
      val fnPtr = _174137913_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_CanContentRenderOutsideBounds(value: Boolean): Unit {
      val fnPtr = _174137913_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_AnchorRequested(handler: TypedEventHandler<ScrollViewer?,
        AnchorRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _174137913_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_AnchorRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _174137913_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137913_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollViewer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174137913_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("786fb0c450a95a458a927bf372e19098")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewer4(ptr: Pointer?): WithDefault = IScrollViewer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewer4 {
      val address = segment.toRawLongValue()
      return makeIScrollViewer4(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174137913_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewer4): Array<IScrollViewer4?> = (elements as
        Array<IScrollViewer4?>).castToImpl<IScrollViewer4,IScrollViewer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewer4?> =
        arrayOfNulls<IScrollViewer4_Impl>(size) as Array<IScrollViewer4?>
  }
}
