package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.FrameworkElement
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TickBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.TickBar;{573293bd-3f6a-56c3-bf95-6254c9bbbc89})")
@WinRTByReference(brClass = TickBar.ByReference::class)
public class TickBar(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), ITickBar.WithDefault, IWinRTObject {
  private val __186092603_Interface: ITickBar.WithDefault by lazy {
    as_186092603()
  }


  public override val __186092603_Ptr: JNAPointer? by lazy {
    __186092603_Interface.__186092603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__186092603_Interface)

  public constructor() : this(ABI.activate())

  private fun as_186092603(): ITickBar.WithDefault {
    if(pointer == NULL) {
      return(ITickBar.ABI.makeITickBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITickBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITickBar.ABI.makeITickBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TickBar> {
    public override fun getValue() = TickBar(pointer.getPointer(0))

    public fun setValue(value: TickBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TickBar, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITickBarStatics_Instance: ITickBarStatics by lazy {
      createITickBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.TickBar".toHandle(),
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

    public fun createITickBarStatics(): ITickBarStatics {
      val refiid = Guid.REFIID(ITickBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.TickBar".toHandle(),refiid,interfacePtr)
      val result = ITickBarStatics.ABI.makeITickBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TickBar {
      val address = segment.toRawLongValue()
      return TickBar(Pointer(address))
    }

    public override fun toNative(obj: TickBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillProperty() = ABI.ITickBarStatics_Instance.get_FillProperty()
  }
}
