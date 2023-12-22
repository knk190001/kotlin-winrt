package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IComboBoxFactory.ABI::class)
@Signature("{71c1014b-acdf-5c03-b5ed-02871caaeb6b}")
@Guid("71c1014bacdf5c03b5ed02871caaeb6b")
@WinRTInterface("71c1014bacdf5c03b5ed02871caaeb6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxFactory.ByReference::class)
public interface IComboBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ComboBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxFactory> {
    public override fun getValue() = ABI.makeIComboBoxFactory(pointer.getPointer(0))

    public fun setValue(value: IComboBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxFactory {
    public val __1892859834_Ptr: Pointer?

    public val _1892859834_VtblPtr: Pointer?
      get() = __1892859834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ComboBox? {
      val fnPtr = _1892859834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBox>()
      val hr = fn.invokeHR(arrayOf(__1892859834_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBox>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1892859834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71c1014bacdf5c03b5ed02871caaeb6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxFactory(ptr: Pointer?): WithDefault = IComboBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxFactory {
      val address = segment.toRawLongValue()
      return makeIComboBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1892859834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxFactory): Array<IComboBoxFactory?> = (elements as
        Array<IComboBoxFactory?>).castToImpl<IComboBoxFactory,IComboBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxFactory?> =
        arrayOfNulls<IComboBoxFactory_Impl>(size) as Array<IComboBoxFactory?>
  }
}
