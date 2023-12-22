package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IScrollContentPresenterStatics.ABI::class)
@Signature("{4e93f295-ef2e-517b-bbf9-dedb854849c8}")
@Guid("4e93f295ef2e517bbbf9dedb854849c8")
@WinRTInterface("4e93f295ef2e517bbbf9dedb854849c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollContentPresenterStatics.ByReference::class)
public interface IScrollContentPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SizesContentToTemplatedParentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollContentPresenterStatics> {
    public override fun getValue() = ABI.makeIScrollContentPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IScrollContentPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollContentPresenterStatics {
    public val __913392802_Ptr: Pointer?

    public val _913392802_VtblPtr: Pointer?
      get() = __913392802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty? {
      val fnPtr = _913392802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__913392802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SizesContentToTemplatedParentProperty(): DependencyProperty? {
      val fnPtr = _913392802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__913392802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollContentPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __913392802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollContentPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e93f295ef2e517bbbf9dedb854849c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollContentPresenterStatics(ptr: Pointer?): WithDefault =
        IScrollContentPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollContentPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIScrollContentPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IScrollContentPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__913392802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollContentPresenterStatics):
        Array<IScrollContentPresenterStatics?> = (elements as
        Array<IScrollContentPresenterStatics?>).castToImpl<IScrollContentPresenterStatics,IScrollContentPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollContentPresenterStatics?> =
        arrayOfNulls<IScrollContentPresenterStatics_Impl>(size) as
        Array<IScrollContentPresenterStatics?>
  }
}
