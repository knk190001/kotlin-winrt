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

@ABIMarker(ITablePatternIdentifiersStatics.ABI::class)
@Signature("{3660935e-bcbb-5848-8e9a-264854f7a19a}")
@Guid("3660935ebcbb58488e9a264854f7a19a")
@WinRTInterface("3660935ebcbb58488e9a264854f7a19a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITablePatternIdentifiersStatics.ByReference::class)
public interface ITablePatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColumnHeadersProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_RowHeadersProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_RowOrColumnMajorProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITablePatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeITablePatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ITablePatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITablePatternIdentifiersStatics {
    public val __670570243_Ptr: Pointer?

    public val _670570243_VtblPtr: Pointer?
      get() = __670570243_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColumnHeadersProperty(): AutomationProperty? {
      val fnPtr = _670570243_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__670570243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RowHeadersProperty(): AutomationProperty? {
      val fnPtr = _670570243_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__670570243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RowOrColumnMajorProperty(): AutomationProperty? {
      val fnPtr = _670570243_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__670570243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITablePatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __670570243_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITablePatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3660935ebcbb58488e9a264854f7a19a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITablePatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ITablePatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITablePatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeITablePatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ITablePatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__670570243_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITablePatternIdentifiersStatics):
        Array<ITablePatternIdentifiersStatics?> = (elements as
        Array<ITablePatternIdentifiersStatics?>).castToImpl<ITablePatternIdentifiersStatics,ITablePatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITablePatternIdentifiersStatics?> =
        arrayOfNulls<ITablePatternIdentifiersStatics_Impl>(size) as
        Array<ITablePatternIdentifiersStatics?>
  }
}
