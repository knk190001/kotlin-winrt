package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBarTemplateSettings.ABI::class)
@Signature("{bcc2a863-eb35-423c-8389-d7827be3bf67}")
@Guid("bcc2a863eb35423c8389d7827be3bf67")
@WinRTInterface("bcc2a863eb35423c8389d7827be3bf67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarTemplateSettings.ByReference::class)
public interface IAppBarTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClipRect(): Rect?

  @InterfaceMethod(1)
  public fun get_CompactVerticalDelta(): Double

  @InterfaceMethod(2)
  public fun get_CompactRootMargin(): Thickness?

  @InterfaceMethod(3)
  public fun get_MinimalVerticalDelta(): Double

  @InterfaceMethod(4)
  public fun get_MinimalRootMargin(): Thickness?

  @InterfaceMethod(5)
  public fun get_HiddenVerticalDelta(): Double

  @InterfaceMethod(6)
  public fun get_HiddenRootMargin(): Thickness?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarTemplateSettings> {
    public override fun getValue() = ABI.makeIAppBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IAppBarTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarTemplateSettings {
    public val __42157333_Ptr: Pointer?

    public val _42157333_VtblPtr: Pointer?
      get() = __42157333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClipRect(): Rect? {
      val fnPtr = _42157333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CompactVerticalDelta(): Double {
      val fnPtr = _42157333_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CompactRootMargin(): Thickness? {
      val fnPtr = _42157333_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinimalVerticalDelta(): Double {
      val fnPtr = _42157333_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MinimalRootMargin(): Thickness? {
      val fnPtr = _42157333_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HiddenVerticalDelta(): Double {
      val fnPtr = _42157333_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_HiddenRootMargin(): Thickness? {
      val fnPtr = _42157333_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__42157333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __42157333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcc2a863eb35423c8389d7827be3bf67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarTemplateSettings(ptr: Pointer?): WithDefault =
        IAppBarTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIAppBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IAppBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__42157333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarTemplateSettings): Array<IAppBarTemplateSettings?>
        = (elements as
        Array<IAppBarTemplateSettings?>).castToImpl<IAppBarTemplateSettings,IAppBarTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarTemplateSettings?> =
        arrayOfNulls<IAppBarTemplateSettings_Impl>(size) as Array<IAppBarTemplateSettings?>
  }
}
