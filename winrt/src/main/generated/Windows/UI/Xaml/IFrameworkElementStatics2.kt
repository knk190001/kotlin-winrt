package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementStatics2.ABI::class)
@Signature("{9695db02-c0d8-4fa2-b100-3fa2df8b9538}")
@Guid("9695db02c0d84fa2b1003fa2df8b9538")
@WinRTInterface("9695db02c0d84fa2b1003fa2df8b9538")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementStatics2.ByReference::class)
public interface IFrameworkElementStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestedThemeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementStatics2> {
    public override fun getValue() = ABI.makeIFrameworkElementStatics2(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementStatics2 {
    public val __1113717405_Ptr: Pointer?

    public val _1113717405_VtblPtr: Pointer?
      get() = __1113717405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestedThemeProperty(): DependencyProperty? {
      val fnPtr = _1113717405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113717405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9695db02c0d84fa2b1003fa2df8b9538")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementStatics2(ptr: Pointer?): WithDefault =
        IFrameworkElementStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementStatics2 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113717405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementStatics2):
        Array<IFrameworkElementStatics2?> = (elements as
        Array<IFrameworkElementStatics2?>).castToImpl<IFrameworkElementStatics2,IFrameworkElementStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementStatics2?> =
        arrayOfNulls<IFrameworkElementStatics2_Impl>(size) as Array<IFrameworkElementStatics2?>
  }
}
