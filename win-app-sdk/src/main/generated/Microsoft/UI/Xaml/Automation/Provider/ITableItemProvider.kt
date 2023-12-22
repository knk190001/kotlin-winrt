package Microsoft.UI.Xaml.Automation.Provider

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

@ABIMarker(ITableItemProvider.ABI::class)
@Signature("{6ce6f038-54d4-5553-a4ad-03cbcf358197}")
@Guid("6ce6f03854d45553a4ad03cbcf358197")
@WinRTInterface("6ce6f03854d45553a4ad03cbcf358197")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITableItemProvider.ByReference::class)
public interface ITableItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetColumnHeaderItems(): Array<IRawElementProviderSimple?>?

  @InterfaceMethod(1)
  public fun GetRowHeaderItems(): Array<IRawElementProviderSimple?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITableItemProvider> {
    public override fun getValue() = ABI.makeITableItemProvider(pointer.getPointer(0))

    public fun setValue(value: ITableItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITableItemProvider {
    public val __1209285157_Ptr: Pointer?

    public val _1209285157_VtblPtr: Pointer?
      get() = __1209285157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetColumnHeaderItems(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1209285157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1209285157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetRowHeaderItems(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1209285157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1209285157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ITableItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209285157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITableItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ce6f03854d45553a4ad03cbcf358197")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITableItemProvider(ptr: Pointer?): WithDefault = ITableItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITableItemProvider {
      val address = segment.toRawLongValue()
      return makeITableItemProvider(Pointer(address))
    }

    public override fun toNative(obj: ITableItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209285157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITableItemProvider): Array<ITableItemProvider?> =
        (elements as
        Array<ITableItemProvider?>).castToImpl<ITableItemProvider,ITableItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITableItemProvider?> =
        arrayOfNulls<ITableItemProvider_Impl>(size) as Array<ITableItemProvider?>
  }
}
