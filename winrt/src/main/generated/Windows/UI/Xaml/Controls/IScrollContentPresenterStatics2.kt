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

@ABIMarker(IScrollContentPresenterStatics2.ABI::class)
@Signature("{e172ff1a-c676-524b-8f20-96152149d05e}")
@Guid("e172ff1ac676524b8f2096152149d05e")
@WinRTInterface("e172ff1ac676524b8f2096152149d05e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollContentPresenterStatics2.ByReference::class)
public interface IScrollContentPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SizesContentToTemplatedParentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollContentPresenterStatics2> {
    public override fun getValue() = ABI.makeIScrollContentPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IScrollContentPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollContentPresenterStatics2 {
    public val __1077159067_Ptr: Pointer?

    public val _1077159067_VtblPtr: Pointer?
      get() = __1077159067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty? {
      val fnPtr = _1077159067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1077159067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SizesContentToTemplatedParentProperty(): DependencyProperty? {
      val fnPtr = _1077159067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1077159067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollContentPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1077159067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollContentPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e172ff1ac676524b8f2096152149d05e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollContentPresenterStatics2(ptr: Pointer?): WithDefault =
        IScrollContentPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollContentPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIScrollContentPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IScrollContentPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1077159067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollContentPresenterStatics2):
        Array<IScrollContentPresenterStatics2?> = (elements as
        Array<IScrollContentPresenterStatics2?>).castToImpl<IScrollContentPresenterStatics2,IScrollContentPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollContentPresenterStatics2?> =
        arrayOfNulls<IScrollContentPresenterStatics2_Impl>(size) as
        Array<IScrollContentPresenterStatics2?>
  }
}
