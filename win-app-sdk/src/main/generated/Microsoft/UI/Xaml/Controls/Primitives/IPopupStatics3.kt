package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IPopupStatics3.ABI::class)
@Signature("{2409656d-84f9-5979-8adf-f3db71530b22}")
@Guid("2409656d84f959798adff3db71530b22")
@WinRTInterface("2409656d84f959798adff3db71530b22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupStatics3.ByReference::class)
public interface IPopupStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdropProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopupStatics3>
      {
    public override fun getValue() = ABI.makeIPopupStatics3(pointer.getPointer(0))

    public fun setValue(value: IPopupStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupStatics3 {
    public val __1663892777_Ptr: Pointer?

    public val _1663892777_VtblPtr: Pointer?
      get() = __1663892777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdropProperty(): DependencyProperty? {
      val fnPtr = _1663892777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1663892777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopupStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1663892777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2409656d84f959798adff3db71530b22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupStatics3(ptr: Pointer?): WithDefault = IPopupStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupStatics3 {
      val address = segment.toRawLongValue()
      return makeIPopupStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPopupStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1663892777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupStatics3): Array<IPopupStatics3?> = (elements as
        Array<IPopupStatics3?>).castToImpl<IPopupStatics3,IPopupStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupStatics3?> =
        arrayOfNulls<IPopupStatics3_Impl>(size) as Array<IPopupStatics3?>
  }
}
