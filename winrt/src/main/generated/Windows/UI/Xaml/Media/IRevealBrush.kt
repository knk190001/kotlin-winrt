package Windows.UI.Xaml.Media

import Windows.UI.Color
import Windows.UI.Xaml.ApplicationTheme
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRevealBrush.ABI::class)
@Signature("{2036a0ed-8271-4398-9019-25872093f13f}")
@Guid("2036a0ed82714398901925872093f13f")
@WinRTInterface("2036a0ed82714398901925872093f13f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBrush.ByReference::class)
public interface IRevealBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_TargetTheme(): ApplicationTheme?

  @InterfaceMethod(3)
  public fun put_TargetTheme(value: ApplicationTheme?): Unit

  @InterfaceMethod(4)
  public fun get_AlwaysUseFallback(): Boolean

  @InterfaceMethod(5)
  public fun put_AlwaysUseFallback(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRevealBrush> {
    public override fun getValue() = ABI.makeIRevealBrush(pointer.getPointer(0))

    public fun setValue(value: IRevealBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBrush {
    public val __1539813361_Ptr: Pointer?

    public val _1539813361_VtblPtr: Pointer?
      get() = __1539813361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TargetTheme(): ApplicationTheme? {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationTheme>()
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TargetTheme(value: ApplicationTheme?): Unit {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AlwaysUseFallback(): Boolean {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AlwaysUseFallback(value: Boolean): Unit {
      val fnPtr = _1539813361_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539813361_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRevealBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539813361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2036a0ed82714398901925872093f13f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBrush(ptr: Pointer?): WithDefault = IRevealBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBrush {
      val address = segment.toRawLongValue()
      return makeIRevealBrush(Pointer(address))
    }

    public override fun toNative(obj: IRevealBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539813361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBrush): Array<IRevealBrush?> = (elements as
        Array<IRevealBrush?>).castToImpl<IRevealBrush,IRevealBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBrush?> =
        arrayOfNulls<IRevealBrush_Impl>(size) as Array<IRevealBrush?>
  }
}
