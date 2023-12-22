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

@ABIMarker(ITimedTextSourceStatics.ABI::class)
@Signature("{7e311853-9aba-4ac4-bb98-2fb176c3bfdd}")
@Guid("7e3118539aba4ac4bb982fb176c3bfdd")
@WinRTInterface("7e3118539aba4ac4bb982fb176c3bfdd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextSourceStatics.ByReference::class)
public interface ITimedTextSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromStream(stream: IRandomAccessStream?): TimedTextSource?

  @InterfaceMethod(1)
  public fun CreateFromUri(uri: Uri?): TimedTextSource?

  @InterfaceMethod(2)
  public fun CreateFromStream(stream: IRandomAccessStream?, defaultLanguage: String?):
      TimedTextSource?

  @InterfaceMethod(3)
  public fun CreateFromUri(uri: Uri?, defaultLanguage: String?): TimedTextSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextSourceStatics> {
    public override fun getValue() = ABI.makeITimedTextSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ITimedTextSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextSourceStatics {
    public val __1734733211_Ptr: Pointer?

    public val _1734733211_VtblPtr: Pointer?
      get() = __1734733211_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromStream(stream: IRandomAccessStream?): TimedTextSource? {
      val fnPtr = _1734733211_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__1734733211_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromUri(uri: Uri?): TimedTextSource? {
      val fnPtr = _1734733211_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__1734733211_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromStream(stream: IRandomAccessStream?, defaultLanguage: String?):
        TimedTextSource? {
      val fnPtr = _1734733211_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__1734733211_Ptr, marshalToNative(stream),
          marshalToNative(defaultLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromUri(uri: Uri?, defaultLanguage: String?): TimedTextSource? {
      val fnPtr = _1734733211_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSource>()
      val hr = fn.invokeHR(arrayOf(__1734733211_Ptr, marshalToNative(uri),
          marshalToNative(defaultLanguage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSource>(result.getValue())
      return resultValue
    }
  }

  public class ITimedTextSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1734733211_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e3118539aba4ac4bb982fb176c3bfdd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextSourceStatics(ptr: Pointer?): WithDefault =
        ITimedTextSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextSourceStatics {
      val address = segment.toRawLongValue()
      return makeITimedTextSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1734733211_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextSourceStatics): Array<ITimedTextSourceStatics?>
        = (elements as
        Array<ITimedTextSourceStatics?>).castToImpl<ITimedTextSourceStatics,ITimedTextSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextSourceStatics?> =
        arrayOfNulls<ITimedTextSourceStatics_Impl>(size) as Array<ITimedTextSourceStatics?>
  }
}
