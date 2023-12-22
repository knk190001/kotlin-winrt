package Windows.Media.Core

import Windows.Media.Core.IMediaStreamDescriptor.ABI.IID
import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IAudioStreamDescriptor.ABI::class)
@Signature("{1e3692e4-4027-4847-a70b-df1d9a2a7b04}")
@Guid("1e3692e440274847a70bdf1d9a2a7b04")
@WinRTInterface("1e3692e440274847a70bdf1d9a2a7b04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStreamDescriptor.ByReference::class)
public interface IAudioStreamDescriptor : NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
  @InterfaceMethod(0)
  public fun get_EncodingProperties(): AudioEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStreamDescriptor> {
    public override fun getValue() = ABI.makeIAudioStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: IAudioStreamDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStreamDescriptor, IMediaStreamDescriptor.WithDefault {
    public val __1806875824_Ptr: Pointer?

    public val _1806875824_VtblPtr: Pointer?
      get() = __1806875824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _1806875824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1806875824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStreamDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
    public override val __1209088862_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1806875824_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1806875824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStreamDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e3692e440274847a70bdf1d9a2a7b04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStreamDescriptor(ptr: Pointer?): WithDefault =
        IAudioStreamDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStreamDescriptor {
      val address = segment.toRawLongValue()
      return makeIAudioStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IAudioStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1806875824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStreamDescriptor): Array<IAudioStreamDescriptor?> =
        (elements as
        Array<IAudioStreamDescriptor?>).castToImpl<IAudioStreamDescriptor,IAudioStreamDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStreamDescriptor?> =
        arrayOfNulls<IAudioStreamDescriptor_Impl>(size) as Array<IAudioStreamDescriptor?>
  }
}
