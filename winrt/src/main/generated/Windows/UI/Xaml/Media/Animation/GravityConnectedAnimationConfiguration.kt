package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.Media.Animation.IGravityConnectedAnimationConfigurationFactory.ABI.IID
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

@ABIMarker(GravityConnectedAnimationConfiguration.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.GravityConnectedAnimationConfiguration;{c751a4b7-0459-5142-b891-aeaac1d41822})")
@WinRTByReference(brClass = GravityConnectedAnimationConfiguration.ByReference::class)
public open class GravityConnectedAnimationConfiguration(
  ptr: JNAPointer? = NULL
) : ConnectedAnimationConfiguration(ptr), IGravityConnectedAnimationConfiguration.WithDefault,
    IGravityConnectedAnimationConfiguration2.WithDefault, IWinRTObject {
  private val __2107830163_Interface: IGravityConnectedAnimationConfiguration.WithDefault by lazy {
    as_2107830163()
  }


  private val __918225663_Interface: IGravityConnectedAnimationConfiguration2.WithDefault by lazy {
    as_918225663()
  }


  public override val __2107830163_Ptr: JNAPointer? by lazy {
    __2107830163_Interface.__2107830163_Ptr
  }


  public override val __918225663_Ptr: JNAPointer? by lazy {
    __918225663_Interface.__918225663_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2107830163_Interface, __918225663_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2107830163(): IGravityConnectedAnimationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IGravityConnectedAnimationConfiguration.ABI.makeIGravityConnectedAnimationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGravityConnectedAnimationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGravityConnectedAnimationConfiguration.ABI.makeIGravityConnectedAnimationConfiguration(ref.value))
  }

  private fun as_918225663(): IGravityConnectedAnimationConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IGravityConnectedAnimationConfiguration2.ABI.makeIGravityConnectedAnimationConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGravityConnectedAnimationConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGravityConnectedAnimationConfiguration2.ABI.makeIGravityConnectedAnimationConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GravityConnectedAnimationConfiguration> {
    public override fun getValue() = GravityConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: GravityConnectedAnimationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GravityConnectedAnimationConfiguration, MemoryAddress> {
    public val IGravityConnectedAnimationConfigurationFactory_Instance:
        IGravityConnectedAnimationConfigurationFactory by lazy {
      createIGravityConnectedAnimationConfigurationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGravityConnectedAnimationConfigurationFactory():
        IGravityConnectedAnimationConfigurationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.GravityConnectedAnimationConfiguration".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGravityConnectedAnimationConfigurationFactory.ABI.makeIGravityConnectedAnimationConfigurationFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IGravityConnectedAnimationConfigurationFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GravityConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return GravityConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: GravityConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
