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

@ABIMarker(IContentPresenterStatics2.ABI::class)
@Signature("{c7d89dd9-06e6-46be-a8a0-9c117d3024a3}")
@Guid("c7d89dd906e646bea8a09c117d3024a3")
@WinRTInterface("c7d89dd906e646bea8a09c117d3024a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenterStatics2.ByReference::class)
public interface IContentPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpticalMarginAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextLineBoundsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenterStatics2> {
    public override fun getValue() = ABI.makeIContentPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IContentPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenterStatics2 {
    public val __1262726264_Ptr: Pointer?

    public val _1262726264_VtblPtr: Pointer?
      get() = __1262726264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpticalMarginAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1262726264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1262726264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextLineBoundsProperty(): DependencyProperty? {
      val fnPtr = _1262726264_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1262726264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1262726264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7d89dd906e646bea8a09c117d3024a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenterStatics2(ptr: Pointer?): WithDefault =
        IContentPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIContentPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1262726264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenterStatics2):
        Array<IContentPresenterStatics2?> = (elements as
        Array<IContentPresenterStatics2?>).castToImpl<IContentPresenterStatics2,IContentPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenterStatics2?> =
        arrayOfNulls<IContentPresenterStatics2_Impl>(size) as Array<IContentPresenterStatics2?>
  }
}
