package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IVirtualizingLayoutContextFactory.ABI.IID
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

@ABIMarker(VirtualizingLayoutContext.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.VirtualizingLayoutContext;{5b5b186a-a7f9-5a2e-b1f0-8950ccd97350})")
@WinRTByReference(brClass = VirtualizingLayoutContext.ByReference::class)
public open class VirtualizingLayoutContext(
  ptr: JNAPointer? = NULL
) : LayoutContext(ptr), IVirtualizingLayoutContext.WithDefault,
    IVirtualizingLayoutContext2.WithDefault, IVirtualizingLayoutContextOverrides.WithDefault,
    IVirtualizingLayoutContextOverrides2.WithDefault, IWinRTObject {
  private val __1783649272_Interface: IVirtualizingLayoutContext.WithDefault by lazy {
    as_1783649272()
  }


  private val __541447366_Interface: IVirtualizingLayoutContext2.WithDefault by lazy {
    as_541447366()
  }


  private val __247389937_Interface: IVirtualizingLayoutContextOverrides.WithDefault by lazy {
    as_247389937()
  }


  private val __920846595_Interface: IVirtualizingLayoutContextOverrides2.WithDefault by lazy {
    as_920846595()
  }


  public override val __1783649272_Ptr: JNAPointer? by lazy {
    __1783649272_Interface.__1783649272_Ptr
  }


  public override val __541447366_Ptr: JNAPointer? by lazy {
    __541447366_Interface.__541447366_Ptr
  }


  public override val __247389937_Ptr: JNAPointer? by lazy {
    __247389937_Interface.__247389937_Ptr
  }


  public override val __920846595_Ptr: JNAPointer? by lazy {
    __920846595_Interface.__920846595_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1783649272_Interface, __541447366_Interface, __247389937_Interface,
        __920846595_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1783649272(): IVirtualizingLayoutContext.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayoutContext.ABI.makeIVirtualizingLayoutContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayoutContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayoutContext.ABI.makeIVirtualizingLayoutContext(ref.value))
  }

  private fun as_541447366(): IVirtualizingLayoutContext2.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayoutContext2.ABI.makeIVirtualizingLayoutContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayoutContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayoutContext2.ABI.makeIVirtualizingLayoutContext2(ref.value))
  }

  private fun as_247389937(): IVirtualizingLayoutContextOverrides.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayoutContextOverrides.ABI.makeIVirtualizingLayoutContextOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayoutContextOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayoutContextOverrides.ABI.makeIVirtualizingLayoutContextOverrides(ref.value))
  }

  private fun as_920846595(): IVirtualizingLayoutContextOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayoutContextOverrides2.ABI.makeIVirtualizingLayoutContextOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayoutContextOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayoutContextOverrides2.ABI.makeIVirtualizingLayoutContextOverrides2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VirtualizingLayoutContext> {
    public override fun getValue() = VirtualizingLayoutContext(pointer.getPointer(0))

    public fun setValue(value: VirtualizingLayoutContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VirtualizingLayoutContext, MemoryAddress> {
    public val IVirtualizingLayoutContextFactory_Instance: IVirtualizingLayoutContextFactory by
        lazy {
      createIVirtualizingLayoutContextFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVirtualizingLayoutContextFactory(): IVirtualizingLayoutContextFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.VirtualizingLayoutContext".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVirtualizingLayoutContextFactory.ABI.makeIVirtualizingLayoutContextFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IVirtualizingLayoutContextFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): VirtualizingLayoutContext {
      val address = segment.toRawLongValue()
      return VirtualizingLayoutContext(Pointer(address))
    }

    public override fun toNative(obj: VirtualizingLayoutContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
