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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextCompositionEndedEventArgs.ABI::class)
@Signature("{19d0a5c5-8d0f-5118-8c30-e709326f1283}")
@Guid("19d0a5c58d0f51188c30e709326f1283")
@WinRTInterface("19d0a5c58d0f51188c30e709326f1283")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCompositionEndedEventArgs.ByReference::class)
public interface ITextCompositionEndedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartIndex(): Int

  @InterfaceMethod(1)
  public fun get_Length(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCompositionEndedEventArgs> {
    public override fun getValue() = ABI.makeITextCompositionEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextCompositionEndedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCompositionEndedEventArgs {
    public val __541566925_Ptr: Pointer?

    public val _541566925_VtblPtr: Pointer?
      get() = __541566925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartIndex(): Int {
      val fnPtr = _541566925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__541566925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): Int {
      val fnPtr = _541566925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__541566925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextCompositionEndedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __541566925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCompositionEndedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19d0a5c58d0f51188c30e709326f1283")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCompositionEndedEventArgs(ptr: Pointer?): WithDefault =
        ITextCompositionEndedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCompositionEndedEventArgs {
      val address = segment.toRawLongValue()
      return makeITextCompositionEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextCompositionEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__541566925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCompositionEndedEventArgs):
        Array<ITextCompositionEndedEventArgs?> = (elements as
        Array<ITextCompositionEndedEventArgs?>).castToImpl<ITextCompositionEndedEventArgs,ITextCompositionEndedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCompositionEndedEventArgs?> =
        arrayOfNulls<ITextCompositionEndedEventArgs_Impl>(size) as
        Array<ITextCompositionEndedEventArgs?>
  }
}
