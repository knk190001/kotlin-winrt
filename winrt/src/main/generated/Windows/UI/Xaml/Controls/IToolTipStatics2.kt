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

@ABIMarker(IToolTipStatics2.ABI::class)
@Signature("{6845e646-9c7f-5011-8a78-7da9d87eb3b6}")
@Guid("6845e6469c7f50118a787da9d87eb3b6")
@WinRTInterface("6845e6469c7f50118a787da9d87eb3b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipStatics2.ByReference::class)
public interface IToolTipStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementRectProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipStatics2> {
    public override fun getValue() = ABI.makeIToolTipStatics2(pointer.getPointer(0))

    public fun setValue(value: IToolTipStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipStatics2 {
    public val __1213434484_Ptr: Pointer?

    public val _1213434484_VtblPtr: Pointer?
      get() = __1213434484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementRectProperty(): DependencyProperty? {
      val fnPtr = _1213434484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1213434484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToolTipStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213434484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6845e6469c7f50118a787da9d87eb3b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipStatics2(ptr: Pointer?): WithDefault = IToolTipStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipStatics2 {
      val address = segment.toRawLongValue()
      return makeIToolTipStatics2(Pointer(address))
    }

    public override fun toNative(obj: IToolTipStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213434484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipStatics2): Array<IToolTipStatics2?> = (elements as
        Array<IToolTipStatics2?>).castToImpl<IToolTipStatics2,IToolTipStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipStatics2?> =
        arrayOfNulls<IToolTipStatics2_Impl>(size) as Array<IToolTipStatics2?>
  }
}
