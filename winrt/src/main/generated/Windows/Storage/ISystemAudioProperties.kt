package Windows.Storage

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

@ABIMarker(ISystemAudioProperties.ABI::class)
@Signature("{3f8f38b7-308c-47e1-924d-8645348e5db7}")
@Guid("3f8f38b7308c47e1924d8645348e5db7")
@WinRTInterface("3f8f38b7308c47e1924d8645348e5db7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemAudioProperties.ByReference::class)
public interface ISystemAudioProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncodingBitrate(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemAudioProperties> {
    public override fun getValue() = ABI.makeISystemAudioProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemAudioProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemAudioProperties {
    public val __788648065_Ptr: Pointer?

    public val _788648065_VtblPtr: Pointer?
      get() = __788648065_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncodingBitrate(): String? {
      val fnPtr = _788648065_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__788648065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemAudioProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788648065_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemAudioProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f8f38b7308c47e1924d8645348e5db7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemAudioProperties(ptr: Pointer?): WithDefault =
        ISystemAudioProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemAudioProperties {
      val address = segment.toRawLongValue()
      return makeISystemAudioProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemAudioProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788648065_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemAudioProperties): Array<ISystemAudioProperties?> =
        (elements as
        Array<ISystemAudioProperties?>).castToImpl<ISystemAudioProperties,ISystemAudioProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemAudioProperties?> =
        arrayOfNulls<ISystemAudioProperties_Impl>(size) as Array<ISystemAudioProperties?>
  }
}
