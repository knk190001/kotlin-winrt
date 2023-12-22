package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.ISystemBackdropFactory.ABI.IID
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

@ABIMarker(SystemBackdrop.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.SystemBackdrop;{5aeed5c4-37ac-5852-b73f-1b76ebc3205f})")
@WinRTByReference(brClass = SystemBackdrop.ByReference::class)
public open class SystemBackdrop(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISystemBackdrop.WithDefault, ISystemBackdropOverrides.WithDefault,
    IWinRTObject {
  private val __343338518_Interface: ISystemBackdrop.WithDefault by lazy {
    as_343338518()
  }


  private val __545458353_Interface: ISystemBackdropOverrides.WithDefault by lazy {
    as_545458353()
  }


  public override val __343338518_Ptr: JNAPointer? by lazy {
    __343338518_Interface.__343338518_Ptr
  }


  public override val __545458353_Ptr: JNAPointer? by lazy {
    __545458353_Interface.__545458353_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343338518_Interface, __545458353_Interface)

  public constructor() : this(ABI.activate())

  private fun as_343338518(): ISystemBackdrop.WithDefault {
    if(pointer == NULL) {
      return(ISystemBackdrop.ABI.makeISystemBackdrop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemBackdrop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemBackdrop.ABI.makeISystemBackdrop(ref.value))
  }

  private fun as_545458353(): ISystemBackdropOverrides.WithDefault {
    if(pointer == NULL) {
      return(ISystemBackdropOverrides.ABI.makeISystemBackdropOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemBackdropOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemBackdropOverrides.ABI.makeISystemBackdropOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SystemBackdrop>
      {
    public override fun getValue() = SystemBackdrop(pointer.getPointer(0))

    public fun setValue(value: SystemBackdrop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemBackdrop, MemoryAddress> {
    public val ISystemBackdropFactory_Instance: ISystemBackdropFactory by lazy {
      createISystemBackdropFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemBackdropFactory(): ISystemBackdropFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.SystemBackdrop".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISystemBackdropFactory.ABI.makeISystemBackdropFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISystemBackdropFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SystemBackdrop {
      val address = segment.toRawLongValue()
      return SystemBackdrop(Pointer(address))
    }

    public override fun toNative(obj: SystemBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
