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

@ABIMarker(IRichTextBlockStatics2.ABI::class)
@Signature("{0d6131e1-af29-48ce-8aaf-74ecc28bfbb0}")
@Guid("0d6131e1af2948ce8aaf74ecc28bfbb0")
@WinRTInterface("0d6131e1af2948ce8aaf74ecc28bfbb0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockStatics2.ByReference::class)
public interface IRichTextBlockStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxLinesProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextLineBoundsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_SelectionHighlightColorProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_OpticalMarginAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsColorFontEnabledProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockStatics2> {
    public override fun getValue() = ABI.makeIRichTextBlockStatics2(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockStatics2 {
    public val __846301067_Ptr: Pointer?

    public val _846301067_VtblPtr: Pointer?
      get() = __846301067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxLinesProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextLineBoundsProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectionHighlightColorProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OpticalMarginAlignmentProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsColorFontEnabledProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _846301067_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __846301067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d6131e1af2948ce8aaf74ecc28bfbb0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockStatics2(ptr: Pointer?): WithDefault =
        IRichTextBlockStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockStatics2 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__846301067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockStatics2): Array<IRichTextBlockStatics2?> =
        (elements as
        Array<IRichTextBlockStatics2?>).castToImpl<IRichTextBlockStatics2,IRichTextBlockStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockStatics2?> =
        arrayOfNulls<IRichTextBlockStatics2_Impl>(size) as Array<IRichTextBlockStatics2?>
  }
}
