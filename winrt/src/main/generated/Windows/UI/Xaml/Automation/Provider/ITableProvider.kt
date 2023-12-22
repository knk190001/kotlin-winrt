package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.RowOrColumnMajor
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

@ABIMarker(ITableProvider.ABI::class)
@Signature("{7a8ed399-6824-4595-bab3-464bc9a04417}")
@Guid("7a8ed39968244595bab3464bc9a04417")
@WinRTInterface("7a8ed39968244595bab3464bc9a04417")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITableProvider.ByReference::class)
public interface ITableProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RowOrColumnMajor(): RowOrColumnMajor?

  @InterfaceMethod(1)
  public fun GetColumnHeaders(): Array<IRawElementProviderSimple?>?

  @InterfaceMethod(2)
  public fun GetRowHeaders(): Array<IRawElementProviderSimple?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITableProvider>
      {
    public override fun getValue() = ABI.makeITableProvider(pointer.getPointer(0))

    public fun setValue(value: ITableProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITableProvider {
    public val __1159423431_Ptr: Pointer?

    public val _1159423431_VtblPtr: Pointer?
      get() = __1159423431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RowOrColumnMajor(): RowOrColumnMajor? {
      val fnPtr = _1159423431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RowOrColumnMajor>()
      val hr = fn.invokeHR(arrayOf(__1159423431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RowOrColumnMajor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetColumnHeaders(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1159423431_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1159423431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRowHeaders(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1159423431_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1159423431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ITableProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159423431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITableProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a8ed39968244595bab3464bc9a04417")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITableProvider(ptr: Pointer?): WithDefault = ITableProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITableProvider {
      val address = segment.toRawLongValue()
      return makeITableProvider(Pointer(address))
    }

    public override fun toNative(obj: ITableProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159423431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITableProvider): Array<ITableProvider?> = (elements as
        Array<ITableProvider?>).castToImpl<ITableProvider,ITableProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITableProvider?> =
        arrayOfNulls<ITableProvider_Impl>(size) as Array<ITableProvider?>
  }
}
