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

@ABIMarker(IFrameStatics2.ABI::class)
@Signature("{e4b5cdfe-42f0-4462-a1c1-5d259dd82a03}")
@Guid("e4b5cdfe42f04462a1c15d259dd82a03")
@WinRTInterface("e4b5cdfe42f04462a1c15d259dd82a03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameStatics2.ByReference::class)
public interface IFrameStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackStackProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ForwardStackProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrameStatics2>
      {
    public override fun getValue() = ABI.makeIFrameStatics2(pointer.getPointer(0))

    public fun setValue(value: IFrameStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameStatics2 {
    public val __2002486530_Ptr: Pointer?

    public val _2002486530_VtblPtr: Pointer?
      get() = __2002486530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackStackProperty(): DependencyProperty? {
      val fnPtr = _2002486530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2002486530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ForwardStackProperty(): DependencyProperty? {
      val fnPtr = _2002486530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2002486530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2002486530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4b5cdfe42f04462a1c15d259dd82a03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameStatics2(ptr: Pointer?): WithDefault = IFrameStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameStatics2 {
      val address = segment.toRawLongValue()
      return makeIFrameStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFrameStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2002486530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameStatics2): Array<IFrameStatics2?> = (elements as
        Array<IFrameStatics2?>).castToImpl<IFrameStatics2,IFrameStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameStatics2?> =
        arrayOfNulls<IFrameStatics2_Impl>(size) as Array<IFrameStatics2?>
  }
}
