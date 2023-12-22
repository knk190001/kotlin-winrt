package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISemanticTextQuery.ABI::class)
@Signature("{6a1cab51-1fb2-4909-80b8-35731a2b3e7f}")
@Guid("6a1cab511fb2490980b835731a2b3e7f")
@WinRTInterface("6a1cab511fb2490980b835731a2b3e7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticTextQuery.ByReference::class)
public interface ISemanticTextQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Find(content: String?): IVectorView<TextSegment?>?

  @InterfaceMethod(1)
  public fun FindInProperty(propertyContent: String?, propertyName: String?):
      IVectorView<TextSegment?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticTextQuery> {
    public override fun getValue() = ABI.makeISemanticTextQuery(pointer.getPointer(0))

    public fun setValue(value: ISemanticTextQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticTextQuery {
    public val __856362798_Ptr: Pointer?

    public val _856362798_VtblPtr: Pointer?
      get() = __856362798_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Find(content: String?): IVectorView<TextSegment?>? {
      val fnPtr = _856362798_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TextSegment?>>()
      val hr = fn.invokeHR(arrayOf(__856362798_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TextSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindInProperty(propertyContent: String?, propertyName: String?):
        IVectorView<TextSegment?>? {
      val fnPtr = _856362798_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TextSegment?>>()
      val hr = fn.invokeHR(arrayOf(__856362798_Ptr, marshalToNative(propertyContent),
          marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TextSegment?>>(result.getValue())
      return resultValue
    }
  }

  public class ISemanticTextQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856362798_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticTextQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a1cab511fb2490980b835731a2b3e7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticTextQuery(ptr: Pointer?): WithDefault = ISemanticTextQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticTextQuery {
      val address = segment.toRawLongValue()
      return makeISemanticTextQuery(Pointer(address))
    }

    public override fun toNative(obj: ISemanticTextQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856362798_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticTextQuery): Array<ISemanticTextQuery?> =
        (elements as
        Array<ISemanticTextQuery?>).castToImpl<ISemanticTextQuery,ISemanticTextQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticTextQuery?> =
        arrayOfNulls<ISemanticTextQuery_Impl>(size) as Array<ISemanticTextQuery?>
  }
}
