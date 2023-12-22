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

@ABIMarker(IContentPresenterStatics3.ABI::class)
@Signature("{cbe6cf5b-38b1-4d5d-b098-bc94b35c8ddf}")
@Guid("cbe6cf5b38b14d5db098bc94b35c8ddf")
@WinRTInterface("cbe6cf5b38b14d5db098bc94b35c8ddf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenterStatics3.ByReference::class)
public interface IContentPresenterStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenterStatics3> {
    public override fun getValue() = ABI.makeIContentPresenterStatics3(pointer.getPointer(0))

    public fun setValue(value: IContentPresenterStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenterStatics3 {
    public val __1262726265_Ptr: Pointer?

    public val _1262726265_VtblPtr: Pointer?
      get() = __1262726265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _1262726265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1262726265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentPresenterStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1262726265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenterStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbe6cf5b38b14d5db098bc94b35c8ddf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenterStatics3(ptr: Pointer?): WithDefault =
        IContentPresenterStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenterStatics3 {
      val address = segment.toRawLongValue()
      return makeIContentPresenterStatics3(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenterStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1262726265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenterStatics3):
        Array<IContentPresenterStatics3?> = (elements as
        Array<IContentPresenterStatics3?>).castToImpl<IContentPresenterStatics3,IContentPresenterStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenterStatics3?> =
        arrayOfNulls<IContentPresenterStatics3_Impl>(size) as Array<IContentPresenterStatics3?>
  }
}
