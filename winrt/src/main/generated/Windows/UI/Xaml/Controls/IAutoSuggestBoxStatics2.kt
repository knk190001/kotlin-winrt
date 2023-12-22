package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IAutoSuggestBoxStatics2.ABI::class)
@Signature("{1cd297a8-8e6a-41ef-a95d-7157dc0c7106}")
@Guid("1cd297a88e6a41efa95d7157dc0c7106")
@WinRTInterface("1cd297a88e6a41efa95d7157dc0c7106")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxStatics2.ByReference::class)
public interface IAutoSuggestBoxStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryIconProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxStatics2> {
    public override fun getValue() = ABI.makeIAutoSuggestBoxStatics2(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxStatics2 {
    public val __1297762559_Ptr: Pointer?

    public val _1297762559_VtblPtr: Pointer?
      get() = __1297762559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryIconProperty(): DependencyProperty? {
      val fnPtr = _1297762559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1297762559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1297762559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cd297a88e6a41efa95d7157dc0c7106")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxStatics2(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxStatics2 {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1297762559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxStatics2): Array<IAutoSuggestBoxStatics2?>
        = (elements as
        Array<IAutoSuggestBoxStatics2?>).castToImpl<IAutoSuggestBoxStatics2,IAutoSuggestBoxStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxStatics2?> =
        arrayOfNulls<IAutoSuggestBoxStatics2_Impl>(size) as Array<IAutoSuggestBoxStatics2?>
  }
}
