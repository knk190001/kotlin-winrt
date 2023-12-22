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

@ABIMarker(IFontIconStatics2.ABI::class)
@Signature("{e6080672-08f8-43d3-8790-4604290cbebd}")
@Guid("e608067208f843d387904604290cbebd")
@WinRTInterface("e608067208f843d387904604290cbebd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIconStatics2.ByReference::class)
public interface IFontIconStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontIconStatics2> {
    public override fun getValue() = ABI.makeIFontIconStatics2(pointer.getPointer(0))

    public fun setValue(value: IFontIconStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIconStatics2 {
    public val __1150228145_Ptr: Pointer?

    public val _1150228145_VtblPtr: Pointer?
      get() = __1150228145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _1150228145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1150228145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFontIconStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1150228145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIconStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e608067208f843d387904604290cbebd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIconStatics2(ptr: Pointer?): WithDefault = IFontIconStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIconStatics2 {
      val address = segment.toRawLongValue()
      return makeIFontIconStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFontIconStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1150228145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIconStatics2): Array<IFontIconStatics2?> = (elements
        as Array<IFontIconStatics2?>).castToImpl<IFontIconStatics2,IFontIconStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIconStatics2?> =
        arrayOfNulls<IFontIconStatics2_Impl>(size) as Array<IFontIconStatics2?>
  }
}
