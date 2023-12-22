package Microsoft.UI.Composition

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
@Signature("rc(Microsoft.UI.Composition.Compositor;{95213c13-c4cb-57de-b267-d21ab901ae38})")
@WinRTByReference(brClass = Compositor.ByReference::class)
public class Compositor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositor.WithDefault, ICompositor2.WithDefault, ICompositor4.WithDefault,
    ICompositor5.WithDefault, ICompositor6.WithDefault, ICompositor7.WithDefault,
    ICompositorWithProjectedShadow.WithDefault, ICompositorWithRadialGradient.WithDefault,
    ICompositorWithVisualSurface.WithDefault, ICompositor8.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __404036826_Interface: ICompositor.WithDefault by lazy {
    as_404036826()
  }


  private val __359760232_Interface: ICompositor2.WithDefault by lazy {
    as_359760232()
  }


  private val __359760230_Interface: ICompositor4.WithDefault by lazy {
    as_359760230()
  }


  private val __359760229_Interface: ICompositor5.WithDefault by lazy {
    as_359760229()
  }


  private val __359760228_Interface: ICompositor6.WithDefault by lazy {
    as_359760228()
  }


  private val __359760227_Interface: ICompositor7.WithDefault by lazy {
    as_359760227()
  }


  private val __145472472_Interface: ICompositorWithProjectedShadow.WithDefault by lazy {
    as_145472472()
  }


  private val __1860171599_Interface: ICompositorWithRadialGradient.WithDefault by lazy {
    as_1860171599()
  }


  private val __76351379_Interface: ICompositorWithVisualSurface.WithDefault by lazy {
    as_76351379()
  }


  private val __359760226_Interface: ICompositor8.WithDefault by lazy {
    as_359760226()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __404036826_Ptr: JNAPointer? by lazy {
    __404036826_Interface.__404036826_Ptr
  }


  public override val __359760232_Ptr: JNAPointer? by lazy {
    __359760232_Interface.__359760232_Ptr
  }


  public override val __359760230_Ptr: JNAPointer? by lazy {
    __359760230_Interface.__359760230_Ptr
  }


  public override val __359760229_Ptr: JNAPointer? by lazy {
    __359760229_Interface.__359760229_Ptr
  }


  public override val __359760228_Ptr: JNAPointer? by lazy {
    __359760228_Interface.__359760228_Ptr
  }


  public override val __359760227_Ptr: JNAPointer? by lazy {
    __359760227_Interface.__359760227_Ptr
  }


  public override val __145472472_Ptr: JNAPointer? by lazy {
    __145472472_Interface.__145472472_Ptr
  }


  public override val __1860171599_Ptr: JNAPointer? by lazy {
    __1860171599_Interface.__1860171599_Ptr
  }


  public override val __76351379_Ptr: JNAPointer? by lazy {
    __76351379_Interface.__76351379_Ptr
  }


  public override val __359760226_Ptr: JNAPointer? by lazy {
    __359760226_Interface.__359760226_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__404036826_Interface, __359760232_Interface, __359760230_Interface,
        __359760229_Interface, __359760228_Interface, __359760227_Interface, __145472472_Interface,
        __1860171599_Interface, __76351379_Interface, __359760226_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_404036826(): ICompositor.WithDefault {
    if(pointer == NULL) {
      return(ICompositor.ABI.makeICompositor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor.ABI.makeICompositor(ref.value))
  }

  private fun as_359760232(): ICompositor2.WithDefault {
    if(pointer == NULL) {
      return(ICompositor2.ABI.makeICompositor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor2.ABI.makeICompositor2(ref.value))
  }

  private fun as_359760230(): ICompositor4.WithDefault {
    if(pointer == NULL) {
      return(ICompositor4.ABI.makeICompositor4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor4.ABI.makeICompositor4(ref.value))
  }

  private fun as_359760229(): ICompositor5.WithDefault {
    if(pointer == NULL) {
      return(ICompositor5.ABI.makeICompositor5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor5.ABI.makeICompositor5(ref.value))
  }

  private fun as_359760228(): ICompositor6.WithDefault {
    if(pointer == NULL) {
      return(ICompositor6.ABI.makeICompositor6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor6.ABI.makeICompositor6(ref.value))
  }

  private fun as_359760227(): ICompositor7.WithDefault {
    if(pointer == NULL) {
      return(ICompositor7.ABI.makeICompositor7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor7.ABI.makeICompositor7(ref.value))
  }

  private fun as_145472472(): ICompositorWithProjectedShadow.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithProjectedShadow.ABI.makeICompositorWithProjectedShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithProjectedShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithProjectedShadow.ABI.makeICompositorWithProjectedShadow(ref.value))
  }

  private fun as_1860171599(): ICompositorWithRadialGradient.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithRadialGradient.ABI.makeICompositorWithRadialGradient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithRadialGradient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithRadialGradient.ABI.makeICompositorWithRadialGradient(ref.value))
  }

  private fun as_76351379(): ICompositorWithVisualSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositorWithVisualSurface.ABI.makeICompositorWithVisualSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositorWithVisualSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositorWithVisualSurface.ABI.makeICompositorWithVisualSurface(ref.value))
  }

  private fun as_359760226(): ICompositor8.WithDefault {
    if(pointer == NULL) {
      return(ICompositor8.ABI.makeICompositor8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositor8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositor8.ABI.makeICompositor8(ref.value))
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
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Compositor".toHandle(),
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Compositor".toHandle(),refiid,interfacePtr)
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
