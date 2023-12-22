package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.Media.Animation.IDirectConnectedAnimationConfigurationFactory.ABI.IID
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

@ABIMarker(DirectConnectedAnimationConfiguration.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DirectConnectedAnimationConfiguration;{ee5d736f-5738-5d86-b770-151948cf365e})")
@WinRTByReference(brClass = DirectConnectedAnimationConfiguration.ByReference::class)
public open class DirectConnectedAnimationConfiguration(
  ptr: JNAPointer? = NULL
) : ConnectedAnimationConfiguration(ptr), IDirectConnectedAnimationConfiguration.WithDefault,
    IWinRTObject {
  private val __1277040948_Interface: IDirectConnectedAnimationConfiguration.WithDefault by lazy {
    as_1277040948()
  }


  public override val __1277040948_Ptr: JNAPointer? by lazy {
    __1277040948_Interface.__1277040948_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1277040948_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1277040948(): IDirectConnectedAnimationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IDirectConnectedAnimationConfiguration.ABI.makeIDirectConnectedAnimationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDirectConnectedAnimationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDirectConnectedAnimationConfiguration.ABI.makeIDirectConnectedAnimationConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DirectConnectedAnimationConfiguration> {
    public override fun getValue() = DirectConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: DirectConnectedAnimationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DirectConnectedAnimationConfiguration, MemoryAddress> {
    public val IDirectConnectedAnimationConfigurationFactory_Instance:
        IDirectConnectedAnimationConfigurationFactory by lazy {
      createIDirectConnectedAnimationConfigurationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDirectConnectedAnimationConfigurationFactory():
        IDirectConnectedAnimationConfigurationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DirectConnectedAnimationConfiguration".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDirectConnectedAnimationConfigurationFactory.ABI.makeIDirectConnectedAnimationConfigurationFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IDirectConnectedAnimationConfigurationFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DirectConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return DirectConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: DirectConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
