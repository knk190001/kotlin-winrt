package Windows.Devices.Lights.Effects

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILampArrayBitmapEffect.ABI::class)
@Signature("{3238e065-d877-4627-89e5-2a88f7052fa6}")
@Guid("3238e065d877462789e52a88f7052fa6")
@WinRTInterface("3238e065d877462789e52a88f7052fa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayBitmapEffect.ByReference::class)
public interface ILampArrayBitmapEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_StartDelay(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_StartDelay(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_UpdateInterval(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_UpdateInterval(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun get_SuggestedBitmapSize(): Size?

  @InterfaceMethod(7)
  public fun add_BitmapRequested(handler: TypedEventHandler<LampArrayBitmapEffect?,
      LampArrayBitmapRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_BitmapRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayBitmapEffect> {
    public override fun getValue() = ABI.makeILampArrayBitmapEffect(pointer.getPointer(0))

    public fun setValue(value: ILampArrayBitmapEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayBitmapEffect {
    public val __1083555707_Ptr: Pointer?

    public val _1083555707_VtblPtr: Pointer?
      get() = __1083555707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StartDelay(): TimeSpan? {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StartDelay(value: TimeSpan?): Unit {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UpdateInterval(): TimeSpan? {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_UpdateInterval(value: TimeSpan?): Unit {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SuggestedBitmapSize(): Size? {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_BitmapRequested(handler: TypedEventHandler<LampArrayBitmapEffect?,
        LampArrayBitmapRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_BitmapRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1083555707_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1083555707_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayBitmapEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1083555707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayBitmapEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3238e065d877462789e52a88f7052fa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayBitmapEffect(ptr: Pointer?): WithDefault =
        ILampArrayBitmapEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayBitmapEffect {
      val address = segment.toRawLongValue()
      return makeILampArrayBitmapEffect(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayBitmapEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1083555707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayBitmapEffect): Array<ILampArrayBitmapEffect?> =
        (elements as
        Array<ILampArrayBitmapEffect?>).castToImpl<ILampArrayBitmapEffect,ILampArrayBitmapEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayBitmapEffect?> =
        arrayOfNulls<ILampArrayBitmapEffect_Impl>(size) as Array<ILampArrayBitmapEffect?>
  }
}
