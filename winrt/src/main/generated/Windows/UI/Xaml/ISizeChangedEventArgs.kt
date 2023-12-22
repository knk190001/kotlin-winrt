package Windows.UI.Xaml

import Windows.Foundation.Size
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

@ABIMarker(ISizeChangedEventArgs.ABI::class)
@Signature("{d5312e60-5cc1-42a1-920c-1af46be2f986}")
@Guid("d5312e605cc142a1920c1af46be2f986")
@WinRTInterface("d5312e605cc142a1920c1af46be2f986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISizeChangedEventArgs.ByReference::class)
public interface ISizeChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreviousSize(): Size?

  @InterfaceMethod(1)
  public fun get_NewSize(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISizeChangedEventArgs> {
    public override fun getValue() = ABI.makeISizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISizeChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISizeChangedEventArgs {
    public val __1736363446_Ptr: Pointer?

    public val _1736363446_VtblPtr: Pointer?
      get() = __1736363446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreviousSize(): Size? {
      val fnPtr = _1736363446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1736363446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewSize(): Size? {
      val fnPtr = _1736363446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1736363446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class ISizeChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1736363446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISizeChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5312e605cc142a1920c1af46be2f986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISizeChangedEventArgs(ptr: Pointer?): WithDefault =
        ISizeChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1736363446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISizeChangedEventArgs): Array<ISizeChangedEventArgs?> =
        (elements as
        Array<ISizeChangedEventArgs?>).castToImpl<ISizeChangedEventArgs,ISizeChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISizeChangedEventArgs?> =
        arrayOfNulls<ISizeChangedEventArgs_Impl>(size) as Array<ISizeChangedEventArgs?>
  }
}
