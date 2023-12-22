package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IDispatcherTimerFactory.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DispatcherTimer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DispatcherTimer;{58a4abf1-a4a3-53dd-ae21-08f43231e817})")
@WinRTByReference(brClass = DispatcherTimer.ByReference::class)
public open class DispatcherTimer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherTimer.WithDefault, IWinRTObject {
  private val __563305911_Interface: IDispatcherTimer.WithDefault by lazy {
    as_563305911()
  }


  public override val __563305911_Ptr: JNAPointer? by lazy {
    __563305911_Interface.__563305911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__563305911_Interface)

  public constructor() : this(ABI.activate())

  private fun as_563305911(): IDispatcherTimer.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherTimer.ABI.makeIDispatcherTimer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherTimer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherTimer.ABI.makeIDispatcherTimer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DispatcherTimer> {
    public override fun getValue() = DispatcherTimer(pointer.getPointer(0))

    public fun setValue(value: DispatcherTimer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DispatcherTimer, MemoryAddress> {
    public val IDispatcherTimerFactory_Instance: IDispatcherTimerFactory by lazy {
      createIDispatcherTimerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDispatcherTimerFactory(): IDispatcherTimerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DispatcherTimer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDispatcherTimerFactory.ABI.makeIDispatcherTimerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDispatcherTimerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DispatcherTimer {
      val address = segment.toRawLongValue()
      return DispatcherTimer(Pointer(address))
    }

    public override fun toNative(obj: DispatcherTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
