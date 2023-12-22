package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.Media.Brush
import Windows.Foundation.Collections.IVector
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

@ABIMarker(ITextHighlighter.ABI::class)
@Signature("{b756e861-1d2b-5f6f-81fd-c51a5bc068ff}")
@Guid("b756e8611d2b5f6f81fdc51a5bc068ff")
@WinRTInterface("b756e8611d2b5f6f81fdc51a5bc068ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextHighlighter.ByReference::class)
public interface ITextHighlighter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ranges(): IVector<TextRange?>?

  @InterfaceMethod(1)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(2)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(3)
  public fun get_Background(): Brush?

  @InterfaceMethod(4)
  public fun put_Background(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextHighlighter> {
    public override fun getValue() = ABI.makeITextHighlighter(pointer.getPointer(0))

    public fun setValue(value: ITextHighlighter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextHighlighter {
    public val __301989513_Ptr: Pointer?

    public val _301989513_VtblPtr: Pointer?
      get() = __301989513_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ranges(): IVector<TextRange?>? {
      val fnPtr = _301989513_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TextRange?>>()
      val hr = fn.invokeHR(arrayOf(__301989513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TextRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _301989513_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__301989513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _301989513_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__301989513_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Background(): Brush? {
      val fnPtr = _301989513_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__301989513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _301989513_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__301989513_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextHighlighter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __301989513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextHighlighter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b756e8611d2b5f6f81fdc51a5bc068ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextHighlighter(ptr: Pointer?): WithDefault = ITextHighlighter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextHighlighter {
      val address = segment.toRawLongValue()
      return makeITextHighlighter(Pointer(address))
    }

    public override fun toNative(obj: ITextHighlighter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__301989513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextHighlighter): Array<ITextHighlighter?> = (elements as
        Array<ITextHighlighter?>).castToImpl<ITextHighlighter,ITextHighlighter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextHighlighter?> =
        arrayOfNulls<ITextHighlighter_Impl>(size) as Array<ITextHighlighter?>
  }
}
