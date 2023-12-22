package Windows.UI.Xaml.Controls

import Windows.Foundation.Point
import Windows.UI.Xaml.Documents.TextPointer
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.Thickness
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichTextBlockOverflow.ABI::class)
@Signature("{4f93749b-dac3-4a42-9cbb-99f0de37c071}")
@Guid("4f93749bdac34a429cbb99f0de37c071")
@WinRTInterface("4f93749bdac34a429cbb99f0de37c071")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflow.ByReference::class)
public interface IRichTextBlockOverflow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OverflowContentTarget(): RichTextBlockOverflow?

  @InterfaceMethod(1)
  public fun put_OverflowContentTarget(value: RichTextBlockOverflow?): Unit

  @InterfaceMethod(2)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(3)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(4)
  public fun get_ContentSource(): RichTextBlock?

  @InterfaceMethod(5)
  public fun get_HasOverflowContent(): Boolean

  @InterfaceMethod(6)
  public fun get_ContentStart(): TextPointer?

  @InterfaceMethod(7)
  public fun get_ContentEnd(): TextPointer?

  @InterfaceMethod(8)
  public fun get_BaselineOffset(): Double

  @InterfaceMethod(9)
  public fun GetPositionFromPoint(point: Point?): TextPointer?

  @InterfaceMethod(10)
  public fun Focus(value: FocusState?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflow> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflow(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflow {
    public val __1634978966_Ptr: Pointer?

    public val _1634978966_VtblPtr: Pointer?
      get() = __1634978966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OverflowContentTarget(): RichTextBlockOverflow? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichTextBlockOverflow>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichTextBlockOverflow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OverflowContentTarget(value: RichTextBlockOverflow?): Unit {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentSource(): RichTextBlock? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichTextBlock>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichTextBlock>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HasOverflowContent(): Boolean {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ContentStart(): TextPointer? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ContentEnd(): TextPointer? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_BaselineOffset(): Double {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun GetPositionFromPoint(point: Point?): TextPointer? {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _1634978966_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1634978966_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRichTextBlockOverflow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1634978966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f93749bdac34a429cbb99f0de37c071")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflow(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflow {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflow(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1634978966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflow): Array<IRichTextBlockOverflow?> =
        (elements as
        Array<IRichTextBlockOverflow?>).castToImpl<IRichTextBlockOverflow,IRichTextBlockOverflow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflow?> =
        arrayOfNulls<IRichTextBlockOverflow_Impl>(size) as Array<IRichTextBlockOverflow?>
  }
}
