package Windows.Data.Pdf

import Windows.Foundation.IAsyncAction
import Windows.Foundation.Size
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPdfPage.ABI::class)
@Signature("{9db4b0c8-5320-4cfc-ad76-493fdad0e594}")
@Guid("9db4b0c853204cfcad76493fdad0e594")
@WinRTInterface("9db4b0c853204cfcad76493fdad0e594")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPdfPage.ByReference::class)
public interface IPdfPage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RenderToStreamAsync(outputStream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(1)
  public fun RenderToStreamAsync(outputStream: IRandomAccessStream?,
      options: PdfPageRenderOptions?): IAsyncAction?

  @InterfaceMethod(2)
  public fun PreparePageAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun get_Index(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_Size(): Size?

  @InterfaceMethod(5)
  public fun get_Dimensions(): PdfPageDimensions?

  @InterfaceMethod(6)
  public fun get_Rotation(): PdfPageRotation?

  @InterfaceMethod(7)
  public fun get_PreferredZoom(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPdfPage> {
    public override fun getValue() = ABI.makeIPdfPage(pointer.getPointer(0))

    public fun setValue(value: IPdfPage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPdfPage {
    public val __1854766863_Ptr: Pointer?

    public val _1854766863_VtblPtr: Pointer?
      get() = __1854766863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RenderToStreamAsync(outputStream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr, marshalToNative(outputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RenderToStreamAsync(outputStream: IRandomAccessStream?,
        options: PdfPageRenderOptions?): IAsyncAction? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr, marshalToNative(outputStream),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PreparePageAsync(): IAsyncAction? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Index(): WinDef.UINT {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Size(): Size? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Dimensions(): PdfPageDimensions? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PdfPageDimensions>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PdfPageDimensions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Rotation(): PdfPageRotation? {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PdfPageRotation>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PdfPageRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PreferredZoom(): Float {
      val fnPtr = _1854766863_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1854766863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IPdfPage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1854766863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPdfPage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9db4b0c853204cfcad76493fdad0e594")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPdfPage(ptr: Pointer?): WithDefault = IPdfPage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPdfPage {
      val address = segment.toRawLongValue()
      return makeIPdfPage(Pointer(address))
    }

    public override fun toNative(obj: IPdfPage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1854766863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPdfPage): Array<IPdfPage?> = (elements as
        Array<IPdfPage?>).castToImpl<IPdfPage,IPdfPage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPdfPage?> = arrayOfNulls<IPdfPage_Impl>(size) as
        Array<IPdfPage?>
  }
}
