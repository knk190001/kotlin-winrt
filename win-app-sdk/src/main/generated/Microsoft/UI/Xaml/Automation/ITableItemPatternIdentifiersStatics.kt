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

@ABIMarker(ITableItemPatternIdentifiersStatics.ABI::class)
@Signature("{81d24bd7-66fb-53ef-9b32-d00f9c240a14}")
@Guid("81d24bd766fb53ef9b32d00f9c240a14")
@WinRTInterface("81d24bd766fb53ef9b32d00f9c240a14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITableItemPatternIdentifiersStatics.ByReference::class)
public interface ITableItemPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColumnHeaderItemsProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_RowHeaderItemsProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITableItemPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeITableItemPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ITableItemPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITableItemPatternIdentifiersStatics {
    public val __788866256_Ptr: Pointer?

    public val _788866256_VtblPtr: Pointer?
      get() = __788866256_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColumnHeaderItemsProperty(): AutomationProperty? {
      val fnPtr = _788866256_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__788866256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RowHeaderItemsProperty(): AutomationProperty? {
      val fnPtr = _788866256_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__788866256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITableItemPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788866256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITableItemPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81d24bd766fb53ef9b32d00f9c240a14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITableItemPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ITableItemPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITableItemPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeITableItemPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ITableItemPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788866256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITableItemPatternIdentifiersStatics):
        Array<ITableItemPatternIdentifiersStatics?> = (elements as
        Array<ITableItemPatternIdentifiersStatics?>).castToImpl<ITableItemPatternIdentifiersStatics,ITableItemPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITableItemPatternIdentifiersStatics?> =
        arrayOfNulls<ITableItemPatternIdentifiersStatics_Impl>(size) as
        Array<ITableItemPatternIdentifiersStatics?>
  }
}
