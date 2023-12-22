package Windows.Data.Pdf

import Windows.Foundation.Rect
import Windows.UI.Color
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

@ABIMarker(IPdfPageRenderOptions.ABI::class)
@Signature("{3c98056f-b7cf-4c29-9a04-52d90267f425}")
@Guid("3c98056fb7cf4c299a0452d90267f425")
@WinRTInterface("3c98056fb7cf4c299a0452d90267f425")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPdfPageRenderOptions.ByReference::class)
public interface IPdfPageRenderOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceRect(): Rect?

  @InterfaceMethod(1)
  public fun put_SourceRect(value: Rect?): Unit

  @InterfaceMethod(2)
  public fun get_DestinationWidth(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_DestinationWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_DestinationHeight(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_DestinationHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(7)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(8)
  public fun get_IsIgnoringHighContrast(): Boolean

  @InterfaceMethod(9)
  public fun put_IsIgnoringHighContrast(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_BitmapEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(11)
  public fun put_BitmapEncoderId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPdfPageRenderOptions> {
    public override fun getValue() = ABI.makeIPdfPageRenderOptions(pointer.getPointer(0))

    public fun setValue(value: IPdfPageRenderOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPdfPageRenderOptions {
    public val __242255543_Ptr: Pointer?

    public val _242255543_VtblPtr: Pointer?
      get() = __242255543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceRect(): Rect? {
      val fnPtr = _242255543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceRect(value: Rect?): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DestinationWidth(): WinDef.UINT {
      val fnPtr = _242255543_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DestinationWidth(value: WinDef.UINT): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DestinationHeight(): WinDef.UINT {
      val fnPtr = _242255543_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DestinationHeight(value: WinDef.UINT): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _242255543_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsIgnoringHighContrast(): Boolean {
      val fnPtr = _242255543_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsIgnoringHighContrast(value: Boolean): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BitmapEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _242255543_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_BitmapEncoderId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _242255543_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242255543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPdfPageRenderOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __242255543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPdfPageRenderOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c98056fb7cf4c299a0452d90267f425")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPdfPageRenderOptions(ptr: Pointer?): WithDefault =
        IPdfPageRenderOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPdfPageRenderOptions {
      val address = segment.toRawLongValue()
      return makeIPdfPageRenderOptions(Pointer(address))
    }

    public override fun toNative(obj: IPdfPageRenderOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__242255543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPdfPageRenderOptions): Array<IPdfPageRenderOptions?> =
        (elements as
        Array<IPdfPageRenderOptions?>).castToImpl<IPdfPageRenderOptions,IPdfPageRenderOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPdfPageRenderOptions?> =
        arrayOfNulls<IPdfPageRenderOptions_Impl>(size) as Array<IPdfPageRenderOptions?>
  }
}
