package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Style
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IPipsPager.ABI::class)
@Signature("{de7fc5d5-9446-5693-bbf3-fd7f943a567c}")
@Guid("de7fc5d594465693bbf3fd7f943a567c")
@WinRTInterface("de7fc5d594465693bbf3fd7f943a567c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPipsPager.ByReference::class)
public interface IPipsPager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NumberOfPages(): Int

  @InterfaceMethod(1)
  public fun put_NumberOfPages(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_SelectedPageIndex(): Int

  @InterfaceMethod(3)
  public fun put_SelectedPageIndex(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_MaxVisiblePips(): Int

  @InterfaceMethod(5)
  public fun put_MaxVisiblePips(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(7)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(8)
  public fun get_PreviousButtonVisibility(): PipsPagerButtonVisibility?

  @InterfaceMethod(9)
  public fun put_PreviousButtonVisibility(value: PipsPagerButtonVisibility?): Unit

  @InterfaceMethod(10)
  public fun get_NextButtonVisibility(): PipsPagerButtonVisibility?

  @InterfaceMethod(11)
  public fun put_NextButtonVisibility(value: PipsPagerButtonVisibility?): Unit

  @InterfaceMethod(12)
  public fun get_PreviousButtonStyle(): Style?

  @InterfaceMethod(13)
  public fun put_PreviousButtonStyle(value: Style?): Unit

  @InterfaceMethod(14)
  public fun get_NextButtonStyle(): Style?

  @InterfaceMethod(15)
  public fun put_NextButtonStyle(value: Style?): Unit

  @InterfaceMethod(16)
  public fun get_SelectedPipStyle(): Style?

  @InterfaceMethod(17)
  public fun put_SelectedPipStyle(value: Style?): Unit

  @InterfaceMethod(18)
  public fun get_NormalPipStyle(): Style?

  @InterfaceMethod(19)
  public fun put_NormalPipStyle(value: Style?): Unit

  @InterfaceMethod(20)
  public fun add_SelectedIndexChanged(handler: TypedEventHandler<PipsPager?,
      PipsPagerSelectedIndexChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_SelectedIndexChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun get_TemplateSettings(): PipsPagerTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPipsPager> {
    public override fun getValue() = ABI.makeIPipsPager(pointer.getPointer(0))

    public fun setValue(value: IPipsPager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPipsPager {
    public val __1142814080_Ptr: Pointer?

    public val _1142814080_VtblPtr: Pointer?
      get() = __1142814080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NumberOfPages(): Int {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_NumberOfPages(value: Int): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectedPageIndex(): Int {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_SelectedPageIndex(value: Int): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxVisiblePips(): Int {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxVisiblePips(value: Int): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PreviousButtonVisibility(): PipsPagerButtonVisibility? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PipsPagerButtonVisibility>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PipsPagerButtonVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PreviousButtonVisibility(value: PipsPagerButtonVisibility?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_NextButtonVisibility(): PipsPagerButtonVisibility? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PipsPagerButtonVisibility>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PipsPagerButtonVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_NextButtonVisibility(value: PipsPagerButtonVisibility?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_PreviousButtonStyle(): Style? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_PreviousButtonStyle(value: Style?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_NextButtonStyle(): Style? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_NextButtonStyle(value: Style?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_SelectedPipStyle(): Style? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_SelectedPipStyle(value: Style?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_NormalPipStyle(): Style? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_NormalPipStyle(value: Style?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_SelectedIndexChanged(handler: TypedEventHandler<PipsPager?,
        PipsPagerSelectedIndexChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_SelectedIndexChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_TemplateSettings(): PipsPagerTemplateSettings? {
      val fnPtr = _1142814080_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PipsPagerTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1142814080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PipsPagerTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IPipsPager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1142814080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPipsPager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de7fc5d594465693bbf3fd7f943a567c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPipsPager(ptr: Pointer?): WithDefault = IPipsPager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPipsPager {
      val address = segment.toRawLongValue()
      return makeIPipsPager(Pointer(address))
    }

    public override fun toNative(obj: IPipsPager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1142814080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPipsPager): Array<IPipsPager?> = (elements as
        Array<IPipsPager?>).castToImpl<IPipsPager,IPipsPager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPipsPager?> = arrayOfNulls<IPipsPager_Impl>(size)
        as Array<IPipsPager?>
  }
}
