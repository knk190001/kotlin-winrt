package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ITextHighlighterStatics.ABI::class)
@Signature("{b3b009c4-3a7e-49cc-ab84-29c405488765}")
@Guid("b3b009c43a7e49ccab8429c405488765")
@WinRTInterface("b3b009c43a7e49ccab8429c405488765")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextHighlighterStatics.ByReference::class)
public interface ITextHighlighterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ForegroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BackgroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextHighlighterStatics> {
    public override fun getValue() = ABI.makeITextHighlighterStatics(pointer.getPointer(0))

    public fun setValue(value: ITextHighlighterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextHighlighterStatics {
    public val __2117372839_Ptr: Pointer?

    public val _2117372839_VtblPtr: Pointer?
      get() = __2117372839_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _2117372839_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2117372839_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _2117372839_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2117372839_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextHighlighterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2117372839_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextHighlighterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3b009c43a7e49ccab8429c405488765")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextHighlighterStatics(ptr: Pointer?): WithDefault =
        ITextHighlighterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextHighlighterStatics {
      val address = segment.toRawLongValue()
      return makeITextHighlighterStatics(Pointer(address))
    }

    public override fun toNative(obj: ITextHighlighterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2117372839_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextHighlighterStatics): Array<ITextHighlighterStatics?>
        = (elements as
        Array<ITextHighlighterStatics?>).castToImpl<ITextHighlighterStatics,ITextHighlighterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextHighlighterStatics?> =
        arrayOfNulls<ITextHighlighterStatics_Impl>(size) as Array<ITextHighlighterStatics?>
  }
}
