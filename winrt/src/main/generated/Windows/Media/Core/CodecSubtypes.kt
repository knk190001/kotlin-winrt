package Windows.Media.Core

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CodecSubtypes.ABI::class)
@WinRTByReference(brClass = CodecSubtypes.ByReference::class)
public class CodecSubtypes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CodecSubtypes>
      {
    public override fun getValue() = CodecSubtypes(pointer.getPointer(0))

    public fun setValue(value: CodecSubtypes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CodecSubtypes, MemoryAddress> {
    public val ICodecSubtypesStatics_Instance: ICodecSubtypesStatics by lazy {
      createICodecSubtypesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICodecSubtypesStatics(): ICodecSubtypesStatics {
      val refiid = Guid.REFIID(ICodecSubtypesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.CodecSubtypes".toHandle(),refiid,interfacePtr)
      val result = ICodecSubtypesStatics.ABI.makeICodecSubtypesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CodecSubtypes {
      val address = segment.toRawLongValue()
      return CodecSubtypes(Pointer(address))
    }

    public override fun toNative(obj: CodecSubtypes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_VideoFormatDV25() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDV25()

    public fun get_VideoFormatDV50() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDV50()

    public fun get_VideoFormatDvc() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDvc()

    public fun get_VideoFormatDvh1() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDvh1()

    public fun get_VideoFormatDvhD() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDvhD()

    public fun get_VideoFormatDvsd() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDvsd()

    public fun get_VideoFormatDvsl() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatDvsl()

    public fun get_VideoFormatH263() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatH263()

    public fun get_VideoFormatH264() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatH264()

    public fun get_VideoFormatH265() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatH265()

    public fun get_VideoFormatH264ES() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatH264ES()

    public fun get_VideoFormatHevc() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatHevc()

    public fun get_VideoFormatHevcES() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatHevcES()

    public fun get_VideoFormatM4S2() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatM4S2()

    public fun get_VideoFormatMjpg() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMjpg()

    public fun get_VideoFormatMP43() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMP43()

    public fun get_VideoFormatMP4S() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMP4S()

    public fun get_VideoFormatMP4V() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMP4V()

    public fun get_VideoFormatMpeg2() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMpeg2()

    public fun get_VideoFormatVP80() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatVP80()

    public fun get_VideoFormatVP90() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatVP90()

    public fun get_VideoFormatMpg1() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMpg1()

    public fun get_VideoFormatMss1() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMss1()

    public fun get_VideoFormatMss2() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatMss2()

    public fun get_VideoFormatWmv1() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatWmv1()

    public fun get_VideoFormatWmv2() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatWmv2()

    public fun get_VideoFormatWmv3() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatWmv3()

    public fun get_VideoFormatWvc1() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormatWvc1()

    public fun get_VideoFormat420O() = ABI.ICodecSubtypesStatics_Instance.get_VideoFormat420O()

    public fun get_AudioFormatAac() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAac()

    public fun get_AudioFormatAdts() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAdts()

    public fun get_AudioFormatAlac() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAlac()

    public fun get_AudioFormatAmrNB() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAmrNB()

    public fun get_AudioFormatAmrWB() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAmrWB()

    public fun get_AudioFormatAmrWP() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatAmrWP()

    public fun get_AudioFormatDolbyAC3() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatDolbyAC3()

    public fun get_AudioFormatDolbyAC3Spdif() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatDolbyAC3Spdif()

    public fun get_AudioFormatDolbyDDPlus() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatDolbyDDPlus()

    public fun get_AudioFormatDrm() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatDrm()

    public fun get_AudioFormatDts() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatDts()

    public fun get_AudioFormatFlac() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatFlac()

    public fun get_AudioFormatFloat() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatFloat()

    public fun get_AudioFormatMP3() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatMP3()

    public fun get_AudioFormatMPeg() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatMPeg()

    public fun get_AudioFormatMsp1() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatMsp1()

    public fun get_AudioFormatOpus() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatOpus()

    public fun get_AudioFormatPcm() = ABI.ICodecSubtypesStatics_Instance.get_AudioFormatPcm()

    public fun get_AudioFormatWmaSpdif() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatWmaSpdif()

    public fun get_AudioFormatWMAudioLossless() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatWMAudioLossless()

    public fun get_AudioFormatWMAudioV8() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatWMAudioV8()

    public fun get_AudioFormatWMAudioV9() =
        ABI.ICodecSubtypesStatics_Instance.get_AudioFormatWMAudioV9()
  }
}
