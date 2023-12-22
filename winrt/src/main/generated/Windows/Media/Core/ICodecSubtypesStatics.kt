package Windows.Media.Core

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

@ABIMarker(ICodecSubtypesStatics.ABI::class)
@Signature("{a66ac4f2-888b-4224-8cf6-2a8d4eb02382}")
@Guid("a66ac4f2888b42248cf62a8d4eb02382")
@WinRTInterface("a66ac4f2888b42248cf62a8d4eb02382")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICodecSubtypesStatics.ByReference::class)
public interface ICodecSubtypesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoFormatDV25(): String?

  @InterfaceMethod(1)
  public fun get_VideoFormatDV50(): String?

  @InterfaceMethod(2)
  public fun get_VideoFormatDvc(): String?

  @InterfaceMethod(3)
  public fun get_VideoFormatDvh1(): String?

  @InterfaceMethod(4)
  public fun get_VideoFormatDvhD(): String?

  @InterfaceMethod(5)
  public fun get_VideoFormatDvsd(): String?

  @InterfaceMethod(6)
  public fun get_VideoFormatDvsl(): String?

  @InterfaceMethod(7)
  public fun get_VideoFormatH263(): String?

  @InterfaceMethod(8)
  public fun get_VideoFormatH264(): String?

  @InterfaceMethod(9)
  public fun get_VideoFormatH265(): String?

  @InterfaceMethod(10)
  public fun get_VideoFormatH264ES(): String?

  @InterfaceMethod(11)
  public fun get_VideoFormatHevc(): String?

  @InterfaceMethod(12)
  public fun get_VideoFormatHevcES(): String?

  @InterfaceMethod(13)
  public fun get_VideoFormatM4S2(): String?

  @InterfaceMethod(14)
  public fun get_VideoFormatMjpg(): String?

  @InterfaceMethod(15)
  public fun get_VideoFormatMP43(): String?

  @InterfaceMethod(16)
  public fun get_VideoFormatMP4S(): String?

  @InterfaceMethod(17)
  public fun get_VideoFormatMP4V(): String?

  @InterfaceMethod(18)
  public fun get_VideoFormatMpeg2(): String?

  @InterfaceMethod(19)
  public fun get_VideoFormatVP80(): String?

  @InterfaceMethod(20)
  public fun get_VideoFormatVP90(): String?

  @InterfaceMethod(21)
  public fun get_VideoFormatMpg1(): String?

  @InterfaceMethod(22)
  public fun get_VideoFormatMss1(): String?

  @InterfaceMethod(23)
  public fun get_VideoFormatMss2(): String?

  @InterfaceMethod(24)
  public fun get_VideoFormatWmv1(): String?

  @InterfaceMethod(25)
  public fun get_VideoFormatWmv2(): String?

  @InterfaceMethod(26)
  public fun get_VideoFormatWmv3(): String?

  @InterfaceMethod(27)
  public fun get_VideoFormatWvc1(): String?

  @InterfaceMethod(28)
  public fun get_VideoFormat420O(): String?

  @InterfaceMethod(29)
  public fun get_AudioFormatAac(): String?

  @InterfaceMethod(30)
  public fun get_AudioFormatAdts(): String?

  @InterfaceMethod(31)
  public fun get_AudioFormatAlac(): String?

  @InterfaceMethod(32)
  public fun get_AudioFormatAmrNB(): String?

  @InterfaceMethod(33)
  public fun get_AudioFormatAmrWB(): String?

  @InterfaceMethod(34)
  public fun get_AudioFormatAmrWP(): String?

  @InterfaceMethod(35)
  public fun get_AudioFormatDolbyAC3(): String?

  @InterfaceMethod(36)
  public fun get_AudioFormatDolbyAC3Spdif(): String?

  @InterfaceMethod(37)
  public fun get_AudioFormatDolbyDDPlus(): String?

  @InterfaceMethod(38)
  public fun get_AudioFormatDrm(): String?

  @InterfaceMethod(39)
  public fun get_AudioFormatDts(): String?

  @InterfaceMethod(40)
  public fun get_AudioFormatFlac(): String?

  @InterfaceMethod(41)
  public fun get_AudioFormatFloat(): String?

  @InterfaceMethod(42)
  public fun get_AudioFormatMP3(): String?

  @InterfaceMethod(43)
  public fun get_AudioFormatMPeg(): String?

  @InterfaceMethod(44)
  public fun get_AudioFormatMsp1(): String?

  @InterfaceMethod(45)
  public fun get_AudioFormatOpus(): String?

  @InterfaceMethod(46)
  public fun get_AudioFormatPcm(): String?

  @InterfaceMethod(47)
  public fun get_AudioFormatWmaSpdif(): String?

  @InterfaceMethod(48)
  public fun get_AudioFormatWMAudioLossless(): String?

  @InterfaceMethod(49)
  public fun get_AudioFormatWMAudioV8(): String?

  @InterfaceMethod(50)
  public fun get_AudioFormatWMAudioV9(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICodecSubtypesStatics> {
    public override fun getValue() = ABI.makeICodecSubtypesStatics(pointer.getPointer(0))

    public fun setValue(value: ICodecSubtypesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICodecSubtypesStatics {
    public val __1397597867_Ptr: Pointer?

    public val _1397597867_VtblPtr: Pointer?
      get() = __1397597867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoFormatDV25(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoFormatDV50(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VideoFormatDvc(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VideoFormatDvh1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VideoFormatDvhD(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VideoFormatDvsd(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_VideoFormatDvsl(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_VideoFormatH263(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_VideoFormatH264(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_VideoFormatH265(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_VideoFormatH264ES(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_VideoFormatHevc(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_VideoFormatHevcES(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_VideoFormatM4S2(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_VideoFormatMjpg(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_VideoFormatMP43(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_VideoFormatMP4S(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_VideoFormatMP4V(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_VideoFormatMpeg2(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_VideoFormatVP80(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_VideoFormatVP90(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_VideoFormatMpg1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_VideoFormatMss1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_VideoFormatMss2(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_VideoFormatWmv1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_VideoFormatWmv2(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_VideoFormatWmv3(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_VideoFormatWvc1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_VideoFormat420O(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_AudioFormatAac(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_AudioFormatAdts(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_AudioFormatAlac(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_AudioFormatAmrNB(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_AudioFormatAmrWB(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_AudioFormatAmrWP(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_AudioFormatDolbyAC3(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_AudioFormatDolbyAC3Spdif(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_AudioFormatDolbyDDPlus(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_AudioFormatDrm(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_AudioFormatDts(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun get_AudioFormatFlac(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_AudioFormatFloat(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun get_AudioFormatMP3(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_AudioFormatMPeg(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_AudioFormatMsp1(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun get_AudioFormatOpus(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_AudioFormatPcm(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_AudioFormatWmaSpdif(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_AudioFormatWMAudioLossless(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_AudioFormatWMAudioV8(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_AudioFormatWMAudioV9(): String? {
      val fnPtr = _1397597867_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1397597867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICodecSubtypesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1397597867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICodecSubtypesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a66ac4f2888b42248cf62a8d4eb02382")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICodecSubtypesStatics(ptr: Pointer?): WithDefault =
        ICodecSubtypesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICodecSubtypesStatics {
      val address = segment.toRawLongValue()
      return makeICodecSubtypesStatics(Pointer(address))
    }

    public override fun toNative(obj: ICodecSubtypesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1397597867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICodecSubtypesStatics): Array<ICodecSubtypesStatics?> =
        (elements as
        Array<ICodecSubtypesStatics?>).castToImpl<ICodecSubtypesStatics,ICodecSubtypesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICodecSubtypesStatics?> =
        arrayOfNulls<ICodecSubtypesStatics_Impl>(size) as Array<ICodecSubtypesStatics?>
  }
}
