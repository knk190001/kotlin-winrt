package Windows.Media.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextSourceStatics2.ABI::class)
@Signature("{b66b7602-923e-43fa-9633-587075812db5}")
@Guid("b66b7602923e43fa9633587075812db5")
@WinRTInterface("b66b7602923e43fa9633587075812db5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextSourceStatics2.ByReference::class)
public interface ITimedTextSourceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromStreamWithIndex(stream: IRandomAccessStream?,
      indexStream: IRandomAccessStream?): TimedTextSource?

  @InterfaceMethod(1)
  public fun CreateFromUriWithIndex(uri: Uri?, indexUri: Uri?): TimedTextSource?

  @InterfaceMethod(2)
  public fun CreateFromStreamWithIndex(
    stream: IRandomAccessStream?,
    indexStream: IRandomAccessStream?,
    defaultLanguage: String?
  ): TimedTextSource?

  @InterfaceMethod(3)
  public fun CreateFromUriWithIndex(
    uri: Uri?,
    indexUri: Uri?,
    defaultLanguage: String?
  ): TimedTextSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextSourceStatics2> {
    public override fun getValue() = ABI.makeITimedTextSourceStatics2(pointer.getPointer(0))

    public fun setValue(value: ITimedTextSourceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextSourceStatics2 {
    public val __2057845257_Ptr: Pointer?

    public val _2057845257_VtblPtr: Pointer?
      get() = __2057845257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromStreamWithIndex(stream: IRandomAccessStream?,
        indexStream: IRandomAccessStream?): TimedTextSource? {
      val fnPtr = _2057845257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__2057845257_Ptr, marshalToNative(stream),
          marshalToNative(indexStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromUriWithIndex(uri: Uri?, indexUri: Uri?): TimedTextSource? {
      val fnPtr = _2057845257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__2057845257_Ptr, marshalToNative(uri),
          marshalToNative(indexUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromStreamWithIndex(
      stream: IRandomAccessStream?,
      indexStream: IRandomAccessStream?,
      defaultLanguage: String?
    ): TimedTextSource? {
      val fnPtr = _2057845257_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__2057845257_Ptr, marshalToNative(stream),
          marshalToNative(indexStream), marshalToNative(defaultLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromUriWithIndex(
      uri: Uri?,
      indexUri: Uri?,
      defaultLanguage: String?
    ): TimedTextSource? {
      val fnPtr = _2057845257_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__2057845257_Ptr, marshalToNative(uri),
          marshalToNative(indexUri), marshalToNative(defaultLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }
  }

  public class ITimedTextSourceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2057845257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextSourceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b66b7602923e43fa9633587075812db5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextSourceStatics2(ptr: Pointer?): WithDefault =
        ITimedTextSourceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextSourceStatics2 {
      val address = segment.toRawLongValue()
      return makeITimedTextSourceStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextSourceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2057845257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextSourceStatics2):
        Array<ITimedTextSourceStatics2?> = (elements as
        Array<ITimedTextSourceStatics2?>).castToImpl<ITimedTextSourceStatics2,ITimedTextSourceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextSourceStatics2?> =
        arrayOfNulls<ITimedTextSourceStatics2_Impl>(size) as Array<ITimedTextSourceStatics2?>
  }
}
