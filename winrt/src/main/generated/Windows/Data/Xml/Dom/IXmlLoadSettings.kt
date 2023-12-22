package Windows.Data.Xml.Dom

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

@ABIMarker(IXmlLoadSettings.ABI::class)
@Signature("{58aa07a8-fed6-46f7-b4c5-fb1ba72108d6}")
@Guid("58aa07a8fed646f7b4c5fb1ba72108d6")
@WinRTInterface("58aa07a8fed646f7b4c5fb1ba72108d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlLoadSettings.ByReference::class)
public interface IXmlLoadSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxElementDepth(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_MaxElementDepth(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_ProhibitDtd(): Boolean

  @InterfaceMethod(3)
  public fun put_ProhibitDtd(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ResolveExternals(): Boolean

  @InterfaceMethod(5)
  public fun put_ResolveExternals(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_ValidateOnParse(): Boolean

  @InterfaceMethod(7)
  public fun put_ValidateOnParse(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ElementContentWhiteSpace(): Boolean

  @InterfaceMethod(9)
  public fun put_ElementContentWhiteSpace(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlLoadSettings> {
    public override fun getValue() = ABI.makeIXmlLoadSettings(pointer.getPointer(0))

    public fun setValue(value: IXmlLoadSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlLoadSettings {
    public val __413425545_Ptr: Pointer?

    public val _413425545_VtblPtr: Pointer?
      get() = __413425545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxElementDepth(): WinDef.UINT {
      val fnPtr = _413425545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxElementDepth(value: WinDef.UINT): Unit {
      val fnPtr = _413425545_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ProhibitDtd(): Boolean {
      val fnPtr = _413425545_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ProhibitDtd(value: Boolean): Unit {
      val fnPtr = _413425545_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ResolveExternals(): Boolean {
      val fnPtr = _413425545_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ResolveExternals(value: Boolean): Unit {
      val fnPtr = _413425545_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ValidateOnParse(): Boolean {
      val fnPtr = _413425545_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ValidateOnParse(value: Boolean): Unit {
      val fnPtr = _413425545_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ElementContentWhiteSpace(): Boolean {
      val fnPtr = _413425545_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ElementContentWhiteSpace(value: Boolean): Unit {
      val fnPtr = _413425545_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413425545_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlLoadSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413425545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlLoadSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58aa07a8fed646f7b4c5fb1ba72108d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlLoadSettings(ptr: Pointer?): WithDefault = IXmlLoadSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlLoadSettings {
      val address = segment.toRawLongValue()
      return makeIXmlLoadSettings(Pointer(address))
    }

    public override fun toNative(obj: IXmlLoadSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413425545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlLoadSettings): Array<IXmlLoadSettings?> = (elements as
        Array<IXmlLoadSettings?>).castToImpl<IXmlLoadSettings,IXmlLoadSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlLoadSettings?> =
        arrayOfNulls<IXmlLoadSettings_Impl>(size) as Array<IXmlLoadSettings?>
  }
}
