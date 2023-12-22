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

@ABIMarker(ILampArraySolidEffect.ABI::class)
@Signature("{441f8213-43cc-4b33-80eb-c6ddde7dc8ed}")
@Guid("441f821343cc4b3380ebc6ddde7dc8ed")
@WinRTInterface("441f821343cc4b3380ebc6ddde7dc8ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArraySolidEffect.ByReference::class)
public interface ILampArraySolidEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_StartDelay(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_StartDelay(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun get_CompletionBehavior(): LampArrayEffectCompletionBehavior?

  @InterfaceMethod(7)
  public fun put_CompletionBehavior(value: LampArrayEffectCompletionBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArraySolidEffect> {
    public override fun getValue() = ABI.makeILampArraySolidEffect(pointer.getPointer(0))

    public fun setValue(value: ILampArraySolidEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArraySolidEffect {
    public val __644307305_Ptr: Pointer?

    public val _644307305_VtblPtr: Pointer?
      get() = __644307305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _644307305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _644307305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _644307305_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _644307305_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StartDelay(): TimeSpan? {
      val fnPtr = _644307305_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StartDelay(value: TimeSpan?): Unit {
      val fnPtr = _644307305_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CompletionBehavior(): LampArrayEffectCompletionBehavior? {
      val fnPtr = _644307305_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayEffectCompletionBehavior>()
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayEffectCompletionBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CompletionBehavior(value: LampArrayEffectCompletionBehavior?): Unit {
      val fnPtr = _644307305_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644307305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArraySolidEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __644307305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArraySolidEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("441f821343cc4b3380ebc6ddde7dc8ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArraySolidEffect(ptr: Pointer?): WithDefault =
        ILampArraySolidEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArraySolidEffect {
      val address = segment.toRawLongValue()
      return makeILampArraySolidEffect(Pointer(address))
    }

    public override fun toNative(obj: ILampArraySolidEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__644307305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArraySolidEffect): Array<ILampArraySolidEffect?> =
        (elements as
        Array<ILampArraySolidEffect?>).castToImpl<ILampArraySolidEffect,ILampArraySolidEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArraySolidEffect?> =
        arrayOfNulls<ILampArraySolidEffect_Impl>(size) as Array<ILampArraySolidEffect?>
  }
}
