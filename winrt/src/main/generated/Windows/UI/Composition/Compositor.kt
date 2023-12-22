package Windows.UI.Composition

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(Compositor.ABI::class)
@Signature("rc(Windows.UI.Composition.Compositor;{b403ca50-7f8c-4e83-985f-cc45060036d8})")
@WinRTByReference(brClass = Compositor.ByReference::class)
public class Compositor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositor.WithDefault, ICompositor2.WithDefault, ICompositor3.WithDefault,
    ICompositor4.WithDefault, ICompositor5.WithDefault, ICompositor6.WithDefault,
    ICompositorWithProjectedShadow.WithDefault, ICompositorWithRadialGradient.WithDefault,
    ICompositorWithVisualSurface.WithDefault, ICompositor7.WithDefault,
    ICompositorWithBlurredWallpaperBackdropBrush.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __211191343_Interface: ICompositor.WithDefault by lazy {
    as_211191343()
  }


  private val __2043002909_Interface: ICompositor2.WithDefault by lazy {
    as_2043002909()
  }


  private val __2043002908_Interface: ICompositor3.WithDefault by lazy {
    as_2043002908()
  }


  private val __2043002907_Interface: ICompositor4.WithDefault by lazy {
    as_2043002907()
  }


  private val __2043002906_Interface: ICompositor5.WithDefault by lazy {
    as_2043002906()
  }


  private val __2043002905_Interface: ICompositor6.WithDefault by lazy {
    as_2043002905()
  }


  private val __466362269_Interface: ICompositorWithProjectedShadow.WithDefault by lazy {
    as_466362269()
  }


  private val __791964316_Interface: ICompositorWithRadialGradient.WithDefault by lazy {
    as_791964316()
  }


  private val __1824472136_Interface: ICompositorWithVisualSurface.WithDefault by lazy {
    as_1824472136()
  }


  private val __2043002904_Interface: ICompositor7.WithDefault by lazy {
    as_2043002904()
  }


  private val __1500063095_Interface: ICompositorWithBlurredWallpaperBackdropBrush.WithDefault by
      lazy {
    as_1500063095()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __211191343_Ptr: JNAPointer? by lazy {
    __211191343_Interface.__211191343_Ptr
  }


  public override val __2043002909_Ptr: JNAPointer? by lazy {
    __2043002909_Interface.__2043002909_Ptr
  }


  public override val __2043002908_Ptr: JNAPointer? by lazy {
    __2043002908_Interface.__2043002908_Ptr
  }


  public override val __2043002907_Ptr: JNAPointer? by lazy {
    __2043002907_Interface.__2043002907_Ptr
  }


  public override val __2043002906_Ptr: JNAPointer? by lazy {
    __2043002906_Interface.__2043002906_Ptr
  }


  public override val __2043002905_Ptr: JNAPointer? by lazy {
    __2043002905_Interface.__2043002905_Ptr
  }


  public override val __466362269_Ptr: JNAPointer? by lazy {
    __466362269_Interface.__466362269_Ptr
  }


  public override val __791964316_Ptr: JNAPointer? by lazy {
    __791964316_Interface.__791964316_Ptr
  }


  public override val __1824472136_Ptr: JNAPointer? by lazy {
    __1824472136_Interface.__1824472136_Ptr
  }


  public override val __2043002904_Ptr: JNAPointer? by lazy {
    __2043002904_Interface.__2043002904_Ptr
  }


  public override val __1500063095_Ptr: JNAPointer? by lazy {
    __1500063095_Interface.__1500063095_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__211191343_Interface, __2043002909_Interface, __2043002908_Interface,
        __2043002907_Interface, __2043002906_Interface, __2043002905_Interface,
        __466362269_Interface, __791964316_Interface, __1824472136_Interface,
        __2043002904_Interface, __1500063095_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_211191343(): ICompositor.WithDefault {
    if(pointer == NULL) {
      return(ICompositor.ABI.makeICompositor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor.ABI.makeICompositor(ref.value))
  }

  private fun as_2043002909(): ICompositor2.WithDefault {
    if(pointer == NULL) {
      return(ICompositor2.ABI.makeICompositor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor2.ABI.makeICompositor2(ref.value))
  }

  private fun as_2043002908(): ICompositor3.WithDefault {
    if(pointer == NULL) {
      return(ICompositor3.ABI.makeICompositor3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor3.ABI.makeICompositor3(ref.value))
  }

  private fun as_2043002907(): ICompositor4.WithDefault {
    if(pointer == NULL) {
      return(ICompositor4.ABI.makeICompositor4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor4.ABI.makeICompositor4(ref.value))
  }

  private fun as_2043002906(): ICompositor5.WithDefault {
    if(pointer == NULL) {
      return(ICompositor5.ABI.makeICompositor5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor5.ABI.makeICompositor5(ref.value))
  }

  private fun as_2043002905(): ICompositor6.WithDefault {
    if(pointer == NULL) {
      return(ICompositor6.ABI.makeICompositor6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor6.ABI.makeICompositor6(ref.value))
  }

  private fun as_466362269(): ICompositorWithProjectedShadow.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithProjectedShadow.ABI.makeICompositorWithProjectedShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithProjectedShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithProjectedShadow.ABI.makeICompositorWithProjectedShadow(ref.value))
  }

  private fun as_791964316(): ICompositorWithRadialGradient.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithRadialGradient.ABI.makeICompositorWithRadialGradient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithRadialGradient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithRadialGradient.ABI.makeICompositorWithRadialGradient(ref.value))
  }

  private fun as_1824472136(): ICompositorWithVisualSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithVisualSurface.ABI.makeICompositorWithVisualSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithVisualSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithVisualSurface.ABI.makeICompositorWithVisualSurface(ref.value))
  }

  private fun as_2043002904(): ICompositor7.WithDefault {
    if(pointer == NULL) {
      return(ICompositor7.ABI.makeICompositor7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor7.ABI.makeICompositor7(ref.value))
  }

  private fun as_1500063095(): ICompositorWithBlurredWallpaperBackdropBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithBlurredWallpaperBackdropBrush.ABI.makeICompositorWithBlurredWallpaperBackdropBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithBlurredWallpaperBackdropBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithBlurredWallpaperBackdropBrush.ABI.makeICompositorWithBlurredWallpaperBackdropBrush(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Compositor> {
    public override fun getValue() = Compositor(pointer.getPointer(0))

    public fun setValue(value: Compositor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Compositor, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICompositorStatics_Instance: ICompositorStatics by lazy {
      createICompositorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Compositor".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createICompositorStatics(): ICompositorStatics {
      val refiid = Guid.REFIID(ICompositorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Compositor".toHandle(),refiid,interfacePtr)
      val result = ICompositorStatics.ABI.makeICompositorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Compositor {
      val address = segment.toRawLongValue()
      return Compositor(Pointer(address))
    }

    public override fun toNative(obj: Compositor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxGlobalPlaybackRate() =
        ABI.ICompositorStatics_Instance.get_MaxGlobalPlaybackRate()

    public fun get_MinGlobalPlaybackRate() =
        ABI.ICompositorStatics_Instance.get_MinGlobalPlaybackRate()
  }
}
