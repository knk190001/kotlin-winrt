package Windows.Gaming.Input

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IRacingWheelStatics.ABI::class)
@Signature("{3ac12cd5-581b-4936-9f94-69f1e6514c7d}")
@Guid("3ac12cd5581b49369f9469f1e6514c7d")
@WinRTInterface("3ac12cd5581b49369f9469f1e6514c7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRacingWheelStatics.ByReference::class)
public interface IRacingWheelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_RacingWheelAdded(value: EventHandler<RacingWheel?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_RacingWheelAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_RacingWheelRemoved(value: EventHandler<RacingWheel?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RacingWheelRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_RacingWheels(): IVectorView<RacingWheel?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRacingWheelStatics> {
    public override fun getValue() = ABI.makeIRacingWheelStatics(pointer.getPointer(0))

    public fun setValue(value: IRacingWheelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRacingWheelStatics {
    public val __133682229_Ptr: Pointer?

    public val _133682229_VtblPtr: Pointer?
      get() = __133682229_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_RacingWheelAdded(value: EventHandler<RacingWheel?>?):
        EventRegistrationToken? {
      val fnPtr = _133682229_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__133682229_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_RacingWheelAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _133682229_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__133682229_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RacingWheelRemoved(value: EventHandler<RacingWheel?>?):
        EventRegistrationToken? {
      val fnPtr = _133682229_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__133682229_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RacingWheelRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _133682229_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__133682229_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RacingWheels(): IVectorView<RacingWheel?>? {
      val fnPtr = _133682229_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RacingWheel?>>()
      val hr = fn.invokeHR(arrayOf(__133682229_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RacingWheel?>>(result.getValue())
      return resultValue
    }
  }

  public class IRacingWheelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __133682229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRacingWheelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ac12cd5581b49369f9469f1e6514c7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRacingWheelStatics(ptr: Pointer?): WithDefault = IRacingWheelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRacingWheelStatics {
      val address = segment.toRawLongValue()
      return makeIRacingWheelStatics(Pointer(address))
    }

    public override fun toNative(obj: IRacingWheelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__133682229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRacingWheelStatics): Array<IRacingWheelStatics?> =
        (elements as
        Array<IRacingWheelStatics?>).castToImpl<IRacingWheelStatics,IRacingWheelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRacingWheelStatics?> =
        arrayOfNulls<IRacingWheelStatics_Impl>(size) as Array<IRacingWheelStatics?>
  }
}
