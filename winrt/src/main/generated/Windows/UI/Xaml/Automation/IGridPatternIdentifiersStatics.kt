package Windows.UI.Xaml.Automation

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

@ABIMarker(IGridPatternIdentifiersStatics.ABI::class)
@Signature("{7bc452f3-a181-4137-8de9-1f9b1a8320ed}")
@Guid("7bc452f3a18141378de91f9b1a8320ed")
@WinRTInterface("7bc452f3a18141378de91f9b1a8320ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridPatternIdentifiersStatics.ByReference::class)
public interface IGridPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColumnCountProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_RowCountProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridPatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIGridPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IGridPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridPatternIdentifiersStatics {
    public val __1787575498_Ptr: Pointer?

    public val _1787575498_VtblPtr: Pointer?
      get() = __1787575498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColumnCountProperty(): AutomationProperty? {
      val fnPtr = _1787575498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1787575498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RowCountProperty(): AutomationProperty? {
      val fnPtr = _1787575498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1787575498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGridPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1787575498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bc452f3a18141378de91f9b1a8320ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IGridPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIGridPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IGridPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1787575498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridPatternIdentifiersStatics):
        Array<IGridPatternIdentifiersStatics?> = (elements as
        Array<IGridPatternIdentifiersStatics?>).castToImpl<IGridPatternIdentifiersStatics,IGridPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridPatternIdentifiersStatics?> =
        arrayOfNulls<IGridPatternIdentifiersStatics_Impl>(size) as
        Array<IGridPatternIdentifiersStatics?>
  }
}
