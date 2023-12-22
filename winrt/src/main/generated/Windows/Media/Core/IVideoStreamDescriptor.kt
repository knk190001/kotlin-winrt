package Windows.Media.Core

import Windows.Media.Core.IMediaStreamDescriptor.ABI.IID
import Windows.Media.MediaProperties.VideoEncodingProperties
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVideoStreamDescriptor.ABI::class)
@Signature("{12ee0d55-9c2b-4440-8057-2c7a90f0cbec}")
@Guid("12ee0d559c2b444080572c7a90f0cbec")
@WinRTInterface("12ee0d559c2b444080572c7a90f0cbec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStreamDescriptor.ByReference::class)
public interface IVideoStreamDescriptor : NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
  @InterfaceMethod(0)
  public fun get_EncodingProperties(): VideoEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStreamDescriptor> {
    public override fun getValue() = ABI.makeIVideoStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: IVideoStreamDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStreamDescriptor, IMediaStreamDescriptor.WithDefault {
    public val __1359228427_Ptr: Pointer?

    public val _1359228427_VtblPtr: Pointer?
      get() = __1359228427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncodingProperties(): VideoEncodingProperties? {
      val fnPtr = _1359228427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1359228427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStreamDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
    public override val __1209088862_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1359228427_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1359228427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStreamDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12ee0d559c2b444080572c7a90f0cbec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStreamDescriptor(ptr: Pointer?): WithDefault =
        IVideoStreamDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoStreamDescriptor {
      val address = segment.toRawLongValue()
      return makeIVideoStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IVideoStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359228427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStreamDescriptor): Array<IVideoStreamDescriptor?> =
        (elements as
        Array<IVideoStreamDescriptor?>).castToImpl<IVideoStreamDescriptor,IVideoStreamDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStreamDescriptor?> =
        arrayOfNulls<IVideoStreamDescriptor_Impl>(size) as Array<IVideoStreamDescriptor?>
  }
}
