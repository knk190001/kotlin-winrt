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

@ABIMarker(IRichEditBoxStatics3.ABI::class)
@Signature("{6d17eec5-1fb3-4c8b-aa23-f5e15d6ab64e}")
@Guid("6d17eec51fb34c8baa23f5e15d6ab64e")
@WinRTInterface("6d17eec51fb34c8baa23f5e15d6ab64e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxStatics3.ByReference::class)
public interface IRichEditBoxStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredCandidateWindowAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxStatics3> {
    public override fun getValue() = ABI.makeIRichEditBoxStatics3(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxStatics3 {
    public val __545562249_Ptr: Pointer?

    public val _545562249_VtblPtr: Pointer?
      get() = __545562249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredCandidateWindowAlignmentProperty(): DependencyProperty? {
      val fnPtr = _545562249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _545562249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545562249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d17eec51fb34c8baa23f5e15d6ab64e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxStatics3(ptr: Pointer?): WithDefault = IRichEditBoxStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxStatics3 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxStatics3(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545562249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxStatics3): Array<IRichEditBoxStatics3?> =
        (elements as
        Array<IRichEditBoxStatics3?>).castToImpl<IRichEditBoxStatics3,IRichEditBoxStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxStatics3?> =
        arrayOfNulls<IRichEditBoxStatics3_Impl>(size) as Array<IRichEditBoxStatics3?>
  }
}
