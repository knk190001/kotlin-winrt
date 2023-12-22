package Windows.UI.Text.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextCompositionSegment.ABI::class)
@Signature("{776c6bd9-4ead-4da7-8f47-3a88b523cc34}")
@Guid("776c6bd94ead4da78f473a88b523cc34")
@WinRTInterface("776c6bd94ead4da78f473a88b523cc34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextCompositionSegment.ByReference::class)
public interface ICoreTextCompositionSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreconversionString(): String?

  @InterfaceMethod(1)
  public fun get_Range(): CoreTextRange?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextCompositionSegment> {
    public override fun getValue() = ABI.makeICoreTextCompositionSegment(pointer.getPointer(0))

    public fun setValue(value: ICoreTextCompositionSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextCompositionSegment {
    public val __1149606573_Ptr: Pointer?

    public val _1149606573_VtblPtr: Pointer?
      get() = __1149606573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreconversionString(): String? {
      val fnPtr = _1149606573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1149606573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Range(): CoreTextRange? {
      val fnPtr = _1149606573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__1149606573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextCompositionSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149606573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextCompositionSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("776c6bd94ead4da78f473a88b523cc34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextCompositionSegment(ptr: Pointer?): WithDefault =
        ICoreTextCompositionSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextCompositionSegment {
      val address = segment.toRawLongValue()
      return makeICoreTextCompositionSegment(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextCompositionSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149606573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextCompositionSegment):
        Array<ICoreTextCompositionSegment?> = (elements as
        Array<ICoreTextCompositionSegment?>).castToImpl<ICoreTextCompositionSegment,ICoreTextCompositionSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextCompositionSegment?> =
        arrayOfNulls<ICoreTextCompositionSegment_Impl>(size) as Array<ICoreTextCompositionSegment?>
  }
}
