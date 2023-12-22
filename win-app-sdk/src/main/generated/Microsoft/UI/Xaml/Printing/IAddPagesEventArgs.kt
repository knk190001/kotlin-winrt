package Microsoft.UI.Xaml.Printing

import Windows.Graphics.Printing.PrintTaskOptions
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

@ABIMarker(IAddPagesEventArgs.ABI::class)
@Signature("{a69f3cb3-6b74-5ee8-b034-188098a98c5d}")
@Guid("a69f3cb36b745ee8b034188098a98c5d")
@WinRTInterface("a69f3cb36b745ee8b034188098a98c5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAddPagesEventArgs.ByReference::class)
public interface IAddPagesEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrintTaskOptions(): PrintTaskOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAddPagesEventArgs> {
    public override fun getValue() = ABI.makeIAddPagesEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAddPagesEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAddPagesEventArgs {
    public val __801849108_Ptr: Pointer?

    public val _801849108_VtblPtr: Pointer?
      get() = __801849108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintTaskOptions(): PrintTaskOptions? {
      val fnPtr = _801849108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskOptions>()
      val hr = fn.invokeHR(arrayOf(__801849108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskOptions>(result.getValue())
      return resultValue
    }
  }

  public class IAddPagesEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __801849108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAddPagesEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a69f3cb36b745ee8b034188098a98c5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAddPagesEventArgs(ptr: Pointer?): WithDefault = IAddPagesEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAddPagesEventArgs {
      val address = segment.toRawLongValue()
      return makeIAddPagesEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAddPagesEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__801849108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAddPagesEventArgs): Array<IAddPagesEventArgs?> =
        (elements as
        Array<IAddPagesEventArgs?>).castToImpl<IAddPagesEventArgs,IAddPagesEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAddPagesEventArgs?> =
        arrayOfNulls<IAddPagesEventArgs_Impl>(size) as Array<IAddPagesEventArgs?>
  }
}
