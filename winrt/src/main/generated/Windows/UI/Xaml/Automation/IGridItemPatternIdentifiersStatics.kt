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

@ABIMarker(IGridItemPatternIdentifiersStatics.ABI::class)
@Signature("{217d2402-5e46-4d61-8794-b8ee8e774714}")
@Guid("217d24025e464d618794b8ee8e774714")
@WinRTInterface("217d24025e464d618794b8ee8e774714")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridItemPatternIdentifiersStatics.ByReference::class)
public interface IGridItemPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColumnProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_ColumnSpanProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_ContainingGridProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_RowProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_RowSpanProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridItemPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIGridItemPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IGridItemPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridItemPatternIdentifiersStatics {
    public val __1108818569_Ptr: Pointer?

    public val _1108818569_VtblPtr: Pointer?
      get() = __1108818569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColumnProperty(): AutomationProperty? {
      val fnPtr = _1108818569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1108818569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ColumnSpanProperty(): AutomationProperty? {
      val fnPtr = _1108818569_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1108818569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContainingGridProperty(): AutomationProperty? {
      val fnPtr = _1108818569_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1108818569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RowProperty(): AutomationProperty? {
      val fnPtr = _1108818569_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1108818569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RowSpanProperty(): AutomationProperty? {
      val fnPtr = _1108818569_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1108818569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGridItemPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1108818569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridItemPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217d24025e464d618794b8ee8e774714")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridItemPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IGridItemPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridItemPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIGridItemPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IGridItemPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1108818569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridItemPatternIdentifiersStatics):
        Array<IGridItemPatternIdentifiersStatics?> = (elements as
        Array<IGridItemPatternIdentifiersStatics?>).castToImpl<IGridItemPatternIdentifiersStatics,IGridItemPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridItemPatternIdentifiersStatics?> =
        arrayOfNulls<IGridItemPatternIdentifiersStatics_Impl>(size) as
        Array<IGridItemPatternIdentifiersStatics?>
  }
}
