package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.ICompositionSupportsSystemBackdrop
import Microsoft.UI.Composition.Visual
import Microsoft.UI.IClosableNotifier
import Windows.Foundation.IClosable
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentIsland.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentIsland;{5b2504ba-361c-50aa-bd6e-4122c6d93889})")
@WinRTByReference(brClass = ContentIsland.ByReference::class)
public class ContentIsland(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentIsland.WithDefault, IContentIsland2.WithDefault,
    IClosable.WithDefault, IClosableNotifier.WithDefault,
    ICompositionSupportsSystemBackdrop.WithDefault, IWinRTObject {
  private val __1009738748_Interface: IContentIsland.WithDefault by lazy {
    as_1009738748()
  }


  private val __1237130066_Interface: IContentIsland2.WithDefault by lazy {
    as_1237130066()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __105354978_Interface: IClosableNotifier.WithDefault by lazy {
    as_105354978()
  }


  private val __1941813094_Interface: ICompositionSupportsSystemBackdrop.WithDefault by lazy {
    as_1941813094()
  }


  public override val __1009738748_Ptr: JNAPointer? by lazy {
    __1009738748_Interface.__1009738748_Ptr
  }


  public override val __1237130066_Ptr: JNAPointer? by lazy {
    __1237130066_Interface.__1237130066_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __105354978_Ptr: JNAPointer? by lazy {
    __105354978_Interface.__105354978_Ptr
  }


  public override val __1941813094_Ptr: JNAPointer? by lazy {
    __1941813094_Interface.__1941813094_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1009738748_Interface, __1237130066_Interface, __1260617006_Interface,
        __105354978_Interface, __1941813094_Interface)

  private fun as_1009738748(): IContentIsland.WithDefault {
    if(pointer == NULL) {
      return(IContentIsland.ABI.makeIContentIsland(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIsland>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIsland.ABI.makeIContentIsland(ref.value))
  }

  private fun as_1237130066(): IContentIsland2.WithDefault {
    if(pointer == NULL) {
      return(IContentIsland2.ABI.makeIContentIsland2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIsland2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIsland2.ABI.makeIContentIsland2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_105354978(): IClosableNotifier.WithDefault {
    if(pointer == NULL) {
      return(IClosableNotifier.ABI.makeIClosableNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosableNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosableNotifier.ABI.makeIClosableNotifier(ref.value))
  }

  private fun as_1941813094(): ICompositionSupportsSystemBackdrop.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSupportsSystemBackdrop.ABI.makeICompositionSupportsSystemBackdrop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSupportsSystemBackdrop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSupportsSystemBackdrop.ABI.makeICompositionSupportsSystemBackdrop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentIsland>
      {
    public override fun getValue() = ContentIsland(pointer.getPointer(0))

    public fun setValue(value: ContentIsland): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentIsland, MemoryAddress> {
    public val IContentIslandStatics_Instance: IContentIslandStatics by lazy {
      createIContentIslandStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentIslandStatics(): IContentIslandStatics {
      val refiid = Guid.REFIID(IContentIslandStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.ContentIsland".toHandle(),refiid,interfacePtr)
      val result = IContentIslandStatics.ABI.makeIContentIslandStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentIsland {
      val address = segment.toRawLongValue()
      return ContentIsland(Pointer(address))
    }

    public override fun toNative(obj: ContentIsland): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(Root: Visual) = ABI.IContentIslandStatics_Instance.Create(Root)

    public fun FindAllForCompositor(compositor: Compositor) =
        ABI.IContentIslandStatics_Instance.FindAllForCompositor(compositor)

    public fun FindAllForCurrentThread() =
        ABI.IContentIslandStatics_Instance.FindAllForCurrentThread()

    public fun GetByVisual(child: Visual) = ABI.IContentIslandStatics_Instance.GetByVisual(child)

    public fun GetFromId(id: WinDef.ULONG) = ABI.IContentIslandStatics_Instance.GetFromId(id)
  }
}
