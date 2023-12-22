package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextElementStatics2.ABI::class)
@Signature("{164297b2-982b-49e1-8c03-ca43bc4d5b6d}")
@Guid("164297b2982b49e18c03ca43bc4d5b6d")
@WinRTInterface("164297b2982b49e18c03ca43bc4d5b6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElementStatics2.ByReference::class)
public interface ITextElementStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextElementStatics2> {
    public override fun getValue() = ABI.makeITextElementStatics2(pointer.getPointer(0))

    public fun setValue(value: ITextElementStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElementStatics2 {
    public val __1124852716_Ptr: Pointer?

    public val _1124852716_VtblPtr: Pointer?
      get() = __1124852716_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _1124852716_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextElementStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1124852716_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElementStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("164297b2982b49e18c03ca43bc4d5b6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElementStatics2(ptr: Pointer?): WithDefault = ITextElementStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElementStatics2 {
      val address = segment.toRawLongValue()
      return makeITextElementStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITextElementStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1124852716_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElementStatics2): Array<ITextElementStatics2?> =
        (elements as
        Array<ITextElementStatics2?>).castToImpl<ITextElementStatics2,ITextElementStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElementStatics2?> =
        arrayOfNulls<ITextElementStatics2_Impl>(size) as Array<ITextElementStatics2?>
  }
}
