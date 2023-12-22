package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRatingItemFontInfo.ABI::class)
@Signature("{054723e9-7989-4d5c-9d01-a7eb876f1071}")
@Guid("054723e979894d5c9d01a7eb876f1071")
@WinRTInterface("054723e979894d5c9d01a7eb876f1071")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemFontInfo.ByReference::class)
public interface IRatingItemFontInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisabledGlyph(): String?

  @InterfaceMethod(1)
  public fun put_DisabledGlyph(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Glyph(): String?

  @InterfaceMethod(3)
  public fun put_Glyph(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_PointerOverGlyph(): String?

  @InterfaceMethod(5)
  public fun put_PointerOverGlyph(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_PointerOverPlaceholderGlyph(): String?

  @InterfaceMethod(7)
  public fun put_PointerOverPlaceholderGlyph(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_PlaceholderGlyph(): String?

  @InterfaceMethod(9)
  public fun put_PlaceholderGlyph(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_UnsetGlyph(): String?

  @InterfaceMethod(11)
  public fun put_UnsetGlyph(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemFontInfo> {
    public override fun getValue() = ABI.makeIRatingItemFontInfo(pointer.getPointer(0))

    public fun setValue(value: IRatingItemFontInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemFontInfo {
    public val __2067255593_Ptr: Pointer?

    public val _2067255593_VtblPtr: Pointer?
      get() = __2067255593_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisabledGlyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisabledGlyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Glyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Glyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PointerOverGlyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PointerOverGlyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PointerOverPlaceholderGlyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PointerOverPlaceholderGlyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PlaceholderGlyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PlaceholderGlyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_UnsetGlyph(): String? {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_UnsetGlyph(value: String?): Unit {
      val fnPtr = _2067255593_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067255593_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRatingItemFontInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067255593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemFontInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("054723e979894d5c9d01a7eb876f1071")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemFontInfo(ptr: Pointer?): WithDefault = IRatingItemFontInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemFontInfo {
      val address = segment.toRawLongValue()
      return makeIRatingItemFontInfo(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemFontInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067255593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemFontInfo): Array<IRatingItemFontInfo?> =
        (elements as
        Array<IRatingItemFontInfo?>).castToImpl<IRatingItemFontInfo,IRatingItemFontInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemFontInfo?> =
        arrayOfNulls<IRatingItemFontInfo_Impl>(size) as Array<IRatingItemFontInfo?>
  }
}
