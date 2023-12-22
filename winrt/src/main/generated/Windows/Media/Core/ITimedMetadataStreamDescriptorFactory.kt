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

@ABIMarker(ITimedMetadataStreamDescriptorFactory.ABI::class)
@Signature("{c027de30-7362-4ff9-98b1-2dfd0b8d1cae}")
@Guid("c027de3073624ff998b12dfd0b8d1cae")
@WinRTInterface("c027de3073624ff998b12dfd0b8d1cae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataStreamDescriptorFactory.ByReference::class)
public interface ITimedMetadataStreamDescriptorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(encodingProperties: TimedMetadataEncodingProperties?):
      TimedMetadataStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataStreamDescriptorFactory> {
    public override fun getValue() =
        ABI.makeITimedMetadataStreamDescriptorFactory(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataStreamDescriptorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataStreamDescriptorFactory {
    public val __548846826_Ptr: Pointer?

    public val _548846826_VtblPtr: Pointer?
      get() = __548846826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(encodingProperties: TimedMetadataEncodingProperties?):
        TimedMetadataStreamDescriptor? {
      val fnPtr = _548846826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__548846826_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataStreamDescriptorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __548846826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataStreamDescriptorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c027de3073624ff998b12dfd0b8d1cae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataStreamDescriptorFactory(ptr: Pointer?): WithDefault =
        ITimedMetadataStreamDescriptorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataStreamDescriptorFactory {
      val address = segment.toRawLongValue()
      return makeITimedMetadataStreamDescriptorFactory(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataStreamDescriptorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__548846826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataStreamDescriptorFactory):
        Array<ITimedMetadataStreamDescriptorFactory?> = (elements as
        Array<ITimedMetadataStreamDescriptorFactory?>).castToImpl<ITimedMetadataStreamDescriptorFactory,ITimedMetadataStreamDescriptorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataStreamDescriptorFactory?> =
        arrayOfNulls<ITimedMetadataStreamDescriptorFactory_Impl>(size) as
        Array<ITimedMetadataStreamDescriptorFactory?>
  }
}
