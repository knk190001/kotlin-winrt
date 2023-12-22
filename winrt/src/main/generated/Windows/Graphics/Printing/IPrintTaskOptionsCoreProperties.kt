package Windows.Graphics.Printing

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintTaskOptionsCoreProperties.ABI::class)
@Signature("{c1b71832-9e93-4e55-814b-3326a59efce1}")
@Guid("c1b718329e934e55814b3326a59efce1")
@WinRTInterface("c1b718329e934e55814b3326a59efce1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionsCoreProperties.ByReference::class)
public interface IPrintTaskOptionsCoreProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_MediaSize(value: PrintMediaSize?): Unit

  @InterfaceMethod(1)
  public fun get_MediaSize(): PrintMediaSize?

  @InterfaceMethod(2)
  public fun put_MediaType(value: PrintMediaType?): Unit

  @InterfaceMethod(3)
  public fun get_MediaType(): PrintMediaType?

  @InterfaceMethod(4)
  public fun put_Orientation(value: PrintOrientation?): Unit

  @InterfaceMethod(5)
  public fun get_Orientation(): PrintOrientation?

  @InterfaceMethod(6)
  public fun put_PrintQuality(value: PrintQuality?): Unit

  @InterfaceMethod(7)
  public fun get_PrintQuality(): PrintQuality?

  @InterfaceMethod(8)
  public fun put_ColorMode(value: PrintColorMode?): Unit

  @InterfaceMethod(9)
  public fun get_ColorMode(): PrintColorMode?

  @InterfaceMethod(10)
  public fun put_Duplex(value: PrintDuplex?): Unit

  @InterfaceMethod(11)
  public fun get_Duplex(): PrintDuplex?

  @InterfaceMethod(12)
  public fun put_Collation(value: PrintCollation?): Unit

  @InterfaceMethod(13)
  public fun get_Collation(): PrintCollation?

  @InterfaceMethod(14)
  public fun put_Staple(value: PrintStaple?): Unit

  @InterfaceMethod(15)
  public fun get_Staple(): PrintStaple?

  @InterfaceMethod(16)
  public fun put_HolePunch(value: PrintHolePunch?): Unit

  @InterfaceMethod(17)
  public fun get_HolePunch(): PrintHolePunch?

  @InterfaceMethod(18)
  public fun put_Binding(value: PrintBinding?): Unit

  @InterfaceMethod(19)
  public fun get_Binding(): PrintBinding?

  @InterfaceMethod(20)
  public fun get_MinCopies(): WinDef.UINT

  @InterfaceMethod(21)
  public fun get_MaxCopies(): WinDef.UINT

  @InterfaceMethod(22)
  public fun put_NumberOfCopies(value: WinDef.UINT): Unit

  @InterfaceMethod(23)
  public fun get_NumberOfCopies(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionsCoreProperties> {
    public override fun getValue() = ABI.makeIPrintTaskOptionsCoreProperties(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionsCoreProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionsCoreProperties {
    public val __609648774_Ptr: Pointer?

    public val _609648774_VtblPtr: Pointer?
      get() = __609648774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_MediaSize(value: PrintMediaSize?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_MediaSize(): PrintMediaSize? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintMediaSize>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintMediaSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_MediaType(value: PrintMediaType?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_MediaType(): PrintMediaType? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintMediaType>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintMediaType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Orientation(value: PrintOrientation?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Orientation(): PrintOrientation? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintOrientation>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PrintQuality(value: PrintQuality?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PrintQuality(): PrintQuality? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintQuality>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintQuality>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ColorMode(value: PrintColorMode?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ColorMode(): PrintColorMode? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintColorMode>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintColorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Duplex(value: PrintDuplex?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Duplex(): PrintDuplex? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintDuplex>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintDuplex>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_Collation(value: PrintCollation?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_Collation(): PrintCollation? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintCollation>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintCollation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Staple(value: PrintStaple?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Staple(): PrintStaple? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintStaple>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintStaple>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_HolePunch(value: PrintHolePunch?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_HolePunch(): PrintHolePunch? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintHolePunch>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintHolePunch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_Binding(value: PrintBinding?): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_Binding(): PrintBinding? {
      val fnPtr = _609648774_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintBinding>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintBinding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_MinCopies(): WinDef.UINT {
      val fnPtr = _609648774_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_MaxCopies(): WinDef.UINT {
      val fnPtr = _609648774_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_NumberOfCopies(value: WinDef.UINT): Unit {
      val fnPtr = _609648774_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_NumberOfCopies(): WinDef.UINT {
      val fnPtr = _609648774_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__609648774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTaskOptionsCoreProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __609648774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionsCoreProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1b718329e934e55814b3326a59efce1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionsCoreProperties(ptr: Pointer?): WithDefault =
        IPrintTaskOptionsCoreProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionsCoreProperties {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionsCoreProperties(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionsCoreProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609648774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionsCoreProperties):
        Array<IPrintTaskOptionsCoreProperties?> = (elements as
        Array<IPrintTaskOptionsCoreProperties?>).castToImpl<IPrintTaskOptionsCoreProperties,IPrintTaskOptionsCoreProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionsCoreProperties?> =
        arrayOfNulls<IPrintTaskOptionsCoreProperties_Impl>(size) as
        Array<IPrintTaskOptionsCoreProperties?>
  }
}
