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

@ABIMarker(SceneAnalyzedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.SceneAnalyzedEventArgs;{146b9588-2851-45e4-ad55-44cf8df8db4d})")
@WinRTByReference(brClass = SceneAnalyzedEventArgs.ByReference::class)
public class SceneAnalyzedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISceneAnalyzedEventArgs.WithDefault, IWinRTObject {
  private val __1850213064_Interface: ISceneAnalyzedEventArgs.WithDefault by lazy {
    as_1850213064()
  }


  public override val __1850213064_Ptr: JNAPointer? by lazy {
    __1850213064_Interface.__1850213064_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1850213064_Interface)

  private fun as_1850213064(): ISceneAnalyzedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISceneAnalyzedEventArgs.ABI.makeISceneAnalyzedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneAnalyzedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneAnalyzedEventArgs.ABI.makeISceneAnalyzedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneAnalyzedEventArgs> {
    public override fun getValue() = SceneAnalyzedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SceneAnalyzedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneAnalyzedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneAnalyzedEventArgs {
      val address = segment.toRawLongValue()
      return SceneAnalyzedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SceneAnalyzedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
