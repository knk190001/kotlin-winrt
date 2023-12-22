package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IProgressRing.ABI::class)
@Signature("{2670d03f-e28c-5652-bee2-b5212ebdf7ff}")
@Guid("2670d03fe28c5652bee2b5212ebdf7ff")
@WinRTInterface("2670d03fe28c5652bee2b5212ebdf7ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRing.ByReference::class)
public interface IProgressRing : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun put_IsActive(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsIndeterminate(): Boolean

  @InterfaceMethod(3)
  public fun put_IsIndeterminate(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_TemplateSettings(): ProgressRingTemplateSettings?

  @InterfaceMethod(5)
  public fun get_Value(): Double

  @InterfaceMethod(6)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_Minimum(): Double

  @InterfaceMethod(8)
  public fun put_Minimum(value: Double): Unit

  @InterfaceMethod(9)
  public fun get_Maximum(): Double

  @InterfaceMethod(10)
  public fun put_Maximum(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IProgressRing>
      {
    public override fun getValue() = ABI.makeIProgressRing(pointer.getPointer(0))

    public fun setValue(value: IProgressRing_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRing {
    public val __476373692_Ptr: Pointer?

    public val _476373692_VtblPtr: Pointer?
      get() = __476373692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _476373692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsActive(value: Boolean): Unit {
      val fnPtr = _476373692_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsIndeterminate(): Boolean {
      val fnPtr = _476373692_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsIndeterminate(value: Boolean): Unit {
      val fnPtr = _476373692_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TemplateSettings(): ProgressRingTemplateSettings? {
      val fnPtr = _476373692_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressRingTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressRingTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Value(): Double {
      val fnPtr = _476373692_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _476373692_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Minimum(): Double {
      val fnPtr = _476373692_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Minimum(value: Double): Unit {
      val fnPtr = _476373692_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Maximum(): Double {
      val fnPtr = _476373692_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Maximum(value: Double): Unit {
      val fnPtr = _476373692_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476373692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProgressRing_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __476373692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRing, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2670d03fe28c5652bee2b5212ebdf7ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRing(ptr: Pointer?): WithDefault = IProgressRing_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRing {
      val address = segment.toRawLongValue()
      return makeIProgressRing(Pointer(address))
    }

    public override fun toNative(obj: IProgressRing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__476373692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRing): Array<IProgressRing?> = (elements as
        Array<IProgressRing?>).castToImpl<IProgressRing,IProgressRing_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRing?> =
        arrayOfNulls<IProgressRing_Impl>(size) as Array<IProgressRing?>
  }
}
