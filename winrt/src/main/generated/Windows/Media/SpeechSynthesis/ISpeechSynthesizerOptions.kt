package Windows.Media.SpeechSynthesis

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

@ABIMarker(ISpeechSynthesizerOptions.ABI::class)
@Signature("{a0e23871-cc3d-43c9-91b1-ee185324d83d}")
@Guid("a0e23871cc3d43c991b1ee185324d83d")
@WinRTInterface("a0e23871cc3d43c991b1ee185324d83d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechSynthesizerOptions.ByReference::class)
public interface ISpeechSynthesizerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IncludeWordBoundaryMetadata(): Boolean

  @InterfaceMethod(1)
  public fun put_IncludeWordBoundaryMetadata(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IncludeSentenceBoundaryMetadata(): Boolean

  @InterfaceMethod(3)
  public fun put_IncludeSentenceBoundaryMetadata(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechSynthesizerOptions> {
    public override fun getValue() = ABI.makeISpeechSynthesizerOptions(pointer.getPointer(0))

    public fun setValue(value: ISpeechSynthesizerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechSynthesizerOptions {
    public val __828443460_Ptr: Pointer?

    public val _828443460_VtblPtr: Pointer?
      get() = __828443460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IncludeWordBoundaryMetadata(): Boolean {
      val fnPtr = _828443460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__828443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IncludeWordBoundaryMetadata(value: Boolean): Unit {
      val fnPtr = _828443460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__828443460_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IncludeSentenceBoundaryMetadata(): Boolean {
      val fnPtr = _828443460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__828443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IncludeSentenceBoundaryMetadata(value: Boolean): Unit {
      val fnPtr = _828443460_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__828443460_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechSynthesizerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __828443460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechSynthesizerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0e23871cc3d43c991b1ee185324d83d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechSynthesizerOptions(ptr: Pointer?): WithDefault =
        ISpeechSynthesizerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechSynthesizerOptions {
      val address = segment.toRawLongValue()
      return makeISpeechSynthesizerOptions(Pointer(address))
    }

    public override fun toNative(obj: ISpeechSynthesizerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__828443460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechSynthesizerOptions):
        Array<ISpeechSynthesizerOptions?> = (elements as
        Array<ISpeechSynthesizerOptions?>).castToImpl<ISpeechSynthesizerOptions,ISpeechSynthesizerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechSynthesizerOptions?> =
        arrayOfNulls<ISpeechSynthesizerOptions_Impl>(size) as Array<ISpeechSynthesizerOptions?>
  }
}
