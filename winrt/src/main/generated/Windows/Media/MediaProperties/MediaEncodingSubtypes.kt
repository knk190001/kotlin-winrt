package Windows.Media.MediaProperties

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(MediaEncodingSubtypes.ABI::class)
@WinRTByReference(brClass = MediaEncodingSubtypes.ByReference::class)
public class MediaEncodingSubtypes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaEncodingSubtypes> {
    public override fun getValue() = MediaEncodingSubtypes(pointer.getPointer(0))

    public fun setValue(value: MediaEncodingSubtypes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaEncodingSubtypes, MemoryAddress> {
    public val IMediaEncodingSubtypesStatics2_Instance: IMediaEncodingSubtypesStatics2 by lazy {
      createIMediaEncodingSubtypesStatics2()
    }


    public val IMediaEncodingSubtypesStatics5_Instance: IMediaEncodingSubtypesStatics5 by lazy {
      createIMediaEncodingSubtypesStatics5()
    }


    public val IMediaEncodingSubtypesStatics3_Instance: IMediaEncodingSubtypesStatics3 by lazy {
      createIMediaEncodingSubtypesStatics3()
    }


    public val IMediaEncodingSubtypesStatics_Instance: IMediaEncodingSubtypesStatics by lazy {
      createIMediaEncodingSubtypesStatics()
    }


    public val IMediaEncodingSubtypesStatics4_Instance: IMediaEncodingSubtypesStatics4 by lazy {
      createIMediaEncodingSubtypesStatics4()
    }


    public val IMediaEncodingSubtypesStatics6_Instance: IMediaEncodingSubtypesStatics6 by lazy {
      createIMediaEncodingSubtypesStatics6()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaEncodingSubtypesStatics2(): IMediaEncodingSubtypesStatics2 {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics2.ABI.makeIMediaEncodingSubtypesStatics2(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingSubtypesStatics5(): IMediaEncodingSubtypesStatics5 {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics5.ABI.makeIMediaEncodingSubtypesStatics5(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingSubtypesStatics3(): IMediaEncodingSubtypesStatics3 {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics3.ABI.makeIMediaEncodingSubtypesStatics3(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingSubtypesStatics(): IMediaEncodingSubtypesStatics {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics.ABI.makeIMediaEncodingSubtypesStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingSubtypesStatics4(): IMediaEncodingSubtypesStatics4 {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics4.ABI.makeIMediaEncodingSubtypesStatics4(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingSubtypesStatics6(): IMediaEncodingSubtypesStatics6 {
      val refiid = Guid.REFIID(IMediaEncodingSubtypesStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingSubtypes".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingSubtypesStatics6.ABI.makeIMediaEncodingSubtypesStatics6(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaEncodingSubtypes {
      val address = segment.toRawLongValue()
      return MediaEncodingSubtypes(Pointer(address))
    }

    public override fun toNative(obj: MediaEncodingSubtypes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Vp9() = ABI.IMediaEncodingSubtypesStatics2_Instance.get_Vp9()

    public fun get_L8() = ABI.IMediaEncodingSubtypesStatics2_Instance.get_L8()

    public fun get_L16() = ABI.IMediaEncodingSubtypesStatics2_Instance.get_L16()

    public fun get_D16() = ABI.IMediaEncodingSubtypesStatics2_Instance.get_D16()

    public fun get_Heif() = ABI.IMediaEncodingSubtypesStatics5_Instance.get_Heif()

    public fun get_Alac() = ABI.IMediaEncodingSubtypesStatics3_Instance.get_Alac()

    public fun get_Flac() = ABI.IMediaEncodingSubtypesStatics3_Instance.get_Flac()

    public fun get_Aac() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Aac()

    public fun get_AacAdts() = ABI.IMediaEncodingSubtypesStatics_Instance.get_AacAdts()

    public fun get_Ac3() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Ac3()

    public fun get_AmrNb() = ABI.IMediaEncodingSubtypesStatics_Instance.get_AmrNb()

    public fun get_AmrWb() = ABI.IMediaEncodingSubtypesStatics_Instance.get_AmrWb()

    public fun get_Argb32() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Argb32()

    public fun get_Asf() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Asf()

    public fun get_Avi() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Avi()

    public fun get_Bgra8() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Bgra8()

    public fun get_Bmp() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Bmp()

    public fun get_Eac3() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Eac3()

    public fun get_Float() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Float()

    public fun get_Gif() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Gif()

    public fun get_H263() = ABI.IMediaEncodingSubtypesStatics_Instance.get_H263()

    public fun get_H264() = ABI.IMediaEncodingSubtypesStatics_Instance.get_H264()

    public fun get_H264Es() = ABI.IMediaEncodingSubtypesStatics_Instance.get_H264Es()

    public fun get_Hevc() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Hevc()

    public fun get_HevcEs() = ABI.IMediaEncodingSubtypesStatics_Instance.get_HevcEs()

    public fun get_Iyuv() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Iyuv()

    public fun get_Jpeg() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Jpeg()

    public fun get_JpegXr() = ABI.IMediaEncodingSubtypesStatics_Instance.get_JpegXr()

    public fun get_Mjpg() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mjpg()

    public fun get_Mpeg() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mpeg()

    public fun get_Mpeg1() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mpeg1()

    public fun get_Mpeg2() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mpeg2()

    public fun get_Mp3() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mp3()

    public fun get_Mpeg4() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Mpeg4()

    public fun get_Nv12() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Nv12()

    public fun get_Pcm() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Pcm()

    public fun get_Png() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Png()

    public fun get_Rgb24() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Rgb24()

    public fun get_Rgb32() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Rgb32()

    public fun get_Tiff() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Tiff()

    public fun get_Wave() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Wave()

    public fun get_Wma8() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Wma8()

    public fun get_Wma9() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Wma9()

    public fun get_Wmv3() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Wmv3()

    public fun get_Wvc1() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Wvc1()

    public fun get_Yuy2() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Yuy2()

    public fun get_Yv12() = ABI.IMediaEncodingSubtypesStatics_Instance.get_Yv12()

    public fun get_P010() = ABI.IMediaEncodingSubtypesStatics4_Instance.get_P010()

    public fun get_Pgs() = ABI.IMediaEncodingSubtypesStatics6_Instance.get_Pgs()

    public fun get_Srt() = ABI.IMediaEncodingSubtypesStatics6_Instance.get_Srt()

    public fun get_Ssa() = ABI.IMediaEncodingSubtypesStatics6_Instance.get_Ssa()

    public fun get_VobSub() = ABI.IMediaEncodingSubtypesStatics6_Instance.get_VobSub()
  }
}
