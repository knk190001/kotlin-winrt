package Windows.UI.Xaml.Media

import Windows.Foundation.Size
import Windows.Foundation.Uri
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

@ABIMarker(ILoadedImageSurfaceStatics.ABI::class)
@Signature("{22b8edf6-84ad-40ab-937d-4871613e765d}")
@Guid("22b8edf684ad40ab937d4871613e765d")
@WinRTInterface("22b8edf684ad40ab937d4871613e765d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoadedImageSurfaceStatics.ByReference::class)
public interface ILoadedImageSurfaceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartLoadFromUri(uri: Uri?, desiredMaxSize: Size?): LoadedImageSurface?

  @InterfaceMethod(1)
  public fun StartLoadFromUri(uri: Uri?): LoadedImageSurface?

  @InterfaceMethod(2)
  public fun StartLoadFromStream(stream: IRandomAccessStream?, desiredMaxSize: Size?):
      LoadedImageSurface?

  @InterfaceMethod(3)
  public fun StartLoadFromStream(stream: IRandomAccessStream?): LoadedImageSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoadedImageSurfaceStatics> {
    public override fun getValue() = ABI.makeILoadedImageSurfaceStatics(pointer.getPointer(0))

    public fun setValue(value: ILoadedImageSurfaceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoadedImageSurfaceStatics {
    public val __214999506_Ptr: Pointer?

    public val _214999506_VtblPtr: Pointer?
      get() = __214999506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartLoadFromUri(uri: Uri?, desiredMaxSize: Size?): LoadedImageSurface? {
      val fnPtr = _214999506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoadedImageSurface>()
      val hr = fn.invokeHR(arrayOf(__214999506_Ptr, marshalToNative(uri),
          marshalToNative(desiredMaxSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoadedImageSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartLoadFromUri(uri: Uri?): LoadedImageSurface? {
      val fnPtr = _214999506_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoadedImageSurface>()
      val hr = fn.invokeHR(arrayOf(__214999506_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoadedImageSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartLoadFromStream(stream: IRandomAccessStream?, desiredMaxSize: Size?):
        LoadedImageSurface? {
      val fnPtr = _214999506_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoadedImageSurface>()
      val hr = fn.invokeHR(arrayOf(__214999506_Ptr, marshalToNative(stream),
          marshalToNative(desiredMaxSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoadedImageSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StartLoadFromStream(stream: IRandomAccessStream?): LoadedImageSurface? {
      val fnPtr = _214999506_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoadedImageSurface>()
      val hr = fn.invokeHR(arrayOf(__214999506_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoadedImageSurface>(result.getValue())
      return resultValue
    }
  }

  public class ILoadedImageSurfaceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214999506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoadedImageSurfaceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22b8edf684ad40ab937d4871613e765d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoadedImageSurfaceStatics(ptr: Pointer?): WithDefault =
        ILoadedImageSurfaceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoadedImageSurfaceStatics {
      val address = segment.toRawLongValue()
      return makeILoadedImageSurfaceStatics(Pointer(address))
    }

    public override fun toNative(obj: ILoadedImageSurfaceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214999506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoadedImageSurfaceStatics):
        Array<ILoadedImageSurfaceStatics?> = (elements as
        Array<ILoadedImageSurfaceStatics?>).castToImpl<ILoadedImageSurfaceStatics,ILoadedImageSurfaceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoadedImageSurfaceStatics?> =
        arrayOfNulls<ILoadedImageSurfaceStatics_Impl>(size) as Array<ILoadedImageSurfaceStatics?>
  }
}
