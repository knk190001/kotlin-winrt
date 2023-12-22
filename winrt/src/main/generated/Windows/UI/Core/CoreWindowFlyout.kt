package Windows.UI.Core

import Windows.Foundation.Point
import Windows.UI.Core.ICoreWindowFlyoutFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWindowFlyout.ABI::class)
@Signature("rc(Windows.UI.Core.CoreWindowFlyout;{e89d854d-2050-40bb-b344-f6f355eeb314})")
@WinRTByReference(brClass = CoreWindowFlyout.ByReference::class)
public class CoreWindowFlyout(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWindowFlyout.WithDefault, IWinRTObject {
  private val __740998437_Interface: ICoreWindowFlyout.WithDefault by lazy {
    as_740998437()
  }


  public override val __740998437_Ptr: JNAPointer? by lazy {
    __740998437_Interface.__740998437_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__740998437_Interface)

  public constructor(position: Point) : this(ABI.activate(position))

  public constructor(position: Point, title: String) : this(ABI.activate(position, title))

  private fun as_740998437(): ICoreWindowFlyout.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowFlyout.ABI.makeICoreWindowFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowFlyout.ABI.makeICoreWindowFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWindowFlyout> {
    public override fun getValue() = CoreWindowFlyout(pointer.getPointer(0))

    public fun setValue(value: CoreWindowFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindowFlyout, MemoryAddress> {
    public val ICoreWindowFlyoutFactory_Instance: ICoreWindowFlyoutFactory by lazy {
      createICoreWindowFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWindowFlyoutFactory(): ICoreWindowFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreWindowFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICoreWindowFlyoutFactory.ABI.makeICoreWindowFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(position: Point): JNAPointer? =
        ICoreWindowFlyoutFactory_Instance.Create(position)?.pointer

    public fun activate(position: Point, title: String): JNAPointer? =
        ICoreWindowFlyoutFactory_Instance.CreateWithTitle(position, title)?.pointer

    public override fun fromNative(segment: MemoryAddress): CoreWindowFlyout {
      val address = segment.toRawLongValue()
      return CoreWindowFlyout(Pointer(address))
    }

    public override fun toNative(obj: CoreWindowFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
