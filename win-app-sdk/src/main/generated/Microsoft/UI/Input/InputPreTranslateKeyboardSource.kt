package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputPreTranslateKeyboardSource.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputPreTranslateKeyboardSource;{2f327feb-b7e7-5e37-a0cc-37dcabe76588})")
@WinRTByReference(brClass = InputPreTranslateKeyboardSource.ByReference::class)
public class InputPreTranslateKeyboardSource(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputPreTranslateKeyboardSource.WithDefault, IWinRTObject {
  private val __1825692798_Interface: IInputPreTranslateKeyboardSource.WithDefault by lazy {
    as_1825692798()
  }


  public override val __1825692798_Ptr: JNAPointer? by lazy {
    __1825692798_Interface.__1825692798_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1825692798_Interface)

  private fun as_1825692798(): IInputPreTranslateKeyboardSource.WithDefault {
    if(pointer == NULL) {
      return(IInputPreTranslateKeyboardSource.ABI.makeIInputPreTranslateKeyboardSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPreTranslateKeyboardSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPreTranslateKeyboardSource.ABI.makeIInputPreTranslateKeyboardSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputPreTranslateKeyboardSource> {
    public override fun getValue() = InputPreTranslateKeyboardSource(pointer.getPointer(0))

    public fun setValue(value: InputPreTranslateKeyboardSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputPreTranslateKeyboardSource, MemoryAddress> {
    public val IInputPreTranslateKeyboardSourceStatics_Instance:
        IInputPreTranslateKeyboardSourceStatics by lazy {
      createIInputPreTranslateKeyboardSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputPreTranslateKeyboardSourceStatics():
        IInputPreTranslateKeyboardSourceStatics {
      val refiid = Guid.REFIID(IInputPreTranslateKeyboardSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputPreTranslateKeyboardSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputPreTranslateKeyboardSourceStatics.ABI.makeIInputPreTranslateKeyboardSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputPreTranslateKeyboardSource {
      val address = segment.toRawLongValue()
      return InputPreTranslateKeyboardSource(Pointer(address))
    }

    public override fun toNative(obj: InputPreTranslateKeyboardSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForIsland(island: ContentIsland) =
        ABI.IInputPreTranslateKeyboardSourceStatics_Instance.GetForIsland(island)
  }
}
