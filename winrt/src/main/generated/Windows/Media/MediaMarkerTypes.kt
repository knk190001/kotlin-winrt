package Windows.Media

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

@ABIMarker(MediaMarkerTypes.ABI::class)
@WinRTByReference(brClass = MediaMarkerTypes.ByReference::class)
public class MediaMarkerTypes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaMarkerTypes> {
    public override fun getValue() = MediaMarkerTypes(pointer.getPointer(0))

    public fun setValue(value: MediaMarkerTypes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaMarkerTypes, MemoryAddress> {
    public val IMediaMarkerTypesStatics_Instance: IMediaMarkerTypesStatics by lazy {
      createIMediaMarkerTypesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaMarkerTypesStatics(): IMediaMarkerTypesStatics {
      val refiid = Guid.REFIID(IMediaMarkerTypesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaMarkerTypes".toHandle(),refiid,interfacePtr)
      val result = IMediaMarkerTypesStatics.ABI.makeIMediaMarkerTypesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaMarkerTypes {
      val address = segment.toRawLongValue()
      return MediaMarkerTypes(Pointer(address))
    }

    public override fun toNative(obj: MediaMarkerTypes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Bookmark() = ABI.IMediaMarkerTypesStatics_Instance.get_Bookmark()
  }
}
