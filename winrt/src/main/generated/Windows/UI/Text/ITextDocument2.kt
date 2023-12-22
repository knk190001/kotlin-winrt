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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextDocument2.ABI::class)
@Signature("{f2311112-8c89-49c9-9118-f057cbb814ee}")
@Guid("f23111128c8949c99118f057cbb814ee")
@WinRTInterface("f23111128c8949c99118f057cbb814ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextDocument2.ByReference::class)
public interface ITextDocument2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlignmentIncludesTrailingWhitespace(): Boolean

  @InterfaceMethod(1)
  public fun put_AlignmentIncludesTrailingWhitespace(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IgnoreTrailingCharacterSpacing(): Boolean

  @InterfaceMethod(3)
  public fun put_IgnoreTrailingCharacterSpacing(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextDocument2>
      {
    public override fun getValue() = ABI.makeITextDocument2(pointer.getPointer(0))

    public fun setValue(value: ITextDocument2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextDocument2 {
    public val __145749795_Ptr: Pointer?

    public val _145749795_VtblPtr: Pointer?
      get() = __145749795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlignmentIncludesTrailingWhitespace(): Boolean {
      val fnPtr = _145749795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__145749795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AlignmentIncludesTrailingWhitespace(value: Boolean): Unit {
      val fnPtr = _145749795_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145749795_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IgnoreTrailingCharacterSpacing(): Boolean {
      val fnPtr = _145749795_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__145749795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IgnoreTrailingCharacterSpacing(value: Boolean): Unit {
      val fnPtr = _145749795_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145749795_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextDocument2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145749795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextDocument2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f23111128c8949c99118f057cbb814ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextDocument2(ptr: Pointer?): WithDefault = ITextDocument2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextDocument2 {
      val address = segment.toRawLongValue()
      return makeITextDocument2(Pointer(address))
    }

    public override fun toNative(obj: ITextDocument2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145749795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextDocument2): Array<ITextDocument2?> = (elements as
        Array<ITextDocument2?>).castToImpl<ITextDocument2,ITextDocument2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextDocument2?> =
        arrayOfNulls<ITextDocument2_Impl>(size) as Array<ITextDocument2?>
  }
}
