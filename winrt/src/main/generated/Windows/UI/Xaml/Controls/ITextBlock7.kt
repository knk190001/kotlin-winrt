package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(ITextBlock7.ABI::class)
@Signature("{dfe20a4e-8be7-5e33-9f37-72416875b121}")
@Guid("dfe20a4e8be75e339f3772416875b121")
@WinRTInterface("dfe20a4e8be75e339f3772416875b121")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlock7.ByReference::class)
public interface ITextBlock7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(2)
  public fun CopySelectionToClipboard(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBlock7> {
    public override fun getValue() = ABI.makeITextBlock7(pointer.getPointer(0))

    public fun setValue(value: ITextBlock7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlock7 {
    public val __164916749_Ptr: Pointer?

    public val _164916749_VtblPtr: Pointer?
      get() = __164916749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _164916749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__164916749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _164916749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164916749_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CopySelectionToClipboard(): Unit {
      val fnPtr = _164916749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164916749_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBlock7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164916749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlock7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfe20a4e8be75e339f3772416875b121")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlock7(ptr: Pointer?): WithDefault = ITextBlock7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlock7 {
      val address = segment.toRawLongValue()
      return makeITextBlock7(Pointer(address))
    }

    public override fun toNative(obj: ITextBlock7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164916749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlock7): Array<ITextBlock7?> = (elements as
        Array<ITextBlock7?>).castToImpl<ITextBlock7,ITextBlock7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlock7?> =
        arrayOfNulls<ITextBlock7_Impl>(size) as Array<ITextBlock7?>
  }
}
