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

@ABIMarker(IFrameStatics5.ABI::class)
@Signature("{53c89b25-f0e0-58f1-a06d-441075914ff8}")
@Guid("53c89b25f0e058f1a06d441075914ff8")
@WinRTInterface("53c89b25f0e058f1a06d441075914ff8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameStatics5.ByReference::class)
public interface IFrameStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsNavigationStackEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrameStatics5>
      {
    public override fun getValue() = ABI.makeIFrameStatics5(pointer.getPointer(0))

    public fun setValue(value: IFrameStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameStatics5 {
    public val __2002486527_Ptr: Pointer?

    public val _2002486527_VtblPtr: Pointer?
      get() = __2002486527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsNavigationStackEnabledProperty(): DependencyProperty? {
      val fnPtr = _2002486527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2002486527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2002486527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53c89b25f0e058f1a06d441075914ff8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameStatics5(ptr: Pointer?): WithDefault = IFrameStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameStatics5 {
      val address = segment.toRawLongValue()
      return makeIFrameStatics5(Pointer(address))
    }

    public override fun toNative(obj: IFrameStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2002486527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameStatics5): Array<IFrameStatics5?> = (elements as
        Array<IFrameStatics5?>).castToImpl<IFrameStatics5,IFrameStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameStatics5?> =
        arrayOfNulls<IFrameStatics5_Impl>(size) as Array<IFrameStatics5?>
  }
}
