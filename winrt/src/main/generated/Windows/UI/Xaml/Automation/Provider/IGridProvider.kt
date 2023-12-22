package Windows.UI.Xaml.Automation.Provider

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

@ABIMarker(IGridProvider.ABI::class)
@Signature("{8b62b7a0-932c-4490-9a13-02fdb39a8f5b}")
@Guid("8b62b7a0932c44909a1302fdb39a8f5b")
@WinRTInterface("8b62b7a0932c44909a1302fdb39a8f5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridProvider.ByReference::class)
public interface IGridProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColumnCount(): Int

  @InterfaceMethod(1)
  public fun get_RowCount(): Int

  @InterfaceMethod(2)
  public fun GetItem(row: Int, column: Int): IRawElementProviderSimple?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridProvider>
      {
    public override fun getValue() = ABI.makeIGridProvider(pointer.getPointer(0))

    public fun setValue(value: IGridProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridProvider {
    public val __1085635473_Ptr: Pointer?

    public val _1085635473_VtblPtr: Pointer?
      get() = __1085635473_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColumnCount(): Int {
      val fnPtr = _1085635473_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1085635473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_RowCount(): Int {
      val fnPtr = _1085635473_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1085635473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetItem(row: Int, column: Int): IRawElementProviderSimple? {
      val fnPtr = _1085635473_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1085635473_Ptr, row, column, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }
  }

  public class IGridProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1085635473_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b62b7a0932c44909a1302fdb39a8f5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridProvider(ptr: Pointer?): WithDefault = IGridProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridProvider {
      val address = segment.toRawLongValue()
      return makeIGridProvider(Pointer(address))
    }

    public override fun toNative(obj: IGridProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1085635473_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridProvider): Array<IGridProvider?> = (elements as
        Array<IGridProvider?>).castToImpl<IGridProvider,IGridProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridProvider?> =
        arrayOfNulls<IGridProvider_Impl>(size) as Array<IGridProvider?>
  }
}
