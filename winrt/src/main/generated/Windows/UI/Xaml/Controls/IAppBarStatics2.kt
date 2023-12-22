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

@ABIMarker(IAppBarStatics2.ABI::class)
@Signature("{222355e9-0384-49de-8738-dfc9d409ac5d}")
@Guid("222355e9038449de8738dfc9d409ac5d")
@WinRTInterface("222355e9038449de8738dfc9d409ac5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarStatics2.ByReference::class)
public interface IAppBarStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClosedDisplayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarStatics2> {
    public override fun getValue() = ABI.makeIAppBarStatics2(pointer.getPointer(0))

    public fun setValue(value: IAppBarStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarStatics2 {
    public val __1123242107_Ptr: Pointer?

    public val _1123242107_VtblPtr: Pointer?
      get() = __1123242107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClosedDisplayModeProperty(): DependencyProperty? {
      val fnPtr = _1123242107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1123242107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123242107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("222355e9038449de8738dfc9d409ac5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarStatics2(ptr: Pointer?): WithDefault = IAppBarStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarStatics2 {
      val address = segment.toRawLongValue()
      return makeIAppBarStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAppBarStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123242107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarStatics2): Array<IAppBarStatics2?> = (elements as
        Array<IAppBarStatics2?>).castToImpl<IAppBarStatics2,IAppBarStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarStatics2?> =
        arrayOfNulls<IAppBarStatics2_Impl>(size) as Array<IAppBarStatics2?>
  }
}
