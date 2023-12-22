package Windows.UI.Xaml.Media

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
@Signature("rc(Windows.UI.Xaml.Media.LoadedImageSourceLoadCompletedEventArgs;{1ac60b1e-7837-4489-b3e5-d0d5ad0a56c4})")
@WinRTByReference(brClass = LoadedImageSourceLoadCompletedEventArgs.ByReference::class)
public class LoadedImageSourceLoadCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoadedImageSourceLoadCompletedEventArgs.WithDefault, IWinRTObject {
  private val __2135162873_Interface: ILoadedImageSourceLoadCompletedEventArgs.WithDefault by lazy {
    as_2135162873()
  }


  public override val __2135162873_Ptr: JNAPointer? by lazy {
    __2135162873_Interface.__2135162873_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2135162873_Interface)

  private fun as_2135162873(): ILoadedImageSourceLoadCompletedEventArgs.WithDefault {
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
