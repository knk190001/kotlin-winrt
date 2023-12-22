package Windows.Data.Text

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

@ABIMarker(ISemanticTextQueryFactory.ABI::class)
@Signature("{238c0503-f995-4587-8777-a2b7d80acfef}")
@Guid("238c0503f99545878777a2b7d80acfef")
@WinRTInterface("238c0503f99545878777a2b7d80acfef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticTextQueryFactory.ByReference::class)
public interface ISemanticTextQueryFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(aqsFilter: String?): SemanticTextQuery?

  @InterfaceMethod(1)
  public fun CreateWithLanguage(aqsFilter: String?, filterLanguage: String?): SemanticTextQuery?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticTextQueryFactory> {
    public override fun getValue() = ABI.makeISemanticTextQueryFactory(pointer.getPointer(0))

    public fun setValue(value: ISemanticTextQueryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticTextQueryFactory {
    public val __344479784_Ptr: Pointer?

    public val _344479784_VtblPtr: Pointer?
      get() = __344479784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(aqsFilter: String?): SemanticTextQuery? {
      val fnPtr = _344479784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticTextQuery>()
      val hr = fn.invokeHR(arrayOf(__344479784_Ptr, marshalToNative(aqsFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticTextQuery>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithLanguage(aqsFilter: String?, filterLanguage: String?):
        SemanticTextQuery? {
      val fnPtr = _344479784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticTextQuery>()
      val hr = fn.invokeHR(arrayOf(__344479784_Ptr, marshalToNative(aqsFilter),
          marshalToNative(filterLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticTextQuery>(result.getValue())
      return resultValue
    }
  }

  public class ISemanticTextQueryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __344479784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticTextQueryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("238c0503f99545878777a2b7d80acfef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticTextQueryFactory(ptr: Pointer?): WithDefault =
        ISemanticTextQueryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticTextQueryFactory {
      val address = segment.toRawLongValue()
      return makeISemanticTextQueryFactory(Pointer(address))
    }

    public override fun toNative(obj: ISemanticTextQueryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__344479784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticTextQueryFactory):
        Array<ISemanticTextQueryFactory?> = (elements as
        Array<ISemanticTextQueryFactory?>).castToImpl<ISemanticTextQueryFactory,ISemanticTextQueryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticTextQueryFactory?> =
        arrayOfNulls<ISemanticTextQueryFactory_Impl>(size) as Array<ISemanticTextQueryFactory?>
  }
}
