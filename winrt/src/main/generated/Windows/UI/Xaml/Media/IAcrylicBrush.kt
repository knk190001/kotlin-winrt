package Windows.UI.Xaml.Media

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAcrylicBrush.ABI::class)
@Signature("{79bbcf4e-cd66-4f1b-a8b6-cd6d2977c18d}")
@Guid("79bbcf4ecd664f1ba8b6cd6d2977c18d")
@WinRTInterface("79bbcf4ecd664f1ba8b6cd6d2977c18d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcrylicBrush.ByReference::class)
public interface IAcrylicBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSource(): AcrylicBackgroundSource?

  @InterfaceMethod(1)
  public fun put_BackgroundSource(value: AcrylicBackgroundSource?): Unit

  @InterfaceMethod(2)
  public fun get_TintColor(): Color?

  @InterfaceMethod(3)
  public fun put_TintColor(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_TintOpacity(): Double

  @InterfaceMethod(5)
  public fun put_TintOpacity(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_TintTransitionDuration(): TimeSpan?

  @InterfaceMethod(7)
  public fun put_TintTransitionDuration(value: TimeSpan?): Unit

  @InterfaceMethod(8)
  public fun get_AlwaysUseFallback(): Boolean

  @InterfaceMethod(9)
  public fun put_AlwaysUseFallback(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAcrylicBrush>
      {
    public override fun getValue() = ABI.makeIAcrylicBrush(pointer.getPointer(0))

    public fun setValue(value: IAcrylicBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcrylicBrush {
    public val __1114652985_Ptr: Pointer?

    public val _1114652985_VtblPtr: Pointer?
      get() = __1114652985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSource(): AcrylicBackgroundSource? {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AcrylicBackgroundSource>()
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AcrylicBackgroundSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundSource(value: AcrylicBackgroundSource?): Unit {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TintColor(): Color? {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TintColor(value: Color?): Unit {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TintOpacity(): Double {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_TintOpacity(value: Double): Unit {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TintTransitionDuration(): TimeSpan? {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TintTransitionDuration(value: TimeSpan?): Unit {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AlwaysUseFallback(): Boolean {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AlwaysUseFallback(value: Boolean): Unit {
      val fnPtr = _1114652985_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114652985_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAcrylicBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1114652985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcrylicBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79bbcf4ecd664f1ba8b6cd6d2977c18d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcrylicBrush(ptr: Pointer?): WithDefault = IAcrylicBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcrylicBrush {
      val address = segment.toRawLongValue()
      return makeIAcrylicBrush(Pointer(address))
    }

    public override fun toNative(obj: IAcrylicBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1114652985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcrylicBrush): Array<IAcrylicBrush?> = (elements as
        Array<IAcrylicBrush?>).castToImpl<IAcrylicBrush,IAcrylicBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcrylicBrush?> =
        arrayOfNulls<IAcrylicBrush_Impl>(size) as Array<IAcrylicBrush?>
  }
}
