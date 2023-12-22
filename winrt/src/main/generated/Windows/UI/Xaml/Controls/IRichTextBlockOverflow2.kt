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

@ABIMarker(IRichTextBlockOverflow2.ABI::class)
@Signature("{8742624e-a882-4826-b929-4d5c3905b9a1}")
@Guid("8742624ea8824826b9294d5c3905b9a1")
@WinRTInterface("8742624ea8824826b9294d5c3905b9a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflow2.ByReference::class)
public interface IRichTextBlockOverflow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxLines(): Int

  @InterfaceMethod(1)
  public fun put_MaxLines(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflow2> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflow2(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflow2 {
    public val __855259656_Ptr: Pointer?

    public val _855259656_VtblPtr: Pointer?
      get() = __855259656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxLines(): Int {
      val fnPtr = _855259656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__855259656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _855259656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__855259656_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlockOverflow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855259656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8742624ea8824826b9294d5c3905b9a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflow2(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflow2 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflow2(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855259656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflow2): Array<IRichTextBlockOverflow2?>
        = (elements as
        Array<IRichTextBlockOverflow2?>).castToImpl<IRichTextBlockOverflow2,IRichTextBlockOverflow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflow2?> =
        arrayOfNulls<IRichTextBlockOverflow2_Impl>(size) as Array<IRichTextBlockOverflow2?>
  }
}
