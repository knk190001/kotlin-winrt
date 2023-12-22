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

@ABIMarker(IAppBarStatics4.ABI::class)
@Signature("{ba02082e-1165-4451-94b3-eb3ac73e4196}")
@Guid("ba02082e1165445194b3eb3ac73e4196")
@WinRTInterface("ba02082e1165445194b3eb3ac73e4196")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarStatics4.ByReference::class)
public interface IAppBarStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarStatics4> {
    public override fun getValue() = ABI.makeIAppBarStatics4(pointer.getPointer(0))

    public fun setValue(value: IAppBarStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarStatics4 {
    public val __1123242109_Ptr: Pointer?

    public val _1123242109_VtblPtr: Pointer?
      get() = __1123242109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1123242109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1123242109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123242109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba02082e1165445194b3eb3ac73e4196")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarStatics4(ptr: Pointer?): WithDefault = IAppBarStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarStatics4 {
      val address = segment.toRawLongValue()
      return makeIAppBarStatics4(Pointer(address))
    }

    public override fun toNative(obj: IAppBarStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123242109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarStatics4): Array<IAppBarStatics4?> = (elements as
        Array<IAppBarStatics4?>).castToImpl<IAppBarStatics4,IAppBarStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarStatics4?> =
        arrayOfNulls<IAppBarStatics4_Impl>(size) as Array<IAppBarStatics4?>
  }
}
