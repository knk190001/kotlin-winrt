package Microsoft.UI.Xaml.Automation

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

@ABIMarker(ISpreadsheetItemPatternIdentifiersStatics.ABI::class)
@Signature("{7eb10f80-8d3a-59ad-a2b9-05d8cecf18db}")
@Guid("7eb10f808d3a59ada2b905d8cecf18db")
@WinRTInterface("7eb10f808d3a59ada2b905d8cecf18db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpreadsheetItemPatternIdentifiersStatics.ByReference::class)
public interface ISpreadsheetItemPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FormulaProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpreadsheetItemPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeISpreadsheetItemPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ISpreadsheetItemPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpreadsheetItemPatternIdentifiersStatics {
    public val __1322842254_Ptr: Pointer?

    public val _1322842254_VtblPtr: Pointer?
      get() = __1322842254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FormulaProperty(): AutomationProperty? {
      val fnPtr = _1322842254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1322842254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISpreadsheetItemPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1322842254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpreadsheetItemPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eb10f808d3a59ada2b905d8cecf18db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpreadsheetItemPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ISpreadsheetItemPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpreadsheetItemPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeISpreadsheetItemPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpreadsheetItemPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1322842254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpreadsheetItemPatternIdentifiersStatics):
        Array<ISpreadsheetItemPatternIdentifiersStatics?> = (elements as
        Array<ISpreadsheetItemPatternIdentifiersStatics?>).castToImpl<ISpreadsheetItemPatternIdentifiersStatics,ISpreadsheetItemPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpreadsheetItemPatternIdentifiersStatics?> =
        arrayOfNulls<ISpreadsheetItemPatternIdentifiersStatics_Impl>(size) as
        Array<ISpreadsheetItemPatternIdentifiersStatics?>
  }
}
