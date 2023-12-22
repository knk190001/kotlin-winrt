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

@ABIMarker(IContentPresenterStatics5.ABI::class)
@Signature("{169e700f-e8e6-5f6a-b97e-7ef8f7006f49}")
@Guid("169e700fe8e65f6ab97e7ef8f7006f49")
@WinRTInterface("169e700fe8e65f6ab97e7ef8f7006f49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenterStatics5.ByReference::class)
public interface IContentPresenterStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenterStatics5> {
    public override fun getValue() = ABI.makeIContentPresenterStatics5(pointer.getPointer(0))

    public fun setValue(value: IContentPresenterStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenterStatics5 {
    public val __1262726267_Ptr: Pointer?

    public val _1262726267_VtblPtr: Pointer?
      get() = __1262726267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _1262726267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1262726267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentPresenterStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1262726267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenterStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("169e700fe8e65f6ab97e7ef8f7006f49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenterStatics5(ptr: Pointer?): WithDefault =
        IContentPresenterStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenterStatics5 {
      val address = segment.toRawLongValue()
      return makeIContentPresenterStatics5(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenterStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1262726267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenterStatics5):
        Array<IContentPresenterStatics5?> = (elements as
        Array<IContentPresenterStatics5?>).castToImpl<IContentPresenterStatics5,IContentPresenterStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenterStatics5?> =
        arrayOfNulls<IContentPresenterStatics5_Impl>(size) as Array<IContentPresenterStatics5?>
  }
}
