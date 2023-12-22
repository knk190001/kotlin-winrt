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

@ABIMarker(IRichEditBoxStatics8.ABI::class)
@Signature("{58045172-106b-56a9-a8e4-4b74bf347d4e}")
@Guid("58045172106b56a9a8e44b74bf347d4e")
@WinRTInterface("58045172106b56a9a8e44b74bf347d4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxStatics8.ByReference::class)
public interface IRichEditBoxStatics8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ProofingMenuFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxStatics8> {
    public override fun getValue() = ABI.makeIRichEditBoxStatics8(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxStatics8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxStatics8 {
    public val __545562244_Ptr: Pointer?

    public val _545562244_VtblPtr: Pointer?
      get() = __545562244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _545562244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProofingMenuFlyoutProperty(): DependencyProperty? {
      val fnPtr = _545562244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _545562244_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxStatics8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545562244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxStatics8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58045172106b56a9a8e44b74bf347d4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxStatics8(ptr: Pointer?): WithDefault = IRichEditBoxStatics8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxStatics8 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxStatics8(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxStatics8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545562244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxStatics8): Array<IRichEditBoxStatics8?> =
        (elements as
        Array<IRichEditBoxStatics8?>).castToImpl<IRichEditBoxStatics8,IRichEditBoxStatics8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxStatics8?> =
        arrayOfNulls<IRichEditBoxStatics8_Impl>(size) as Array<IRichEditBoxStatics8?>
  }
}
