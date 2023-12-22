package Windows.Media.MediaProperties

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
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioEncodingPropertiesWithFormatUserData.ABI::class)
@Signature("{98f10d79-13ea-49ff-be70-2673db69702c}")
@Guid("98f10d7913ea49ffbe702673db69702c")
@WinRTInterface("98f10d7913ea49ffbe702673db69702c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingPropertiesWithFormatUserData.ByReference::class)
public interface IAudioEncodingPropertiesWithFormatUserData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetFormatUserData(value: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun GetFormatUserData(value: OutArray<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingPropertiesWithFormatUserData> {
    public override fun getValue() =
        ABI.makeIAudioEncodingPropertiesWithFormatUserData(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingPropertiesWithFormatUserData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingPropertiesWithFormatUserData {
    public val __77954073_Ptr: Pointer?

    public val _77954073_VtblPtr: Pointer?
      get() = __77954073_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetFormatUserData(value: Array<Byte>): Unit {
      val fnPtr = _77954073_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77954073_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetFormatUserData(value: OutArray<Byte>): Unit {
      val fnPtr = _77954073_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77954073_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioEncodingPropertiesWithFormatUserData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __77954073_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingPropertiesWithFormatUserData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98f10d7913ea49ffbe702673db69702c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingPropertiesWithFormatUserData(ptr: Pointer?): WithDefault =
        IAudioEncodingPropertiesWithFormatUserData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAudioEncodingPropertiesWithFormatUserData {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingPropertiesWithFormatUserData(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingPropertiesWithFormatUserData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__77954073_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingPropertiesWithFormatUserData):
        Array<IAudioEncodingPropertiesWithFormatUserData?> = (elements as
        Array<IAudioEncodingPropertiesWithFormatUserData?>).castToImpl<IAudioEncodingPropertiesWithFormatUserData,IAudioEncodingPropertiesWithFormatUserData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingPropertiesWithFormatUserData?> =
        arrayOfNulls<IAudioEncodingPropertiesWithFormatUserData_Impl>(size) as
        Array<IAudioEncodingPropertiesWithFormatUserData?>
  }
}
