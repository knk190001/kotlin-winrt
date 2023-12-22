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

@ABIMarker(IRichTextBlock6.ABI::class)
@Signature("{ae9010cd-e899-526e-927e-88e0eed693c8}")
@Guid("ae9010cde899526e927e88e0eed693c8")
@WinRTInterface("ae9010cde899526e927e88e0eed693c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock6.ByReference::class)
public interface IRichTextBlock6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(2)
  public fun CopySelectionToClipboard(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlock6> {
    public override fun getValue() = ABI.makeIRichTextBlock6(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock6 {
    public val __1376290286_Ptr: Pointer?

    public val _1376290286_VtblPtr: Pointer?
      get() = __1376290286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _1376290286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1376290286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1376290286_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290286_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CopySelectionToClipboard(): Unit {
      val fnPtr = _1376290286_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290286_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376290286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae9010cde899526e927e88e0eed693c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock6(ptr: Pointer?): WithDefault = IRichTextBlock6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock6 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock6(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376290286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock6): Array<IRichTextBlock6?> = (elements as
        Array<IRichTextBlock6?>).castToImpl<IRichTextBlock6,IRichTextBlock6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock6?> =
        arrayOfNulls<IRichTextBlock6_Impl>(size) as Array<IRichTextBlock6?>
  }
}
