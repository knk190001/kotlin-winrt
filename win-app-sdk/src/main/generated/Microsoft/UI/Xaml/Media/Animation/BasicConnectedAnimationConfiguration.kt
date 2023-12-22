package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Media.Animation.IBasicConnectedAnimationConfigurationFactory.ABI.IID
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

@ABIMarker(BasicConnectedAnimationConfiguration.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.BasicConnectedAnimationConfiguration;{7ff18afe-91e8-52fa-a1c1-7b2c1a140118})")
@WinRTByReference(brClass = BasicConnectedAnimationConfiguration.ByReference::class)
public open class BasicConnectedAnimationConfiguration(
  ptr: JNAPointer? = NULL
) : ConnectedAnimationConfiguration(ptr), IBasicConnectedAnimationConfiguration.WithDefault,
    IWinRTObject {
  private val __1703195480_Interface: IBasicConnectedAnimationConfiguration.WithDefault by lazy {
    as_1703195480()
  }


  public override val __1703195480_Ptr: JNAPointer? by lazy {
    __1703195480_Interface.__1703195480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1703195480_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1703195480(): IBasicConnectedAnimationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IBasicConnectedAnimationConfiguration.ABI.makeIBasicConnectedAnimationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBasicConnectedAnimationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBasicConnectedAnimationConfiguration.ABI.makeIBasicConnectedAnimationConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BasicConnectedAnimationConfiguration> {
    public override fun getValue() = BasicConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: BasicConnectedAnimationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BasicConnectedAnimationConfiguration, MemoryAddress> {
    public val IBasicConnectedAnimationConfigurationFactory_Instance:
        IBasicConnectedAnimationConfigurationFactory by lazy {
      createIBasicConnectedAnimationConfigurationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBasicConnectedAnimationConfigurationFactory():
        IBasicConnectedAnimationConfigurationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BasicConnectedAnimationConfiguration".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBasicConnectedAnimationConfigurationFactory.ABI.makeIBasicConnectedAnimationConfigurationFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IBasicConnectedAnimationConfigurationFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BasicConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return BasicConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: BasicConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
