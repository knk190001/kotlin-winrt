package Windows.Media.Audio

import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.Effects.IAudioEffectDefinition.ABI.IID
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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IReverbEffectDefinition.ABI::class)
@Signature("{4606aa89-f563-4d0a-8f6e-f0cddff35d84}")
@Guid("4606aa89f5634d0a8f6ef0cddff35d84")
@WinRTInterface("4606aa89f5634d0a8f6ef0cddff35d84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReverbEffectDefinition.ByReference::class)
public interface IReverbEffectDefinition : NativeMapped, IWinRTInterface, IAudioEffectDefinition {
  @InterfaceMethod(0)
  public fun put_WetDryMix(value: Double): Unit

  @InterfaceMethod(1)
  public fun get_WetDryMix(): Double

  @InterfaceMethod(2)
  public fun put_ReflectionsDelay(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_ReflectionsDelay(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_ReverbDelay(value: Byte): Unit

  @InterfaceMethod(5)
  public fun get_ReverbDelay(): Byte

  @InterfaceMethod(6)
  public fun put_RearDelay(value: Byte): Unit

  @InterfaceMethod(7)
  public fun get_RearDelay(): Byte

  @InterfaceMethod(8)
  public fun put_PositionLeft(value: Byte): Unit

  @InterfaceMethod(9)
  public fun get_PositionLeft(): Byte

  @InterfaceMethod(10)
  public fun put_PositionRight(value: Byte): Unit

  @InterfaceMethod(11)
  public fun get_PositionRight(): Byte

  @InterfaceMethod(12)
  public fun put_PositionMatrixLeft(value: Byte): Unit

  @InterfaceMethod(13)
  public fun get_PositionMatrixLeft(): Byte

  @InterfaceMethod(14)
  public fun put_PositionMatrixRight(value: Byte): Unit

  @InterfaceMethod(15)
  public fun get_PositionMatrixRight(): Byte

  @InterfaceMethod(16)
  public fun put_EarlyDiffusion(value: Byte): Unit

  @InterfaceMethod(17)
  public fun get_EarlyDiffusion(): Byte

  @InterfaceMethod(18)
  public fun put_LateDiffusion(value: Byte): Unit

  @InterfaceMethod(19)
  public fun get_LateDiffusion(): Byte

  @InterfaceMethod(20)
  public fun put_LowEQGain(value: Byte): Unit

  @InterfaceMethod(21)
  public fun get_LowEQGain(): Byte

  @InterfaceMethod(22)
  public fun put_LowEQCutoff(value: Byte): Unit

  @InterfaceMethod(23)
  public fun get_LowEQCutoff(): Byte

  @InterfaceMethod(24)
  public fun put_HighEQGain(value: Byte): Unit

  @InterfaceMethod(25)
  public fun get_HighEQGain(): Byte

  @InterfaceMethod(26)
  public fun put_HighEQCutoff(value: Byte): Unit

  @InterfaceMethod(27)
  public fun get_HighEQCutoff(): Byte

  @InterfaceMethod(28)
  public fun put_RoomFilterFreq(value: Double): Unit

  @InterfaceMethod(29)
  public fun get_RoomFilterFreq(): Double

  @InterfaceMethod(30)
  public fun put_RoomFilterMain(value: Double): Unit

  @InterfaceMethod(31)
  public fun get_RoomFilterMain(): Double

  @InterfaceMethod(32)
  public fun put_RoomFilterHF(value: Double): Unit

  @InterfaceMethod(33)
  public fun get_RoomFilterHF(): Double

  @InterfaceMethod(34)
  public fun put_ReflectionsGain(value: Double): Unit

  @InterfaceMethod(35)
  public fun get_ReflectionsGain(): Double

  @InterfaceMethod(36)
  public fun put_ReverbGain(value: Double): Unit

  @InterfaceMethod(37)
  public fun get_ReverbGain(): Double

  @InterfaceMethod(38)
  public fun put_DecayTime(value: Double): Unit

  @InterfaceMethod(39)
  public fun get_DecayTime(): Double

  @InterfaceMethod(40)
  public fun put_Density(value: Double): Unit

  @InterfaceMethod(41)
  public fun get_Density(): Double

  @InterfaceMethod(42)
  public fun put_RoomSize(value: Double): Unit

  @InterfaceMethod(43)
  public fun get_RoomSize(): Double

  @InterfaceMethod(44)
  public fun put_DisableLateField(value: Boolean): Unit

  @InterfaceMethod(45)
  public fun get_DisableLateField(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReverbEffectDefinition> {
    public override fun getValue() = ABI.makeIReverbEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IReverbEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReverbEffectDefinition, IAudioEffectDefinition.WithDefault {
    public val __510138430_Ptr: Pointer?

    public val _510138430_VtblPtr: Pointer?
      get() = __510138430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_WetDryMix(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_WetDryMix(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ReflectionsDelay(value: WinDef.UINT): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ReflectionsDelay(): WinDef.UINT {
      val fnPtr = _510138430_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_ReverbDelay(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ReverbDelay(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_RearDelay(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_RearDelay(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_PositionLeft(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_PositionLeft(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_PositionRight(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_PositionRight(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_PositionMatrixLeft(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_PositionMatrixLeft(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_PositionMatrixRight(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_PositionMatrixRight(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_EarlyDiffusion(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_EarlyDiffusion(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_LateDiffusion(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_LateDiffusion(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_LowEQGain(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_LowEQGain(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_LowEQCutoff(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_LowEQCutoff(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun put_HighEQGain(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_HighEQGain(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_HighEQCutoff(value: Byte): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_HighEQCutoff(): Byte {
      val fnPtr = _510138430_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun put_RoomFilterFreq(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_RoomFilterFreq(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_RoomFilterMain(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_RoomFilterMain(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun put_RoomFilterHF(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_RoomFilterHF(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun put_ReflectionsGain(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_ReflectionsGain(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun put_ReverbGain(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_ReverbGain(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun put_DecayTime(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_DecayTime(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun put_Density(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_Density(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(42)
    public override fun put_RoomSize(value: Double): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_RoomSize(): Double {
      val fnPtr = _510138430_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(44)
    public override fun put_DisableLateField(value: Boolean): Unit {
      val fnPtr = _510138430_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_DisableLateField(): Boolean {
      val fnPtr = _510138430_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__510138430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IReverbEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioEffectDefinition {
    public override val __1562923618_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_510138430_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __510138430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReverbEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4606aa89f5634d0a8f6ef0cddff35d84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReverbEffectDefinition(ptr: Pointer?): WithDefault =
        IReverbEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReverbEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIReverbEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IReverbEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510138430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReverbEffectDefinition): Array<IReverbEffectDefinition?>
        = (elements as
        Array<IReverbEffectDefinition?>).castToImpl<IReverbEffectDefinition,IReverbEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReverbEffectDefinition?> =
        arrayOfNulls<IReverbEffectDefinition_Impl>(size) as Array<IReverbEffectDefinition?>
  }
}
