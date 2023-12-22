package Windows.Media.Editing

import Windows.Foundation.TimeSpan
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Storage.IStorageFile
import Windows.UI.Color
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(MediaClip.ABI::class)
@Signature("rc(Windows.Media.Editing.MediaClip;{53f25366-5fba-3ea4-8693-24761811140a})")
@WinRTByReference(brClass = MediaClip.ByReference::class)
public class MediaClip(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaClip.WithDefault, IWinRTObject {
  private val __588491698_Interface: IMediaClip.WithDefault by lazy {
    as_588491698()
  }


  public override val __588491698_Ptr: JNAPointer? by lazy {
    __588491698_Interface.__588491698_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__588491698_Interface)

  private fun as_588491698(): IMediaClip.WithDefault {
    if(pointer == NULL) {
      return(IMediaClip.ABI.makeIMediaClip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaClip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaClip.ABI.makeIMediaClip(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaClip> {
    public override fun getValue() = MediaClip(pointer.getPointer(0))

    public fun setValue(value: MediaClip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaClip, MemoryAddress> {
    public val IMediaClipStatics2_Instance: IMediaClipStatics2 by lazy {
      createIMediaClipStatics2()
    }


    public val IMediaClipStatics_Instance: IMediaClipStatics by lazy {
      createIMediaClipStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaClipStatics2(): IMediaClipStatics2 {
      val refiid = Guid.REFIID(IMediaClipStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Editing.MediaClip".toHandle(),refiid,interfacePtr)
      val result = IMediaClipStatics2.ABI.makeIMediaClipStatics2(interfacePtr.value)
      return result
    }

    public fun createIMediaClipStatics(): IMediaClipStatics {
      val refiid = Guid.REFIID(IMediaClipStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Editing.MediaClip".toHandle(),refiid,interfacePtr)
      val result = IMediaClipStatics.ABI.makeIMediaClipStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaClip {
      val address = segment.toRawLongValue()
      return MediaClip(Pointer(address))
    }

    public override fun toNative(obj: MediaClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromSurface(surface: IDirect3DSurface, originalDuration: TimeSpan) =
        ABI.IMediaClipStatics2_Instance.CreateFromSurface(surface, originalDuration)

    public fun CreateFromColor(color: Color, originalDuration: TimeSpan) =
        ABI.IMediaClipStatics_Instance.CreateFromColor(color, originalDuration)

    public fun CreateFromFileAsync(`file`: IStorageFile) =
        ABI.IMediaClipStatics_Instance.CreateFromFileAsync(file)

    public fun CreateFromImageFileAsync(`file`: IStorageFile, originalDuration: TimeSpan) =
        ABI.IMediaClipStatics_Instance.CreateFromImageFileAsync(file, originalDuration)
  }
}
