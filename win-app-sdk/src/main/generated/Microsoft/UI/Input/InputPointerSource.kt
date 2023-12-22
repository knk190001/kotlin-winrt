package Microsoft.UI.Input

import Microsoft.UI.Composition.Visual
import Microsoft.UI.Content.ContentIsland
import Microsoft.UI.WindowId
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

@ABIMarker(InputPointerSource.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputPointerSource;{6a6c2764-c3f4-5be5-8447-c9a98766c240})")
@WinRTByReference(brClass = InputPointerSource.ByReference::class)
public class InputPointerSource(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputPointerSource.WithDefault, IInputPointerSource2.WithDefault,
    IWinRTObject {
  private val __241873337_Interface: IInputPointerSource.WithDefault by lazy {
    as_241873337()
  }


  private val __1091861195_Interface: IInputPointerSource2.WithDefault by lazy {
    as_1091861195()
  }


  public override val __241873337_Ptr: JNAPointer? by lazy {
    __241873337_Interface.__241873337_Ptr
  }


  public override val __1091861195_Ptr: JNAPointer? by lazy {
    __1091861195_Interface.__1091861195_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__241873337_Interface, __1091861195_Interface)

  private fun as_241873337(): IInputPointerSource.WithDefault {
    if(pointer == NULL) {
      return(IInputPointerSource.ABI.makeIInputPointerSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPointerSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPointerSource.ABI.makeIInputPointerSource(ref.value))
  }

  private fun as_1091861195(): IInputPointerSource2.WithDefault {
    if(pointer == NULL) {
      return(IInputPointerSource2.ABI.makeIInputPointerSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPointerSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPointerSource2.ABI.makeIInputPointerSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputPointerSource> {
    public override fun getValue() = InputPointerSource(pointer.getPointer(0))

    public fun setValue(value: InputPointerSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputPointerSource, MemoryAddress> {
    public val IInputPointerSourceStatics2_Instance: IInputPointerSourceStatics2 by lazy {
      createIInputPointerSourceStatics2()
    }


    public val IInputPointerSourceStatics_Instance: IInputPointerSourceStatics by lazy {
      createIInputPointerSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputPointerSourceStatics2(): IInputPointerSourceStatics2 {
      val refiid = Guid.REFIID(IInputPointerSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputPointerSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputPointerSourceStatics2.ABI.makeIInputPointerSourceStatics2(interfacePtr.value)
      return result
    }

    public fun createIInputPointerSourceStatics(): IInputPointerSourceStatics {
      val refiid = Guid.REFIID(IInputPointerSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputPointerSource".toHandle(),refiid,interfacePtr)
      val result = IInputPointerSourceStatics.ABI.makeIInputPointerSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputPointerSource {
      val address = segment.toRawLongValue()
      return InputPointerSource(Pointer(address))
    }

    public override fun toNative(obj: InputPointerSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForVisual(visual: Visual) =
        ABI.IInputPointerSourceStatics2_Instance.GetForVisual(visual)

    public fun GetForWindowId(windowId: WindowId) =
        ABI.IInputPointerSourceStatics2_Instance.GetForWindowId(windowId)

    public fun RemoveForVisual(visual: Visual) =
        ABI.IInputPointerSourceStatics2_Instance.RemoveForVisual(visual)

    public fun GetForIsland(island: ContentIsland) =
        ABI.IInputPointerSourceStatics_Instance.GetForIsland(island)
  }
}
