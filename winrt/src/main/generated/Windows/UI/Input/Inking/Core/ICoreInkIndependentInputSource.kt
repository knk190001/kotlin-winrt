package Windows.UI.Input.Inking.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.PointerEventArgs
import Windows.UI.Input.Inking.InkPresenter
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

@ABIMarker(ICoreInkIndependentInputSource.ABI::class)
@Signature("{39b38da9-7639-4499-a5b5-191d00e35b16}")
@Guid("39b38da976394499a5b5191d00e35b16")
@WinRTInterface("39b38da976394499a5b5191d00e35b16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInkIndependentInputSource.ByReference::class)
public interface ICoreInkIndependentInputSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PointerEntering(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PointerEntering(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PointerHovering(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PointerHovering(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PointerExiting(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PointerExiting(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PointerPressing(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PointerPressing(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PointerMoving(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PointerMoving(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PointerReleasing(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PointerReleasing(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_PointerLost(handler: TypedEventHandler<CoreInkIndependentInputSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_PointerLost(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun get_InkPresenter(): InkPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInkIndependentInputSource> {
    public override fun getValue() = ABI.makeICoreInkIndependentInputSource(pointer.getPointer(0))

    public fun setValue(value: ICoreInkIndependentInputSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInkIndependentInputSource {
    public val __981480103_Ptr: Pointer?

    public val _981480103_VtblPtr: Pointer?
      get() = __981480103_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_PointerEntering(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PointerEntering(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_PointerHovering(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PointerHovering(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_PointerExiting(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PointerExiting(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_PointerPressing(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PointerPressing(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PointerMoving(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PointerMoving(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_PointerReleasing(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PointerReleasing(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_PointerLost(handler: TypedEventHandler<CoreInkIndependentInputSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_PointerLost(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _981480103_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_InkPresenter(): InkPresenter? {
      val fnPtr = _981480103_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__981480103_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInkIndependentInputSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __981480103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInkIndependentInputSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39b38da976394499a5b5191d00e35b16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInkIndependentInputSource(ptr: Pointer?): WithDefault =
        ICoreInkIndependentInputSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInkIndependentInputSource {
      val address = segment.toRawLongValue()
      return makeICoreInkIndependentInputSource(Pointer(address))
    }

    public override fun toNative(obj: ICoreInkIndependentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__981480103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInkIndependentInputSource):
        Array<ICoreInkIndependentInputSource?> = (elements as
        Array<ICoreInkIndependentInputSource?>).castToImpl<ICoreInkIndependentInputSource,ICoreInkIndependentInputSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInkIndependentInputSource?> =
        arrayOfNulls<ICoreInkIndependentInputSource_Impl>(size) as
        Array<ICoreInkIndependentInputSource?>
  }
}
