package Windows.UI.Input.Inking.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ICoreWetStrokeUpdateSource.ABI::class)
@Signature("{1f718e22-ee52-4e00-8209-4c3e5b21a3cc}")
@Guid("1f718e22ee524e0082094c3e5b21a3cc")
@WinRTInterface("1f718e22ee524e0082094c3e5b21a3cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWetStrokeUpdateSource.ByReference::class)
public interface ICoreWetStrokeUpdateSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_WetStrokeStarting(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
      CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_WetStrokeStarting(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_WetStrokeContinuing(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
      CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_WetStrokeContinuing(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_WetStrokeStopping(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
      CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_WetStrokeStopping(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_WetStrokeCompleted(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
      CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_WetStrokeCompleted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_WetStrokeCanceled(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
      CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_WetStrokeCanceled(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_InkPresenter(): InkPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWetStrokeUpdateSource> {
    public override fun getValue() = ABI.makeICoreWetStrokeUpdateSource(pointer.getPointer(0))

    public fun setValue(value: ICoreWetStrokeUpdateSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWetStrokeUpdateSource {
    public val __1013735448_Ptr: Pointer?

    public val _1013735448_VtblPtr: Pointer?
      get() = __1013735448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_WetStrokeStarting(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
        CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_WetStrokeStarting(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_WetStrokeContinuing(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
        CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_WetStrokeContinuing(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_WetStrokeStopping(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
        CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_WetStrokeStopping(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_WetStrokeCompleted(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
        CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_WetStrokeCompleted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_WetStrokeCanceled(handler: TypedEventHandler<CoreWetStrokeUpdateSource?,
        CoreWetStrokeUpdateEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_WetStrokeCanceled(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_InkPresenter(): InkPresenter? {
      val fnPtr = _1013735448_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__1013735448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWetStrokeUpdateSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1013735448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWetStrokeUpdateSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f718e22ee524e0082094c3e5b21a3cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWetStrokeUpdateSource(ptr: Pointer?): WithDefault =
        ICoreWetStrokeUpdateSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWetStrokeUpdateSource {
      val address = segment.toRawLongValue()
      return makeICoreWetStrokeUpdateSource(Pointer(address))
    }

    public override fun toNative(obj: ICoreWetStrokeUpdateSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1013735448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWetStrokeUpdateSource):
        Array<ICoreWetStrokeUpdateSource?> = (elements as
        Array<ICoreWetStrokeUpdateSource?>).castToImpl<ICoreWetStrokeUpdateSource,ICoreWetStrokeUpdateSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWetStrokeUpdateSource?> =
        arrayOfNulls<ICoreWetStrokeUpdateSource_Impl>(size) as Array<ICoreWetStrokeUpdateSource?>
  }
}
