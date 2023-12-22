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

@ABIMarker(IPivotItemFactory.ABI::class)
@Signature("{9149a2ab-606c-55a9-8786-801d55ca8ed6}")
@Guid("9149a2ab606c55a98786801d55ca8ed6")
@WinRTInterface("9149a2ab606c55a98786801d55ca8ed6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemFactory.ByReference::class)
public interface IPivotItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PivotItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemFactory> {
    public override fun getValue() = ABI.makeIPivotItemFactory(pointer.getPointer(0))

    public fun setValue(value: IPivotItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemFactory {
    public val __185294692_Ptr: Pointer?

    public val _185294692_VtblPtr: Pointer?
      get() = __185294692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PivotItem? {
      val fnPtr = _185294692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotItem>()
      val hr = fn.invokeHR(arrayOf(__185294692_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotItem>(result.getValue())
      return resultValue
    }
  }

  public class IPivotItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __185294692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9149a2ab606c55a98786801d55ca8ed6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemFactory(ptr: Pointer?): WithDefault = IPivotItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemFactory {
      val address = segment.toRawLongValue()
      return makeIPivotItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__185294692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemFactory): Array<IPivotItemFactory?> = (elements
        as Array<IPivotItemFactory?>).castToImpl<IPivotItemFactory,IPivotItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemFactory?> =
        arrayOfNulls<IPivotItemFactory_Impl>(size) as Array<IPivotItemFactory?>
  }
}
