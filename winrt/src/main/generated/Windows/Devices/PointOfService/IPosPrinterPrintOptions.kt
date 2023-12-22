package Windows.Devices.PointOfService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPosPrinterPrintOptions.ABI::class)
@Signature("{0a2e16fd-1d02-5a58-9d59-bfcde76fde86}")
@Guid("0a2e16fd1d025a589d59bfcde76fde86")
@WinRTInterface("0a2e16fd1d025a589d59bfcde76fde86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterPrintOptions.ByReference::class)
public interface IPosPrinterPrintOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TypeFace(): String?

  @InterfaceMethod(1)
  public fun put_TypeFace(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_CharacterHeight(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_CharacterHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_Bold(): Boolean

  @InterfaceMethod(5)
  public fun put_Bold(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Italic(): Boolean

  @InterfaceMethod(7)
  public fun put_Italic(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_Underline(): Boolean

  @InterfaceMethod(9)
  public fun put_Underline(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_ReverseVideo(): Boolean

  @InterfaceMethod(11)
  public fun put_ReverseVideo(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_Strikethrough(): Boolean

  @InterfaceMethod(13)
  public fun put_Strikethrough(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_Superscript(): Boolean

  @InterfaceMethod(15)
  public fun put_Superscript(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_Subscript(): Boolean

  @InterfaceMethod(17)
  public fun put_Subscript(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_DoubleWide(): Boolean

  @InterfaceMethod(19)
  public fun put_DoubleWide(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_DoubleHigh(): Boolean

  @InterfaceMethod(21)
  public fun put_DoubleHigh(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_Alignment(): PosPrinterAlignment?

  @InterfaceMethod(23)
  public fun put_Alignment(value: PosPrinterAlignment?): Unit

  @InterfaceMethod(24)
  public fun get_CharacterSet(): WinDef.UINT

  @InterfaceMethod(25)
  public fun put_CharacterSet(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterPrintOptions> {
    public override fun getValue() = ABI.makeIPosPrinterPrintOptions(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterPrintOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterPrintOptions {
    public val __1717168982_Ptr: Pointer?

    public val _1717168982_VtblPtr: Pointer?
      get() = __1717168982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TypeFace(): String? {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TypeFace(value: String?): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CharacterHeight(): WinDef.UINT {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CharacterHeight(value: WinDef.UINT): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Bold(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Bold(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Italic(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Italic(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Underline(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Underline(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ReverseVideo(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ReverseVideo(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Strikethrough(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_Strikethrough(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Superscript(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_Superscript(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Subscript(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_Subscript(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_DoubleWide(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_DoubleWide(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_DoubleHigh(): Boolean {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_DoubleHigh(value: Boolean): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Alignment(): PosPrinterAlignment? {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterAlignment>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Alignment(value: PosPrinterAlignment?): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CharacterSet(): WinDef.UINT {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_CharacterSet(value: WinDef.UINT): Unit {
      val fnPtr = _1717168982_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1717168982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPosPrinterPrintOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1717168982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterPrintOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a2e16fd1d025a589d59bfcde76fde86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterPrintOptions(ptr: Pointer?): WithDefault =
        IPosPrinterPrintOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterPrintOptions {
      val address = segment.toRawLongValue()
      return makeIPosPrinterPrintOptions(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterPrintOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1717168982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterPrintOptions): Array<IPosPrinterPrintOptions?>
        = (elements as
        Array<IPosPrinterPrintOptions?>).castToImpl<IPosPrinterPrintOptions,IPosPrinterPrintOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterPrintOptions?> =
        arrayOfNulls<IPosPrinterPrintOptions_Impl>(size) as Array<IPosPrinterPrintOptions?>
  }
}
