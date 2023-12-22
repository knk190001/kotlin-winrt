package Windows.UI.Accessibility

import Windows.Foundation.Rect
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

@ABIMarker(IScreenReaderPositionChangedEventArgs.ABI::class)
@Signature("{557eb5e5-54d0-5ccd-9fc5-ed33357f8a9f}")
@Guid("557eb5e554d05ccd9fc5ed33357f8a9f")
@WinRTInterface("557eb5e554d05ccd9fc5ed33357f8a9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScreenReaderPositionChangedEventArgs.ByReference::class)
public interface IScreenReaderPositionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScreenPositionInRawPixels(): Rect?

  @InterfaceMethod(1)
  public fun get_IsReadingText(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScreenReaderPositionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIScreenReaderPositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScreenReaderPositionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScreenReaderPositionChangedEventArgs {
    public val __1215205573_Ptr: Pointer?

    public val _1215205573_VtblPtr: Pointer?
      get() = __1215205573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScreenPositionInRawPixels(): Rect? {
      val fnPtr = _1215205573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1215205573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsReadingText(): Boolean {
      val fnPtr = _1215205573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1215205573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IScreenReaderPositionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215205573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScreenReaderPositionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("557eb5e554d05ccd9fc5ed33357f8a9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScreenReaderPositionChangedEventArgs(ptr: Pointer?): WithDefault =
        IScreenReaderPositionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScreenReaderPositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScreenReaderPositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScreenReaderPositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215205573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScreenReaderPositionChangedEventArgs):
        Array<IScreenReaderPositionChangedEventArgs?> = (elements as
        Array<IScreenReaderPositionChangedEventArgs?>).castToImpl<IScreenReaderPositionChangedEventArgs,IScreenReaderPositionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScreenReaderPositionChangedEventArgs?> =
        arrayOfNulls<IScreenReaderPositionChangedEventArgs_Impl>(size) as
        Array<IScreenReaderPositionChangedEventArgs?>
  }
}
