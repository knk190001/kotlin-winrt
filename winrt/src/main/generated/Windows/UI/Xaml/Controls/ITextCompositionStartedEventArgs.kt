package Windows.UI.Xaml.Controls

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

@ABIMarker(ITextCompositionStartedEventArgs.ABI::class)
@Signature("{df22abb2-10cf-491e-91e8-d3cd72d8a0d3}")
@Guid("df22abb210cf491e91e8d3cd72d8a0d3")
@WinRTInterface("df22abb210cf491e91e8d3cd72d8a0d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCompositionStartedEventArgs.ByReference::class)
public interface ITextCompositionStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartIndex(): Int

  @InterfaceMethod(1)
  public fun get_Length(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCompositionStartedEventArgs> {
    public override fun getValue() = ABI.makeITextCompositionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextCompositionStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCompositionStartedEventArgs {
    public val __1778803671_Ptr: Pointer?

    public val _1778803671_VtblPtr: Pointer?
      get() = __1778803671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartIndex(): Int {
      val fnPtr = _1778803671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1778803671_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): Int {
      val fnPtr = _1778803671_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1778803671_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextCompositionStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1778803671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCompositionStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df22abb210cf491e91e8d3cd72d8a0d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCompositionStartedEventArgs(ptr: Pointer?): WithDefault =
        ITextCompositionStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCompositionStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeITextCompositionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextCompositionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1778803671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCompositionStartedEventArgs):
        Array<ITextCompositionStartedEventArgs?> = (elements as
        Array<ITextCompositionStartedEventArgs?>).castToImpl<ITextCompositionStartedEventArgs,ITextCompositionStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCompositionStartedEventArgs?> =
        arrayOfNulls<ITextCompositionStartedEventArgs_Impl>(size) as
        Array<ITextCompositionStartedEventArgs?>
  }
}
