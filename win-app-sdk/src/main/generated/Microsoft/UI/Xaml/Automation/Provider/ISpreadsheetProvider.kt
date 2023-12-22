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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpreadsheetProvider.ABI::class)
@Signature("{1ff41bac-d9e3-5e48-b5f8-9eab0fb2d9d8}")
@Guid("1ff41bacd9e35e48b5f89eab0fb2d9d8")
@WinRTInterface("1ff41bacd9e35e48b5f89eab0fb2d9d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpreadsheetProvider.ByReference::class)
public interface ISpreadsheetProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetItemByName(name: String?): IRawElementProviderSimple?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpreadsheetProvider> {
    public override fun getValue() = ABI.makeISpreadsheetProvider(pointer.getPointer(0))

    public fun setValue(value: ISpreadsheetProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpreadsheetProvider {
    public val __322826704_Ptr: Pointer?

    public val _322826704_VtblPtr: Pointer?
      get() = __322826704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemByName(name: String?): IRawElementProviderSimple? {
      val fnPtr = _322826704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__322826704_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }
  }

  public class ISpreadsheetProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __322826704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpreadsheetProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ff41bacd9e35e48b5f89eab0fb2d9d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpreadsheetProvider(ptr: Pointer?): WithDefault = ISpreadsheetProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpreadsheetProvider {
      val address = segment.toRawLongValue()
      return makeISpreadsheetProvider(Pointer(address))
    }

    public override fun toNative(obj: ISpreadsheetProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__322826704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpreadsheetProvider): Array<ISpreadsheetProvider?> =
        (elements as
        Array<ISpreadsheetProvider?>).castToImpl<ISpreadsheetProvider,ISpreadsheetProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpreadsheetProvider?> =
        arrayOfNulls<ISpreadsheetProvider_Impl>(size) as Array<ISpreadsheetProvider?>
  }
}
