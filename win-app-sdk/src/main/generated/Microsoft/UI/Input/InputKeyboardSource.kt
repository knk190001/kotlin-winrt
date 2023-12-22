package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
import Microsoft.UI.WindowId
import Windows.System.VirtualKey
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputKeyboardSource.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputKeyboardSource;{ed61b906-16ad-5df7-a550-5e6f7d2229f7})")
@WinRTByReference(brClass = InputKeyboardSource.ByReference::class)
public class InputKeyboardSource(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputKeyboardSource.WithDefault, IInputKeyboardSource2.WithDefault,
    IInputKeyboardSource3.WithDefault, IWinRTObject {
  private val __1135711027_Interface: IInputKeyboardSource.WithDefault by lazy {
    as_1135711027()
  }


  private val __847303519_Interface: IInputKeyboardSource2.WithDefault by lazy {
    as_847303519()
  }


  private val __847303520_Interface: IInputKeyboardSource3.WithDefault by lazy {
    as_847303520()
  }


  public override val __1135711027_Ptr: JNAPointer? by lazy {
    __1135711027_Interface.__1135711027_Ptr
  }


  public override val __847303519_Ptr: JNAPointer? by lazy {
    __847303519_Interface.__847303519_Ptr
  }


  public override val __847303520_Ptr: JNAPointer? by lazy {
    __847303520_Interface.__847303520_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1135711027_Interface, __847303519_Interface, __847303520_Interface)

  private fun as_1135711027(): IInputKeyboardSource.WithDefault {
    if(pointer == NULL) {
      return(IInputKeyboardSource.ABI.makeIInputKeyboardSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputKeyboardSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputKeyboardSource.ABI.makeIInputKeyboardSource(ref.value))
  }

  private fun as_847303519(): IInputKeyboardSource2.WithDefault {
    if(pointer == NULL) {
      return(IInputKeyboardSource2.ABI.makeIInputKeyboardSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputKeyboardSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputKeyboardSource2.ABI.makeIInputKeyboardSource2(ref.value))
  }

  private fun as_847303520(): IInputKeyboardSource3.WithDefault {
    if(pointer == NULL) {
      return(IInputKeyboardSource3.ABI.makeIInputKeyboardSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputKeyboardSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputKeyboardSource3.ABI.makeIInputKeyboardSource3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputKeyboardSource> {
    public override fun getValue() = InputKeyboardSource(pointer.getPointer(0))

    public fun setValue(value: InputKeyboardSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputKeyboardSource, MemoryAddress> {
    public val IInputKeyboardSourceStatics3_Instance: IInputKeyboardSourceStatics3 by lazy {
      createIInputKeyboardSourceStatics3()
    }


    public val IInputKeyboardSourceStatics_Instance: IInputKeyboardSourceStatics by lazy {
      createIInputKeyboardSourceStatics()
    }


    public val IInputKeyboardSourceStatics2_Instance: IInputKeyboardSourceStatics2 by lazy {
      createIInputKeyboardSourceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputKeyboardSourceStatics3(): IInputKeyboardSourceStatics3 {
      val refiid = Guid.REFIID(IInputKeyboardSourceStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputKeyboardSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputKeyboardSourceStatics3.ABI.makeIInputKeyboardSourceStatics3(interfacePtr.value)
      return result
    }

    public fun createIInputKeyboardSourceStatics(): IInputKeyboardSourceStatics {
      val refiid = Guid.REFIID(IInputKeyboardSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputKeyboardSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputKeyboardSourceStatics.ABI.makeIInputKeyboardSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIInputKeyboardSourceStatics2(): IInputKeyboardSourceStatics2 {
      val refiid = Guid.REFIID(IInputKeyboardSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputKeyboardSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputKeyboardSourceStatics2.ABI.makeIInputKeyboardSourceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputKeyboardSource {
      val address = segment.toRawLongValue()
      return InputKeyboardSource(Pointer(address))
    }

    public override fun toNative(obj: InputKeyboardSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForWindowId(windowId: WindowId) =
        ABI.IInputKeyboardSourceStatics3_Instance.GetForWindowId(windowId)

    public fun GetKeyStateForCurrentThread(virtualKey: VirtualKey) =
        ABI.IInputKeyboardSourceStatics_Instance.GetKeyStateForCurrentThread(virtualKey)

    public fun GetForIsland(island: ContentIsland) =
        ABI.IInputKeyboardSourceStatics2_Instance.GetForIsland(island)
  }
}
