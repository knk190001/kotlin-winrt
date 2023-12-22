package Microsoft.UI.Xaml.Media

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

@ABIMarker(LoadedImageSourceLoadCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.LoadedImageSourceLoadCompletedEventArgs;{4121bb7c-48e8-542d-b950-3ea7e709c0d6})")
@WinRTByReference(brClass = LoadedImageSourceLoadCompletedEventArgs.ByReference::class)
public class LoadedImageSourceLoadCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoadedImageSourceLoadCompletedEventArgs.WithDefault, IWinRTObject {
  private val __344246222_Interface: ILoadedImageSourceLoadCompletedEventArgs.WithDefault by lazy {
    as_344246222()
  }


  public override val __344246222_Ptr: JNAPointer? by lazy {
    __344246222_Interface.__344246222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__344246222_Interface)

  private fun as_344246222(): ILoadedImageSourceLoadCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILoadedImageSourceLoadCompletedEventArgs.ABI.makeILoadedImageSourceLoadCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoadedImageSourceLoadCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoadedImageSourceLoadCompletedEventArgs.ABI.makeILoadedImageSourceLoadCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoadedImageSourceLoadCompletedEventArgs> {
    public override fun getValue() = LoadedImageSourceLoadCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LoadedImageSourceLoadCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoadedImageSourceLoadCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        LoadedImageSourceLoadCompletedEventArgs {
      val address = segment.toRawLongValue()
      return LoadedImageSourceLoadCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LoadedImageSourceLoadCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
