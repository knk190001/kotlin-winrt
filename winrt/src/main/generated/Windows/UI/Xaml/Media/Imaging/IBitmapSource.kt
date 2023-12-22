package Windows.UI.Xaml.Media.Imaging

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IBitmapSource.ABI::class)
@Signature("{23d86411-202f-41b2-8c5b-a8a3b333800b}")
@Guid("23d86411202f41b28c5ba8a3b333800b")
@WinRTInterface("23d86411202f41b28c5ba8a3b333800b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapSource.ByReference::class)
public interface IBitmapSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelWidth(): Int

  @InterfaceMethod(1)
  public fun get_PixelHeight(): Int

  @InterfaceMethod(2)
  public fun SetSource(streamSource: IRandomAccessStream?): Unit

  @InterfaceMethod(3)
  public fun SetSourceAsync(streamSource: IRandomAccessStream?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapSource>
      {
    public override fun getValue() = ABI.makeIBitmapSource(pointer.getPointer(0))

    public fun setValue(value: IBitmapSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapSource {
    public val __436748316_Ptr: Pointer?

    public val _436748316_VtblPtr: Pointer?
      get() = __436748316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelWidth(): Int {
      val fnPtr = _436748316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__436748316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PixelHeight(): Int {
      val fnPtr = _436748316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__436748316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetSource(streamSource: IRandomAccessStream?): Unit {
      val fnPtr = _436748316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__436748316_Ptr, marshalToNative(streamSource),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetSourceAsync(streamSource: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _436748316_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__436748316_Ptr, marshalToNative(streamSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __436748316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23d86411202f41b28c5ba8a3b333800b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapSource(ptr: Pointer?): WithDefault = IBitmapSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapSource {
      val address = segment.toRawLongValue()
      return makeIBitmapSource(Pointer(address))
    }

    public override fun toNative(obj: IBitmapSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__436748316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapSource): Array<IBitmapSource?> = (elements as
        Array<IBitmapSource?>).castToImpl<IBitmapSource,IBitmapSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapSource?> =
        arrayOfNulls<IBitmapSource_Impl>(size) as Array<IBitmapSource?>
  }
}
