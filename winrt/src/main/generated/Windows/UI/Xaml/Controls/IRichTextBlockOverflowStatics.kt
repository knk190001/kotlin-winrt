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

@ABIMarker(IRichTextBlockOverflowStatics.ABI::class)
@Signature("{041ac2f7-4f2b-43c3-a122-3fea9ca9dc87}")
@Guid("041ac2f74f2b43c3a1223fea9ca9dc87")
@WinRTInterface("041ac2f74f2b43c3a1223fea9ca9dc87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflowStatics.ByReference::class)
public interface IRichTextBlockOverflowStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverflowContentTargetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PaddingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HasOverflowContentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflowStatics> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflowStatics(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflowStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflowStatics {
    public val __45770501_Ptr: Pointer?

    public val _45770501_VtblPtr: Pointer?
      get() = __45770501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverflowContentTargetProperty(): DependencyProperty? {
      val fnPtr = _45770501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__45770501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _45770501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__45770501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasOverflowContentProperty(): DependencyProperty? {
      val fnPtr = _45770501_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__45770501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockOverflowStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __45770501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflowStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("041ac2f74f2b43c3a1223fea9ca9dc87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflowStatics(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflowStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflowStatics {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflowStatics(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflowStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__45770501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflowStatics):
        Array<IRichTextBlockOverflowStatics?> = (elements as
        Array<IRichTextBlockOverflowStatics?>).castToImpl<IRichTextBlockOverflowStatics,IRichTextBlockOverflowStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflowStatics?> =
        arrayOfNulls<IRichTextBlockOverflowStatics_Impl>(size) as
        Array<IRichTextBlockOverflowStatics?>
  }
}
