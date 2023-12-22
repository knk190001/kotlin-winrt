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

@ABIMarker(IHandwritingViewStatics2.ABI::class)
@Signature("{2cd052e4-d703-5183-a1be-7e285df978d9}")
@Guid("2cd052e4d7035183a1be7e285df978d9")
@WinRTInterface("2cd052e4d7035183a1be7e285df978d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingViewStatics2.ByReference::class)
public interface IHandwritingViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSwitchToKeyboardEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsCommandBarOpenProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingViewStatics2> {
    public override fun getValue() = ABI.makeIHandwritingViewStatics2(pointer.getPointer(0))

    public fun setValue(value: IHandwritingViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingViewStatics2 {
    public val __1991048547_Ptr: Pointer?

    public val _1991048547_VtblPtr: Pointer?
      get() = __1991048547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSwitchToKeyboardEnabledProperty(): DependencyProperty? {
      val fnPtr = _1991048547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1991048547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsCommandBarOpenProperty(): DependencyProperty? {
      val fnPtr = _1991048547_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1991048547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHandwritingViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1991048547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cd052e4d7035183a1be7e285df978d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingViewStatics2(ptr: Pointer?): WithDefault =
        IHandwritingViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingViewStatics2 {
      val address = segment.toRawLongValue()
      return makeIHandwritingViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1991048547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingViewStatics2):
        Array<IHandwritingViewStatics2?> = (elements as
        Array<IHandwritingViewStatics2?>).castToImpl<IHandwritingViewStatics2,IHandwritingViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingViewStatics2?> =
        arrayOfNulls<IHandwritingViewStatics2_Impl>(size) as Array<IHandwritingViewStatics2?>
  }
}
