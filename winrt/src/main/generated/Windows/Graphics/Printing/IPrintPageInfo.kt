package Windows.Graphics.Printing

import Windows.Foundation.Size
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

@ABIMarker(IPrintPageInfo.ABI::class)
@Signature("{dd4be9c9-a6a1-4ada-930e-da872a4f23d3}")
@Guid("dd4be9c9a6a14ada930eda872a4f23d3")
@WinRTInterface("dd4be9c9a6a14ada930eda872a4f23d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintPageInfo.ByReference::class)
public interface IPrintPageInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_MediaSize(value: PrintMediaSize?): Unit

  @InterfaceMethod(1)
  public fun get_MediaSize(): PrintMediaSize?

  @InterfaceMethod(2)
  public fun put_PageSize(value: Size?): Unit

  @InterfaceMethod(3)
  public fun get_PageSize(): Size?

  @InterfaceMethod(4)
  public fun put_DpiX(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_DpiX(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_DpiY(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_DpiY(): WinDef.UINT

  @InterfaceMethod(8)
  public fun put_Orientation(value: PrintOrientation?): Unit

  @InterfaceMethod(9)
  public fun get_Orientation(): PrintOrientation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintPageInfo>
      {
    public override fun getValue() = ABI.makeIPrintPageInfo(pointer.getPointer(0))

    public fun setValue(value: IPrintPageInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintPageInfo {
    public val __153688978_Ptr: Pointer?

    public val _153688978_VtblPtr: Pointer?
      get() = __153688978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_MediaSize(value: PrintMediaSize?): Unit {
      val fnPtr = _153688978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_MediaSize(): PrintMediaSize? {
      val fnPtr = _153688978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintMediaSize>()
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintMediaSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PageSize(value: Size?): Unit {
      val fnPtr = _153688978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PageSize(): Size? {
      val fnPtr = _153688978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DpiX(value: WinDef.UINT): Unit {
      val fnPtr = _153688978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DpiX(): WinDef.UINT {
      val fnPtr = _153688978_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_DpiY(value: WinDef.UINT): Unit {
      val fnPtr = _153688978_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_DpiY(): WinDef.UINT {
      val fnPtr = _153688978_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Orientation(value: PrintOrientation?): Unit {
      val fnPtr = _153688978_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Orientation(): PrintOrientation? {
      val fnPtr = _153688978_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintOrientation>()
      val hr = fn.invokeHR(arrayOf(__153688978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintOrientation>(result.getValue())
      return resultValue
    }
  }

  public class IPrintPageInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153688978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintPageInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd4be9c9a6a14ada930eda872a4f23d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintPageInfo(ptr: Pointer?): WithDefault = IPrintPageInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintPageInfo {
      val address = segment.toRawLongValue()
      return makeIPrintPageInfo(Pointer(address))
    }

    public override fun toNative(obj: IPrintPageInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__153688978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintPageInfo): Array<IPrintPageInfo?> = (elements as
        Array<IPrintPageInfo?>).castToImpl<IPrintPageInfo,IPrintPageInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintPageInfo?> =
        arrayOfNulls<IPrintPageInfo_Impl>(size) as Array<IPrintPageInfo?>
  }
}
