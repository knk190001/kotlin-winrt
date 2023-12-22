package Windows.UI.Input.Inking.Analysis

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

@ABIMarker(IInkAnalyzerFactory.ABI::class)
@Signature("{29138686-1963-49d8-9589-e14384c769e3}")
@Guid("29138686196349d89589e14384c769e3")
@WinRTInterface("29138686196349d89589e14384c769e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalyzerFactory.ByReference::class)
public interface IInkAnalyzerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAnalyzer(): InkAnalyzer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalyzerFactory> {
    public override fun getValue() = ABI.makeIInkAnalyzerFactory(pointer.getPointer(0))

    public fun setValue(value: IInkAnalyzerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalyzerFactory {
    public val __108091476_Ptr: Pointer?

    public val _108091476_VtblPtr: Pointer?
      get() = __108091476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAnalyzer(): InkAnalyzer? {
      val fnPtr = _108091476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkAnalyzer>()
      val hr = fn.invokeHR(arrayOf(__108091476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkAnalyzer>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalyzerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108091476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalyzerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29138686196349d89589e14384c769e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalyzerFactory(ptr: Pointer?): WithDefault = IInkAnalyzerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalyzerFactory {
      val address = segment.toRawLongValue()
      return makeIInkAnalyzerFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalyzerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108091476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalyzerFactory): Array<IInkAnalyzerFactory?> =
        (elements as
        Array<IInkAnalyzerFactory?>).castToImpl<IInkAnalyzerFactory,IInkAnalyzerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalyzerFactory?> =
        arrayOfNulls<IInkAnalyzerFactory_Impl>(size) as Array<IInkAnalyzerFactory?>
  }
}
