package Windows.Gaming.Input.ForceFeedback

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IForceFeedbackEffect.ABI::class)
@Signature("{a17fba0c-2ae4-48c2-8063-eabd0777cb89}")
@Guid("a17fba0c2ae448c28063eabd0777cb89")
@WinRTInterface("a17fba0c2ae448c28063eabd0777cb89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IForceFeedbackEffect.ByReference::class)
public interface IForceFeedbackEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Gain(): Double

  @InterfaceMethod(1)
  public fun put_Gain(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_State(): ForceFeedbackEffectState?

  @InterfaceMethod(3)
  public fun Start(): Unit

  @InterfaceMethod(4)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IForceFeedbackEffect> {
    public override fun getValue() = ABI.makeIForceFeedbackEffect(pointer.getPointer(0))

    public fun setValue(value: IForceFeedbackEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IForceFeedbackEffect {
    public val __455352496_Ptr: Pointer?

    public val _455352496_VtblPtr: Pointer?
      get() = __455352496_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Gain(): Double {
      val fnPtr = _455352496_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__455352496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Gain(value: Double): Unit {
      val fnPtr = _455352496_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455352496_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_State(): ForceFeedbackEffectState? {
      val fnPtr = _455352496_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ForceFeedbackEffectState>()
      val hr = fn.invokeHR(arrayOf(__455352496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ForceFeedbackEffectState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Start(): Unit {
      val fnPtr = _455352496_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455352496_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Stop(): Unit {
      val fnPtr = _455352496_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__455352496_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IForceFeedbackEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __455352496_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IForceFeedbackEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a17fba0c2ae448c28063eabd0777cb89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIForceFeedbackEffect(ptr: Pointer?): WithDefault = IForceFeedbackEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IForceFeedbackEffect {
      val address = segment.toRawLongValue()
      return makeIForceFeedbackEffect(Pointer(address))
    }

    public override fun toNative(obj: IForceFeedbackEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__455352496_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IForceFeedbackEffect): Array<IForceFeedbackEffect?> =
        (elements as
        Array<IForceFeedbackEffect?>).castToImpl<IForceFeedbackEffect,IForceFeedbackEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IForceFeedbackEffect?> =
        arrayOfNulls<IForceFeedbackEffect_Impl>(size) as Array<IForceFeedbackEffect?>
  }
}
