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

@ABIMarker(ITimedMetadataEncodingProperties.ABI::class)
@Signature("{51cd30d3-d690-4cfa-97f4-4a398e9db420}")
@Guid("51cd30d3d6904cfa97f44a398e9db420")
@WinRTInterface("51cd30d3d6904cfa97f44a398e9db420")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataEncodingProperties.ByReference::class)
public interface ITimedMetadataEncodingProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetFormatUserData(value: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun GetFormatUserData(value: OutArray<Byte>): Unit

  @InterfaceMethod(2)
  public fun Copy(): TimedMetadataEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataEncodingProperties> {
    public override fun getValue() = ABI.makeITimedMetadataEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataEncodingProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataEncodingProperties {
    public val __59979813_Ptr: Pointer?

    public val _59979813_VtblPtr: Pointer?
      get() = __59979813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetFormatUserData(value: Array<Byte>): Unit {
      val fnPtr = _59979813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__59979813_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetFormatUserData(value: OutArray<Byte>): Unit {
      val fnPtr = _59979813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__59979813_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Copy(): TimedMetadataEncodingProperties? {
      val fnPtr = _59979813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__59979813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataEncodingProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __59979813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataEncodingProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51cd30d3d6904cfa97f44a398e9db420")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataEncodingProperties(ptr: Pointer?): WithDefault =
        ITimedMetadataEncodingProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataEncodingProperties {
      val address = segment.toRawLongValue()
      return makeITimedMetadataEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__59979813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataEncodingProperties):
        Array<ITimedMetadataEncodingProperties?> = (elements as
        Array<ITimedMetadataEncodingProperties?>).castToImpl<ITimedMetadataEncodingProperties,ITimedMetadataEncodingProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataEncodingProperties?> =
        arrayOfNulls<ITimedMetadataEncodingProperties_Impl>(size) as
        Array<ITimedMetadataEncodingProperties?>
  }
}
