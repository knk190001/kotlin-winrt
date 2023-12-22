package Windows.Data.Pdf

import Windows.Foundation.Rect
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPdfPageDimensions.ABI::class)
@Signature("{22170471-313e-44e8-835d-63a3e7624a10}")
@Guid("22170471313e44e8835d63a3e7624a10")
@WinRTInterface("22170471313e44e8835d63a3e7624a10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPdfPageDimensions.ByReference::class)
public interface IPdfPageDimensions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaBox(): Rect?

  @InterfaceMethod(1)
  public fun get_CropBox(): Rect?

  @InterfaceMethod(2)
  public fun get_BleedBox(): Rect?

  @InterfaceMethod(3)
  public fun get_TrimBox(): Rect?

  @InterfaceMethod(4)
  public fun get_ArtBox(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPdfPageDimensions> {
    public override fun getValue() = ABI.makeIPdfPageDimensions(pointer.getPointer(0))

    public fun setValue(value: IPdfPageDimensions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPdfPageDimensions {
    public val __14490722_Ptr: Pointer?

    public val _14490722_VtblPtr: Pointer?
      get() = __14490722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaBox(): Rect? {
      val fnPtr = _14490722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__14490722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CropBox(): Rect? {
      val fnPtr = _14490722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__14490722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BleedBox(): Rect? {
      val fnPtr = _14490722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__14490722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TrimBox(): Rect? {
      val fnPtr = _14490722_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__14490722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ArtBox(): Rect? {
      val fnPtr = _14490722_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__14490722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IPdfPageDimensions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __14490722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPdfPageDimensions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22170471313e44e8835d63a3e7624a10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPdfPageDimensions(ptr: Pointer?): WithDefault = IPdfPageDimensions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPdfPageDimensions {
      val address = segment.toRawLongValue()
      return makeIPdfPageDimensions(Pointer(address))
    }

    public override fun toNative(obj: IPdfPageDimensions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__14490722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPdfPageDimensions): Array<IPdfPageDimensions?> =
        (elements as
        Array<IPdfPageDimensions?>).castToImpl<IPdfPageDimensions,IPdfPageDimensions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPdfPageDimensions?> =
        arrayOfNulls<IPdfPageDimensions_Impl>(size) as Array<IPdfPageDimensions?>
  }
}
