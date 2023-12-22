package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayWireFormat.ABI::class)
@Signature("{1acc967d-872c-5a38-bbb9-1d4872b76255}")
@Guid("1acc967d872c5a38bbb91d4872b76255")
@WinRTInterface("1acc967d872c5a38bbb91d4872b76255")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayWireFormat.ByReference::class)
public interface IDisplayWireFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelEncoding(): DisplayWireFormatPixelEncoding?

  @InterfaceMethod(1)
  public fun get_BitsPerChannel(): Int

  @InterfaceMethod(2)
  public fun get_ColorSpace(): DisplayWireFormatColorSpace?

  @InterfaceMethod(3)
  public fun get_Eotf(): DisplayWireFormatEotf?

  @InterfaceMethod(4)
  public fun get_HdrMetadata(): DisplayWireFormatHdrMetadata?

  @InterfaceMethod(5)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayWireFormat> {
    public override fun getValue() = ABI.makeIDisplayWireFormat(pointer.getPointer(0))

    public fun setValue(value: IDisplayWireFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayWireFormat {
    public val __1623101436_Ptr: Pointer?

    public val _1623101436_VtblPtr: Pointer?
      get() = __1623101436_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelEncoding(): DisplayWireFormatPixelEncoding? {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormatPixelEncoding>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormatPixelEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitsPerChannel(): Int {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ColorSpace(): DisplayWireFormatColorSpace? {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormatColorSpace>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormatColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Eotf(): DisplayWireFormatEotf? {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormatEotf>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormatEotf>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HdrMetadata(): DisplayWireFormatHdrMetadata? {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormatHdrMetadata>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormatHdrMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _1623101436_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1623101436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayWireFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1623101436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayWireFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1acc967d872c5a38bbb91d4872b76255")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayWireFormat(ptr: Pointer?): WithDefault = IDisplayWireFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayWireFormat {
      val address = segment.toRawLongValue()
      return makeIDisplayWireFormat(Pointer(address))
    }

    public override fun toNative(obj: IDisplayWireFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1623101436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayWireFormat): Array<IDisplayWireFormat?> =
        (elements as
        Array<IDisplayWireFormat?>).castToImpl<IDisplayWireFormat,IDisplayWireFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayWireFormat?> =
        arrayOfNulls<IDisplayWireFormat_Impl>(size) as Array<IDisplayWireFormat?>
  }
}
