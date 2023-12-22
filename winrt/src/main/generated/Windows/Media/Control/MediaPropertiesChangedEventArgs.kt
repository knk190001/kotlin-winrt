package Windows.Media.Control

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

@ABIMarker(MediaPropertiesChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Control.MediaPropertiesChangedEventArgs;{7d3741cb-adf0-5cef-91ba-cfabcdd77678})")
@WinRTByReference(brClass = MediaPropertiesChangedEventArgs.ByReference::class)
public class MediaPropertiesChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPropertiesChangedEventArgs.WithDefault, IWinRTObject {
  private val __1902819367_Interface: IMediaPropertiesChangedEventArgs.WithDefault by lazy {
    as_1902819367()
  }


  public override val __1902819367_Ptr: JNAPointer? by lazy {
    __1902819367_Interface.__1902819367_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1902819367_Interface)

  private fun as_1902819367(): IMediaPropertiesChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPropertiesChangedEventArgs.ABI.makeIMediaPropertiesChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPropertiesChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPropertiesChangedEventArgs.ABI.makeIMediaPropertiesChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPropertiesChangedEventArgs> {
    public override fun getValue() = MediaPropertiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPropertiesChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPropertiesChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPropertiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPropertiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPropertiesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
