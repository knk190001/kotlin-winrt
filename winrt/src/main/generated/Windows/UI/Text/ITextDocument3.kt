package Windows.UI.Text

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

@ABIMarker(ITextDocument3.ABI::class)
@Signature("{75ab03a1-a6f8-441d-aa18-0a851d6e5e3c}")
@Guid("75ab03a1a6f8441daa180a851d6e5e3c")
@WinRTInterface("75ab03a1a6f8441daa180a851d6e5e3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextDocument3.ByReference::class)
public interface ITextDocument3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClearUndoRedoHistory(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextDocument3>
      {
    public override fun getValue() = ABI.makeITextDocument3(pointer.getPointer(0))

    public fun setValue(value: ITextDocument3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextDocument3 {
    public val __145749794_Ptr: Pointer?

    public val _145749794_VtblPtr: Pointer?
      get() = __145749794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClearUndoRedoHistory(): Unit {
      val fnPtr = _145749794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145749794_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextDocument3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145749794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextDocument3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75ab03a1a6f8441daa180a851d6e5e3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextDocument3(ptr: Pointer?): WithDefault = ITextDocument3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextDocument3 {
      val address = segment.toRawLongValue()
      return makeITextDocument3(Pointer(address))
    }

    public override fun toNative(obj: ITextDocument3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145749794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextDocument3): Array<ITextDocument3?> = (elements as
        Array<ITextDocument3?>).castToImpl<ITextDocument3,ITextDocument3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextDocument3?> =
        arrayOfNulls<ITextDocument3_Impl>(size) as Array<ITextDocument3?>
  }
}
