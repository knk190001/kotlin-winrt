package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.GridLength
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

@ABIMarker(ISplitViewTemplateSettings.ABI::class)
@Signature("{c16ab5a7-4996-4443-b199-6b6b89124eab}")
@Guid("c16ab5a749964443b1996b6b89124eab")
@WinRTInterface("c16ab5a749964443b1996b6b89124eab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitViewTemplateSettings.ByReference::class)
public interface ISplitViewTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpenPaneLength(): Double

  @InterfaceMethod(1)
  public fun get_NegativeOpenPaneLength(): Double

  @InterfaceMethod(2)
  public fun get_OpenPaneLengthMinusCompactLength(): Double

  @InterfaceMethod(3)
  public fun get_NegativeOpenPaneLengthMinusCompactLength(): Double

  @InterfaceMethod(4)
  public fun get_OpenPaneGridLength(): GridLength?

  @InterfaceMethod(5)
  public fun get_CompactPaneGridLength(): GridLength?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitViewTemplateSettings> {
    public override fun getValue() = ABI.makeISplitViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ISplitViewTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitViewTemplateSettings {
    public val __1604127328_Ptr: Pointer?

    public val _1604127328_VtblPtr: Pointer?
      get() = __1604127328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenPaneLength(): Double {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NegativeOpenPaneLength(): Double {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OpenPaneLengthMinusCompactLength(): Double {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_NegativeOpenPaneLengthMinusCompactLength(): Double {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_OpenPaneGridLength(): GridLength? {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CompactPaneGridLength(): GridLength? {
      val fnPtr = _1604127328_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1604127328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }
  }

  public class ISplitViewTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1604127328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitViewTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c16ab5a749964443b1996b6b89124eab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitViewTemplateSettings(ptr: Pointer?): WithDefault =
        ISplitViewTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitViewTemplateSettings {
      val address = segment.toRawLongValue()
      return makeISplitViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ISplitViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1604127328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitViewTemplateSettings):
        Array<ISplitViewTemplateSettings?> = (elements as
        Array<ISplitViewTemplateSettings?>).castToImpl<ISplitViewTemplateSettings,ISplitViewTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitViewTemplateSettings?> =
        arrayOfNulls<ISplitViewTemplateSettings_Impl>(size) as Array<ISplitViewTemplateSettings?>
  }
}
