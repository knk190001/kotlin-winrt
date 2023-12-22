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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBoxTextChangingEventArgs.ABI::class)
@Signature("{a1a08d48-e8c0-5379-b138-7eb3f8d5f5e6}")
@Guid("a1a08d48e8c05379b1387eb3f8d5f5e6")
@WinRTInterface("a1a08d48e8c05379b1387eb3f8d5f5e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxTextChangingEventArgs.ByReference::class)
public interface ITextBoxTextChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsContentChanging(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxTextChangingEventArgs> {
    public override fun getValue() = ABI.makeITextBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextBoxTextChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxTextChangingEventArgs {
    public val __1942079878_Ptr: Pointer?

    public val _1942079878_VtblPtr: Pointer?
      get() = __1942079878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsContentChanging(): Boolean {
      val fnPtr = _1942079878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1942079878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextBoxTextChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942079878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxTextChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1a08d48e8c05379b1387eb3f8d5f5e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxTextChangingEventArgs(ptr: Pointer?): WithDefault =
        ITextBoxTextChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeITextBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942079878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxTextChangingEventArgs):
        Array<ITextBoxTextChangingEventArgs?> = (elements as
        Array<ITextBoxTextChangingEventArgs?>).castToImpl<ITextBoxTextChangingEventArgs,ITextBoxTextChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxTextChangingEventArgs?> =
        arrayOfNulls<ITextBoxTextChangingEventArgs_Impl>(size) as
        Array<ITextBoxTextChangingEventArgs?>
  }
}
