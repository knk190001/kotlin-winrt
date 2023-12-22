package Windows.UI.Text.Core

import Windows.Foundation.Deferral
import Windows.Foundation.IReference
import Windows.UI.Text.UnderlineType
import Windows.UI.ViewManagement.UIElementType
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextFormatUpdatingEventArgs.ABI::class)
@Signature("{7310bd33-b4a8-43b1-b37b-0724d4aca7ab}")
@Guid("7310bd33b4a843b1b37b0724d4aca7ab")
@WinRTInterface("7310bd33b4a843b1b37b0724d4aca7ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextFormatUpdatingEventArgs.ByReference::class)
public interface ICoreTextFormatUpdatingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Range(): CoreTextRange?

  @InterfaceMethod(1)
  public fun get_TextColor(): IReference<UIElementType?>?

  @InterfaceMethod(2)
  public fun get_BackgroundColor(): IReference<UIElementType?>?

  @InterfaceMethod(3)
  public fun get_UnderlineColor(): IReference<UIElementType?>?

  @InterfaceMethod(4)
  public fun get_UnderlineType(): IReference<UnderlineType?>?

  @InterfaceMethod(5)
  public fun get_Reason(): CoreTextFormatUpdatingReason?

  @InterfaceMethod(6)
  public fun get_Result(): CoreTextFormatUpdatingResult?

  @InterfaceMethod(7)
  public fun put_Result(value: CoreTextFormatUpdatingResult?): Unit

  @InterfaceMethod(8)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(9)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextFormatUpdatingEventArgs> {
    public override fun getValue() = ABI.makeICoreTextFormatUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextFormatUpdatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextFormatUpdatingEventArgs {
    public val __216451254_Ptr: Pointer?

    public val _216451254_VtblPtr: Pointer?
      get() = __216451254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Range(): CoreTextRange? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextColor(): IReference<UIElementType?>? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UIElementType?>>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UIElementType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundColor(): IReference<UIElementType?>? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UIElementType?>>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UIElementType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UnderlineColor(): IReference<UIElementType?>? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UIElementType?>>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UIElementType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_UnderlineType(): IReference<UnderlineType?>? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UnderlineType?>>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UnderlineType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Reason(): CoreTextFormatUpdatingReason? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextFormatUpdatingReason>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextFormatUpdatingReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Result(): CoreTextFormatUpdatingResult? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextFormatUpdatingResult>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextFormatUpdatingResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Result(value: CoreTextFormatUpdatingResult?): Unit {
      val fnPtr = _216451254_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _216451254_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _216451254_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__216451254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextFormatUpdatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __216451254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextFormatUpdatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7310bd33b4a843b1b37b0724d4aca7ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextFormatUpdatingEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextFormatUpdatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextFormatUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextFormatUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextFormatUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__216451254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextFormatUpdatingEventArgs):
        Array<ICoreTextFormatUpdatingEventArgs?> = (elements as
        Array<ICoreTextFormatUpdatingEventArgs?>).castToImpl<ICoreTextFormatUpdatingEventArgs,ICoreTextFormatUpdatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextFormatUpdatingEventArgs?> =
        arrayOfNulls<ICoreTextFormatUpdatingEventArgs_Impl>(size) as
        Array<ICoreTextFormatUpdatingEventArgs?>
  }
}
