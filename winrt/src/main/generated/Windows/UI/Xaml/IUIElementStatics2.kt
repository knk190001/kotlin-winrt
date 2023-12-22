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

@ABIMarker(IUIElementStatics2.ABI::class)
@Signature("{58d3574b-f53c-45be-989b-a5869564874c}")
@Guid("58d3574bf53c45be989ba5869564874c")
@WinRTInterface("58d3574bf53c45be989ba5869564874c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics2.ByReference::class)
public interface IUIElementStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositeModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics2> {
    public override fun getValue() = ABI.makeIUIElementStatics2(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics2 {
    public val __1915643133_Ptr: Pointer?

    public val _1915643133_VtblPtr: Pointer?
      get() = __1915643133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositeModeProperty(): DependencyProperty? {
      val fnPtr = _1915643133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58d3574bf53c45be989ba5869564874c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics2(ptr: Pointer?): WithDefault = IUIElementStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics2 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics2(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics2): Array<IUIElementStatics2?> =
        (elements as
        Array<IUIElementStatics2?>).castToImpl<IUIElementStatics2,IUIElementStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics2?> =
        arrayOfNulls<IUIElementStatics2_Impl>(size) as Array<IUIElementStatics2?>
  }
}
