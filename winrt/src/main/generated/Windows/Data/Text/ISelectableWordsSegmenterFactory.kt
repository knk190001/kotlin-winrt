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

@ABIMarker(ISelectableWordsSegmenterFactory.ABI::class)
@Signature("{8c7a7648-6057-4339-bc70-f210010a4150}")
@Guid("8c7a764860574339bc70f210010a4150")
@WinRTInterface("8c7a764860574339bc70f210010a4150")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectableWordsSegmenterFactory.ByReference::class)
public interface ISelectableWordsSegmenterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithLanguage(language: String?): SelectableWordsSegmenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectableWordsSegmenterFactory> {
    public override fun getValue() = ABI.makeISelectableWordsSegmenterFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectableWordsSegmenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectableWordsSegmenterFactory {
    public val __551780998_Ptr: Pointer?

    public val _551780998_VtblPtr: Pointer?
      get() = __551780998_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithLanguage(language: String?): SelectableWordsSegmenter? {
      val fnPtr = _551780998_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectableWordsSegmenter>()
      val hr = fn.invokeHR(arrayOf(__551780998_Ptr, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectableWordsSegmenter>(result.getValue())
      return resultValue
    }
  }

  public class ISelectableWordsSegmenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __551780998_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectableWordsSegmenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c7a764860574339bc70f210010a4150")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectableWordsSegmenterFactory(ptr: Pointer?): WithDefault =
        ISelectableWordsSegmenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectableWordsSegmenterFactory {
      val address = segment.toRawLongValue()
      return makeISelectableWordsSegmenterFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectableWordsSegmenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__551780998_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordsSegmenterFactory):
        Array<ISelectableWordsSegmenterFactory?> = (elements as
        Array<ISelectableWordsSegmenterFactory?>).castToImpl<ISelectableWordsSegmenterFactory,ISelectableWordsSegmenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordsSegmenterFactory?> =
        arrayOfNulls<ISelectableWordsSegmenterFactory_Impl>(size) as
        Array<ISelectableWordsSegmenterFactory?>
  }
}
