package Windows.Media.Core

import Windows.Media.MediaProperties.TimedMetadataEncodingProperties
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

@ABIMarker(ITimedMetadataStreamDescriptor.ABI::class)
@Signature("{133336bf-296a-463e-9ff9-01cd25691408}")
@Guid("133336bf296a463e9ff901cd25691408")
@WinRTInterface("133336bf296a463e9ff901cd25691408")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataStreamDescriptor.ByReference::class)
public interface ITimedMetadataStreamDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncodingProperties(): TimedMetadataEncodingProperties?

  @InterfaceMethod(1)
  public fun Copy(): TimedMetadataStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataStreamDescriptor> {
    public override fun getValue() = ABI.makeITimedMetadataStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataStreamDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataStreamDescriptor {
    public val __1847036928_Ptr: Pointer?

    public val _1847036928_VtblPtr: Pointer?
      get() = __1847036928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncodingProperties(): TimedMetadataEncodingProperties? {
      val fnPtr = _1847036928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1847036928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Copy(): TimedMetadataStreamDescriptor? {
      val fnPtr = _1847036928_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1847036928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataStreamDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1847036928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataStreamDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("133336bf296a463e9ff901cd25691408")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataStreamDescriptor(ptr: Pointer?): WithDefault =
        ITimedMetadataStreamDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataStreamDescriptor {
      val address = segment.toRawLongValue()
      return makeITimedMetadataStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1847036928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataStreamDescriptor):
        Array<ITimedMetadataStreamDescriptor?> = (elements as
        Array<ITimedMetadataStreamDescriptor?>).castToImpl<ITimedMetadataStreamDescriptor,ITimedMetadataStreamDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataStreamDescriptor?> =
        arrayOfNulls<ITimedMetadataStreamDescriptor_Impl>(size) as
        Array<ITimedMetadataStreamDescriptor?>
  }
}
