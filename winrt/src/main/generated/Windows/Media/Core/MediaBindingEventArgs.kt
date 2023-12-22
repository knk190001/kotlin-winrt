package Windows.Media.Core

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

@ABIMarker(MediaBindingEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaBindingEventArgs;{b61cb25a-1b6d-4630-a86d-2f0837f712e5})")
@WinRTByReference(brClass = MediaBindingEventArgs.ByReference::class)
public class MediaBindingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBindingEventArgs.WithDefault, IMediaBindingEventArgs2.WithDefault,
    IMediaBindingEventArgs3.WithDefault, IWinRTObject {
  private val __1175088609_Interface: IMediaBindingEventArgs.WithDefault by lazy {
    as_1175088609()
  }


  private val __2068008561_Interface: IMediaBindingEventArgs2.WithDefault by lazy {
    as_2068008561()
  }


  private val __2068008562_Interface: IMediaBindingEventArgs3.WithDefault by lazy {
    as_2068008562()
  }


  public override val __1175088609_Ptr: JNAPointer? by lazy {
    __1175088609_Interface.__1175088609_Ptr
  }


  public override val __2068008561_Ptr: JNAPointer? by lazy {
    __2068008561_Interface.__2068008561_Ptr
  }


  public override val __2068008562_Ptr: JNAPointer? by lazy {
    __2068008562_Interface.__2068008562_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1175088609_Interface, __2068008561_Interface, __2068008562_Interface)

  private fun as_1175088609(): IMediaBindingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaBindingEventArgs.ABI.makeIMediaBindingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBindingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBindingEventArgs.ABI.makeIMediaBindingEventArgs(ref.value))
  }

  private fun as_2068008561(): IMediaBindingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMediaBindingEventArgs2.ABI.makeIMediaBindingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBindingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBindingEventArgs2.ABI.makeIMediaBindingEventArgs2(ref.value))
  }

  private fun as_2068008562(): IMediaBindingEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IMediaBindingEventArgs3.ABI.makeIMediaBindingEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBindingEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBindingEventArgs3.ABI.makeIMediaBindingEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBindingEventArgs> {
    public override fun getValue() = MediaBindingEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaBindingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBindingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBindingEventArgs {
      val address = segment.toRawLongValue()
      return MediaBindingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaBindingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
