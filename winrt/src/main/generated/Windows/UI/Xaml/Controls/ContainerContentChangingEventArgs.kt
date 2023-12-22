package Windows.UI.Xaml.Controls

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

@ABIMarker(ContainerContentChangingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ContainerContentChangingEventArgs;{07deeaa7-018f-4dda-b399-fd4e13a31bea})")
@WinRTByReference(brClass = ContainerContentChangingEventArgs.ByReference::class)
public class ContainerContentChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContainerContentChangingEventArgs.WithDefault, IWinRTObject {
  private val __597287478_Interface: IContainerContentChangingEventArgs.WithDefault by lazy {
    as_597287478()
  }


  public override val __597287478_Ptr: JNAPointer? by lazy {
    __597287478_Interface.__597287478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597287478_Interface)

  public constructor() : this(ABI.activate())

  private fun as_597287478(): IContainerContentChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContainerContentChangingEventArgs.ABI.makeIContainerContentChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContainerContentChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContainerContentChangingEventArgs.ABI.makeIContainerContentChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContainerContentChangingEventArgs> {
    public override fun getValue() = ContainerContentChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContainerContentChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContainerContentChangingEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContainerContentChangingEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContainerContentChangingEventArgs {
      val address = segment.toRawLongValue()
      return ContainerContentChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContainerContentChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
