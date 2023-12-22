package Windows.ApplicationModel.SocialInfo

import Windows.Foundation.IAsyncAction
import Windows.Foundation.Uri
import Windows.Graphics.Imaging.BitmapSize
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(ISocialItemThumbnail.ABI::class)
@Signature("{5cbf831a-3f08-497f-917f-57e09d84b141}")
@Guid("5cbf831a3f08497f917f57e09d84b141")
@WinRTInterface("5cbf831a3f08497f917f57e09d84b141")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialItemThumbnail.ByReference::class)
public interface ISocialItemThumbnail : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetUri(): Uri?

  @InterfaceMethod(1)
  public fun put_TargetUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_ImageUri(): Uri?

  @InterfaceMethod(3)
  public fun put_ImageUri(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_BitmapSize(): BitmapSize?

  @InterfaceMethod(5)
  public fun put_BitmapSize(value: BitmapSize?): Unit

  @InterfaceMethod(6)
  public fun SetImageAsync(image: IInputStream?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialItemThumbnail> {
    public override fun getValue() = ABI.makeISocialItemThumbnail(pointer.getPointer(0))

    public fun setValue(value: ISocialItemThumbnail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialItemThumbnail {
    public val __479677224_Ptr: Pointer?

    public val _479677224_VtblPtr: Pointer?
      get() = __479677224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _479677224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _479677224_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ImageUri(): Uri? {
      val fnPtr = _479677224_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ImageUri(value: Uri?): Unit {
      val fnPtr = _479677224_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BitmapSize(): BitmapSize? {
      val fnPtr = _479677224_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSize>()
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BitmapSize(value: BitmapSize?): Unit {
      val fnPtr = _479677224_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetImageAsync(image: IInputStream?): IAsyncAction? {
      val fnPtr = _479677224_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__479677224_Ptr, marshalToNative(image), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISocialItemThumbnail_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479677224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialItemThumbnail, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5cbf831a3f08497f917f57e09d84b141")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialItemThumbnail(ptr: Pointer?): WithDefault = ISocialItemThumbnail_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialItemThumbnail {
      val address = segment.toRawLongValue()
      return makeISocialItemThumbnail(Pointer(address))
    }

    public override fun toNative(obj: ISocialItemThumbnail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479677224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialItemThumbnail): Array<ISocialItemThumbnail?> =
        (elements as
        Array<ISocialItemThumbnail?>).castToImpl<ISocialItemThumbnail,ISocialItemThumbnail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialItemThumbnail?> =
        arrayOfNulls<ISocialItemThumbnail_Impl>(size) as Array<ISocialItemThumbnail?>
  }
}
