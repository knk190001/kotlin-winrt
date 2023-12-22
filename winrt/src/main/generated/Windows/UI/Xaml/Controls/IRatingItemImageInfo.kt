package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.ImageSource
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

@ABIMarker(IRatingItemImageInfo.ABI::class)
@Signature("{25240e8c-e0d2-490e-b8f8-96c8ee0512b9}")
@Guid("25240e8ce0d2490eb8f896c8ee0512b9")
@WinRTInterface("25240e8ce0d2490eb8f896c8ee0512b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemImageInfo.ByReference::class)
public interface IRatingItemImageInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisabledImage(): ImageSource?

  @InterfaceMethod(1)
  public fun put_DisabledImage(value: ImageSource?): Unit

  @InterfaceMethod(2)
  public fun get_Image(): ImageSource?

  @InterfaceMethod(3)
  public fun put_Image(value: ImageSource?): Unit

  @InterfaceMethod(4)
  public fun get_PlaceholderImage(): ImageSource?

  @InterfaceMethod(5)
  public fun put_PlaceholderImage(value: ImageSource?): Unit

  @InterfaceMethod(6)
  public fun get_PointerOverImage(): ImageSource?

  @InterfaceMethod(7)
  public fun put_PointerOverImage(value: ImageSource?): Unit

  @InterfaceMethod(8)
  public fun get_PointerOverPlaceholderImage(): ImageSource?

  @InterfaceMethod(9)
  public fun put_PointerOverPlaceholderImage(value: ImageSource?): Unit

  @InterfaceMethod(10)
  public fun get_UnsetImage(): ImageSource?

  @InterfaceMethod(11)
  public fun put_UnsetImage(value: ImageSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemImageInfo> {
    public override fun getValue() = ABI.makeIRatingItemImageInfo(pointer.getPointer(0))

    public fun setValue(value: IRatingItemImageInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemImageInfo {
    public val __342303389_Ptr: Pointer?

    public val _342303389_VtblPtr: Pointer?
      get() = __342303389_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisabledImage(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisabledImage(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Image(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Image(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PlaceholderImage(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PlaceholderImage(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PointerOverImage(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PointerOverImage(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PointerOverPlaceholderImage(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PointerOverPlaceholderImage(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_UnsetImage(): ImageSource? {
      val fnPtr = _342303389_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_UnsetImage(value: ImageSource?): Unit {
      val fnPtr = _342303389_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342303389_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRatingItemImageInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __342303389_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemImageInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25240e8ce0d2490eb8f896c8ee0512b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemImageInfo(ptr: Pointer?): WithDefault = IRatingItemImageInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemImageInfo {
      val address = segment.toRawLongValue()
      return makeIRatingItemImageInfo(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemImageInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__342303389_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemImageInfo): Array<IRatingItemImageInfo?> =
        (elements as
        Array<IRatingItemImageInfo?>).castToImpl<IRatingItemImageInfo,IRatingItemImageInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemImageInfo?> =
        arrayOfNulls<IRatingItemImageInfo_Impl>(size) as Array<IRatingItemImageInfo?>
  }
}
