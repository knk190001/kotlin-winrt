package Windows.UI.Xaml.Printing

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
@Signature("{e2e52be5-056c-4420-9795-cb3526ce0c20}")
@Guid("e2e52be5056c44209795cb3526ce0c20")
@WinRTInterface("e2e52be5056c44209795cb3526ce0c20")
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
    public val __1734605001_Ptr: Pointer?

    public val _1734605001_VtblPtr: Pointer?
      get() = __1734605001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintTaskOptions(): PrintTaskOptions? {
      val fnPtr = _1734605001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskOptions>()
      val hr = fn.invokeHR(arrayOf(__1734605001_Ptr,  result))
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
    public override val __1734605001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAddPagesEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2e52be5056c44209795cb3526ce0c20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAddPagesEventArgs(ptr: Pointer?): WithDefault = IAddPagesEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAddPagesEventArgs {
      val address = segment.toRawLongValue()
      return makeIAddPagesEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAddPagesEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1734605001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAddPagesEventArgs): Array<IAddPagesEventArgs?> =
        (elements as
        Array<IAddPagesEventArgs?>).castToImpl<IAddPagesEventArgs,IAddPagesEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAddPagesEventArgs?> =
        arrayOfNulls<IAddPagesEventArgs_Impl>(size) as Array<IAddPagesEventArgs?>
  }
}
