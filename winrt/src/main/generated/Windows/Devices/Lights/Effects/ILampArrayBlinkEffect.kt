package Windows.Devices.Lights.Effects

import Windows.Foundation.TimeSpan
import Windows.UI.Color
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

@ABIMarker(ILampArrayBlinkEffect.ABI::class)
@Signature("{ebbf35f6-2fc5-4bb3-b3c3-6221a7680d13}")
@Guid("ebbf35f62fc54bb3b3c36221a7680d13")
@WinRTInterface("ebbf35f62fc54bb3b3c36221a7680d13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayBlinkEffect.ByReference::class)
public interface ILampArrayBlinkEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_AttackDuration(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_AttackDuration(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_SustainDuration(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_SustainDuration(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun get_DecayDuration(): TimeSpan?

  @InterfaceMethod(7)
  public fun put_DecayDuration(value: TimeSpan?): Unit

  @InterfaceMethod(8)
  public fun get_RepetitionDelay(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_RepetitionDelay(value: TimeSpan?): Unit

  @InterfaceMethod(10)
  public fun get_StartDelay(): TimeSpan?

  @InterfaceMethod(11)
  public fun put_StartDelay(value: TimeSpan?): Unit

  @InterfaceMethod(12)
  public fun get_Occurrences(): Int

  @InterfaceMethod(13)
  public fun put_Occurrences(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_RepetitionMode(): LampArrayRepetitionMode?

  @InterfaceMethod(15)
  public fun put_RepetitionMode(value: LampArrayRepetitionMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayBlinkEffect> {
    public override fun getValue() = ABI.makeILampArrayBlinkEffect(pointer.getPointer(0))

    public fun setValue(value: ILampArrayBlinkEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayBlinkEffect {
    public val __697260408_Ptr: Pointer?

    public val _697260408_VtblPtr: Pointer?
      get() = __697260408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AttackDuration(): TimeSpan? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AttackDuration(value: TimeSpan?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SustainDuration(): TimeSpan? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SustainDuration(value: TimeSpan?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DecayDuration(): TimeSpan? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DecayDuration(value: TimeSpan?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RepetitionDelay(): TimeSpan? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_RepetitionDelay(value: TimeSpan?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_StartDelay(): TimeSpan? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_StartDelay(value: TimeSpan?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Occurrences(): Int {
      val fnPtr = _697260408_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_Occurrences(value: Int): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_RepetitionMode(): LampArrayRepetitionMode? {
      val fnPtr = _697260408_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayRepetitionMode>()
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayRepetitionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_RepetitionMode(value: LampArrayRepetitionMode?): Unit {
      val fnPtr = _697260408_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697260408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayBlinkEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697260408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayBlinkEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebbf35f62fc54bb3b3c36221a7680d13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayBlinkEffect(ptr: Pointer?): WithDefault =
        ILampArrayBlinkEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayBlinkEffect {
      val address = segment.toRawLongValue()
      return makeILampArrayBlinkEffect(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayBlinkEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697260408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayBlinkEffect): Array<ILampArrayBlinkEffect?> =
        (elements as
        Array<ILampArrayBlinkEffect?>).castToImpl<ILampArrayBlinkEffect,ILampArrayBlinkEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayBlinkEffect?> =
        arrayOfNulls<ILampArrayBlinkEffect_Impl>(size) as Array<ILampArrayBlinkEffect?>
  }
}
