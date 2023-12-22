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

@ABIMarker(ITimedMetadataEncodingPropertiesStatics.ABI::class)
@Signature("{6629bb67-6e55-5643-89a0-7a7e8d85b52c}")
@Guid("6629bb676e55564389a07a7e8d85b52c")
@WinRTInterface("6629bb676e55564389a07a7e8d85b52c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataEncodingPropertiesStatics.ByReference::class)
public interface ITimedMetadataEncodingPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePgs(): TimedMetadataEncodingProperties?

  @InterfaceMethod(1)
  public fun CreateSrt(): TimedMetadataEncodingProperties?

  @InterfaceMethod(2)
  public fun CreateSsa(formatUserData: Array<Byte>): TimedMetadataEncodingProperties?

  @InterfaceMethod(3)
  public fun CreateVobSub(formatUserData: Array<Byte>): TimedMetadataEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataEncodingPropertiesStatics> {
    public override fun getValue() =
        ABI.makeITimedMetadataEncodingPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataEncodingPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataEncodingPropertiesStatics {
    public val __1735533600_Ptr: Pointer?

    public val _1735533600_VtblPtr: Pointer?
      get() = __1735533600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePgs(): TimedMetadataEncodingProperties? {
      val fnPtr = _1735533600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1735533600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSrt(): TimedMetadataEncodingProperties? {
      val fnPtr = _1735533600_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1735533600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateSsa(formatUserData: Array<Byte>): TimedMetadataEncodingProperties? {
      val fnPtr = _1735533600_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1735533600_Ptr,
          formatUserData.size,marshalToNative(formatUserData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateVobSub(formatUserData: Array<Byte>):
        TimedMetadataEncodingProperties? {
      val fnPtr = _1735533600_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1735533600_Ptr,
          formatUserData.size,marshalToNative(formatUserData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataEncodingPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1735533600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataEncodingPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6629bb676e55564389a07a7e8d85b52c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataEncodingPropertiesStatics(ptr: Pointer?): WithDefault =
        ITimedMetadataEncodingPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITimedMetadataEncodingPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeITimedMetadataEncodingPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataEncodingPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1735533600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataEncodingPropertiesStatics):
        Array<ITimedMetadataEncodingPropertiesStatics?> = (elements as
        Array<ITimedMetadataEncodingPropertiesStatics?>).castToImpl<ITimedMetadataEncodingPropertiesStatics,ITimedMetadataEncodingPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataEncodingPropertiesStatics?> =
        arrayOfNulls<ITimedMetadataEncodingPropertiesStatics_Impl>(size) as
        Array<ITimedMetadataEncodingPropertiesStatics?>
  }
}
