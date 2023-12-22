package Windows.Media.MediaProperties

import Windows.Media.MediaProperties.IMediaEncodingProperties.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAudioEncodingProperties.ABI::class)
@Signature("{62bc7a16-005c-4b3b-8a0b-0a090e9687f3}")
@Guid("62bc7a16005c4b3b8a0b0a090e9687f3")
@WinRTInterface("62bc7a16005c4b3b8a0b0a090e9687f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingProperties.ByReference::class)
public interface IAudioEncodingProperties : NativeMapped, IWinRTInterface, IMediaEncodingProperties
    {
  @InterfaceMethod(0)
  public fun put_Bitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_Bitrate(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_ChannelCount(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_ChannelCount(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_SampleRate(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_SampleRate(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_BitsPerSample(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_BitsPerSample(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingProperties> {
    public override fun getValue() = ABI.makeIAudioEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingProperties, IMediaEncodingProperties.WithDefault {
    public val __2055784821_Ptr: Pointer?

    public val _2055784821_VtblPtr: Pointer?
      get() = __2055784821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Bitrate(value: WinDef.UINT): Unit {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Bitrate(): WinDef.UINT {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ChannelCount(value: WinDef.UINT): Unit {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ChannelCount(): WinDef.UINT {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_SampleRate(value: WinDef.UINT): Unit {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SampleRate(): WinDef.UINT {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_BitsPerSample(value: WinDef.UINT): Unit {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_BitsPerSample(): WinDef.UINT {
      val fnPtr = _2055784821_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2055784821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioEncodingProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaEncodingProperties {
    public override val __1294923267_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2055784821_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2055784821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62bc7a16005c4b3b8a0b0a090e9687f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingProperties(ptr: Pointer?): WithDefault =
        IAudioEncodingProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEncodingProperties {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2055784821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingProperties):
        Array<IAudioEncodingProperties?> = (elements as
        Array<IAudioEncodingProperties?>).castToImpl<IAudioEncodingProperties,IAudioEncodingProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingProperties?> =
        arrayOfNulls<IAudioEncodingProperties_Impl>(size) as Array<IAudioEncodingProperties?>
  }
}
