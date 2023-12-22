package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IVirtualizingLayoutFactory.ABI.IID
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

@ABIMarker(VirtualizingLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.VirtualizingLayout;{54857ce0-b9e6-51a3-bfa8-dcd8ee306d5c})")
@WinRTByReference(brClass = VirtualizingLayout.ByReference::class)
public open class VirtualizingLayout(
  ptr: JNAPointer? = NULL
) : Layout(ptr), IVirtualizingLayout.WithDefault, IVirtualizingLayoutOverrides.WithDefault,
    IWinRTObject {
  private val __922873271_Interface: IVirtualizingLayout.WithDefault by lazy {
    as_922873271()
  }


  private val __51842608_Interface: IVirtualizingLayoutOverrides.WithDefault by lazy {
    as_51842608()
  }


  public override val __922873271_Ptr: JNAPointer? by lazy {
    __922873271_Interface.__922873271_Ptr
  }


  public override val __51842608_Ptr: JNAPointer? by lazy {
    __51842608_Interface.__51842608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922873271_Interface, __51842608_Interface)

  public constructor() : this(ABI.activate())

  private fun as_922873271(): IVirtualizingLayout.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayout.ABI.makeIVirtualizingLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayout.ABI.makeIVirtualizingLayout(ref.value))
  }

  private fun as_51842608(): IVirtualizingLayoutOverrides.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingLayoutOverrides.ABI.makeIVirtualizingLayoutOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingLayoutOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingLayoutOverrides.ABI.makeIVirtualizingLayoutOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VirtualizingLayout> {
    public override fun getValue() = VirtualizingLayout(pointer.getPointer(0))

    public fun setValue(value: VirtualizingLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VirtualizingLayout, MemoryAddress> {
    public val IVirtualizingLayoutFactory_Instance: IVirtualizingLayoutFactory by lazy {
      createIVirtualizingLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVirtualizingLayoutFactory(): IVirtualizingLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.VirtualizingLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVirtualizingLayoutFactory.ABI.makeIVirtualizingLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IVirtualizingLayoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): VirtualizingLayout {
      val address = segment.toRawLongValue()
      return VirtualizingLayout(Pointer(address))
    }

    public override fun toNative(obj: VirtualizingLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
