package Windows.Globalization

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ILanguageExtensionSubtags.ABI::class)
@Signature("{7d7daf45-368d-4364-852b-dec927037b85}")
@Guid("7d7daf45368d4364852bdec927037b85")
@WinRTInterface("7d7daf45368d4364852bdec927037b85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageExtensionSubtags.ByReference::class)
public interface ILanguageExtensionSubtags : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetExtensionSubtags(singleton: String?): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageExtensionSubtags> {
    public override fun getValue() = ABI.makeILanguageExtensionSubtags(pointer.getPointer(0))

    public fun setValue(value: ILanguageExtensionSubtags_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageExtensionSubtags {
    public val __258634811_Ptr: Pointer?

    public val _258634811_VtblPtr: Pointer?
      get() = __258634811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetExtensionSubtags(singleton: String?): IVectorView<String?>? {
      val fnPtr = _258634811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__258634811_Ptr, marshalToNative(singleton), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ILanguageExtensionSubtags_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __258634811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageExtensionSubtags, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d7daf45368d4364852bdec927037b85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageExtensionSubtags(ptr: Pointer?): WithDefault =
        ILanguageExtensionSubtags_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageExtensionSubtags {
      val address = segment.toRawLongValue()
      return makeILanguageExtensionSubtags(Pointer(address))
    }

    public override fun toNative(obj: ILanguageExtensionSubtags): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__258634811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageExtensionSubtags):
        Array<ILanguageExtensionSubtags?> = (elements as
        Array<ILanguageExtensionSubtags?>).castToImpl<ILanguageExtensionSubtags,ILanguageExtensionSubtags_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageExtensionSubtags?> =
        arrayOfNulls<ILanguageExtensionSubtags_Impl>(size) as Array<ILanguageExtensionSubtags?>
  }
}
