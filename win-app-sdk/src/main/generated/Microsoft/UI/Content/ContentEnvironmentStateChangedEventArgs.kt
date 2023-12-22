package Microsoft.UI.Content

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

@ABIMarker(ContentEnvironmentStateChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentEnvironmentStateChangedEventArgs;{8970fa4f-10ba-5f67-970b-8c72bc009b67})")
@WinRTByReference(brClass = ContentEnvironmentStateChangedEventArgs.ByReference::class)
public class ContentEnvironmentStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentEnvironmentStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __2036426192_Interface: IContentEnvironmentStateChangedEventArgs.WithDefault by lazy {
    as_2036426192()
  }


  public override val __2036426192_Ptr: JNAPointer? by lazy {
    __2036426192_Interface.__2036426192_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2036426192_Interface)

  private fun as_2036426192(): IContentEnvironmentStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentEnvironmentStateChangedEventArgs.ABI.makeIContentEnvironmentStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentEnvironmentStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentEnvironmentStateChangedEventArgs.ABI.makeIContentEnvironmentStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentEnvironmentStateChangedEventArgs> {
    public override fun getValue() = ContentEnvironmentStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentEnvironmentStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentEnvironmentStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContentEnvironmentStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return ContentEnvironmentStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentEnvironmentStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
