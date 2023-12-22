package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IFlyoutShowOptionsFactory.ABI.IID
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

@ABIMarker(FlyoutShowOptions.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.FlyoutShowOptions;{57d693ad-0c74-54dd-b110-1ee43fabadd9})")
@WinRTByReference(brClass = FlyoutShowOptions.ByReference::class)
public open class FlyoutShowOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFlyoutShowOptions.WithDefault, IWinRTObject {
  private val __1290889354_Interface: IFlyoutShowOptions.WithDefault by lazy {
    as_1290889354()
  }


  public override val __1290889354_Ptr: JNAPointer? by lazy {
    __1290889354_Interface.__1290889354_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1290889354_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1290889354(): IFlyoutShowOptions.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutShowOptions.ABI.makeIFlyoutShowOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutShowOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutShowOptions.ABI.makeIFlyoutShowOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlyoutShowOptions> {
    public override fun getValue() = FlyoutShowOptions(pointer.getPointer(0))

    public fun setValue(value: FlyoutShowOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutShowOptions, MemoryAddress> {
    public val IFlyoutShowOptionsFactory_Instance: IFlyoutShowOptionsFactory by lazy {
      createIFlyoutShowOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutShowOptionsFactory(): IFlyoutShowOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutShowOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutShowOptionsFactory.ABI.makeIFlyoutShowOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlyoutShowOptionsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlyoutShowOptions {
      val address = segment.toRawLongValue()
      return FlyoutShowOptions(Pointer(address))
    }

    public override fun toNative(obj: FlyoutShowOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
