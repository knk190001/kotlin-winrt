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

@ABIMarker(ICommonClaimedPosPrinterStation.ABI::class)
@Signature("{b7eb66a8-fe8a-4cfb-8b42-e35b280cb27c}")
@Guid("b7eb66a8fe8a4cfb8b42e35b280cb27c")
@WinRTInterface("b7eb66a8fe8a4cfb8b42e35b280cb27c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommonClaimedPosPrinterStation.ByReference::class)
public interface ICommonClaimedPosPrinterStation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_CharactersPerLine(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_CharactersPerLine(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_LineHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_LineHeight(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_LineSpacing(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_LineSpacing(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_LineWidth(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_IsLetterQuality(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsLetterQuality(): Boolean

  @InterfaceMethod(9)
  public fun get_IsPaperNearEnd(): Boolean

  @InterfaceMethod(10)
  public fun put_ColorCartridge(value: PosPrinterColorCartridge?): Unit

  @InterfaceMethod(11)
  public fun get_ColorCartridge(): PosPrinterColorCartridge?

  @InterfaceMethod(12)
  public fun get_IsCoverOpen(): Boolean

  @InterfaceMethod(13)
  public fun get_IsCartridgeRemoved(): Boolean

  @InterfaceMethod(14)
  public fun get_IsCartridgeEmpty(): Boolean

  @InterfaceMethod(15)
  public fun get_IsHeadCleaning(): Boolean

  @InterfaceMethod(16)
  public fun get_IsPaperEmpty(): Boolean

  @InterfaceMethod(17)
  public fun get_IsReadyToPrint(): Boolean

  @InterfaceMethod(18)
  public fun ValidateData(`data`: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommonClaimedPosPrinterStation> {
    public override fun getValue() = ABI.makeICommonClaimedPosPrinterStation(pointer.getPointer(0))

    public fun setValue(value: ICommonClaimedPosPrinterStation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommonClaimedPosPrinterStation {
    public val __1383195011_Ptr: Pointer?

    public val _1383195011_VtblPtr: Pointer?
      get() = __1383195011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_CharactersPerLine(value: WinDef.UINT): Unit {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_CharactersPerLine(): WinDef.UINT {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_LineHeight(value: WinDef.UINT): Unit {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LineHeight(): WinDef.UINT {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_LineSpacing(value: WinDef.UINT): Unit {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_LineSpacing(): WinDef.UINT {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_LineWidth(): WinDef.UINT {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsLetterQuality(value: Boolean): Unit {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsLetterQuality(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsPaperNearEnd(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_ColorCartridge(value: PosPrinterColorCartridge?): Unit {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ColorCartridge(): PosPrinterColorCartridge? {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterColorCartridge>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterColorCartridge>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsCoverOpen(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsCartridgeRemoved(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_IsCartridgeEmpty(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_IsHeadCleaning(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_IsPaperEmpty(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_IsReadyToPrint(): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun ValidateData(`data`: String?): Boolean {
      val fnPtr = _1383195011_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1383195011_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICommonClaimedPosPrinterStation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383195011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommonClaimedPosPrinterStation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7eb66a8fe8a4cfb8b42e35b280cb27c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommonClaimedPosPrinterStation(ptr: Pointer?): WithDefault =
        ICommonClaimedPosPrinterStation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommonClaimedPosPrinterStation {
      val address = segment.toRawLongValue()
      return makeICommonClaimedPosPrinterStation(Pointer(address))
    }

    public override fun toNative(obj: ICommonClaimedPosPrinterStation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383195011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommonClaimedPosPrinterStation):
        Array<ICommonClaimedPosPrinterStation?> = (elements as
        Array<ICommonClaimedPosPrinterStation?>).castToImpl<ICommonClaimedPosPrinterStation,ICommonClaimedPosPrinterStation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommonClaimedPosPrinterStation?> =
        arrayOfNulls<ICommonClaimedPosPrinterStation_Impl>(size) as
        Array<ICommonClaimedPosPrinterStation?>
  }
}
