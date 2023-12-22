package Windows.Media.Devices

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IFocusSettings.ABI::class)
@Signature("{79958f6b-3263-4275-85d6-aeae891c96ee}")
@Guid("79958f6b3263427585d6aeae891c96ee")
@WinRTInterface("79958f6b3263427585d6aeae891c96ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusSettings.ByReference::class)
public interface IFocusSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): FocusMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: FocusMode?): Unit

  @InterfaceMethod(2)
  public fun get_AutoFocusRange(): AutoFocusRange?

  @InterfaceMethod(3)
  public fun put_AutoFocusRange(value: AutoFocusRange?): Unit

  @InterfaceMethod(4)
  public fun get_Value(): IReference<WinDef.UINT>?

  @InterfaceMethod(5)
  public fun put_Value(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(6)
  public fun get_Distance(): IReference<ManualFocusDistance?>?

  @InterfaceMethod(7)
  public fun put_Distance(value: IReference<ManualFocusDistance?>?): Unit

  @InterfaceMethod(8)
  public fun get_WaitForFocus(): Boolean

  @InterfaceMethod(9)
  public fun put_WaitForFocus(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_DisableDriverFallback(): Boolean

  @InterfaceMethod(11)
  public fun put_DisableDriverFallback(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFocusSettings>
      {
    public override fun getValue() = ABI.makeIFocusSettings(pointer.getPointer(0))

    public fun setValue(value: IFocusSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusSettings {
    public val __1691121254_Ptr: Pointer?

    public val _1691121254_VtblPtr: Pointer?
      get() = __1691121254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): FocusMode? {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusMode>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: FocusMode?): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AutoFocusRange(): AutoFocusRange? {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoFocusRange>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoFocusRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AutoFocusRange(value: AutoFocusRange?): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): IReference<WinDef.UINT>? {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Distance(): IReference<ManualFocusDistance?>? {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<ManualFocusDistance?>>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<ManualFocusDistance?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Distance(value: IReference<ManualFocusDistance?>?): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_WaitForFocus(): Boolean {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_WaitForFocus(value: Boolean): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DisableDriverFallback(): Boolean {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_DisableDriverFallback(value: Boolean): Unit {
      val fnPtr = _1691121254_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1691121254_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFocusSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1691121254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79958f6b3263427585d6aeae891c96ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusSettings(ptr: Pointer?): WithDefault = IFocusSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusSettings {
      val address = segment.toRawLongValue()
      return makeIFocusSettings(Pointer(address))
    }

    public override fun toNative(obj: IFocusSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1691121254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusSettings): Array<IFocusSettings?> = (elements as
        Array<IFocusSettings?>).castToImpl<IFocusSettings,IFocusSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusSettings?> =
        arrayOfNulls<IFocusSettings_Impl>(size) as Array<IFocusSettings?>
  }
}
